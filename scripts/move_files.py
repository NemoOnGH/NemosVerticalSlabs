import os
import json
import shutil
import filecmp

def move_files(mod_id: str, dest_id: str):
    src_base = "../src/main/generated"
    block_ids = get_block_ids_from_path(src_base, mod_id)

    move_files_to_destination(block_ids, src_base, dest_id, "assets/nemos_vertical_slabs/models/block", mod_id)
    move_files_to_destination(block_ids, src_base, dest_id, "assets/nemos_vertical_slabs/items", mod_id)
    move_files_to_destination(block_ids, src_base, dest_id, "data/nemos_vertical_slabs/loot_table/blocks", mod_id)
    move_files_to_destination(block_ids, src_base, dest_id, "data/nemos_vertical_slabs/recipe", mod_id)
    move_files_to_destination(block_ids, src_base, dest_id, "data/nemos_vertical_slabs/advancement/recipes", mod_id)

def get_block_ids_from_path(src_base: str, mod_id: str) -> list:
    recipe_path = os.path.join(src_base, "data/nemos_vertical_slabs/recipe")
    block_ids = []

    if os.path.isdir(recipe_path):
        for file_name in os.listdir(recipe_path):
            file_path = os.path.join(recipe_path, file_name)

            if os.path.isfile(file_path):
                with open(file_path, encoding="utf-8") as file:
                    file_content = file.read()
                    if mod_id not in file_content:
                        continue

                    try:
                        json_data = json.loads(file_content)
                    except json.JSONDecodeError:
                        continue

                if "result" in json_data and "id" in json_data["result"]:
                    block_id = json_data["result"]["id"]
                    block_ids.append(block_id.split(":", 1)[1])

    return block_ids

def move_files_to_destination(block_ids: [], src_base: str, dest_id: str, path_suffix: str, mod_id: str):
    path = os.path.join(src_base, path_suffix)

    if not os.path.isdir(path):
        return

    for root, dirs, files in os.walk(path):
        for file_name in files:
            file_path = os.path.join(root, file_name)

            file_content = ""
            try:
                with open(file_path, encoding="utf-8") as file:
                    file_content = file.read()
            except Exception as e:
                print(f"Fehler beim Lesen von {file_path}: {e}")
                continue

            should_move = False

            if mod_id in file_content:
                should_move = True

            for block_id in block_ids:
                if block_id in file_content:
                    should_move = True
                    break

            for block_id in block_ids:
                if file_name == f"{block_id}.json":
                    should_move = True
                    break

            if should_move:
                rel_path = os.path.relpath(file_path, src_base)
                dest_base = f"../src/main/resources/resourcepacks/{dest_id}"
                dest_path = os.path.join(dest_base, rel_path)
                move_file(file_path, dest_path)

def move_file(src, dest):
    if os.path.exists(dest):
        if filecmp.cmp(src, dest, shallow=False):
            print(f"Files identical, delete new one: {src}")
            os.remove(src)
        else:
            print(f"Files differ, replace old one: {dest}")
            os.remove(dest)
            shutil.move(src, dest)
    else:
        os.makedirs(os.path.dirname(dest), exist_ok=True)
        shutil.move(src, dest)
        print(f"File moved: {src} -> {dest}")

# Example usage
move_files("nemos_mossy_blocks", "mossy_vertical_slabs")
move_files("biomesoplenty", "biomesoplenty_vertical_slabs")
move_files("biomeswevegone", "biomeswevegone_vertical_slabs")
