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
        addVerticalSlabDrops(NemosVerticalBlocks.OAK_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.SPRUCE_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.BIRCH_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.JUNGLE_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.ACACIA_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.DARK_OAK_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.MANGROVE_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.CHERRY_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.BAMBOO_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.BAMBOO_MOSAIC_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.CRIMSON_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.WARPED_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.STONE_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.COBBLESTONE_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.SMOOTH_STONE_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.STONE_BRICK_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.MOSSY_STONE_BRICK_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.GRANITE_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.POLISHED_GRANITE_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.DIORITE_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.POLISHED_DIORITE_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.ANDESITE_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.POLISHED_ANDESITE_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.DEEPSLATE_TILE_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.TUFF_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.POLISHED_TUFF_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.TUFF_BRICK_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.BRICK_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.MUD_BRICK_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.SANDSTONE_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.SMOOTH_SANDSTONE_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.CUT_SANDSTONE_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.RED_SANDSTONE_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.CUT_RED_SANDSTONE_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.PRISMARINE_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.PRISMARINE_BRICK_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.DARK_PRISMARINE_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.NETHER_BRICK_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.RED_NETHER_BRICK_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.BLACKSTONE_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.END_STONE_BRICK_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.PURPUR_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.QUARTZ_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.CUT_COPPER_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB.get());

//        addVerticalSlabDrops(NemosVerticalBlocks.MOSSY_OAK_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.MOSSY_SPRUCE_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.MOSSY_BIRCH_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.MOSSY_JUNGLE_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.MOSSY_ACACIA_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.MOSSY_DARK_OAK_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.MOSSY_MANGROVE_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.MOSSY_CHERRY_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.MOSSY_BAMBOO_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.MOSSY_CRIMSON_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.MOSSY_WARPED_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.MOSSY_STONE_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.MOSSY_BRICK_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.MOSSY_TUFF_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.MOSSY_TUFF_BRICK_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.PALE_MOSSY_OAK_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.PALE_MOSSY_SPRUCE_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.PALE_MOSSY_BIRCH_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.PALE_MOSSY_JUNGLE_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.PALE_MOSSY_ACACIA_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.PALE_MOSSY_DARK_OAK_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.PALE_MOSSY_MANGROVE_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.PALE_MOSSY_CHERRY_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.PALE_MOSSY_BAMBOO_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.PALE_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.PALE_MOSSY_CRIMSON_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.PALE_MOSSY_WARPED_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.PALE_MOSSY_STONE_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.PALE_MOSSY_BRICK_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.PALE_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.PALE_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.PALE_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.PALE_MOSSY_TUFF_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.PALE_MOSSY_TUFF_BRICK_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.CRIMSON_MOSSY_OAK_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.CRIMSON_MOSSY_SPRUCE_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.CRIMSON_MOSSY_BIRCH_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.CRIMSON_MOSSY_JUNGLE_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.CRIMSON_MOSSY_ACACIA_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.CRIMSON_MOSSY_DARK_OAK_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.CRIMSON_MOSSY_MANGROVE_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.CRIMSON_MOSSY_CHERRY_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.CRIMSON_MOSSY_BAMBOO_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.CRIMSON_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.CRIMSON_MOSSY_CRIMSON_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.CRIMSON_MOSSY_WARPED_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.CRIMSON_MOSSY_STONE_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.CRIMSON_MOSSY_BRICK_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.CRIMSON_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.CRIMSON_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.CRIMSON_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.CRIMSON_MOSSY_TUFF_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.CRIMSON_MOSSY_TUFF_BRICK_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.WARPED_MOSSY_OAK_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.WARPED_MOSSY_SPRUCE_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.WARPED_MOSSY_BIRCH_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.WARPED_MOSSY_JUNGLE_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.WARPED_MOSSY_ACACIA_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.WARPED_MOSSY_DARK_OAK_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.WARPED_MOSSY_MANGROVE_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.WARPED_MOSSY_CHERRY_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.WARPED_MOSSY_BAMBOO_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.WARPED_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.WARPED_MOSSY_CRIMSON_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.WARPED_MOSSY_WARPED_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.WARPED_MOSSY_STONE_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.WARPED_MOSSY_BRICK_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.WARPED_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.WARPED_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.WARPED_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.WARPED_MOSSY_TUFF_VERTICAL_SLAB.get());
//        addVerticalSlabDrops(NemosVerticalBlocks.WARPED_MOSSY_TUFF_BRICK_VERTICAL_SLAB.get());

        addVerticalSlabDrops(NemosVerticalBlocks.CUT_WHITE_SANDSTONE_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.SMOOTH_WHITE_SANDSTONE_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.WHITE_SANDSTONE_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.CUT_ORANGE_SANDSTONE_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.SMOOTH_ORANGE_SANDSTONE_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.ORANGE_SANDSTONE_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.CUT_BLACK_SANDSTONE_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.SMOOTH_BLACK_SANDSTONE_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.BLACK_SANDSTONE_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.BRIMSTONE_BRICK_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.FIR_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.PINE_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.MAPLE_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.REDWOOD_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.MAHOGANY_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.JACARANDA_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.PALM_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.WILLOW_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.DEAD_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.MAGIC_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.UMBRAN_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.HELLBARK_VERTICAL_SLAB.get());
        addVerticalSlabDrops(NemosVerticalBlocks.EMPYREAL_VERTICAL_SLAB.get());
    }

    private void addVerticalSlabDrops(Block drop) {
        this.add(drop, verticalSlabDrops(drop));
    }

    private LootTable.Builder verticalSlabDrops(Block drop) {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                        .add(this.applyExplosionDecay(drop, LootItem.lootTableItem(drop)
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F))
                                        .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(drop)
                                                .setProperties(StatePropertiesPredicate.Builder.properties()
                                                        .hasProperty(VerticalSlabBlock.TYPE, VerticalSlabType.DOUBLE)))))));
    }
}
