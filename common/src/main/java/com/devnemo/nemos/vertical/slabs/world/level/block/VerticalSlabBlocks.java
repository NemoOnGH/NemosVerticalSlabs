package com.devnemo.nemos.vertical.slabs.world.level.block;

import com.devnemo.nemos.vertical.slabs.platform.Services;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

import java.util.Optional;
import java.util.function.Supplier;

import static com.devnemo.nemos.vertical.slabs.Constants.BIOMES_O_PLENTY_MOD_ID;
import static com.devnemo.nemos.vertical.slabs.Constants.NEMOS_MOSSY_BLOCKS_MOD_ID;
import static net.minecraft.world.level.block.Blocks.*;

public class VerticalSlabBlocks {

    public static final Supplier<Block> OAK_VERTICAL_SLAB = registerVerticalSlab(
            "oak_vertical_slab",
            OAK_SLAB);
    public static final Supplier<Block> SPRUCE_VERTICAL_SLAB = registerVerticalSlab(
            "spruce_vertical_slab",
            SPRUCE_SLAB);
    public static final Supplier<Block> BIRCH_VERTICAL_SLAB = registerVerticalSlab(
            "birch_vertical_slab",
            BIRCH_SLAB);
    public static final Supplier<Block> JUNGLE_VERTICAL_SLAB = registerVerticalSlab(
            "jungle_vertical_slab",
            JUNGLE_SLAB);
    public static final Supplier<Block> ACACIA_VERTICAL_SLAB = registerVerticalSlab(
            "acacia_vertical_slab",
            ACACIA_SLAB);
    public static final Supplier<Block> DARK_OAK_VERTICAL_SLAB = registerVerticalSlab(
            "dark_oak_vertical_slab",
            DARK_OAK_SLAB);
    public static final Supplier<Block> MANGROVE_VERTICAL_SLAB = registerVerticalSlab(
            "mangrove_vertical_slab",
            MANGROVE_SLAB);
    public static final Supplier<Block> CHERRY_VERTICAL_SLAB = registerVerticalSlab(
            "cherry_vertical_slab",
            CHERRY_SLAB);
    public static final Supplier<Block> PALE_OAK_VERTICAL_SLAB = registerVerticalSlab(
            "pale_oak_vertical_slab",
            PALE_OAK_SLAB);
    public static final Supplier<Block> BAMBOO_VERTICAL_SLAB = registerVerticalSlab(
            "bamboo_vertical_slab",
            BAMBOO_SLAB);
    public static final Supplier<Block> BAMBOO_MOSAIC_VERTICAL_SLAB = registerVerticalSlab(
            "bamboo_mosaic_vertical_slab",
            BAMBOO_MOSAIC_SLAB);
    public static final Supplier<Block> CRIMSON_VERTICAL_SLAB = registerVerticalSlab(
            "crimson_vertical_slab",
            CRIMSON_SLAB);
    public static final Supplier<Block> WARPED_VERTICAL_SLAB = registerVerticalSlab(
            "warped_vertical_slab",
            WARPED_SLAB);
    public static final Supplier<Block> STONE_VERTICAL_SLAB = registerVerticalSlab(
            "stone_vertical_slab",
            STONE_SLAB);
    public static final Supplier<Block> COBBLESTONE_VERTICAL_SLAB = registerVerticalSlab(
            "cobblestone_vertical_slab",
            COBBLESTONE_SLAB);
    public static final Supplier<Block> MOSSY_COBBLESTONE_VERTICAL_SLAB = registerVerticalSlab(
            "mossy_cobblestone_vertical_slab",
            MOSSY_COBBLESTONE_SLAB);
    public static final Supplier<Block> SMOOTH_STONE_VERTICAL_SLAB = registerVerticalSlab(
            "smooth_stone_vertical_slab",
            SMOOTH_STONE_SLAB);
    public static final Supplier<Block> STONE_BRICK_VERTICAL_SLAB = registerVerticalSlab(
            "stone_brick_vertical_slab",
            STONE_BRICK_SLAB);
    public static final Supplier<Block> MOSSY_STONE_BRICK_VERTICAL_SLAB = registerVerticalSlab(
            "mossy_stone_brick_vertical_slab",
            MOSSY_STONE_BRICK_SLAB);
    public static final Supplier<Block> GRANITE_VERTICAL_SLAB = registerVerticalSlab(
            "granite_vertical_slab",
            GRANITE_SLAB);
    public static final Supplier<Block> POLISHED_GRANITE_VERTICAL_SLAB = registerVerticalSlab(
            "polished_granite_vertical_slab",
            POLISHED_GRANITE_SLAB);
    public static final Supplier<Block> DIORITE_VERTICAL_SLAB = registerVerticalSlab(
            "diorite_vertical_slab",
            DIORITE_SLAB);
    public static final Supplier<Block> POLISHED_DIORITE_VERTICAL_SLAB = registerVerticalSlab(
            "polished_diorite_vertical_slab",
            POLISHED_DIORITE_SLAB);
    public static final Supplier<Block> ANDESITE_VERTICAL_SLAB = registerVerticalSlab(
            "andesite_vertical_slab",
            ANDESITE_SLAB);
    public static final Supplier<Block> POLISHED_ANDESITE_VERTICAL_SLAB = registerVerticalSlab(
            "polished_andesite_vertical_slab",
            POLISHED_ANDESITE_SLAB);
    public static final Supplier<Block> COBBLED_DEEPSLATE_VERTICAL_SLAB = registerVerticalSlab(
            "cobbled_deepslate_vertical_slab",
            COBBLED_DEEPSLATE_SLAB);
    public static final Supplier<Block> POLISHED_DEEPSLATE_VERTICAL_SLAB = registerVerticalSlab(
            "polished_deepslate_vertical_slab",
            POLISHED_DEEPSLATE_SLAB);
    public static final Supplier<Block> DEEPSLATE_BRICK_VERTICAL_SLAB = registerVerticalSlab(
            "deepslate_brick_vertical_slab",
            DEEPSLATE_BRICK_SLAB);
    public static final Supplier<Block> DEEPSLATE_TILE_VERTICAL_SLAB = registerVerticalSlab(
            "deepslate_tile_vertical_slab",
            DEEPSLATE_TILE_SLAB);
    public static final Supplier<Block> TUFF_VERTICAL_SLAB = registerVerticalSlab(
            "tuff_vertical_slab",
            TUFF_SLAB);
    public static final Supplier<Block> POLISHED_TUFF_VERTICAL_SLAB = registerVerticalSlab(
            "polished_tuff_vertical_slab",
            POLISHED_TUFF_SLAB);
    public static final Supplier<Block> TUFF_BRICK_VERTICAL_SLAB = registerVerticalSlab(
            "tuff_brick_vertical_slab",
            TUFF_BRICK_SLAB);
    public static final Supplier<Block> BRICK_VERTICAL_SLAB = registerVerticalSlab(
            "brick_vertical_slab",
            BRICK_SLAB);
    public static final Supplier<Block> MUD_BRICK_VERTICAL_SLAB = registerVerticalSlab(
            "mud_brick_vertical_slab",
            MUD_BRICK_SLAB);
    public static final Supplier<Block> SANDSTONE_VERTICAL_SLAB = registerVerticalSlab(
            "sandstone_vertical_slab",
            SANDSTONE_SLAB);
    public static final Supplier<Block> SMOOTH_SANDSTONE_VERTICAL_SLAB = registerVerticalSlab(
            "smooth_sandstone_vertical_slab",
            SMOOTH_SANDSTONE_SLAB);
    public static final Supplier<Block> CUT_SANDSTONE_VERTICAL_SLAB = registerVerticalSlab(
            "cut_sandstone_vertical_slab",
            CUT_SANDSTONE_SLAB);
    public static final Supplier<Block> RED_SANDSTONE_VERTICAL_SLAB = registerVerticalSlab(
            "red_sandstone_vertical_slab",
            RED_SANDSTONE_SLAB);
    public static final Supplier<Block> SMOOTH_RED_SANDSTONE_VERTICAL_SLAB = registerVerticalSlab(
            "smooth_red_sandstone_vertical_slab",
            SMOOTH_RED_SANDSTONE_SLAB);
    public static final Supplier<Block> CUT_RED_SANDSTONE_VERTICAL_SLAB = registerVerticalSlab(
            "cut_red_sandstone_vertical_slab",
            CUT_RED_SANDSTONE_SLAB);
    public static final Supplier<Block> PRISMARINE_VERTICAL_SLAB = registerVerticalSlab(
            "prismarine_vertical_slab",
            PRISMARINE_SLAB);
    public static final Supplier<Block> PRISMARINE_BRICK_VERTICAL_SLAB = registerVerticalSlab(
            "prismarine_brick_vertical_slab",
            PRISMARINE_BRICK_SLAB);
    public static final Supplier<Block> DARK_PRISMARINE_VERTICAL_SLAB = registerVerticalSlab(
            "dark_prismarine_vertical_slab",
            DARK_PRISMARINE_SLAB);
    public static final Supplier<Block> NETHER_BRICK_VERTICAL_SLAB = registerVerticalSlab(
            "nether_brick_vertical_slab",
            NETHER_BRICK_SLAB);
    public static final Supplier<Block> RED_NETHER_BRICK_VERTICAL_SLAB = registerVerticalSlab(
            "red_nether_brick_vertical_slab",
            RED_NETHER_BRICK_SLAB);
    public static final Supplier<Block> BLACKSTONE_VERTICAL_SLAB = registerVerticalSlab(
            "blackstone_vertical_slab",
            BLACKSTONE_SLAB);
    public static final Supplier<Block> POLISHED_BLACKSTONE_VERTICAL_SLAB = registerVerticalSlab(
            "polished_blackstone_vertical_slab",
            POLISHED_BLACKSTONE_SLAB);
    public static final Supplier<Block> POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB = registerVerticalSlab(
            "polished_blackstone_brick_vertical_slab",
            POLISHED_BLACKSTONE_BRICK_SLAB);
    public static final Supplier<Block> END_STONE_BRICK_VERTICAL_SLAB = registerVerticalSlab(
            "end_stone_brick_vertical_slab",
            END_STONE_BRICK_SLAB);
    public static final Supplier<Block> PURPUR_VERTICAL_SLAB = registerVerticalSlab(
            "purpur_vertical_slab",
            PURPUR_SLAB);
    public static final Supplier<Block> QUARTZ_VERTICAL_SLAB = registerVerticalSlab(
            "quartz_vertical_slab",
            QUARTZ_SLAB);
    public static final Supplier<Block> SMOOTH_QUARTZ_VERTICAL_SLAB = registerVerticalSlab(
            "smooth_quartz_vertical_slab",
            SMOOTH_QUARTZ_SLAB);
    public static final Supplier<Block> CUT_COPPER_VERTICAL_SLAB = registerCopperVerticalSlab(
            "cut_copper_vertical_slab",
            WeatheringCopper.WeatherState.UNAFFECTED,
            CUT_COPPER_SLAB);
    public static final Supplier<Block> EXPOSED_CUT_COPPER_VERTICAL_SLAB = registerCopperVerticalSlab(
            "exposed_cut_copper_vertical_slab",
            WeatheringCopper.WeatherState.EXPOSED,
            EXPOSED_CUT_COPPER_SLAB);
    public static final Supplier<Block> WEATHERED_CUT_COPPER_VERTICAL_SLAB = registerCopperVerticalSlab(
            "weathered_cut_copper_vertical_slab",
            WeatheringCopper.WeatherState.WEATHERED,
            WEATHERED_CUT_COPPER_SLAB);
    public static final Supplier<Block> OXIDIZED_CUT_COPPER_VERTICAL_SLAB = registerCopperVerticalSlab(
            "oxidized_cut_copper_vertical_slab",
            WeatheringCopper.WeatherState.OXIDIZED,
            OXIDIZED_CUT_COPPER_SLAB);
    public static final Supplier<Block> WAXED_CUT_COPPER_VERTICAL_SLAB = registerVerticalSlab(
            "waxed_cut_copper_vertical_slab",
            WAXED_CUT_COPPER_SLAB);
    public static final Supplier<Block> WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB = registerVerticalSlab(
            "waxed_exposed_cut_copper_vertical_slab",
            WAXED_EXPOSED_CUT_COPPER_SLAB);
    public static final Supplier<Block> WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB = registerVerticalSlab(
            "waxed_weathered_cut_copper_vertical_slab",
            WAXED_WEATHERED_CUT_COPPER_SLAB);
    public static final Supplier<Block> WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB = registerVerticalSlab(
            "waxed_oxidized_cut_copper_vertical_slab",
            WAXED_OXIDIZED_CUT_COPPER_SLAB);

