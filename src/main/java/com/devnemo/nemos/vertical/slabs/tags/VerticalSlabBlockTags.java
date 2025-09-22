package com.devnemo.nemos.vertical.slabs.tags;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

import static com.devnemo.nemos.vertical.slabs.NemosVerticalSlabs.MOD_ID;

public class VerticalSlabBlockTags {

    public static final TagKey<Block> WOODEN_VERTICAL_SLABS = bind("wooden_vertical_slabs");

    private static TagKey<Block> bind(String path) {
        return TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MOD_ID, path));
    }
}
