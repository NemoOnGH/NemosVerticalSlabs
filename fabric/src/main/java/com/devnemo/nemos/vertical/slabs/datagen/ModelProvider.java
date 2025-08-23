package com.devnemo.nemos.vertical.slabs.datagen;

import biomesoplenty.api.block.BOPBlocks;
import com.devnemo.nemos.vertical.slabs.client.data.models.model.NemosVerticalModelTemplates;
import com.devnemo.nemos.vertical.slabs.world.level.block.NemosVerticalBlocks;
import com.devnemo.nemos.vertical.slabs.world.level.block.state.properties.NemosVerticalBlockStateProperties;
import com.devnemo.nemos.vertical.slabs.world.level.block.state.properties.VerticalSlabType;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.data.models.blockstates.PropertyDispatch;
import net.minecraft.data.models.blockstates.Variant;
import net.minecraft.data.models.blockstates.VariantProperties;
import net.minecraft.data.models.model.ModelLocationUtils;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.data.models.model.TextureSlot;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class ModelProvider extends FabricModelProvider {

    private static final String TOP_SUFFIX = "_top";
    private static final String SIDE_SUFFIX = "_side";
    private static final String BOTTOM_SUFFIX = "_bottom";

    public ModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.OAK_PLANKS, NemosVerticalBlocks.OAK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.SPRUCE_PLANKS, NemosVerticalBlocks.SPRUCE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.BIRCH_PLANKS, NemosVerticalBlocks.BIRCH_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.JUNGLE_PLANKS, NemosVerticalBlocks.JUNGLE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.ACACIA_PLANKS, NemosVerticalBlocks.ACACIA_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.DARK_OAK_PLANKS, NemosVerticalBlocks.DARK_OAK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.MANGROVE_PLANKS, NemosVerticalBlocks.MANGROVE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.CHERRY_PLANKS, NemosVerticalBlocks.CHERRY_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.BAMBOO_PLANKS, NemosVerticalBlocks.BAMBOO_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.BAMBOO_MOSAIC, NemosVerticalBlocks.BAMBOO_MOSAIC_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.CRIMSON_PLANKS, NemosVerticalBlocks.CRIMSON_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.WARPED_PLANKS, NemosVerticalBlocks.WARPED_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.STONE, NemosVerticalBlocks.STONE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.COBBLESTONE, NemosVerticalBlocks.COBBLESTONE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.MOSSY_COBBLESTONE, NemosVerticalBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB.get());
        registerSmoothStone(blockModelGenerators);
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.STONE_BRICKS, NemosVerticalBlocks.STONE_BRICK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.MOSSY_STONE_BRICKS, NemosVerticalBlocks.MOSSY_STONE_BRICK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.GRANITE, NemosVerticalBlocks.GRANITE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.POLISHED_GRANITE, NemosVerticalBlocks.POLISHED_GRANITE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.DIORITE, NemosVerticalBlocks.DIORITE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.POLISHED_DIORITE, NemosVerticalBlocks.POLISHED_DIORITE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.ANDESITE, NemosVerticalBlocks.ANDESITE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.POLISHED_ANDESITE, NemosVerticalBlocks.POLISHED_ANDESITE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.COBBLED_DEEPSLATE, NemosVerticalBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.POLISHED_DEEPSLATE, NemosVerticalBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.DEEPSLATE_BRICKS, NemosVerticalBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.DEEPSLATE_TILES, NemosVerticalBlocks.DEEPSLATE_TILE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.TUFF, NemosVerticalBlocks.TUFF_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.POLISHED_TUFF, NemosVerticalBlocks.POLISHED_TUFF_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.TUFF_BRICKS, NemosVerticalBlocks.TUFF_BRICK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.BRICKS, NemosVerticalBlocks.BRICK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.MUD_BRICKS, NemosVerticalBlocks.MUD_BRICK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.SANDSTONE, Blocks.SANDSTONE, TOP_SUFFIX, "", BOTTOM_SUFFIX, NemosVerticalBlocks.SANDSTONE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.SANDSTONE, Blocks.SMOOTH_SANDSTONE, TOP_SUFFIX, NemosVerticalBlocks.SMOOTH_SANDSTONE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModelForCutSandstone(blockModelGenerators, Blocks.CUT_SANDSTONE, Blocks.SANDSTONE, NemosVerticalBlocks.CUT_SANDSTONE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE, TOP_SUFFIX, "", BOTTOM_SUFFIX, NemosVerticalBlocks.RED_SANDSTONE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.RED_SANDSTONE, Blocks.SMOOTH_RED_SANDSTONE, TOP_SUFFIX, NemosVerticalBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModelForCutSandstone(blockModelGenerators, Blocks.CUT_RED_SANDSTONE, Blocks.RED_SANDSTONE, NemosVerticalBlocks.CUT_RED_SANDSTONE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.PRISMARINE, NemosVerticalBlocks.PRISMARINE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.PRISMARINE_BRICKS, NemosVerticalBlocks.PRISMARINE_BRICK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.DARK_PRISMARINE, NemosVerticalBlocks.DARK_PRISMARINE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.NETHER_BRICKS, NemosVerticalBlocks.NETHER_BRICK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.RED_NETHER_BRICKS, NemosVerticalBlocks.RED_NETHER_BRICK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.BLACKSTONE, NemosVerticalBlocks.BLACKSTONE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.POLISHED_BLACKSTONE, NemosVerticalBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.POLISHED_BLACKSTONE_BRICKS, NemosVerticalBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.END_STONE_BRICKS, NemosVerticalBlocks.END_STONE_BRICK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.PURPUR_BLOCK, NemosVerticalBlocks.PURPUR_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, TOP_SUFFIX, SIDE_SUFFIX, TOP_SUFFIX, NemosVerticalBlocks.QUARTZ_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.QUARTZ_BLOCK, Blocks.SMOOTH_QUARTZ, BOTTOM_SUFFIX, NemosVerticalBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.CUT_COPPER, NemosVerticalBlocks.CUT_COPPER_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.EXPOSED_CUT_COPPER, NemosVerticalBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.WEATHERED_CUT_COPPER, NemosVerticalBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.OXIDIZED_CUT_COPPER, NemosVerticalBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.CUT_COPPER, NemosVerticalBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.EXPOSED_CUT_COPPER, NemosVerticalBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.WEATHERED_CUT_COPPER, NemosVerticalBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.OXIDIZED_CUT_COPPER, NemosVerticalBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB.get());

//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.MOSSY_OAK_PLANKS.get(), NemosVerticalBlocks.MOSSY_OAK_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.MOSSY_SPRUCE_PLANKS.get(), NemosVerticalBlocks.MOSSY_SPRUCE_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.MOSSY_BIRCH_PLANKS.get(), NemosVerticalBlocks.MOSSY_BIRCH_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.MOSSY_JUNGLE_PLANKS.get(), NemosVerticalBlocks.MOSSY_JUNGLE_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.MOSSY_ACACIA_PLANKS.get(), NemosVerticalBlocks.MOSSY_ACACIA_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.MOSSY_DARK_OAK_PLANKS.get(), NemosVerticalBlocks.MOSSY_DARK_OAK_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.MOSSY_MANGROVE_PLANKS.get(), NemosVerticalBlocks.MOSSY_MANGROVE_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.MOSSY_CHERRY_PLANKS.get(), NemosVerticalBlocks.MOSSY_CHERRY_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.MOSSY_BAMBOO_PLANKS.get(), NemosVerticalBlocks.MOSSY_BAMBOO_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.MOSSY_BAMBOO_MOSAIC.get(), NemosVerticalBlocks.MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.MOSSY_CRIMSON_PLANKS.get(), NemosVerticalBlocks.MOSSY_CRIMSON_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.MOSSY_WARPED_PLANKS.get(), NemosVerticalBlocks.MOSSY_WARPED_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.MOSSY_STONE.get(), NemosVerticalBlocks.MOSSY_STONE_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.MOSSY_COBBLED_DEEPSLATE.get(), NemosVerticalBlocks.MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.MOSSY_DEEPSLATE_BRICKS.get(), NemosVerticalBlocks.MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.MOSSY_DEEPSLATE_TILES.get(), NemosVerticalBlocks.MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.MOSSY_TUFF.get(), NemosVerticalBlocks.MOSSY_TUFF_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.MOSSY_TUFF_BRICKS.get(), NemosVerticalBlocks.MOSSY_TUFF_BRICK_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.MOSSY_BRICKS.get(), NemosVerticalBlocks.MOSSY_BRICK_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.PALE_MOSSY_OAK_PLANKS.get(), NemosVerticalBlocks.PALE_MOSSY_OAK_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.PALE_MOSSY_SPRUCE_PLANKS.get(), NemosVerticalBlocks.PALE_MOSSY_SPRUCE_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.PALE_MOSSY_BIRCH_PLANKS.get(), NemosVerticalBlocks.PALE_MOSSY_BIRCH_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.PALE_MOSSY_JUNGLE_PLANKS.get(), NemosVerticalBlocks.PALE_MOSSY_JUNGLE_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.PALE_MOSSY_ACACIA_PLANKS.get(), NemosVerticalBlocks.PALE_MOSSY_ACACIA_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.PALE_MOSSY_DARK_OAK_PLANKS.get(), NemosVerticalBlocks.PALE_MOSSY_DARK_OAK_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.PALE_MOSSY_MANGROVE_PLANKS.get(), NemosVerticalBlocks.PALE_MOSSY_MANGROVE_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.PALE_MOSSY_CHERRY_PLANKS.get(), NemosVerticalBlocks.PALE_MOSSY_CHERRY_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.PALE_MOSSY_BAMBOO_PLANKS.get(), NemosVerticalBlocks.PALE_MOSSY_BAMBOO_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.PALE_MOSSY_BAMBOO_MOSAIC.get(), NemosVerticalBlocks.PALE_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.PALE_MOSSY_CRIMSON_PLANKS.get(), NemosVerticalBlocks.PALE_MOSSY_CRIMSON_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.PALE_MOSSY_WARPED_PLANKS.get(), NemosVerticalBlocks.PALE_MOSSY_WARPED_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.PALE_MOSSY_STONE.get(), NemosVerticalBlocks.PALE_MOSSY_STONE_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.PALE_MOSSY_COBBLED_DEEPSLATE.get(), NemosVerticalBlocks.PALE_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.PALE_MOSSY_DEEPSLATE_BRICKS.get(), NemosVerticalBlocks.PALE_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.PALE_MOSSY_DEEPSLATE_TILES.get(), NemosVerticalBlocks.PALE_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.PALE_MOSSY_TUFF.get(), NemosVerticalBlocks.PALE_MOSSY_TUFF_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.PALE_MOSSY_TUFF_BRICKS.get(), NemosVerticalBlocks.PALE_MOSSY_TUFF_BRICK_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.PALE_MOSSY_BRICKS.get(), NemosVerticalBlocks.PALE_MOSSY_BRICK_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.CRIMSON_MOSSY_OAK_PLANKS.get(), NemosVerticalBlocks.CRIMSON_MOSSY_OAK_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.CRIMSON_MOSSY_SPRUCE_PLANKS.get(), NemosVerticalBlocks.CRIMSON_MOSSY_SPRUCE_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.CRIMSON_MOSSY_BIRCH_PLANKS.get(), NemosVerticalBlocks.CRIMSON_MOSSY_BIRCH_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.CRIMSON_MOSSY_JUNGLE_PLANKS.get(), NemosVerticalBlocks.CRIMSON_MOSSY_JUNGLE_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.CRIMSON_MOSSY_ACACIA_PLANKS.get(), NemosVerticalBlocks.CRIMSON_MOSSY_ACACIA_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.CRIMSON_MOSSY_DARK_OAK_PLANKS.get(), NemosVerticalBlocks.CRIMSON_MOSSY_DARK_OAK_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.CRIMSON_MOSSY_MANGROVE_PLANKS.get(), NemosVerticalBlocks.CRIMSON_MOSSY_MANGROVE_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.CRIMSON_MOSSY_CHERRY_PLANKS.get(), NemosVerticalBlocks.CRIMSON_MOSSY_CHERRY_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.CRIMSON_MOSSY_BAMBOO_PLANKS.get(), NemosVerticalBlocks.CRIMSON_MOSSY_BAMBOO_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.CRIMSON_MOSSY_BAMBOO_MOSAIC.get(), NemosVerticalBlocks.CRIMSON_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.CRIMSON_MOSSY_CRIMSON_PLANKS.get(), NemosVerticalBlocks.CRIMSON_MOSSY_CRIMSON_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.CRIMSON_MOSSY_WARPED_PLANKS.get(), NemosVerticalBlocks.CRIMSON_MOSSY_WARPED_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.CRIMSON_MOSSY_STONE.get(), NemosVerticalBlocks.CRIMSON_MOSSY_STONE_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.CRIMSON_MOSSY_COBBLED_DEEPSLATE.get(), NemosVerticalBlocks.CRIMSON_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.CRIMSON_MOSSY_DEEPSLATE_BRICKS.get(), NemosVerticalBlocks.CRIMSON_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.CRIMSON_MOSSY_DEEPSLATE_TILES.get(), NemosVerticalBlocks.CRIMSON_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.CRIMSON_MOSSY_TUFF.get(), NemosVerticalBlocks.CRIMSON_MOSSY_TUFF_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.CRIMSON_MOSSY_TUFF_BRICKS.get(), NemosVerticalBlocks.CRIMSON_MOSSY_TUFF_BRICK_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.CRIMSON_MOSSY_BRICKS.get(), NemosVerticalBlocks.CRIMSON_MOSSY_BRICK_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.WARPED_MOSSY_OAK_PLANKS.get(), NemosVerticalBlocks.WARPED_MOSSY_OAK_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.WARPED_MOSSY_SPRUCE_PLANKS.get(), NemosVerticalBlocks.WARPED_MOSSY_SPRUCE_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.WARPED_MOSSY_BIRCH_PLANKS.get(), NemosVerticalBlocks.WARPED_MOSSY_BIRCH_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.WARPED_MOSSY_JUNGLE_PLANKS.get(), NemosVerticalBlocks.WARPED_MOSSY_JUNGLE_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.WARPED_MOSSY_ACACIA_PLANKS.get(), NemosVerticalBlocks.WARPED_MOSSY_ACACIA_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.WARPED_MOSSY_DARK_OAK_PLANKS.get(), NemosVerticalBlocks.WARPED_MOSSY_DARK_OAK_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.WARPED_MOSSY_MANGROVE_PLANKS.get(), NemosVerticalBlocks.WARPED_MOSSY_MANGROVE_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.WARPED_MOSSY_CHERRY_PLANKS.get(), NemosVerticalBlocks.WARPED_MOSSY_CHERRY_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.WARPED_MOSSY_BAMBOO_PLANKS.get(), NemosVerticalBlocks.WARPED_MOSSY_BAMBOO_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.WARPED_MOSSY_BAMBOO_MOSAIC.get(), NemosVerticalBlocks.WARPED_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.WARPED_MOSSY_CRIMSON_PLANKS.get(), NemosVerticalBlocks.WARPED_MOSSY_CRIMSON_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.WARPED_MOSSY_WARPED_PLANKS.get(), NemosVerticalBlocks.WARPED_MOSSY_WARPED_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.WARPED_MOSSY_STONE.get(), NemosVerticalBlocks.WARPED_MOSSY_STONE_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.WARPED_MOSSY_COBBLED_DEEPSLATE.get(), NemosVerticalBlocks.WARPED_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.WARPED_MOSSY_DEEPSLATE_BRICKS.get(), NemosVerticalBlocks.WARPED_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.WARPED_MOSSY_DEEPSLATE_TILES.get(), NemosVerticalBlocks.WARPED_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.WARPED_MOSSY_TUFF.get(), NemosVerticalBlocks.WARPED_MOSSY_TUFF_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.WARPED_MOSSY_TUFF_BRICKS.get(), NemosVerticalBlocks.WARPED_MOSSY_TUFF_BRICK_VERTICAL_SLAB.get());
//        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.WARPED_MOSSY_BRICKS.get(), NemosVerticalBlocks.WARPED_MOSSY_BRICK_VERTICAL_SLAB.get());

        generateVerticalSlabBlockModelForCutSandstone(blockModelGenerators, BOPBlocks.CUT_WHITE_SANDSTONE, BOPBlocks.WHITE_SANDSTONE, NemosVerticalBlocks.CUT_WHITE_SANDSTONE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, BOPBlocks.WHITE_SANDSTONE, BOPBlocks.SMOOTH_WHITE_SANDSTONE, TOP_SUFFIX, NemosVerticalBlocks.SMOOTH_WHITE_SANDSTONE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, BOPBlocks.WHITE_SANDSTONE, BOPBlocks.WHITE_SANDSTONE, TOP_SUFFIX, "", BOTTOM_SUFFIX, NemosVerticalBlocks.WHITE_SANDSTONE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModelForCutSandstone(blockModelGenerators, BOPBlocks.CUT_ORANGE_SANDSTONE, BOPBlocks.ORANGE_SANDSTONE, NemosVerticalBlocks.CUT_ORANGE_SANDSTONE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, BOPBlocks.ORANGE_SANDSTONE, BOPBlocks.SMOOTH_ORANGE_SANDSTONE, TOP_SUFFIX, NemosVerticalBlocks.SMOOTH_ORANGE_SANDSTONE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, BOPBlocks.ORANGE_SANDSTONE, BOPBlocks.ORANGE_SANDSTONE, TOP_SUFFIX, "", BOTTOM_SUFFIX, NemosVerticalBlocks.ORANGE_SANDSTONE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModelForCutSandstone(blockModelGenerators, BOPBlocks.CUT_BLACK_SANDSTONE, BOPBlocks.BLACK_SANDSTONE, NemosVerticalBlocks.CUT_BLACK_SANDSTONE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, BOPBlocks.BLACK_SANDSTONE, BOPBlocks.SMOOTH_BLACK_SANDSTONE, TOP_SUFFIX, NemosVerticalBlocks.SMOOTH_BLACK_SANDSTONE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, BOPBlocks.BLACK_SANDSTONE, BOPBlocks.BLACK_SANDSTONE, TOP_SUFFIX, "", BOTTOM_SUFFIX, NemosVerticalBlocks.BLACK_SANDSTONE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, BOPBlocks.BRIMSTONE_BRICKS, NemosVerticalBlocks.BRIMSTONE_BRICK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, BOPBlocks.FIR_PLANKS, NemosVerticalBlocks.FIR_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, BOPBlocks.PINE_PLANKS, NemosVerticalBlocks.PINE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, BOPBlocks.MAPLE_PLANKS, NemosVerticalBlocks.MAPLE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, BOPBlocks.REDWOOD_PLANKS, NemosVerticalBlocks.REDWOOD_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, BOPBlocks.MAHOGANY_PLANKS, NemosVerticalBlocks.MAHOGANY_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, BOPBlocks.JACARANDA_PLANKS, NemosVerticalBlocks.JACARANDA_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, BOPBlocks.PALM_PLANKS, NemosVerticalBlocks.PALM_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, BOPBlocks.WILLOW_PLANKS, NemosVerticalBlocks.WILLOW_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, BOPBlocks.DEAD_PLANKS, NemosVerticalBlocks.DEAD_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, BOPBlocks.MAGIC_PLANKS, NemosVerticalBlocks.MAGIC_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, BOPBlocks.UMBRAN_PLANKS, NemosVerticalBlocks.UMBRAN_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, BOPBlocks.HELLBARK_PLANKS, NemosVerticalBlocks.HELLBARK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, BOPBlocks.EMPYREAL_PLANKS, NemosVerticalBlocks.EMPYREAL_VERTICAL_SLAB.get());
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {

    }

    private void registerSmoothStone(BlockModelGenerators blockModelGenerators) {
        var textureMapping = new TextureMapping().put(TextureSlot.TOP, TextureMapping.getBlockTexture(Blocks.SMOOTH_STONE))
                .put(TextureSlot.SIDE, TextureMapping.getBlockTexture(Blocks.SMOOTH_STONE_SLAB).withSuffix("_side"))
                .put(TextureSlot.BOTTOM, TextureMapping.getBlockTexture(Blocks.SMOOTH_STONE))
                .put(TextureSlot.PARTICLE, TextureMapping.getBlockTexture(Blocks.SMOOTH_STONE));
        var textureMapping2 = TextureMapping.column(TextureMapping.getBlockTexture(Blocks.SMOOTH_STONE_SLAB, "_side"), textureMapping.get(TextureSlot.TOP));

        var modelId = NemosVerticalModelTemplates.VERTICAL_SLAB.create(
                NemosVerticalBlocks.SMOOTH_STONE_VERTICAL_SLAB.get(),
                textureMapping,
                blockModelGenerators.modelOutput
        );
        var leftModelId = NemosVerticalModelTemplates.VERTICAL_SLAB_LEFT.createWithSuffix(NemosVerticalBlocks.SMOOTH_STONE_VERTICAL_SLAB.get(), "_left", textureMapping, blockModelGenerators.modelOutput);
        var rightModelId = NemosVerticalModelTemplates.VERTICAL_SLAB_RIGHT.createWithSuffix(NemosVerticalBlocks.SMOOTH_STONE_VERTICAL_SLAB.get(), "_right", textureMapping, blockModelGenerators.modelOutput);
        var backModelId = NemosVerticalModelTemplates.VERTICAL_SLAB_BACK.createWithSuffix(NemosVerticalBlocks.SMOOTH_STONE_VERTICAL_SLAB.get(), "_back", textureMapping, blockModelGenerators.modelOutput);
        var fullModelId = ModelTemplates.CUBE_COLUMN.createWithOverride(NemosVerticalBlocks.SMOOTH_STONE_VERTICAL_SLAB.get(), "_double", textureMapping2, blockModelGenerators.modelOutput);

        blockModelGenerators.blockStateOutput.accept(createVerticalSlabBlockState(NemosVerticalBlocks.SMOOTH_STONE_VERTICAL_SLAB.get(), modelId, leftModelId, rightModelId, backModelId, fullModelId));
    }

    private void generateVerticalSlabBlockModel(BlockModelGenerators blockModelGenerators, Block textureBlock, Block block) {
        var textureMapping = new TextureMapping().put(TextureSlot.TOP, TextureMapping.getBlockTexture(textureBlock))
                .put(TextureSlot.SIDE, TextureMapping.getBlockTexture(textureBlock))
                .put(TextureSlot.BOTTOM, TextureMapping.getBlockTexture(textureBlock))
                .put(TextureSlot.PARTICLE, TextureMapping.getBlockTexture(textureBlock));
        var fullModelId = ModelLocationUtils.getModelLocation(textureBlock);

        generateVerticalSlabBlockModel(blockModelGenerators, textureMapping, block, fullModelId);
    }

    private void generateVerticalSlabBlockModel(BlockModelGenerators blockModelGenerators, Block textureBlock, Block fullBlock, String suffix, Block block) {
        generateVerticalSlabBlockModel(blockModelGenerators, textureBlock, fullBlock, suffix, suffix, suffix, block);
    }

    private void generateVerticalSlabBlockModel(BlockModelGenerators blockModelGenerators, Block textureBlock, Block fullBlock, String topSuffix, String sideSuffix, String bottomSuffix, Block block) {
        var textureMapping = new TextureMapping().put(TextureSlot.TOP, TextureMapping.getBlockTexture(textureBlock).withSuffix(topSuffix))
                .put(TextureSlot.SIDE, TextureMapping.getBlockTexture(textureBlock).withSuffix(sideSuffix))
                .put(TextureSlot.BOTTOM, TextureMapping.getBlockTexture(textureBlock).withSuffix(bottomSuffix))
                .put(TextureSlot.PARTICLE, TextureMapping.getBlockTexture(textureBlock).withSuffix(topSuffix));
        var fullModelId = ModelLocationUtils.getModelLocation(fullBlock);

        generateVerticalSlabBlockModel(blockModelGenerators, textureMapping, block, fullModelId);
    }

    private void generateVerticalSlabBlockModelForCutSandstone(BlockModelGenerators blockModelGenerators, Block textureBlock, Block secondTextureBlock, Block block) {
        var textureMapping = new TextureMapping().put(TextureSlot.TOP, TextureMapping.getBlockTexture(secondTextureBlock).withSuffix(TOP_SUFFIX))
                .put(TextureSlot.SIDE, TextureMapping.getBlockTexture(textureBlock))
                .put(TextureSlot.BOTTOM, TextureMapping.getBlockTexture(secondTextureBlock).withSuffix(BOTTOM_SUFFIX))
                .put(TextureSlot.PARTICLE, TextureMapping.getBlockTexture(textureBlock));
        var fullModelId = ModelLocationUtils.getModelLocation(textureBlock);

        generateVerticalSlabBlockModel(blockModelGenerators, textureMapping, block, fullModelId);
    }

    private void generateVerticalSlabBlockModel(
            BlockModelGenerators blockModelGenerators,
            TextureMapping textureMapping,
            Block block,
            ResourceLocation fullModelId
    ) {
        var modelId = NemosVerticalModelTemplates.VERTICAL_SLAB.create(block, textureMapping, blockModelGenerators.modelOutput);
        var leftModelId = NemosVerticalModelTemplates.VERTICAL_SLAB_LEFT.createWithSuffix(block, "_left", textureMapping, blockModelGenerators.modelOutput);
        var rightModelId = NemosVerticalModelTemplates.VERTICAL_SLAB_RIGHT.createWithSuffix(block, "_right", textureMapping, blockModelGenerators.modelOutput);
        var backModelId = NemosVerticalModelTemplates.VERTICAL_SLAB_BACK.createWithSuffix(block, "_back", textureMapping, blockModelGenerators.modelOutput);

        blockModelGenerators.blockStateOutput.accept(createVerticalSlabBlockState(block, modelId, leftModelId, rightModelId, backModelId, fullModelId));
    }

    public static MultiVariantGenerator createVerticalSlabBlockState(
            Block verticalSlabBlock,
            ResourceLocation modelId,
            ResourceLocation leftModelId,
            ResourceLocation rightModelId,
            ResourceLocation backModelId,
            ResourceLocation fullModelId) {
        return MultiVariantGenerator.multiVariant(verticalSlabBlock)
                .with(
                        PropertyDispatch.property(NemosVerticalBlockStateProperties.VERTICAL_SLAB_TYPE)
                                .select(VerticalSlabType.FRONT, createVariant(modelId))
                                .select(VerticalSlabType.LEFT, createVariant(leftModelId))
                                .select(VerticalSlabType.RIGHT, createVariant(rightModelId))
                                .select(VerticalSlabType.BACK, createVariant(backModelId))
                                .select(VerticalSlabType.DOUBLE, createVariant(fullModelId))
                );
    }
    
    private static Variant createVariant(ResourceLocation modelId) {
        return Variant.variant().with(VariantProperties.MODEL, modelId);
    }
}