    public static final Supplier<Block> MOSSY_OAK_VERTICAL_SLAB = registerMossyVerticalSlab(
            "mossy_oak_vertical_slab",
            OAK_SLAB);
    public static final Supplier<Block> MOSSY_SPRUCE_VERTICAL_SLAB = registerMossyVerticalSlab(
            "mossy_spruce_vertical_slab",
            SPRUCE_SLAB);
    public static final Supplier<Block> MOSSY_BIRCH_VERTICAL_SLAB = registerMossyVerticalSlab(
            "mossy_birch_vertical_slab",
            BIRCH_SLAB);
    public static final Supplier<Block> MOSSY_JUNGLE_VERTICAL_SLAB = registerMossyVerticalSlab(
            "mossy_jungle_vertical_slab",
            JUNGLE_SLAB);
    public static final Supplier<Block> MOSSY_ACACIA_VERTICAL_SLAB = registerMossyVerticalSlab(
            "mossy_acacia_vertical_slab",
            ACACIA_SLAB);
    public static final Supplier<Block> MOSSY_DARK_OAK_VERTICAL_SLAB = registerMossyVerticalSlab(
            "mossy_dark_oak_vertical_slab",
            DARK_OAK_SLAB);
    public static final Supplier<Block> MOSSY_MANGROVE_VERTICAL_SLAB = registerMossyVerticalSlab(
            "mossy_mangrove_vertical_slab",
            MANGROVE_SLAB);
    public static final Supplier<Block> MOSSY_CHERRY_VERTICAL_SLAB = registerMossyVerticalSlab(
            "mossy_cherry_vertical_slab",
            CHERRY_SLAB);
    public static final Supplier<Block> MOSSY_PALE_OAK_VERTICAL_SLAB = registerMossyVerticalSlab(
            "mossy_pale_oak_vertical_slab",
            PALE_OAK_SLAB);
    public static final Supplier<Block> MOSSY_BAMBOO_VERTICAL_SLAB = registerMossyVerticalSlab(
            "mossy_bamboo_vertical_slab",
            BAMBOO_SLAB);
    public static final Supplier<Block> MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB = registerMossyVerticalSlab(
            "mossy_bamboo_mosaic_vertical_slab",
            BAMBOO_MOSAIC_SLAB);
    public static final Supplier<Block> MOSSY_CRIMSON_VERTICAL_SLAB = registerMossyVerticalSlab(
            "mossy_crimson_vertical_slab",
            CRIMSON_SLAB);
    public static final Supplier<Block> MOSSY_WARPED_VERTICAL_SLAB = registerMossyVerticalSlab(
            "mossy_warped_vertical_slab",
            WARPED_SLAB);
    public static final Supplier<Block> MOSSY_STONE_VERTICAL_SLAB = registerMossyVerticalSlab(
            "mossy_stone_vertical_slab",
            STONE_SLAB);
    public static final Supplier<Block> MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB = registerMossyVerticalSlab(
            "mossy_cobbled_deepslate_vertical_slab",
            COBBLED_DEEPSLATE_SLAB);
    public static final Supplier<Block> MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB = registerMossyVerticalSlab(
            "mossy_deepslate_brick_vertical_slab",
            DEEPSLATE_BRICK_SLAB);
    public static final Supplier<Block> MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB = registerMossyVerticalSlab(
            "mossy_deepslate_tile_vertical_slab",
            DEEPSLATE_TILE_SLAB);
    public static final Supplier<Block> MOSSY_TUFF_VERTICAL_SLAB = registerMossyVerticalSlab(
            "mossy_tuff_vertical_slab",
            TUFF_SLAB);
    public static final Supplier<Block> MOSSY_TUFF_BRICK_VERTICAL_SLAB = registerMossyVerticalSlab(
            "mossy_tuff_brick_vertical_slab",
            TUFF_BRICK_SLAB);
    public static final Supplier<Block> MOSSY_BRICK_VERTICAL_SLAB = registerMossyVerticalSlab(
            "mossy_brick_vertical_slab",
            BRICK_SLAB);
    public static final Supplier<Block> PALE_MOSSY_OAK_VERTICAL_SLAB = registerMossyVerticalSlab(
            "pale_mossy_oak_vertical_slab",
            OAK_SLAB);
    public static final Supplier<Block> PALE_MOSSY_SPRUCE_VERTICAL_SLAB = registerMossyVerticalSlab(
            "pale_mossy_spruce_vertical_slab",
            SPRUCE_SLAB);
    public static final Supplier<Block> PALE_MOSSY_BIRCH_VERTICAL_SLAB = registerMossyVerticalSlab(
            "pale_mossy_birch_vertical_slab",
            BIRCH_SLAB);
    public static final Supplier<Block> PALE_MOSSY_JUNGLE_VERTICAL_SLAB = registerMossyVerticalSlab(
            "pale_mossy_jungle_vertical_slab",
            JUNGLE_SLAB);
    public static final Supplier<Block> PALE_MOSSY_ACACIA_VERTICAL_SLAB = registerMossyVerticalSlab(
            "pale_mossy_acacia_vertical_slab",
            ACACIA_SLAB);
    public static final Supplier<Block> PALE_MOSSY_DARK_OAK_VERTICAL_SLAB = registerMossyVerticalSlab(
            "pale_mossy_dark_oak_vertical_slab",
            DARK_OAK_SLAB);
    public static final Supplier<Block> PALE_MOSSY_MANGROVE_VERTICAL_SLAB = registerMossyVerticalSlab(
            "pale_mossy_mangrove_vertical_slab",
            MANGROVE_SLAB);
    public static final Supplier<Block> PALE_MOSSY_CHERRY_VERTICAL_SLAB = registerMossyVerticalSlab(
            "pale_mossy_cherry_vertical_slab",
            CHERRY_SLAB);
    public static final Supplier<Block> PALE_MOSSY_PALE_OAK_VERTICAL_SLAB = registerMossyVerticalSlab(
            "pale_mossy_pale_oak_vertical_slab",
            PALE_OAK_SLAB);
    public static final Supplier<Block> PALE_MOSSY_BAMBOO_VERTICAL_SLAB = registerMossyVerticalSlab(
            "pale_mossy_bamboo_vertical_slab",
            BAMBOO_SLAB);
    public static final Supplier<Block> PALE_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB = registerMossyVerticalSlab(
            "pale_mossy_bamboo_mosaic_vertical_slab",
            BAMBOO_MOSAIC_SLAB);
    public static final Supplier<Block> PALE_MOSSY_CRIMSON_VERTICAL_SLAB = registerMossyVerticalSlab(
            "pale_mossy_crimson_vertical_slab",
            CRIMSON_SLAB);
    public static final Supplier<Block> PALE_MOSSY_WARPED_VERTICAL_SLAB = registerMossyVerticalSlab(
            "pale_mossy_warped_vertical_slab",
            WARPED_SLAB);
    public static final Supplier<Block> PALE_MOSSY_STONE_VERTICAL_SLAB = registerMossyVerticalSlab(
            "pale_mossy_stone_vertical_slab",
            STONE_SLAB);
    public static final Supplier<Block> PALE_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB = registerMossyVerticalSlab(
            "pale_mossy_cobbled_deepslate_vertical_slab",
            COBBLED_DEEPSLATE_SLAB);
    public static final Supplier<Block> PALE_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB = registerMossyVerticalSlab(
            "pale_mossy_deepslate_brick_vertical_slab",
            DEEPSLATE_BRICK_SLAB);
    public static final Supplier<Block> PALE_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB = registerMossyVerticalSlab(
            "pale_mossy_deepslate_tile_vertical_slab",
            DEEPSLATE_TILE_SLAB);
    public static final Supplier<Block> PALE_MOSSY_TUFF_VERTICAL_SLAB = registerMossyVerticalSlab(
            "pale_mossy_tuff_vertical_slab",
            TUFF_SLAB);
    public static final Supplier<Block> PALE_MOSSY_TUFF_BRICK_VERTICAL_SLAB = registerMossyVerticalSlab(
            "pale_mossy_tuff_brick_vertical_slab",
            TUFF_BRICK_SLAB);
    public static final Supplier<Block> PALE_MOSSY_BRICK_VERTICAL_SLAB = registerMossyVerticalSlab(
            "pale_mossy_brick_vertical_slab",
            BRICK_SLAB);
    public static final Supplier<Block> CRIMSON_MOSSY_OAK_VERTICAL_SLAB = registerMossyVerticalSlab(
            "crimson_mossy_oak_vertical_slab",
            OAK_SLAB);
    public static final Supplier<Block> CRIMSON_MOSSY_SPRUCE_VERTICAL_SLAB = registerMossyVerticalSlab(
            "crimson_mossy_spruce_vertical_slab",
            SPRUCE_SLAB);
    public static final Supplier<Block> CRIMSON_MOSSY_BIRCH_VERTICAL_SLAB = registerMossyVerticalSlab(
            "crimson_mossy_birch_vertical_slab",
            BIRCH_SLAB);
    public static final Supplier<Block> CRIMSON_MOSSY_JUNGLE_VERTICAL_SLAB = registerMossyVerticalSlab(
            "crimson_mossy_jungle_vertical_slab",
            JUNGLE_SLAB);
    public static final Supplier<Block> CRIMSON_MOSSY_ACACIA_VERTICAL_SLAB = registerMossyVerticalSlab(
            "crimson_mossy_acacia_vertical_slab",
            ACACIA_SLAB);
    public static final Supplier<Block> CRIMSON_MOSSY_DARK_OAK_VERTICAL_SLAB = registerMossyVerticalSlab(
            "crimson_mossy_dark_oak_vertical_slab",
            DARK_OAK_SLAB);
    public static final Supplier<Block> CRIMSON_MOSSY_MANGROVE_VERTICAL_SLAB = registerMossyVerticalSlab(
            "crimson_mossy_mangrove_vertical_slab",
            MANGROVE_SLAB);
    public static final Supplier<Block> CRIMSON_MOSSY_CHERRY_VERTICAL_SLAB = registerMossyVerticalSlab(
            "crimson_mossy_cherry_vertical_slab",
            CHERRY_SLAB);
    public static final Supplier<Block> CRIMSON_MOSSY_PALE_OAK_VERTICAL_SLAB = registerMossyVerticalSlab(
            "crimson_mossy_pale_oak_vertical_slab",
            PALE_OAK_SLAB);
    public static final Supplier<Block> CRIMSON_MOSSY_BAMBOO_VERTICAL_SLAB = registerMossyVerticalSlab(
            "crimson_mossy_bamboo_vertical_slab",
            BAMBOO_SLAB);
    public static final Supplier<Block> CRIMSON_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB = registerMossyVerticalSlab(
            "crimson_mossy_bamboo_mosaic_vertical_slab",
            BAMBOO_MOSAIC_SLAB);
    public static final Supplier<Block> CRIMSON_MOSSY_CRIMSON_VERTICAL_SLAB = registerMossyVerticalSlab(
            "crimson_mossy_crimson_vertical_slab",
            CRIMSON_SLAB);
    public static final Supplier<Block> CRIMSON_MOSSY_WARPED_VERTICAL_SLAB = registerMossyVerticalSlab(
            "crimson_mossy_warped_vertical_slab",
            WARPED_SLAB);
    public static final Supplier<Block> CRIMSON_MOSSY_STONE_VERTICAL_SLAB = registerMossyVerticalSlab(
            "crimson_mossy_stone_vertical_slab",
            STONE_SLAB);
    public static final Supplier<Block> CRIMSON_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB = registerMossyVerticalSlab(
            "crimson_mossy_cobbled_deepslate_vertical_slab",
            COBBLED_DEEPSLATE_SLAB);
    public static final Supplier<Block> CRIMSON_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB = registerMossyVerticalSlab(
            "crimson_mossy_deepslate_brick_vertical_slab",
            DEEPSLATE_BRICK_SLAB);
    public static final Supplier<Block> CRIMSON_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB = registerMossyVerticalSlab(
            "crimson_mossy_deepslate_tile_vertical_slab",
            DEEPSLATE_TILE_SLAB);
    public static final Supplier<Block> CRIMSON_MOSSY_TUFF_VERTICAL_SLAB = registerMossyVerticalSlab(
            "crimson_mossy_tuff_vertical_slab",
            TUFF_SLAB);
    public static final Supplier<Block> CRIMSON_MOSSY_TUFF_BRICK_VERTICAL_SLAB = registerMossyVerticalSlab(
            "crimson_mossy_tuff_brick_vertical_slab",
            TUFF_BRICK_SLAB);
    public static final Supplier<Block> CRIMSON_MOSSY_BRICK_VERTICAL_SLAB = registerMossyVerticalSlab(
            "crimson_mossy_brick_vertical_slab",
            BRICK_SLAB);
    public static final Supplier<Block> WARPED_MOSSY_OAK_VERTICAL_SLAB = registerMossyVerticalSlab(
            "warped_mossy_oak_vertical_slab",
            OAK_SLAB);
    public static final Supplier<Block> WARPED_MOSSY_SPRUCE_VERTICAL_SLAB = registerMossyVerticalSlab(
            "warped_mossy_spruce_vertical_slab",
            SPRUCE_SLAB);
    public static final Supplier<Block> WARPED_MOSSY_BIRCH_VERTICAL_SLAB = registerMossyVerticalSlab(
            "warped_mossy_birch_vertical_slab",
            BIRCH_SLAB);
    public static final Supplier<Block> WARPED_MOSSY_JUNGLE_VERTICAL_SLAB = registerMossyVerticalSlab(
            "warped_mossy_jungle_vertical_slab",
            JUNGLE_SLAB);
    public static final Supplier<Block> WARPED_MOSSY_ACACIA_VERTICAL_SLAB = registerMossyVerticalSlab(
            "warped_mossy_acacia_vertical_slab",
            ACACIA_SLAB);
    public static final Supplier<Block> WARPED_MOSSY_DARK_OAK_VERTICAL_SLAB = registerMossyVerticalSlab(
            "warped_mossy_dark_oak_vertical_slab",
            DARK_OAK_SLAB);
    public static final Supplier<Block> WARPED_MOSSY_MANGROVE_VERTICAL_SLAB = registerMossyVerticalSlab(
            "warped_mossy_mangrove_vertical_slab",
            MANGROVE_SLAB);
    public static final Supplier<Block> WARPED_MOSSY_CHERRY_VERTICAL_SLAB = registerMossyVerticalSlab(
            "warped_mossy_cherry_vertical_slab",
            CHERRY_SLAB);
    public static final Supplier<Block> WARPED_MOSSY_PALE_OAK_VERTICAL_SLAB = registerMossyVerticalSlab(
            "warped_mossy_pale_oak_vertical_slab",
            PALE_OAK_SLAB);
    public static final Supplier<Block> WARPED_MOSSY_BAMBOO_VERTICAL_SLAB = registerMossyVerticalSlab(
            "warped_mossy_bamboo_vertical_slab",
            BAMBOO_SLAB);
    public static final Supplier<Block> WARPED_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB = registerMossyVerticalSlab(
            "warped_mossy_bamboo_mosaic_vertical_slab",
            BAMBOO_MOSAIC_SLAB);
    public static final Supplier<Block> WARPED_MOSSY_CRIMSON_VERTICAL_SLAB = registerMossyVerticalSlab(
            "warped_mossy_crimson_vertical_slab",
            CRIMSON_SLAB);
    public static final Supplier<Block> WARPED_MOSSY_WARPED_VERTICAL_SLAB = registerMossyVerticalSlab(
            "warped_mossy_warped_vertical_slab",
            WARPED_SLAB);
    public static final Supplier<Block> WARPED_MOSSY_STONE_VERTICAL_SLAB = registerMossyVerticalSlab(
            "warped_mossy_stone_vertical_slab",
            STONE_SLAB);
    public static final Supplier<Block> WARPED_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB = registerMossyVerticalSlab(
            "warped_mossy_cobbled_deepslate_vertical_slab",
            COBBLED_DEEPSLATE_SLAB);
    public static final Supplier<Block> WARPED_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB = registerMossyVerticalSlab(
            "warped_mossy_deepslate_brick_vertical_slab",
            DEEPSLATE_BRICK_SLAB);
    public static final Supplier<Block> WARPED_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB = registerMossyVerticalSlab(
            "warped_mossy_deepslate_tile_vertical_slab",
            DEEPSLATE_TILE_SLAB);
    public static final Supplier<Block> WARPED_MOSSY_TUFF_VERTICAL_SLAB = registerMossyVerticalSlab(
            "warped_mossy_tuff_vertical_slab",
            TUFF_SLAB);
    public static final Supplier<Block> WARPED_MOSSY_TUFF_BRICK_VERTICAL_SLAB = registerMossyVerticalSlab(
            "warped_mossy_tuff_brick_vertical_slab",
            TUFF_BRICK_SLAB);
    public static final Supplier<Block> WARPED_MOSSY_BRICK_VERTICAL_SLAB = registerMossyVerticalSlab(
            "warped_mossy_brick_vertical_slab",
            BRICK_SLAB);

