package com.devnemo.nemos.vertical.slabs.world.level.block;

import com.devnemo.nemos.vertical.slabs.platform.Services;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;

import static net.minecraft.world.level.block.Blocks.*;

public class NemosVerticalBlocks {

    public static final Supplier<Block> OAK_VERTICAL_SLAB = register(
            "oak_vertical_slab",
            VerticalSlabBlock::new,
            OAK_SLAB);
    public static final Supplier<Block> SPRUCE_VERTICAL_SLAB = register(
            "spruce_vertical_slab",
            VerticalSlabBlock::new,
            SPRUCE_SLAB);
    public static final Supplier<Block> BIRCH_VERTICAL_SLAB = register(
            "birch_vertical_slab",
            VerticalSlabBlock::new,
            BIRCH_SLAB);
    public static final Supplier<Block> JUNGLE_VERTICAL_SLAB = register(
            "jungle_vertical_slab",
            VerticalSlabBlock::new,
            JUNGLE_SLAB);
    public static final Supplier<Block> ACACIA_VERTICAL_SLAB = register(
            "acacia_vertical_slab",
            VerticalSlabBlock::new,
            ACACIA_SLAB);
    public static final Supplier<Block> DARK_OAK_VERTICAL_SLAB = register(
            "dark_oak_vertical_slab",
            VerticalSlabBlock::new,
            DARK_OAK_SLAB);
    public static final Supplier<Block> MANGROVE_VERTICAL_SLAB = register(
            "mangrove_vertical_slab",
            VerticalSlabBlock::new,
            MANGROVE_SLAB);
    public static final Supplier<Block> CHERRY_VERTICAL_SLAB = register(
            "cherry_vertical_slab",
            VerticalSlabBlock::new,
            CHERRY_SLAB);
    public static final Supplier<Block> PALE_OAK_VERTICAL_SLAB = register(
            "pale_oak_vertical_slab",
            VerticalSlabBlock::new,
            PALE_OAK_SLAB);
    public static final Supplier<Block> BAMBOO_VERTICAL_SLAB = register(
            "bamboo_vertical_slab",
            VerticalSlabBlock::new,
            BAMBOO_SLAB);
    public static final Supplier<Block> BAMBOO_MOSAIC_VERTICAL_SLAB = register(
            "bamboo_mosaic_vertical_slab",
            VerticalSlabBlock::new,
            BAMBOO_MOSAIC_SLAB);
    public static final Supplier<Block> CRIMSON_VERTICAL_SLAB = register(
            "crimson_vertical_slab",
            VerticalSlabBlock::new,
            CRIMSON_SLAB);
    public static final Supplier<Block> WARPED_VERTICAL_SLAB = register(
            "warped_vertical_slab",
            VerticalSlabBlock::new,
            WARPED_SLAB);
    public static final Supplier<Block> STONE_VERTICAL_SLAB = register(
            "stone_vertical_slab",
            VerticalSlabBlock::new,
            STONE_SLAB);
    public static final Supplier<Block> COBBLESTONE_VERTICAL_SLAB = register(
            "cobblestone_vertical_slab",
            VerticalSlabBlock::new,
            COBBLESTONE_SLAB);
    public static final Supplier<Block> MOSSY_COBBLESTONE_VERTICAL_SLAB = register(
            "mossy_cobblestone_vertical_slab",
            VerticalSlabBlock::new,
            MOSSY_COBBLESTONE_SLAB);
    public static final Supplier<Block> SMOOTH_STONE_VERTICAL_SLAB = register(
            "smooth_stone_vertical_slab",
            VerticalSlabBlock::new,
            SMOOTH_STONE_SLAB);
    public static final Supplier<Block> STONE_BRICK_VERTICAL_SLAB = register(
            "stone_brick_vertical_slab",
            VerticalSlabBlock::new,
            STONE_BRICK_SLAB);
    public static final Supplier<Block> MOSSY_STONE_BRICK_VERTICAL_SLAB = register(
            "mossy_stone_brick_vertical_slab",
            VerticalSlabBlock::new,
            MOSSY_STONE_BRICK_SLAB);
    public static final Supplier<Block> GRANITE_VERTICAL_SLAB = register(
            "granite_vertical_slab",
            VerticalSlabBlock::new,
            GRANITE_SLAB);
    public static final Supplier<Block> POLISHED_GRANITE_VERTICAL_SLAB = register(
            "polished_granite_vertical_slab",
            VerticalSlabBlock::new,
            POLISHED_GRANITE_SLAB);
    public static final Supplier<Block> DIORITE_VERTICAL_SLAB = register(
            "diorite_vertical_slab",
            VerticalSlabBlock::new,
            DIORITE_SLAB);
    public static final Supplier<Block> POLISHED_DIORITE_VERTICAL_SLAB = register(
            "polished_diorite_vertical_slab",
            VerticalSlabBlock::new,
            POLISHED_DIORITE_SLAB);
    public static final Supplier<Block> ANDESITE_VERTICAL_SLAB = register(
            "andesite_vertical_slab",
            VerticalSlabBlock::new,
            ANDESITE_SLAB);
    public static final Supplier<Block> POLISHED_ANDESITE_VERTICAL_SLAB = register(
            "polished_andesite_vertical_slab",
            VerticalSlabBlock::new,
            POLISHED_ANDESITE_SLAB);
    public static final Supplier<Block> COBBLED_DEEPSLATE_VERTICAL_SLAB = register(
            "cobbled_deepslate_vertical_slab",
            VerticalSlabBlock::new,
            COBBLED_DEEPSLATE_SLAB);
    public static final Supplier<Block> POLISHED_DEEPSLATE_VERTICAL_SLAB = register(
            "polished_deepslate_vertical_slab",
            VerticalSlabBlock::new,
            POLISHED_DEEPSLATE_SLAB);
    public static final Supplier<Block> DEEPSLATE_BRICK_VERTICAL_SLAB = register(
            "deepslate_brick_vertical_slab",
            VerticalSlabBlock::new,
            DEEPSLATE_BRICK_SLAB);
    public static final Supplier<Block> DEEPSLATE_TILE_VERTICAL_SLAB = register(
            "deepslate_tile_vertical_slab",
            VerticalSlabBlock::new,
            DEEPSLATE_TILE_SLAB);
    public static final Supplier<Block> TUFF_VERTICAL_SLAB = register(
            "tuff_vertical_slab",
            VerticalSlabBlock::new,
            TUFF_SLAB);
    public static final Supplier<Block> POLISHED_TUFF_VERTICAL_SLAB = register(
            "polished_tuff_vertical_slab",
            VerticalSlabBlock::new,
            POLISHED_TUFF_SLAB);
    public static final Supplier<Block> TUFF_BRICK_VERTICAL_SLAB = register(
            "tuff_brick_vertical_slab",
            VerticalSlabBlock::new,
            TUFF_BRICK_SLAB);
    public static final Supplier<Block> BRICK_VERTICAL_SLAB = register(
            "brick_vertical_slab",
            VerticalSlabBlock::new,
            BRICK_SLAB);
    public static final Supplier<Block> MUD_BRICK_VERTICAL_SLAB = register(
            "mud_brick_vertical_slab",
            VerticalSlabBlock::new,
            MUD_BRICK_SLAB);
    public static final Supplier<Block> SANDSTONE_VERTICAL_SLAB = register(
            "sandstone_vertical_slab",
            VerticalSlabBlock::new,
            SANDSTONE_SLAB);
    public static final Supplier<Block> SMOOTH_SANDSTONE_VERTICAL_SLAB = register(
            "smooth_sandstone_vertical_slab",
            VerticalSlabBlock::new,
            SMOOTH_SANDSTONE_SLAB);
    public static final Supplier<Block> CUT_SANDSTONE_VERTICAL_SLAB = register(
            "cut_sandstone_vertical_slab",
            VerticalSlabBlock::new,
            CUT_SANDSTONE_SLAB);
    public static final Supplier<Block> RED_SANDSTONE_VERTICAL_SLAB = register(
            "red_sandstone_vertical_slab",
            VerticalSlabBlock::new,
            RED_SANDSTONE_SLAB);
    public static final Supplier<Block> SMOOTH_RED_SANDSTONE_VERTICAL_SLAB = register(
            "smooth_red_sandstone_vertical_slab",
            VerticalSlabBlock::new,
            SMOOTH_RED_SANDSTONE_SLAB);
    public static final Supplier<Block> CUT_RED_SANDSTONE_VERTICAL_SLAB = register(
            "cut_red_sandstone_vertical_slab",
            VerticalSlabBlock::new,
            CUT_RED_SANDSTONE_SLAB);
    public static final Supplier<Block> PRISMARINE_VERTICAL_SLAB = register(
            "prismarine_vertical_slab",
            VerticalSlabBlock::new,
            PRISMARINE_SLAB);
    public static final Supplier<Block> PRISMARINE_BRICK_VERTICAL_SLAB = register(
            "prismarine_brick_vertical_slab",
            VerticalSlabBlock::new,
            PRISMARINE_BRICK_SLAB);
    public static final Supplier<Block> DARK_PRISMARINE_VERTICAL_SLAB = register(
            "dark_prismarine_vertical_slab",
            VerticalSlabBlock::new,
            DARK_PRISMARINE_SLAB);
    public static final Supplier<Block> NETHER_BRICK_VERTICAL_SLAB = register(
            "nether_brick_vertical_slab",
            VerticalSlabBlock::new,
            NETHER_BRICK_SLAB);
    public static final Supplier<Block> RED_NETHER_BRICK_VERTICAL_SLAB = register(
            "red_nether_brick_vertical_slab",
            VerticalSlabBlock::new,
            RED_NETHER_BRICK_SLAB);
    public static final Supplier<Block> BLACKSTONE_VERTICAL_SLAB = register(
            "blackstone_vertical_slab",
            VerticalSlabBlock::new,
            BLACKSTONE_SLAB);
    public static final Supplier<Block> POLISHED_BLACKSTONE_VERTICAL_SLAB = register(
            "polished_blackstone_vertical_slab",
            VerticalSlabBlock::new,
            POLISHED_BLACKSTONE_SLAB);
    public static final Supplier<Block> POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB = register(
            "polished_blackstone_brick_vertical_slab",
            VerticalSlabBlock::new,
            POLISHED_BLACKSTONE_BRICK_SLAB);
    public static final Supplier<Block> END_STONE_BRICK_VERTICAL_SLAB = register(
            "end_stone_brick_vertical_slab",
            VerticalSlabBlock::new,
            END_STONE_BRICK_SLAB);
    public static final Supplier<Block> PURPUR_VERTICAL_SLAB = register(
            "purpur_vertical_slab",
            VerticalSlabBlock::new,
            PURPUR_SLAB);
    public static final Supplier<Block> QUARTZ_VERTICAL_SLAB = register(
            "quartz_vertical_slab",
            VerticalSlabBlock::new,
            QUARTZ_SLAB);
    public static final Supplier<Block> SMOOTH_QUARTZ_VERTICAL_SLAB = register(
            "smooth_quartz_vertical_slab",
            VerticalSlabBlock::new,
            SMOOTH_QUARTZ_SLAB);
    public static final Supplier<Block> CUT_COPPER_VERTICAL_SLAB = register(
            "cut_copper_vertical_slab",
            VerticalSlabBlock::new,
            CUT_COPPER_SLAB);
    public static final Supplier<Block> EXPOSED_CUT_COPPER_VERTICAL_SLAB = register(
            "exposed_cut_copper_vertical_slab",
            VerticalSlabBlock::new,
            EXPOSED_CUT_COPPER_SLAB);
    public static final Supplier<Block> WEATHERED_CUT_COPPER_VERTICAL_SLAB = register(
            "weathered_cut_copper_vertical_slab",
            VerticalSlabBlock::new,
            WEATHERED_CUT_COPPER_SLAB);
    public static final Supplier<Block> OXIDIZED_CUT_COPPER_VERTICAL_SLAB = register(
            "oxidized_cut_copper_vertical_slab",
            VerticalSlabBlock::new,
            OXIDIZED_CUT_COPPER_SLAB);
    public static final Supplier<Block> WAXED_CUT_COPPER_VERTICAL_SLAB = register(
            "waxed_cut_copper_vertical_slab",
            VerticalSlabBlock::new,
            WAXED_CUT_COPPER_SLAB);
    public static final Supplier<Block> WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB = register(
            "waxed_exposed_cut_copper_vertical_slab",
            VerticalSlabBlock::new,
            WAXED_EXPOSED_CUT_COPPER_SLAB);
    public static final Supplier<Block> WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB = register(
            "waxed_weathered_cut_copper_vertical_slab",
            VerticalSlabBlock::new,
            WAXED_WEATHERED_CUT_COPPER_SLAB);
    public static final Supplier<Block> WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB = register(
            "waxed_oxidized_cut_copper_vertical_slab",
            VerticalSlabBlock::new,
            WAXED_OXIDIZED_CUT_COPPER_SLAB);

