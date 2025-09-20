package com.devnemo.nemos.vertical.slabs.datagen;

import biomesoplenty.api.block.BOPBlocks;
import com.devnemo.nemos.mossy.blocks.world.level.block.NemosMossyBlocks;
import com.devnemo.nemos.vertical.slabs.client.data.models.model.NemosVerticalModelTemplates;
import com.devnemo.nemos.vertical.slabs.world.level.block.VerticalSlabBlocks;
import com.devnemo.nemos.vertical.slabs.world.level.block.state.properties.NemosVerticalBlockStateProperties;
import com.devnemo.nemos.vertical.slabs.world.level.block.state.properties.VerticalSlabType;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.client.data.models.blockstates.BlockModelDefinitionGenerator;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.blockstates.PropertyDispatch;
import net.minecraft.client.data.models.model.ModelLocationUtils;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import static net.minecraft.client.data.models.BlockModelGenerators.plainVariant;

public class ModelProvider extends FabricModelProvider {

    private static final String TOP_SUFFIX = "_top";
    private static final String SIDE_SUFFIX = "_side";
    private static final String BOTTOM_SUFFIX = "_bottom";

    public ModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.OAK_PLANKS, VerticalSlabBlocks.OAK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.SPRUCE_PLANKS, VerticalSlabBlocks.SPRUCE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.BIRCH_PLANKS, VerticalSlabBlocks.BIRCH_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.JUNGLE_PLANKS, VerticalSlabBlocks.JUNGLE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.ACACIA_PLANKS, VerticalSlabBlocks.ACACIA_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.DARK_OAK_PLANKS, VerticalSlabBlocks.DARK_OAK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.MANGROVE_PLANKS, VerticalSlabBlocks.MANGROVE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.CHERRY_PLANKS, VerticalSlabBlocks.CHERRY_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.PALE_OAK_PLANKS, VerticalSlabBlocks.PALE_OAK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.BAMBOO_PLANKS, VerticalSlabBlocks.BAMBOO_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.BAMBOO_MOSAIC, VerticalSlabBlocks.BAMBOO_MOSAIC_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.CRIMSON_PLANKS, VerticalSlabBlocks.CRIMSON_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.WARPED_PLANKS, VerticalSlabBlocks.WARPED_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.STONE, VerticalSlabBlocks.STONE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.COBBLESTONE, VerticalSlabBlocks.COBBLESTONE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.MOSSY_COBBLESTONE, VerticalSlabBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB.get());
        registerSmoothStone(blockModelGenerators);
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.STONE_BRICKS, VerticalSlabBlocks.STONE_BRICK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.MOSSY_STONE_BRICKS, VerticalSlabBlocks.MOSSY_STONE_BRICK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.GRANITE, VerticalSlabBlocks.GRANITE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.POLISHED_GRANITE, VerticalSlabBlocks.POLISHED_GRANITE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.DIORITE, VerticalSlabBlocks.DIORITE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.POLISHED_DIORITE, VerticalSlabBlocks.POLISHED_DIORITE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.ANDESITE, VerticalSlabBlocks.ANDESITE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.POLISHED_ANDESITE, VerticalSlabBlocks.POLISHED_ANDESITE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.COBBLED_DEEPSLATE, VerticalSlabBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.POLISHED_DEEPSLATE, VerticalSlabBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.DEEPSLATE_BRICKS, VerticalSlabBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.DEEPSLATE_TILES, VerticalSlabBlocks.DEEPSLATE_TILE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.TUFF, VerticalSlabBlocks.TUFF_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.POLISHED_TUFF, VerticalSlabBlocks.POLISHED_TUFF_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.TUFF_BRICKS, VerticalSlabBlocks.TUFF_BRICK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.BRICKS, VerticalSlabBlocks.BRICK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.MUD_BRICKS, VerticalSlabBlocks.MUD_BRICK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.SANDSTONE, Blocks.SANDSTONE, TOP_SUFFIX, "", BOTTOM_SUFFIX, VerticalSlabBlocks.SANDSTONE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.SANDSTONE, Blocks.SMOOTH_SANDSTONE, TOP_SUFFIX, VerticalSlabBlocks.SMOOTH_SANDSTONE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModelForCutSandstone(blockModelGenerators, Blocks.CUT_SANDSTONE, Blocks.SANDSTONE, VerticalSlabBlocks.CUT_SANDSTONE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE, TOP_SUFFIX, "", BOTTOM_SUFFIX, VerticalSlabBlocks.RED_SANDSTONE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.RED_SANDSTONE, Blocks.SMOOTH_RED_SANDSTONE, TOP_SUFFIX, VerticalSlabBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModelForCutSandstone(blockModelGenerators, Blocks.CUT_RED_SANDSTONE, Blocks.RED_SANDSTONE, VerticalSlabBlocks.CUT_RED_SANDSTONE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.PRISMARINE, VerticalSlabBlocks.PRISMARINE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.PRISMARINE_BRICKS, VerticalSlabBlocks.PRISMARINE_BRICK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.DARK_PRISMARINE, VerticalSlabBlocks.DARK_PRISMARINE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.NETHER_BRICKS, VerticalSlabBlocks.NETHER_BRICK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.RED_NETHER_BRICKS, VerticalSlabBlocks.RED_NETHER_BRICK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.BLACKSTONE, VerticalSlabBlocks.BLACKSTONE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.POLISHED_BLACKSTONE, VerticalSlabBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.POLISHED_BLACKSTONE_BRICKS, VerticalSlabBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.END_STONE_BRICKS, VerticalSlabBlocks.END_STONE_BRICK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.PURPUR_BLOCK, VerticalSlabBlocks.PURPUR_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, TOP_SUFFIX, SIDE_SUFFIX, TOP_SUFFIX, VerticalSlabBlocks.QUARTZ_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.QUARTZ_BLOCK, Blocks.SMOOTH_QUARTZ, BOTTOM_SUFFIX, VerticalSlabBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.CUT_COPPER, VerticalSlabBlocks.CUT_COPPER_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.EXPOSED_CUT_COPPER, VerticalSlabBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.WEATHERED_CUT_COPPER, VerticalSlabBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.OXIDIZED_CUT_COPPER, VerticalSlabBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.CUT_COPPER, VerticalSlabBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.EXPOSED_CUT_COPPER, VerticalSlabBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.WEATHERED_CUT_COPPER, VerticalSlabBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, Blocks.OXIDIZED_CUT_COPPER, VerticalSlabBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB.get());

        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.MOSSY_OAK_PLANKS.get(), VerticalSlabBlocks.MOSSY_OAK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.MOSSY_SPRUCE_PLANKS.get(), VerticalSlabBlocks.MOSSY_SPRUCE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.MOSSY_BIRCH_PLANKS.get(), VerticalSlabBlocks.MOSSY_BIRCH_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.MOSSY_JUNGLE_PLANKS.get(), VerticalSlabBlocks.MOSSY_JUNGLE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.MOSSY_ACACIA_PLANKS.get(), VerticalSlabBlocks.MOSSY_ACACIA_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.MOSSY_DARK_OAK_PLANKS.get(), VerticalSlabBlocks.MOSSY_DARK_OAK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.MOSSY_MANGROVE_PLANKS.get(), VerticalSlabBlocks.MOSSY_MANGROVE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.MOSSY_CHERRY_PLANKS.get(), VerticalSlabBlocks.MOSSY_CHERRY_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.MOSSY_PALE_OAK_PLANKS.get(), VerticalSlabBlocks.MOSSY_PALE_OAK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.MOSSY_BAMBOO_PLANKS.get(), VerticalSlabBlocks.MOSSY_BAMBOO_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.MOSSY_BAMBOO_MOSAIC.get(), VerticalSlabBlocks.MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.MOSSY_CRIMSON_PLANKS.get(), VerticalSlabBlocks.MOSSY_CRIMSON_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.MOSSY_WARPED_PLANKS.get(), VerticalSlabBlocks.MOSSY_WARPED_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.MOSSY_STONE.get(), VerticalSlabBlocks.MOSSY_STONE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.MOSSY_COBBLED_DEEPSLATE.get(), VerticalSlabBlocks.MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.MOSSY_DEEPSLATE_BRICKS.get(), VerticalSlabBlocks.MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.MOSSY_DEEPSLATE_TILES.get(), VerticalSlabBlocks.MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.MOSSY_TUFF.get(), VerticalSlabBlocks.MOSSY_TUFF_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.MOSSY_TUFF_BRICKS.get(), VerticalSlabBlocks.MOSSY_TUFF_BRICK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.MOSSY_BRICKS.get(), VerticalSlabBlocks.MOSSY_BRICK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.PALE_MOSSY_OAK_PLANKS.get(), VerticalSlabBlocks.PALE_MOSSY_OAK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.PALE_MOSSY_SPRUCE_PLANKS.get(), VerticalSlabBlocks.PALE_MOSSY_SPRUCE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.PALE_MOSSY_BIRCH_PLANKS.get(), VerticalSlabBlocks.PALE_MOSSY_BIRCH_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.PALE_MOSSY_JUNGLE_PLANKS.get(), VerticalSlabBlocks.PALE_MOSSY_JUNGLE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.PALE_MOSSY_ACACIA_PLANKS.get(), VerticalSlabBlocks.PALE_MOSSY_ACACIA_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.PALE_MOSSY_DARK_OAK_PLANKS.get(), VerticalSlabBlocks.PALE_MOSSY_DARK_OAK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.PALE_MOSSY_MANGROVE_PLANKS.get(), VerticalSlabBlocks.PALE_MOSSY_MANGROVE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.PALE_MOSSY_CHERRY_PLANKS.get(), VerticalSlabBlocks.PALE_MOSSY_CHERRY_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.PALE_MOSSY_PALE_OAK_PLANKS.get(), VerticalSlabBlocks.PALE_MOSSY_PALE_OAK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.PALE_MOSSY_BAMBOO_PLANKS.get(), VerticalSlabBlocks.PALE_MOSSY_BAMBOO_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.PALE_MOSSY_BAMBOO_MOSAIC.get(), VerticalSlabBlocks.PALE_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.PALE_MOSSY_CRIMSON_PLANKS.get(), VerticalSlabBlocks.PALE_MOSSY_CRIMSON_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.PALE_MOSSY_WARPED_PLANKS.get(), VerticalSlabBlocks.PALE_MOSSY_WARPED_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.PALE_MOSSY_STONE.get(), VerticalSlabBlocks.PALE_MOSSY_STONE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.PALE_MOSSY_COBBLED_DEEPSLATE.get(), VerticalSlabBlocks.PALE_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.PALE_MOSSY_DEEPSLATE_BRICKS.get(), VerticalSlabBlocks.PALE_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.PALE_MOSSY_DEEPSLATE_TILES.get(), VerticalSlabBlocks.PALE_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.PALE_MOSSY_TUFF.get(), VerticalSlabBlocks.PALE_MOSSY_TUFF_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.PALE_MOSSY_TUFF_BRICKS.get(), VerticalSlabBlocks.PALE_MOSSY_TUFF_BRICK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.PALE_MOSSY_BRICKS.get(), VerticalSlabBlocks.PALE_MOSSY_BRICK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.CRIMSON_MOSSY_OAK_PLANKS.get(), VerticalSlabBlocks.CRIMSON_MOSSY_OAK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.CRIMSON_MOSSY_SPRUCE_PLANKS.get(), VerticalSlabBlocks.CRIMSON_MOSSY_SPRUCE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.CRIMSON_MOSSY_BIRCH_PLANKS.get(), VerticalSlabBlocks.CRIMSON_MOSSY_BIRCH_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.CRIMSON_MOSSY_JUNGLE_PLANKS.get(), VerticalSlabBlocks.CRIMSON_MOSSY_JUNGLE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.CRIMSON_MOSSY_ACACIA_PLANKS.get(), VerticalSlabBlocks.CRIMSON_MOSSY_ACACIA_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.CRIMSON_MOSSY_DARK_OAK_PLANKS.get(), VerticalSlabBlocks.CRIMSON_MOSSY_DARK_OAK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.CRIMSON_MOSSY_MANGROVE_PLANKS.get(), VerticalSlabBlocks.CRIMSON_MOSSY_MANGROVE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.CRIMSON_MOSSY_CHERRY_PLANKS.get(), VerticalSlabBlocks.CRIMSON_MOSSY_CHERRY_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.CRIMSON_MOSSY_PALE_OAK_PLANKS.get(), VerticalSlabBlocks.CRIMSON_MOSSY_PALE_OAK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.CRIMSON_MOSSY_BAMBOO_PLANKS.get(), VerticalSlabBlocks.CRIMSON_MOSSY_BAMBOO_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.CRIMSON_MOSSY_BAMBOO_MOSAIC.get(), VerticalSlabBlocks.CRIMSON_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.CRIMSON_MOSSY_CRIMSON_PLANKS.get(), VerticalSlabBlocks.CRIMSON_MOSSY_CRIMSON_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.CRIMSON_MOSSY_WARPED_PLANKS.get(), VerticalSlabBlocks.CRIMSON_MOSSY_WARPED_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.CRIMSON_MOSSY_STONE.get(), VerticalSlabBlocks.CRIMSON_MOSSY_STONE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.CRIMSON_MOSSY_COBBLED_DEEPSLATE.get(), VerticalSlabBlocks.CRIMSON_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.CRIMSON_MOSSY_DEEPSLATE_BRICKS.get(), VerticalSlabBlocks.CRIMSON_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.CRIMSON_MOSSY_DEEPSLATE_TILES.get(), VerticalSlabBlocks.CRIMSON_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.CRIMSON_MOSSY_TUFF.get(), VerticalSlabBlocks.CRIMSON_MOSSY_TUFF_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.CRIMSON_MOSSY_TUFF_BRICKS.get(), VerticalSlabBlocks.CRIMSON_MOSSY_TUFF_BRICK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.CRIMSON_MOSSY_BRICKS.get(), VerticalSlabBlocks.CRIMSON_MOSSY_BRICK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.WARPED_MOSSY_OAK_PLANKS.get(), VerticalSlabBlocks.WARPED_MOSSY_OAK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.WARPED_MOSSY_SPRUCE_PLANKS.get(), VerticalSlabBlocks.WARPED_MOSSY_SPRUCE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.WARPED_MOSSY_BIRCH_PLANKS.get(), VerticalSlabBlocks.WARPED_MOSSY_BIRCH_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.WARPED_MOSSY_JUNGLE_PLANKS.get(), VerticalSlabBlocks.WARPED_MOSSY_JUNGLE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.WARPED_MOSSY_ACACIA_PLANKS.get(), VerticalSlabBlocks.WARPED_MOSSY_ACACIA_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.WARPED_MOSSY_DARK_OAK_PLANKS.get(), VerticalSlabBlocks.WARPED_MOSSY_DARK_OAK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.WARPED_MOSSY_MANGROVE_PLANKS.get(), VerticalSlabBlocks.WARPED_MOSSY_MANGROVE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.WARPED_MOSSY_CHERRY_PLANKS.get(), VerticalSlabBlocks.WARPED_MOSSY_CHERRY_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.WARPED_MOSSY_PALE_OAK_PLANKS.get(), VerticalSlabBlocks.WARPED_MOSSY_PALE_OAK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.WARPED_MOSSY_BAMBOO_PLANKS.get(), VerticalSlabBlocks.WARPED_MOSSY_BAMBOO_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.WARPED_MOSSY_BAMBOO_MOSAIC.get(), VerticalSlabBlocks.WARPED_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.WARPED_MOSSY_CRIMSON_PLANKS.get(), VerticalSlabBlocks.WARPED_MOSSY_CRIMSON_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.WARPED_MOSSY_WARPED_PLANKS.get(), VerticalSlabBlocks.WARPED_MOSSY_WARPED_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.WARPED_MOSSY_STONE.get(), VerticalSlabBlocks.WARPED_MOSSY_STONE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.WARPED_MOSSY_COBBLED_DEEPSLATE.get(), VerticalSlabBlocks.WARPED_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.WARPED_MOSSY_DEEPSLATE_BRICKS.get(), VerticalSlabBlocks.WARPED_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.WARPED_MOSSY_DEEPSLATE_TILES.get(), VerticalSlabBlocks.WARPED_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.WARPED_MOSSY_TUFF.get(), VerticalSlabBlocks.WARPED_MOSSY_TUFF_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.WARPED_MOSSY_TUFF_BRICKS.get(), VerticalSlabBlocks.WARPED_MOSSY_TUFF_BRICK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, NemosMossyBlocks.WARPED_MOSSY_BRICKS.get(), VerticalSlabBlocks.WARPED_MOSSY_BRICK_VERTICAL_SLAB.get());

        generateVerticalSlabBlockModelForCutSandstone(blockModelGenerators, BOPBlocks.CUT_WHITE_SANDSTONE, BOPBlocks.WHITE_SANDSTONE, VerticalSlabBlocks.CUT_WHITE_SANDSTONE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, BOPBlocks.WHITE_SANDSTONE, BOPBlocks.SMOOTH_WHITE_SANDSTONE, TOP_SUFFIX, VerticalSlabBlocks.SMOOTH_WHITE_SANDSTONE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, BOPBlocks.WHITE_SANDSTONE, BOPBlocks.WHITE_SANDSTONE, TOP_SUFFIX, "", BOTTOM_SUFFIX, VerticalSlabBlocks.WHITE_SANDSTONE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModelForCutSandstone(blockModelGenerators, BOPBlocks.CUT_ORANGE_SANDSTONE, BOPBlocks.ORANGE_SANDSTONE, VerticalSlabBlocks.CUT_ORANGE_SANDSTONE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, BOPBlocks.ORANGE_SANDSTONE, BOPBlocks.SMOOTH_ORANGE_SANDSTONE, TOP_SUFFIX, VerticalSlabBlocks.SMOOTH_ORANGE_SANDSTONE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, BOPBlocks.ORANGE_SANDSTONE, BOPBlocks.ORANGE_SANDSTONE, TOP_SUFFIX, "", BOTTOM_SUFFIX, VerticalSlabBlocks.ORANGE_SANDSTONE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModelForCutSandstone(blockModelGenerators, BOPBlocks.CUT_BLACK_SANDSTONE, BOPBlocks.BLACK_SANDSTONE, VerticalSlabBlocks.CUT_BLACK_SANDSTONE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, BOPBlocks.BLACK_SANDSTONE, BOPBlocks.SMOOTH_BLACK_SANDSTONE, TOP_SUFFIX, VerticalSlabBlocks.SMOOTH_BLACK_SANDSTONE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, BOPBlocks.BLACK_SANDSTONE, BOPBlocks.BLACK_SANDSTONE, TOP_SUFFIX, "", BOTTOM_SUFFIX, VerticalSlabBlocks.BLACK_SANDSTONE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, BOPBlocks.BRIMSTONE_BRICKS, VerticalSlabBlocks.BRIMSTONE_BRICK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, BOPBlocks.FIR_PLANKS, VerticalSlabBlocks.FIR_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, BOPBlocks.PINE_PLANKS, VerticalSlabBlocks.PINE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, BOPBlocks.MAPLE_PLANKS, VerticalSlabBlocks.MAPLE_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, BOPBlocks.REDWOOD_PLANKS, VerticalSlabBlocks.REDWOOD_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, BOPBlocks.MAHOGANY_PLANKS, VerticalSlabBlocks.MAHOGANY_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, BOPBlocks.JACARANDA_PLANKS, VerticalSlabBlocks.JACARANDA_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, BOPBlocks.PALM_PLANKS, VerticalSlabBlocks.PALM_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, BOPBlocks.WILLOW_PLANKS, VerticalSlabBlocks.WILLOW_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, BOPBlocks.DEAD_PLANKS, VerticalSlabBlocks.DEAD_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, BOPBlocks.MAGIC_PLANKS, VerticalSlabBlocks.MAGIC_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, BOPBlocks.UMBRAN_PLANKS, VerticalSlabBlocks.UMBRAN_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, BOPBlocks.HELLBARK_PLANKS, VerticalSlabBlocks.HELLBARK_VERTICAL_SLAB.get());
        generateVerticalSlabBlockModel(blockModelGenerators, BOPBlocks.EMPYREAL_PLANKS, VerticalSlabBlocks.EMPYREAL_VERTICAL_SLAB.get());
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

        var multiVariant = plainVariant(NemosVerticalModelTemplates.VERTICAL_SLAB.create(
                VerticalSlabBlocks.SMOOTH_STONE_VERTICAL_SLAB.get(),
                textureMapping,
                blockModelGenerators.modelOutput
        ));
        var leftMultiVariant = plainVariant(NemosVerticalModelTemplates.VERTICAL_SLAB_LEFT.createWithSuffix(VerticalSlabBlocks.SMOOTH_STONE_VERTICAL_SLAB.get(), "_left", textureMapping, blockModelGenerators.modelOutput));
        var rightMultiVariant = plainVariant(NemosVerticalModelTemplates.VERTICAL_SLAB_RIGHT.createWithSuffix(VerticalSlabBlocks.SMOOTH_STONE_VERTICAL_SLAB.get(), "_right", textureMapping, blockModelGenerators.modelOutput));
        var backMultiVariant = plainVariant(NemosVerticalModelTemplates.VERTICAL_SLAB_BACK.createWithSuffix(VerticalSlabBlocks.SMOOTH_STONE_VERTICAL_SLAB.get(), "_back", textureMapping, blockModelGenerators.modelOutput));
        var fullMultiVariant = plainVariant(ModelTemplates.CUBE_COLUMN.createWithOverride(VerticalSlabBlocks.SMOOTH_STONE_VERTICAL_SLAB.get(), "_double", textureMapping2, blockModelGenerators.modelOutput));

        blockModelGenerators.blockStateOutput.accept(createVerticalSlabBlockState(VerticalSlabBlocks.SMOOTH_STONE_VERTICAL_SLAB.get(), multiVariant, leftMultiVariant, rightMultiVariant, backMultiVariant, fullMultiVariant));
    }

    private void generateVerticalSlabBlockModel(BlockModelGenerators blockModelGenerators, Block textureBlock, Block block) {
        var textureMapping = new TextureMapping().put(TextureSlot.TOP, TextureMapping.getBlockTexture(textureBlock))
                .put(TextureSlot.SIDE, TextureMapping.getBlockTexture(textureBlock))
                .put(TextureSlot.BOTTOM, TextureMapping.getBlockTexture(textureBlock))
                .put(TextureSlot.PARTICLE, TextureMapping.getBlockTexture(textureBlock));
        var fullMultiVariant = plainVariant(ModelLocationUtils.getModelLocation(textureBlock));

        generateVerticalSlabBlockModel(blockModelGenerators, textureMapping, block, fullMultiVariant);
    }

    private void generateVerticalSlabBlockModel(BlockModelGenerators blockModelGenerators, Block textureBlock, Block fullBlock, String suffix, Block block) {
        generateVerticalSlabBlockModel(blockModelGenerators, textureBlock, fullBlock, suffix, suffix, suffix, block);
    }

    private void generateVerticalSlabBlockModel(BlockModelGenerators blockModelGenerators, Block textureBlock, Block fullBlock, String topSuffix, String sideSuffix, String bottomSuffix, Block block) {
        var textureMapping = new TextureMapping().put(TextureSlot.TOP, TextureMapping.getBlockTexture(textureBlock).withSuffix(topSuffix))
                .put(TextureSlot.SIDE, TextureMapping.getBlockTexture(textureBlock).withSuffix(sideSuffix))
                .put(TextureSlot.BOTTOM, TextureMapping.getBlockTexture(textureBlock).withSuffix(bottomSuffix))
                .put(TextureSlot.PARTICLE, TextureMapping.getBlockTexture(textureBlock).withSuffix(topSuffix));
        var fullMultiVariant = plainVariant(ModelLocationUtils.getModelLocation(fullBlock));

        generateVerticalSlabBlockModel(blockModelGenerators, textureMapping, block, fullMultiVariant);
    }

    private void generateVerticalSlabBlockModelForCutSandstone(BlockModelGenerators blockModelGenerators, Block textureBlock, Block secondTextureBlock, Block block) {
        var textureMapping = new TextureMapping().put(TextureSlot.TOP, TextureMapping.getBlockTexture(secondTextureBlock).withSuffix(TOP_SUFFIX))
                .put(TextureSlot.SIDE, TextureMapping.getBlockTexture(textureBlock))
                .put(TextureSlot.BOTTOM, TextureMapping.getBlockTexture(secondTextureBlock).withSuffix(BOTTOM_SUFFIX))
                .put(TextureSlot.PARTICLE, TextureMapping.getBlockTexture(textureBlock));
        var fullMultiVariant = plainVariant(ModelLocationUtils.getModelLocation(textureBlock));

        generateVerticalSlabBlockModel(blockModelGenerators, textureMapping, block, fullMultiVariant);
    }

    private void generateVerticalSlabBlockModel(
            BlockModelGenerators blockModelGenerators,
            TextureMapping textureMapping,
            Block block,
            MultiVariant fullMultiVariant
    ) {
        var multiVariant = plainVariant(NemosVerticalModelTemplates.VERTICAL_SLAB.create(block, textureMapping, blockModelGenerators.modelOutput));
        var leftMultiVariant = plainVariant(NemosVerticalModelTemplates.VERTICAL_SLAB_LEFT.createWithSuffix(block, "_left", textureMapping, blockModelGenerators.modelOutput));
        var rightMultiVariant = plainVariant(NemosVerticalModelTemplates.VERTICAL_SLAB_RIGHT.createWithSuffix(block, "_right", textureMapping, blockModelGenerators.modelOutput));
        var backMultiVariant = plainVariant(NemosVerticalModelTemplates.VERTICAL_SLAB_BACK.createWithSuffix(block, "_back", textureMapping, blockModelGenerators.modelOutput));

        blockModelGenerators.blockStateOutput.accept(createVerticalSlabBlockState(block, multiVariant, leftMultiVariant, rightMultiVariant, backMultiVariant, fullMultiVariant));
    }

    public static BlockModelDefinitionGenerator createVerticalSlabBlockState(
            Block verticalSlabBlock,
            MultiVariant multiVariant,
            MultiVariant leftMultiVariant,
            MultiVariant rightMultiVariant,
            MultiVariant backMultiVariant,
            MultiVariant fullMultiVariant) {
        return MultiVariantGenerator.dispatch(verticalSlabBlock)
                .with(
                        PropertyDispatch.initial(NemosVerticalBlockStateProperties.VERTICAL_SLAB_TYPE)
                                .select(VerticalSlabType.FRONT, multiVariant)
                                .select(VerticalSlabType.LEFT, leftMultiVariant)
                                .select(VerticalSlabType.RIGHT, rightMultiVariant)
                                .select(VerticalSlabType.BACK, backMultiVariant)
                                .select(VerticalSlabType.DOUBLE, fullMultiVariant)
                );
    }
}
