#!/bin/bash

move_files() {
  local MOD_ID="$1"
  local DEST_NAME="$2"

  local SRC_BASE="../common/src/generated/resources"
  local DEST_BASE="../common/src/main/resources/resourcepacks/${DEST_NAME}"

  local BLOCK_FOLDER="$SRC_BASE/assets/nemos_vertical_slabs/models/block"
  local ITEM_FOLDER="$SRC_BASE/assets/nemos_vertical_slabs/models/item"

  local DATA_FOLDERS=("data/nemos_vertical_slabs/loot_table/blocks"
                      "data/nemos_vertical_slabs/advancement/recipes/building_blocks"
                      "data/nemos_vertical_slabs/recipe")

  # Step 1: find block files containing the ID
  BLOCK_FILES=()
  while read -r FILE; do
      BASENAME=$(basename "$FILE")
      BLOCK_FILES+=("$BASENAME")
  done < <(grep -rl "$MOD_ID" "$BLOCK_FOLDER")

  # Step 2: move blocks
  for FILE in "${BLOCK_FILES[@]}"; do
      SRC="$BLOCK_FOLDER/$FILE"
      DEST="$DEST_BASE/assets/nemos_vertical_slabs/models/block/$FILE"
      mkdir -p "$(dirname "$DEST")"
      echo "Moving block: $SRC -> $DEST"
      mv "$SRC" "$DEST"
  done

  # Step 3: move matching items
  for FILE in "${BLOCK_FILES[@]}"; do
      SRC="$ITEM_FOLDER/$FILE"
      DEST="$DEST_BASE/assets/nemos_vertical_slabs/models/item/$FILE"
      mkdir -p "$(dirname "$DEST")"
      echo "Moving block: $SRC -> $DEST"
      mv "$SRC" "$DEST"
  done

  # Step 4: move data files containing the ID
  for folder in "${DATA_FOLDERS[@]}"; do
      SRC="$SRC_BASE/$folder"
      DEST="$DEST_BASE/$folder"

      [ ! -d "$SRC" ] && continue

      grep -rl "$MOD_ID" "$SRC" | while read -r FILE; do
          REL_PATH="${FILE#$SRC/}"
          DEST_PATH="$DEST/$(dirname "$REL_PATH")"
          mkdir -p "$DEST_PATH"
          echo "Moving data: $FILE -> $DEST_PATH/"
          mv "$FILE" "$DEST_PATH/"
      done
  done
}

# Example usage
move_files "nemos_mossy_blocks" "mossy_vertical_slabs"
move_files "biomesoplenty" "biomesoplenty_vertical_slabs"