    public static final Supplier<Block> MOSSY_OAK_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "mossy_oak_vertical_slab",
            VerticalSlabBlock::new,
            OAK_SLAB);
    public static final Supplier<Block> MOSSY_SPRUCE_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "mossy_spruce_vertical_slab",
            VerticalSlabBlock::new,
            SPRUCE_SLAB);
    public static final Supplier<Block> MOSSY_BIRCH_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "mossy_birch_vertical_slab",
            VerticalSlabBlock::new,
            BIRCH_SLAB);
    public static final Supplier<Block> MOSSY_JUNGLE_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "mossy_jungle_vertical_slab",
            VerticalSlabBlock::new,
            JUNGLE_SLAB);
    public static final Supplier<Block> MOSSY_ACACIA_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "mossy_acacia_vertical_slab",
            VerticalSlabBlock::new,
            ACACIA_SLAB);
    public static final Supplier<Block> MOSSY_DARK_OAK_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "mossy_dark_oak_vertical_slab",
            VerticalSlabBlock::new,
            DARK_OAK_SLAB);
    public static final Supplier<Block> MOSSY_MANGROVE_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "mossy_mangrove_vertical_slab",
            VerticalSlabBlock::new,
            MANGROVE_SLAB);
    public static final Supplier<Block> MOSSY_CHERRY_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "mossy_cherry_vertical_slab",
            VerticalSlabBlock::new,
            CHERRY_SLAB);
    public static final Supplier<Block> MOSSY_PALE_OAK_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "mossy_pale_oak_vertical_slab",
            VerticalSlabBlock::new,
            PALE_OAK_SLAB);
    public static final Supplier<Block> MOSSY_BAMBOO_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "mossy_bamboo_vertical_slab",
            VerticalSlabBlock::new,
            BAMBOO_SLAB);
    public static final Supplier<Block> MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "mossy_bamboo_mosaic_vertical_slab",
            VerticalSlabBlock::new,
            BAMBOO_MOSAIC_SLAB);
    public static final Supplier<Block> MOSSY_CRIMSON_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "mossy_crimson_vertical_slab",
            VerticalSlabBlock::new,
            CRIMSON_SLAB);
    public static final Supplier<Block> MOSSY_WARPED_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "mossy_warped_vertical_slab",
            VerticalSlabBlock::new,
            WARPED_SLAB);
    public static final Supplier<Block> MOSSY_STONE_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "mossy_stone_vertical_slab",
            VerticalSlabBlock::new,
            STONE_SLAB);
    public static final Supplier<Block> MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "mossy_cobbled_deepslate_vertical_slab",
            VerticalSlabBlock::new,
            COBBLED_DEEPSLATE_SLAB);
    public static final Supplier<Block> MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "mossy_deepslate_brick_vertical_slab",
            VerticalSlabBlock::new,
            DEEPSLATE_BRICK_SLAB);
    public static final Supplier<Block> MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "mossy_deepslate_tile_vertical_slab",
            VerticalSlabBlock::new,
            DEEPSLATE_TILE_SLAB);
    public static final Supplier<Block> MOSSY_TUFF_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "mossy_tuff_vertical_slab",
            VerticalSlabBlock::new,
            TUFF_SLAB);
    public static final Supplier<Block> MOSSY_TUFF_BRICK_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "mossy_tuff_brick_vertical_slab",
            VerticalSlabBlock::new,
            TUFF_BRICK_SLAB);
    public static final Supplier<Block> MOSSY_BRICK_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "mossy_brick_vertical_slab",
            VerticalSlabBlock::new,
            BRICK_SLAB);
    public static final Supplier<Block> PALE_MOSSY_OAK_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "pale_mossy_oak_vertical_slab",
            VerticalSlabBlock::new,
            OAK_SLAB);
    public static final Supplier<Block> PALE_MOSSY_SPRUCE_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "pale_mossy_spruce_vertical_slab",
            VerticalSlabBlock::new,
            SPRUCE_SLAB);
    public static final Supplier<Block> PALE_MOSSY_BIRCH_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "pale_mossy_birch_vertical_slab",
            VerticalSlabBlock::new,
            BIRCH_SLAB);
    public static final Supplier<Block> PALE_MOSSY_JUNGLE_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "pale_mossy_jungle_vertical_slab",
            VerticalSlabBlock::new,
            JUNGLE_SLAB);
    public static final Supplier<Block> PALE_MOSSY_ACACIA_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "pale_mossy_acacia_vertical_slab",
            VerticalSlabBlock::new,
            ACACIA_SLAB);
    public static final Supplier<Block> PALE_MOSSY_DARK_OAK_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "pale_mossy_dark_oak_vertical_slab",
            VerticalSlabBlock::new,
            DARK_OAK_SLAB);
    public static final Supplier<Block> PALE_MOSSY_MANGROVE_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "pale_mossy_mangrove_vertical_slab",
            VerticalSlabBlock::new,
            MANGROVE_SLAB);
    public static final Supplier<Block> PALE_MOSSY_CHERRY_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "pale_mossy_cherry_vertical_slab",
            VerticalSlabBlock::new,
            CHERRY_SLAB);
    public static final Supplier<Block> PALE_MOSSY_PALE_OAK_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "pale_mossy_pale_oak_vertical_slab",
            VerticalSlabBlock::new,
            PALE_OAK_SLAB);
    public static final Supplier<Block> PALE_MOSSY_BAMBOO_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "pale_mossy_bamboo_vertical_slab",
            VerticalSlabBlock::new,
            BAMBOO_SLAB);
    public static final Supplier<Block> PALE_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "pale_mossy_bamboo_mosaic_vertical_slab",
            VerticalSlabBlock::new,
            BAMBOO_MOSAIC_SLAB);
    public static final Supplier<Block> PALE_MOSSY_CRIMSON_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "pale_mossy_crimson_vertical_slab",
            VerticalSlabBlock::new,
            CRIMSON_SLAB);
    public static final Supplier<Block> PALE_MOSSY_WARPED_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "pale_mossy_warped_vertical_slab",
            VerticalSlabBlock::new,
            WARPED_SLAB);
    public static final Supplier<Block> PALE_MOSSY_STONE_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "pale_mossy_stone_vertical_slab",
            VerticalSlabBlock::new,
            STONE_SLAB);
    public static final Supplier<Block> PALE_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "pale_mossy_cobbled_deepslate_vertical_slab",
            VerticalSlabBlock::new,
            COBBLED_DEEPSLATE_SLAB);
    public static final Supplier<Block> PALE_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "pale_mossy_deepslate_brick_vertical_slab",
            VerticalSlabBlock::new,
            DEEPSLATE_BRICK_SLAB);
    public static final Supplier<Block> PALE_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "pale_mossy_deepslate_tile_vertical_slab",
            VerticalSlabBlock::new,
            DEEPSLATE_TILE_SLAB);
    public static final Supplier<Block> PALE_MOSSY_TUFF_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "pale_mossy_tuff_vertical_slab",
            VerticalSlabBlock::new,
            TUFF_SLAB);
    public static final Supplier<Block> PALE_MOSSY_TUFF_BRICK_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "pale_mossy_tuff_brick_vertical_slab",
            VerticalSlabBlock::new,
            TUFF_BRICK_SLAB);
    public static final Supplier<Block> PALE_MOSSY_BRICK_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "pale_mossy_brick_vertical_slab",
            VerticalSlabBlock::new,
            BRICK_SLAB);
    public static final Supplier<Block> CRIMSON_MOSSY_OAK_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "crimson_mossy_oak_vertical_slab",
            VerticalSlabBlock::new,
            OAK_SLAB);
    public static final Supplier<Block> CRIMSON_MOSSY_SPRUCE_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "crimson_mossy_spruce_vertical_slab",
            VerticalSlabBlock::new,
            SPRUCE_SLAB);
    public static final Supplier<Block> CRIMSON_MOSSY_BIRCH_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "crimson_mossy_birch_vertical_slab",
            VerticalSlabBlock::new,
            BIRCH_SLAB);
    public static final Supplier<Block> CRIMSON_MOSSY_JUNGLE_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "crimson_mossy_jungle_vertical_slab",
            VerticalSlabBlock::new,
            JUNGLE_SLAB);
    public static final Supplier<Block> CRIMSON_MOSSY_ACACIA_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "crimson_mossy_acacia_vertical_slab",
            VerticalSlabBlock::new,
            ACACIA_SLAB);
    public static final Supplier<Block> CRIMSON_MOSSY_DARK_OAK_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "crimson_mossy_dark_oak_vertical_slab",
            VerticalSlabBlock::new,
            DARK_OAK_SLAB);
    public static final Supplier<Block> CRIMSON_MOSSY_MANGROVE_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "crimson_mossy_mangrove_vertical_slab",
            VerticalSlabBlock::new,
            MANGROVE_SLAB);
    public static final Supplier<Block> CRIMSON_MOSSY_CHERRY_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "crimson_mossy_cherry_vertical_slab",
            VerticalSlabBlock::new,
            CHERRY_SLAB);
    public static final Supplier<Block> CRIMSON_MOSSY_PALE_OAK_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "crimson_mossy_pale_oak_vertical_slab",
            VerticalSlabBlock::new,
            PALE_OAK_SLAB);
    public static final Supplier<Block> CRIMSON_MOSSY_BAMBOO_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "crimson_mossy_bamboo_vertical_slab",
            VerticalSlabBlock::new,
            BAMBOO_SLAB);
    public static final Supplier<Block> CRIMSON_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "crimson_mossy_bamboo_mosaic_vertical_slab",
            VerticalSlabBlock::new,
            BAMBOO_MOSAIC_SLAB);
    public static final Supplier<Block> CRIMSON_MOSSY_CRIMSON_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "crimson_mossy_crimson_vertical_slab",
            VerticalSlabBlock::new,
            CRIMSON_SLAB);
    public static final Supplier<Block> CRIMSON_MOSSY_WARPED_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "crimson_mossy_warped_vertical_slab",
            VerticalSlabBlock::new,
            WARPED_SLAB);
    public static final Supplier<Block> CRIMSON_MOSSY_STONE_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "crimson_mossy_stone_vertical_slab",
            VerticalSlabBlock::new,
            STONE_SLAB);
    public static final Supplier<Block> CRIMSON_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "crimson_mossy_cobbled_deepslate_vertical_slab",
            VerticalSlabBlock::new,
            COBBLED_DEEPSLATE_SLAB);
    public static final Supplier<Block> CRIMSON_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "crimson_mossy_deepslate_brick_vertical_slab",
            VerticalSlabBlock::new,
            DEEPSLATE_BRICK_SLAB);
    public static final Supplier<Block> CRIMSON_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "crimson_mossy_deepslate_tile_vertical_slab",
            VerticalSlabBlock::new,
            DEEPSLATE_TILE_SLAB);
    public static final Supplier<Block> CRIMSON_MOSSY_TUFF_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "crimson_mossy_tuff_vertical_slab",
            VerticalSlabBlock::new,
            TUFF_SLAB);
    public static final Supplier<Block> CRIMSON_MOSSY_TUFF_BRICK_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "crimson_mossy_tuff_brick_vertical_slab",
            VerticalSlabBlock::new,
            TUFF_BRICK_SLAB);
    public static final Supplier<Block> CRIMSON_MOSSY_BRICK_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "crimson_mossy_brick_vertical_slab",
            VerticalSlabBlock::new,
            BRICK_SLAB);
    public static final Supplier<Block> WARPED_MOSSY_OAK_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "warped_mossy_oak_vertical_slab",
            VerticalSlabBlock::new,
            OAK_SLAB);
    public static final Supplier<Block> WARPED_MOSSY_SPRUCE_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "warped_mossy_spruce_vertical_slab",
            VerticalSlabBlock::new,
            SPRUCE_SLAB);
    public static final Supplier<Block> WARPED_MOSSY_BIRCH_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "warped_mossy_birch_vertical_slab",
            VerticalSlabBlock::new,
            BIRCH_SLAB);
    public static final Supplier<Block> WARPED_MOSSY_JUNGLE_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "warped_mossy_jungle_vertical_slab",
            VerticalSlabBlock::new,
            JUNGLE_SLAB);
    public static final Supplier<Block> WARPED_MOSSY_ACACIA_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "warped_mossy_acacia_vertical_slab",
            VerticalSlabBlock::new,
            ACACIA_SLAB);
    public static final Supplier<Block> WARPED_MOSSY_DARK_OAK_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "warped_mossy_dark_oak_vertical_slab",
            VerticalSlabBlock::new,
            DARK_OAK_SLAB);
    public static final Supplier<Block> WARPED_MOSSY_MANGROVE_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "warped_mossy_mangrove_vertical_slab",
            VerticalSlabBlock::new,
            MANGROVE_SLAB);
    public static final Supplier<Block> WARPED_MOSSY_CHERRY_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "warped_mossy_cherry_vertical_slab",
            VerticalSlabBlock::new,
            CHERRY_SLAB);
    public static final Supplier<Block> WARPED_MOSSY_PALE_OAK_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "warped_mossy_pale_oak_vertical_slab",
            VerticalSlabBlock::new,
            PALE_OAK_SLAB);
    public static final Supplier<Block> WARPED_MOSSY_BAMBOO_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "warped_mossy_bamboo_vertical_slab",
            VerticalSlabBlock::new,
            BAMBOO_SLAB);
    public static final Supplier<Block> WARPED_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "warped_mossy_bamboo_mosaic_vertical_slab",
            VerticalSlabBlock::new,
            BAMBOO_MOSAIC_SLAB);
    public static final Supplier<Block> WARPED_MOSSY_CRIMSON_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "warped_mossy_crimson_vertical_slab",
            VerticalSlabBlock::new,
            CRIMSON_SLAB);
    public static final Supplier<Block> WARPED_MOSSY_WARPED_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "warped_mossy_warped_vertical_slab",
            VerticalSlabBlock::new,
            WARPED_SLAB);
    public static final Supplier<Block> WARPED_MOSSY_STONE_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "warped_mossy_stone_vertical_slab",
            VerticalSlabBlock::new,
            STONE_SLAB);
    public static final Supplier<Block> WARPED_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "warped_mossy_cobbled_deepslate_vertical_slab",
            VerticalSlabBlock::new,
            COBBLED_DEEPSLATE_SLAB);
    public static final Supplier<Block> WARPED_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "warped_mossy_deepslate_brick_vertical_slab",
            VerticalSlabBlock::new,
            DEEPSLATE_BRICK_SLAB);
    public static final Supplier<Block> WARPED_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "warped_mossy_deepslate_tile_vertical_slab",
            VerticalSlabBlock::new,
            DEEPSLATE_TILE_SLAB);
    public static final Supplier<Block> WARPED_MOSSY_TUFF_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "warped_mossy_tuff_vertical_slab",
            VerticalSlabBlock::new,
            TUFF_SLAB);
    public static final Supplier<Block> WARPED_MOSSY_TUFF_BRICK_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "warped_mossy_tuff_brick_vertical_slab",
            VerticalSlabBlock::new,
            TUFF_BRICK_SLAB);
    public static final Supplier<Block> WARPED_MOSSY_BRICK_VERTICAL_SLAB = registerMossyVerticalSlabs(
            "warped_mossy_brick_vertical_slab",
            VerticalSlabBlock::new,
            BRICK_SLAB);

    public static void init() {
    }

    private static Supplier<Block> register(
            String blockId,
            Function<BlockBehaviour.Properties, Block> function,
            Block blockToCopy
    ) {
        return Services.REGISTRY_HELPER.registerBlock(
                blockId,
                function,
                BlockBehaviour.Properties.ofFullCopy(blockToCopy).noOcclusion()
        );
    }

    private static Supplier<Block> registerMossyVerticalSlabs(
            String blockId,
            Function<BlockBehaviour.Properties, Block> function,
            Block blockToCopy
    ) {
        var optionalSupplier = registerIfModIsLoaded("nemos_mossy_blocks", blockId, function, blockToCopy);

        return optionalSupplier.orElse(null);

    }

    private static Optional<Supplier<Block>> registerIfModIsLoaded(
            String modId,
            String blockId,
            Function<BlockBehaviour.Properties, Block> function,
            Block blockToCopy
    ) {
        var isModLoaded = Services.MOD_LOADER_HELPER.isModLoaded(modId);

        if (!isModLoaded) {
            return Optional.empty();
        }

        return Optional.of(
                Services.REGISTRY_HELPER.registerBlock(
                        blockId,
                        function,
                        BlockBehaviour.Properties.ofFullCopy(blockToCopy).noOcclusion()
                )
        );
    }
}
