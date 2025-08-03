#!/bin/bash

EXCLUDE_PATTERNS=(
  "mossy_cobblestone_vertical_slab"
  "mossy_stone_brick_vertical_slab"
)

is_excluded() {
  local filename="$1"
  for pattern in "${EXCLUDE_PATTERNS[@]}"; do
    if [[ "$filename" == "$pattern"* ]]; then
      return 0
    fi
  done
  return 1
}

move_files() {
  local SRC="$1"
  local DEST="$2"

  mkdir -p "$DEST"

  find "$SRC" -type f -name "*mossy*" | while read -r FILE; do
    BASENAME=$(basename "$FILE")

    if is_excluded "$BASENAME"; then
      echo "Skipping excluded: $BASENAME"
      continue
    fi

    echo "Moving: $FILE -> $DEST/"
    mv "$FILE" "$DEST/"
  done
}

move_files "../common/src/generated/resources/assets/nemos_vertical_slabs/blockstates" "../common/src/main/resources/resourcepacks/mossy_vertical_slabs/assets/nemos_vertical_slabs/blockstates"
move_files "../common/src/generated/resources/assets/nemos_vertical_slabs/items" "../common/src/main/resources/resourcepacks/mossy_vertical_slabs/assets/nemos_vertical_slabs/items"
move_files "../common/src/generated/resources/assets/nemos_vertical_slabs/models/block" "../common/src/main/resources/resourcepacks/mossy_vertical_slabs/assets/nemos_vertical_slabs/models/block"
move_files "../common/src/generated/resources/data/nemos_vertical_slabs/loot_table/blocks" "../common/src/main/resources/resourcepacks/mossy_vertical_slabs/data/nemos_vertical_slabs/loot_table/blocks"
move_files "../common/src/generated/resources/data/nemos_vertical_slabs/advancement/recipes/building_blocks" "../common/src/main/resources/resourcepacks/mossy_vertical_slabs/data/nemos_vertical_slabs/advancement/recipes/building_blocks"
move_files "../common/src/generated/resources/data/nemos_vertical_slabs/recipe" "../common/src/main/resources/resourcepacks/mossy_vertical_slabs/data/nemos_vertical_slabs/recipe"