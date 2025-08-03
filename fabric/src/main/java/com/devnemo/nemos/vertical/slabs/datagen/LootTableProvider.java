package com.devnemo.nemos.vertical.slabs.datagen;

import com.devnemo.nemos.vertical.slabs.world.level.block.NemosVerticalBlocks;
import com.devnemo.nemos.vertical.slabs.world.level.block.VerticalSlabBlock;
import com.devnemo.nemos.vertical.slabs.world.level.block.state.properties.VerticalSlabType;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

import java.util.concurrent.CompletableFuture;

public class LootTableProvider extends FabricBlockLootTableProvider {

    public LootTableProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> providerCompletableFuture) {
        super(dataOutput, providerCompletableFuture);
    }

    @Override
    public void generate() {
        this.add(NemosVerticalBlocks.OAK_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.OAK_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.SPRUCE_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.SPRUCE_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.BIRCH_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.BIRCH_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.JUNGLE_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.JUNGLE_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.ACACIA_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.ACACIA_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.DARK_OAK_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.DARK_OAK_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.MANGROVE_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.MANGROVE_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.CHERRY_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.CHERRY_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.PALE_OAK_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.PALE_OAK_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.BAMBOO_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.BAMBOO_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.BAMBOO_MOSAIC_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.BAMBOO_MOSAIC_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.CRIMSON_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.CRIMSON_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.WARPED_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.WARPED_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.STONE_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.STONE_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.COBBLESTONE_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.COBBLESTONE_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.SMOOTH_STONE_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.SMOOTH_STONE_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.STONE_BRICK_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.STONE_BRICK_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.MOSSY_STONE_BRICK_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.MOSSY_STONE_BRICK_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.GRANITE_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.GRANITE_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.POLISHED_GRANITE_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.POLISHED_GRANITE_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.DIORITE_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.DIORITE_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.POLISHED_DIORITE_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.POLISHED_DIORITE_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.ANDESITE_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.ANDESITE_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.POLISHED_ANDESITE_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.POLISHED_ANDESITE_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.DEEPSLATE_TILE_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.DEEPSLATE_TILE_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.TUFF_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.TUFF_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.POLISHED_TUFF_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.POLISHED_TUFF_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.TUFF_BRICK_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.TUFF_BRICK_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.BRICK_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.BRICK_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.MUD_BRICK_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.MUD_BRICK_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.SANDSTONE_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.SANDSTONE_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.SMOOTH_SANDSTONE_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.SMOOTH_SANDSTONE_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.CUT_SANDSTONE_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.CUT_SANDSTONE_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.RED_SANDSTONE_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.RED_SANDSTONE_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.CUT_RED_SANDSTONE_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.CUT_RED_SANDSTONE_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.PRISMARINE_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.PRISMARINE_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.PRISMARINE_BRICK_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.PRISMARINE_BRICK_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.DARK_PRISMARINE_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.DARK_PRISMARINE_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.NETHER_BRICK_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.NETHER_BRICK_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.RED_NETHER_BRICK_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.RED_NETHER_BRICK_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.BLACKSTONE_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.BLACKSTONE_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.END_STONE_BRICK_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.END_STONE_BRICK_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.PURPUR_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.PURPUR_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.QUARTZ_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.QUARTZ_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.CUT_COPPER_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.CUT_COPPER_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB.get()));

        this.add(NemosVerticalBlocks.MOSSY_OAK_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.MOSSY_OAK_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.MOSSY_SPRUCE_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.MOSSY_SPRUCE_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.MOSSY_BIRCH_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.MOSSY_BIRCH_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.MOSSY_JUNGLE_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.MOSSY_JUNGLE_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.MOSSY_ACACIA_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.MOSSY_ACACIA_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.MOSSY_DARK_OAK_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.MOSSY_DARK_OAK_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.MOSSY_MANGROVE_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.MOSSY_MANGROVE_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.MOSSY_CHERRY_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.MOSSY_CHERRY_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.MOSSY_PALE_OAK_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.MOSSY_PALE_OAK_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.MOSSY_BAMBOO_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.MOSSY_BAMBOO_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.MOSSY_CRIMSON_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.MOSSY_CRIMSON_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.MOSSY_WARPED_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.MOSSY_WARPED_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.MOSSY_STONE_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.MOSSY_STONE_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.MOSSY_BRICK_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.MOSSY_BRICK_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.MOSSY_TUFF_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.MOSSY_TUFF_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.MOSSY_TUFF_BRICK_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.MOSSY_TUFF_BRICK_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.PALE_MOSSY_OAK_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.PALE_MOSSY_OAK_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.PALE_MOSSY_SPRUCE_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.PALE_MOSSY_SPRUCE_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.PALE_MOSSY_BIRCH_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.PALE_MOSSY_BIRCH_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.PALE_MOSSY_JUNGLE_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.PALE_MOSSY_JUNGLE_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.PALE_MOSSY_ACACIA_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.PALE_MOSSY_ACACIA_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.PALE_MOSSY_DARK_OAK_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.PALE_MOSSY_DARK_OAK_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.PALE_MOSSY_MANGROVE_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.PALE_MOSSY_MANGROVE_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.PALE_MOSSY_CHERRY_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.PALE_MOSSY_CHERRY_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.PALE_MOSSY_PALE_OAK_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.PALE_MOSSY_PALE_OAK_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.PALE_MOSSY_BAMBOO_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.PALE_MOSSY_BAMBOO_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.PALE_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.PALE_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.PALE_MOSSY_CRIMSON_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.PALE_MOSSY_CRIMSON_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.PALE_MOSSY_WARPED_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.PALE_MOSSY_WARPED_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.PALE_MOSSY_STONE_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.PALE_MOSSY_STONE_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.PALE_MOSSY_BRICK_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.PALE_MOSSY_BRICK_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.PALE_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.PALE_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.PALE_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.PALE_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.PALE_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.PALE_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.PALE_MOSSY_TUFF_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.PALE_MOSSY_TUFF_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.PALE_MOSSY_TUFF_BRICK_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.PALE_MOSSY_TUFF_BRICK_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.CRIMSON_MOSSY_OAK_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.CRIMSON_MOSSY_OAK_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.CRIMSON_MOSSY_SPRUCE_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.CRIMSON_MOSSY_SPRUCE_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.CRIMSON_MOSSY_BIRCH_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.CRIMSON_MOSSY_BIRCH_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.CRIMSON_MOSSY_JUNGLE_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.CRIMSON_MOSSY_JUNGLE_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.CRIMSON_MOSSY_ACACIA_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.CRIMSON_MOSSY_ACACIA_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.CRIMSON_MOSSY_DARK_OAK_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.CRIMSON_MOSSY_DARK_OAK_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.CRIMSON_MOSSY_MANGROVE_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.CRIMSON_MOSSY_MANGROVE_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.CRIMSON_MOSSY_CHERRY_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.CRIMSON_MOSSY_CHERRY_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.CRIMSON_MOSSY_PALE_OAK_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.CRIMSON_MOSSY_PALE_OAK_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.CRIMSON_MOSSY_BAMBOO_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.CRIMSON_MOSSY_BAMBOO_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.CRIMSON_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.CRIMSON_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.CRIMSON_MOSSY_CRIMSON_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.CRIMSON_MOSSY_CRIMSON_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.CRIMSON_MOSSY_WARPED_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.CRIMSON_MOSSY_WARPED_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.CRIMSON_MOSSY_STONE_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.CRIMSON_MOSSY_STONE_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.CRIMSON_MOSSY_BRICK_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.CRIMSON_MOSSY_BRICK_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.CRIMSON_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.CRIMSON_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.CRIMSON_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.CRIMSON_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.CRIMSON_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.CRIMSON_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.CRIMSON_MOSSY_TUFF_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.CRIMSON_MOSSY_TUFF_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.CRIMSON_MOSSY_TUFF_BRICK_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.CRIMSON_MOSSY_TUFF_BRICK_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.WARPED_MOSSY_OAK_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.WARPED_MOSSY_OAK_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.WARPED_MOSSY_SPRUCE_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.WARPED_MOSSY_SPRUCE_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.WARPED_MOSSY_BIRCH_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.WARPED_MOSSY_BIRCH_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.WARPED_MOSSY_JUNGLE_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.WARPED_MOSSY_JUNGLE_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.WARPED_MOSSY_ACACIA_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.WARPED_MOSSY_ACACIA_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.WARPED_MOSSY_DARK_OAK_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.WARPED_MOSSY_DARK_OAK_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.WARPED_MOSSY_MANGROVE_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.WARPED_MOSSY_MANGROVE_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.WARPED_MOSSY_CHERRY_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.WARPED_MOSSY_CHERRY_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.WARPED_MOSSY_PALE_OAK_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.WARPED_MOSSY_PALE_OAK_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.WARPED_MOSSY_BAMBOO_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.WARPED_MOSSY_BAMBOO_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.WARPED_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.WARPED_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.WARPED_MOSSY_CRIMSON_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.WARPED_MOSSY_CRIMSON_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.WARPED_MOSSY_WARPED_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.WARPED_MOSSY_WARPED_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.WARPED_MOSSY_STONE_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.WARPED_MOSSY_STONE_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.WARPED_MOSSY_BRICK_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.WARPED_MOSSY_BRICK_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.WARPED_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.WARPED_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.WARPED_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.WARPED_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.WARPED_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.WARPED_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.WARPED_MOSSY_TUFF_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.WARPED_MOSSY_TUFF_VERTICAL_SLAB.get()));
        this.add(NemosVerticalBlocks.WARPED_MOSSY_TUFF_BRICK_VERTICAL_SLAB.get(), slabDrops(NemosVerticalBlocks.WARPED_MOSSY_TUFF_BRICK_VERTICAL_SLAB.get()));
    }

    public LootTable.Builder slabDrops(Block drop) {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                        .add(this.applyExplosionDecay(drop, LootItem.lootTableItem(drop)
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F))
                                        .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(drop)
                                                .setProperties(StatePropertiesPredicate.Builder.properties()
                                                        .hasProperty(VerticalSlabBlock.TYPE, VerticalSlabType.DOUBLE)))))));
    }
}