    public static final Supplier<Block> CUT_WHITE_SANDSTONE_VERTICAL_SLAB;
    public static final Supplier<Block> SMOOTH_WHITE_SANDSTONE_VERTICAL_SLAB;
    public static final Supplier<Block> WHITE_SANDSTONE_VERTICAL_SLAB;
    public static final Supplier<Block> CUT_ORANGE_SANDSTONE_VERTICAL_SLAB;
    public static final Supplier<Block> SMOOTH_ORANGE_SANDSTONE_VERTICAL_SLAB;
    public static final Supplier<Block> ORANGE_SANDSTONE_VERTICAL_SLAB;
    public static final Supplier<Block> CUT_BLACK_SANDSTONE_VERTICAL_SLAB;
    public static final Supplier<Block> SMOOTH_BLACK_SANDSTONE_VERTICAL_SLAB;
    public static final Supplier<Block> BLACK_SANDSTONE_VERTICAL_SLAB;
    public static final Supplier<Block> BRIMSTONE_BRICK_VERTICAL_SLAB;
    public static final Supplier<Block> FIR_VERTICAL_SLAB;
    public static final Supplier<Block> PINE_VERTICAL_SLAB;
    public static final Supplier<Block> MAPLE_VERTICAL_SLAB;
    public static final Supplier<Block> REDWOOD_VERTICAL_SLAB;
    public static final Supplier<Block> MAHOGANY_VERTICAL_SLAB;
    public static final Supplier<Block> JACARANDA_VERTICAL_SLAB;
    public static final Supplier<Block> PALM_VERTICAL_SLAB;
    public static final Supplier<Block> WILLOW_VERTICAL_SLAB;
    public static final Supplier<Block> DEAD_VERTICAL_SLAB;
    public static final Supplier<Block> MAGIC_VERTICAL_SLAB;
    public static final Supplier<Block> UMBRAN_VERTICAL_SLAB;
    public static final Supplier<Block> HELLBARK_VERTICAL_SLAB;
    public static final Supplier<Block> EMPYREAL_VERTICAL_SLAB;

