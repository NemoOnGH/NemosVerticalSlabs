package com.devnemo.nemos.vertical.slabs.datagen;

import com.devnemo.nemos.vertical.slabs.world.level.block.NemosVerticalBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;

public class BlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public BlockTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> providerCompletableFuture) {
        super(output, providerCompletableFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        valueLookupBuilder(BlockTags.MINEABLE_WITH_AXE)
                .add(NemosVerticalBlocks.OAK_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.SPRUCE_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.BIRCH_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.JUNGLE_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.ACACIA_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.DARK_OAK_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.MANGROVE_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.CHERRY_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.PALE_OAK_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.BAMBOO_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.BAMBOO_MOSAIC_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.CRIMSON_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.WARPED_VERTICAL_SLAB.get());

        getOrCreateRawBuilder(BlockTags.MINEABLE_WITH_AXE)
                .addOptionalElement(BuiltInRegistries.BLOCK.getKey(NemosVerticalBlocks.MOSSY_OAK_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.MOSSY_SPRUCE_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.MOSSY_BIRCH_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.MOSSY_JUNGLE_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.MOSSY_ACACIA_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.MOSSY_DARK_OAK_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.MOSSY_MANGROVE_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.MOSSY_CHERRY_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.MOSSY_PALE_OAK_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.MOSSY_BAMBOO_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.MOSSY_CRIMSON_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.MOSSY_WARPED_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.PALE_MOSSY_OAK_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.PALE_MOSSY_SPRUCE_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.PALE_MOSSY_BIRCH_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.PALE_MOSSY_JUNGLE_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.PALE_MOSSY_ACACIA_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.PALE_MOSSY_DARK_OAK_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.PALE_MOSSY_MANGROVE_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.PALE_MOSSY_CHERRY_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.PALE_MOSSY_PALE_OAK_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.PALE_MOSSY_BAMBOO_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.PALE_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.PALE_MOSSY_CRIMSON_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.PALE_MOSSY_WARPED_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.CRIMSON_MOSSY_OAK_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.CRIMSON_MOSSY_SPRUCE_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.CRIMSON_MOSSY_BIRCH_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.CRIMSON_MOSSY_JUNGLE_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.CRIMSON_MOSSY_ACACIA_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.CRIMSON_MOSSY_DARK_OAK_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.CRIMSON_MOSSY_MANGROVE_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.CRIMSON_MOSSY_CHERRY_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.CRIMSON_MOSSY_PALE_OAK_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.CRIMSON_MOSSY_BAMBOO_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.CRIMSON_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.CRIMSON_MOSSY_CRIMSON_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.CRIMSON_MOSSY_WARPED_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.WARPED_MOSSY_OAK_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.WARPED_MOSSY_SPRUCE_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.WARPED_MOSSY_BIRCH_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.WARPED_MOSSY_JUNGLE_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.WARPED_MOSSY_ACACIA_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.WARPED_MOSSY_DARK_OAK_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.WARPED_MOSSY_MANGROVE_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.WARPED_MOSSY_CHERRY_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.WARPED_MOSSY_PALE_OAK_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.WARPED_MOSSY_BAMBOO_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.WARPED_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.WARPED_MOSSY_CRIMSON_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.WARPED_MOSSY_WARPED_VERTICAL_SLAB.get()));

        valueLookupBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(NemosVerticalBlocks.STONE_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.COBBLESTONE_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.SMOOTH_STONE_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.STONE_BRICK_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.MOSSY_STONE_BRICK_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.GRANITE_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.POLISHED_GRANITE_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.DIORITE_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.POLISHED_DIORITE_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.ANDESITE_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.POLISHED_ANDESITE_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.DEEPSLATE_TILE_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.TUFF_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.POLISHED_TUFF_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.TUFF_BRICK_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.BRICK_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.MUD_BRICK_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.SANDSTONE_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.SMOOTH_SANDSTONE_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.CUT_SANDSTONE_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.RED_SANDSTONE_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.CUT_RED_SANDSTONE_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.PRISMARINE_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.PRISMARINE_BRICK_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.DARK_PRISMARINE_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.NETHER_BRICK_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.RED_NETHER_BRICK_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.BLACKSTONE_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.END_STONE_BRICK_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.PURPUR_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.QUARTZ_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.CUT_COPPER_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB.get())
                .add(NemosVerticalBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB.get());

        getOrCreateRawBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.MOSSY_STONE_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.MOSSY_TUFF_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.MOSSY_TUFF_BRICK_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.MOSSY_BRICK_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.PALE_MOSSY_STONE_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.PALE_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.PALE_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.PALE_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.PALE_MOSSY_TUFF_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.PALE_MOSSY_TUFF_BRICK_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.PALE_MOSSY_BRICK_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.CRIMSON_MOSSY_STONE_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.CRIMSON_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.CRIMSON_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.CRIMSON_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.CRIMSON_MOSSY_TUFF_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.CRIMSON_MOSSY_TUFF_BRICK_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.CRIMSON_MOSSY_BRICK_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.WARPED_MOSSY_STONE_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.WARPED_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.WARPED_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.WARPED_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.WARPED_MOSSY_TUFF_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.WARPED_MOSSY_TUFF_BRICK_VERTICAL_SLAB.get()))
                .addOptionalElement(getResourceLocationFromBlockRegistry(NemosVerticalBlocks.WARPED_MOSSY_BRICK_VERTICAL_SLAB.get()));
    }

    private ResourceLocation getResourceLocationFromBlockRegistry(Block block) {
        return BuiltInRegistries.BLOCK.getKey(block);
    }
}