    public static void init() {
    }

    static {
        if (Services.MOD_LOADER_HELPER.isModLoaded(BIOMES_O_PLENTY_MOD_ID)) {
            CUT_WHITE_SANDSTONE_VERTICAL_SLAB = registerBopVerticalSlab(
                    "cut_white_sandstone_vertical_slab",
                    BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.QUARTZ).requiresCorrectToolForDrops().strength(0.8F)
            );
            SMOOTH_WHITE_SANDSTONE_VERTICAL_SLAB = registerBopVerticalSlab(
                    "smooth_white_sandstone_vertical_slab",
                    BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.QUARTZ).requiresCorrectToolForDrops().strength(0.8F)
            );
            WHITE_SANDSTONE_VERTICAL_SLAB = registerBopVerticalSlab(
                    "white_sandstone_vertical_slab",
                    BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.QUARTZ).requiresCorrectToolForDrops().strength(0.8F)
            );
            CUT_ORANGE_SANDSTONE_VERTICAL_SLAB = registerBopVerticalSlab(
                    "cut_orange_sandstone_vertical_slab",
                    BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(0.8F)
            );
            SMOOTH_ORANGE_SANDSTONE_VERTICAL_SLAB = registerBopVerticalSlab(
                    "smooth_orange_sandstone_vertical_slab",
                    BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(0.8F)
            );
            ORANGE_SANDSTONE_VERTICAL_SLAB = registerBopVerticalSlab(
                    "orange_sandstone_vertical_slab",
                    BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(0.8F)
            );
            CUT_BLACK_SANDSTONE_VERTICAL_SLAB = registerBopVerticalSlab(
                    "cut_black_sandstone_vertical_slab",
                    BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.COLOR_BLACK).requiresCorrectToolForDrops().strength(0.8F)
            );
            SMOOTH_BLACK_SANDSTONE_VERTICAL_SLAB = registerBopVerticalSlab(
                    "smooth_black_sandstone_vertical_slab",
                    BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.COLOR_BLACK).requiresCorrectToolForDrops().strength(0.8F)
            );
            BLACK_SANDSTONE_VERTICAL_SLAB = registerBopVerticalSlab(
                    "black_sandstone_vertical_slab",
                    BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.COLOR_BLACK).requiresCorrectToolForDrops().strength(0.8F)
            );
            BRIMSTONE_BRICK_VERTICAL_SLAB = registerBopVerticalSlab(
                    "brimstone_brick_vertical_slab",
                    BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.COLOR_YELLOW).requiresCorrectToolForDrops().strength(1.0F, 3.0F)
            );
            FIR_VERTICAL_SLAB = registerBopVerticalSlab(
                    "fir_vertical_slab",
                    BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).ignitedByLava().mapColor(MapColor.TERRACOTTA_WHITE).strength(2.0F, 3.0F).sound(SoundType.WOOD)
            );
            PINE_VERTICAL_SLAB = registerBopVerticalSlab(
                    "pine_vertical_slab",
                    BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).ignitedByLava().mapColor(MapColor.TERRACOTTA_LIGHT_GREEN).strength(2.0F, 3.0F).sound(SoundType.WOOD)
            );
            MAPLE_VERTICAL_SLAB = registerBopVerticalSlab(
                    "maple_vertical_slab",
                    BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).ignitedByLava().mapColor(MapColor.DIRT).strength(2.0F, 3.0F).sound(SoundType.CHERRY_WOOD)
            );
            REDWOOD_VERTICAL_SLAB = registerBopVerticalSlab(
                    "redwood_vertical_slab",
                    BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).ignitedByLava().mapColor(MapColor.CRIMSON_NYLIUM).strength(2.0F, 3.0F).sound(SoundType.WOOD)
            );
            MAHOGANY_VERTICAL_SLAB = registerBopVerticalSlab(
                    "mahogany_vertical_slab",
                    BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).ignitedByLava().mapColor(MapColor.TERRACOTTA_MAGENTA).strength(2.0F, 3.0F).sound(SoundType.WOOD)
            );
            JACARANDA_VERTICAL_SLAB = registerBopVerticalSlab(
                    "jacaranda_vertical_slab",
                    BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).ignitedByLava().mapColor(MapColor.QUARTZ).strength(2.0F, 3.0F).sound(SoundType.CHERRY_WOOD)
            );
            PALM_VERTICAL_SLAB = registerBopVerticalSlab(
                    "palm_vertical_slab",
                    BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).ignitedByLava().mapColor(MapColor.TERRACOTTA_YELLOW).strength(2.0F, 3.0F).sound(SoundType.WOOD)
            );
            WILLOW_VERTICAL_SLAB = registerBopVerticalSlab(
                    "willow_vertical_slab",
                    BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).ignitedByLava().mapColor(MapColor.TERRACOTTA_LIGHT_GREEN).strength(2.0F, 3.0F).sound(SoundType.WOOD)
            );
            DEAD_VERTICAL_SLAB = registerBopVerticalSlab(
                    "dead_vertical_slab",
                    BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).ignitedByLava().mapColor(MapColor.STONE).strength(2.0F, 3.0F).sound(SoundType.WOOD)
            );
            MAGIC_VERTICAL_SLAB = registerBopVerticalSlab(
                    "magic_vertical_slab",
                    BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).ignitedByLava().mapColor(MapColor.COLOR_BLUE).strength(2.0F, 3.0F).sound(SoundType.CHERRY_WOOD)
            );
            UMBRAN_VERTICAL_SLAB = registerBopVerticalSlab(
                    "umbran_vertical_slab",
                    BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).ignitedByLava().mapColor(MapColor.TERRACOTTA_BLUE).strength(2.0F, 3.0F).sound(SoundType.NETHER_WOOD)
            );
            HELLBARK_VERTICAL_SLAB = registerBopVerticalSlab(
                    "hellbark_vertical_slab",
                    BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).mapColor(MapColor.TERRACOTTA_GRAY).strength(2.0F, 3.0F).sound(SoundType.NETHER_WOOD)
            );
            EMPYREAL_VERTICAL_SLAB = registerBopVerticalSlab(
                    "empyreal_vertical_slab",
                    BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).ignitedByLava().mapColor(MapColor.COLOR_PURPLE).strength(2.0F, 3.0F).sound(SoundType.NETHER_WOOD)
            );
        } else {
            CUT_WHITE_SANDSTONE_VERTICAL_SLAB = null;
            SMOOTH_WHITE_SANDSTONE_VERTICAL_SLAB = null;
            WHITE_SANDSTONE_VERTICAL_SLAB = null;
            CUT_ORANGE_SANDSTONE_VERTICAL_SLAB = null;
            SMOOTH_ORANGE_SANDSTONE_VERTICAL_SLAB = null;
            ORANGE_SANDSTONE_VERTICAL_SLAB = null;
            CUT_BLACK_SANDSTONE_VERTICAL_SLAB = null;
            SMOOTH_BLACK_SANDSTONE_VERTICAL_SLAB = null;
            BLACK_SANDSTONE_VERTICAL_SLAB = null;
            BRIMSTONE_BRICK_VERTICAL_SLAB = null;
            FIR_VERTICAL_SLAB = null;
            PINE_VERTICAL_SLAB = null;
            MAPLE_VERTICAL_SLAB = null;
            REDWOOD_VERTICAL_SLAB = null;
            MAHOGANY_VERTICAL_SLAB = null;
            JACARANDA_VERTICAL_SLAB = null;
            PALM_VERTICAL_SLAB = null;
            WILLOW_VERTICAL_SLAB = null;
            DEAD_VERTICAL_SLAB = null;
            MAGIC_VERTICAL_SLAB = null;
            UMBRAN_VERTICAL_SLAB = null;
            HELLBARK_VERTICAL_SLAB = null;
            EMPYREAL_VERTICAL_SLAB = null;
        }
    }

    private static Supplier<Block> registerVerticalSlab(String blockId, Block blockToCopy) {
        return Services.REGISTRY_HELPER.registerBlock(
                blockId,
                VerticalSlabBlock::new,
                BlockBehaviour.Properties.ofFullCopy(blockToCopy)
        );
    }

    private static Supplier<Block> registerVerticalSlab(String blockId, BlockBehaviour.Properties properties) {
        return Services.REGISTRY_HELPER.registerBlock(
                blockId,
                VerticalSlabBlock::new,
                properties
        );
    }

    private static Supplier<Block> registerCopperVerticalSlab(String blockId, WeatheringCopper.WeatherState weatherState, Block blockToCopy) {
        return Services.REGISTRY_HELPER.registerBlock(
                blockId,
                properties -> new WeatheringCopperVerticalSlabBlock(weatherState, properties),
                BlockBehaviour.Properties.ofFullCopy(blockToCopy)
        );
    }

    private static Supplier<Block> registerMossyVerticalSlab(String blockId, Block blockToCopy) {
        var optionalSupplier = registerVerticalSlabIfModIsLoaded(NEMOS_MOSSY_BLOCKS_MOD_ID, blockId, blockToCopy);

        return optionalSupplier.orElse(null);

    }

    private static Supplier<Block> registerBopVerticalSlab(
            String blockId,
            Block blockToCopy
    ) {
        var optionalSupplier = registerVerticalSlabIfModIsLoaded(BIOMES_O_PLENTY_MOD_ID, blockId, blockToCopy);

        return optionalSupplier.orElse(null);

    }

    private static Supplier<Block> registerBopVerticalSlab(
            String blockId,
            BlockBehaviour.Properties properties
    ) {
        var optionalSupplier = registerVerticalSlabIfModIsLoaded(BIOMES_O_PLENTY_MOD_ID, blockId, properties);

        return optionalSupplier.orElse(null);

    }

    private static Optional<Supplier<Block>> registerVerticalSlabIfModIsLoaded(
            String modId,
            String blockId,
            Block blockToCopy
    ) {
        var isModLoaded = Services.MOD_LOADER_HELPER.isModLoaded(modId);

        if (!isModLoaded) {
            return Optional.empty();
        }

        return Optional.of(registerVerticalSlab(blockId, blockToCopy));
    }

    private static Optional<Supplier<Block>> registerVerticalSlabIfModIsLoaded(
            String modId,
            String blockId,
            BlockBehaviour.Properties properties
    ) {
        var isModLoaded = Services.MOD_LOADER_HELPER.isModLoaded(modId);

        if (!isModLoaded) {
            return Optional.empty();
        }

        return Optional.of(registerVerticalSlab(blockId, properties));
    }
}
