package com.devnemo.nemos.vertical.slabs.world.item;

import com.devnemo.nemos.vertical.slabs.platform.Services;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import static com.devnemo.nemos.vertical.slabs.Constants.MOD_ID;

public class NemosVerticalCreativeModeTabs {

    private static final List<Supplier<Item>> DISPLAY_ITEMS = new ArrayList<>();

    public static Supplier<CreativeModeTab> NEMOS_VERTICAL_SLABS = register(
            "itemGroup." + MOD_ID,
            NemosVerticalItems.OAK_VERTICAL_SLAB,
            DISPLAY_ITEMS
    );

    public static void init() {
        addDisplayItems();
    }

    private static void addDisplayItems() {
        addDisplayItem(NemosVerticalItems.OAK_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.SPRUCE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.BIRCH_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.JUNGLE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.ACACIA_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.DARK_OAK_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.MANGROVE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.CHERRY_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.PALE_OAK_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.BAMBOO_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.BAMBOO_MOSAIC_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.CRIMSON_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.WARPED_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.STONE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.COBBLESTONE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.MOSSY_COBBLESTONE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.SMOOTH_STONE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.STONE_BRICK_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.MOSSY_STONE_BRICK_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.GRANITE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.POLISHED_GRANITE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.DIORITE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.POLISHED_DIORITE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.ANDESITE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.POLISHED_ANDESITE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.COBBLED_DEEPSLATE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.POLISHED_DEEPSLATE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.DEEPSLATE_BRICK_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.DEEPSLATE_TILE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.TUFF_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.POLISHED_TUFF_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.TUFF_BRICK_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.BRICK_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.MUD_BRICK_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.SMOOTH_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.CUT_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.RED_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.CUT_RED_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.PRISMARINE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.PRISMARINE_BRICK_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.DARK_PRISMARINE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.NETHER_BRICK_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.RED_NETHER_BRICK_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.BLACKSTONE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.POLISHED_BLACKSTONE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.END_STONE_BRICK_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.PURPUR_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.QUARTZ_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.SMOOTH_QUARTZ_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.CUT_COPPER_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.EXPOSED_CUT_COPPER_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.WEATHERED_CUT_COPPER_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.OXIDIZED_CUT_COPPER_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.WAXED_CUT_COPPER_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB);

        addDisplayItem(NemosVerticalItems.MOSSY_OAK_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.MOSSY_SPRUCE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.MOSSY_BIRCH_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.MOSSY_JUNGLE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.MOSSY_ACACIA_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.MOSSY_DARK_OAK_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.MOSSY_MANGROVE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.MOSSY_CHERRY_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.MOSSY_PALE_OAK_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.MOSSY_BAMBOO_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.MOSSY_CRIMSON_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.MOSSY_WARPED_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.MOSSY_STONE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.MOSSY_TUFF_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.MOSSY_TUFF_BRICK_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.MOSSY_BRICK_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.PALE_MOSSY_OAK_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.PALE_MOSSY_SPRUCE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.PALE_MOSSY_BIRCH_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.PALE_MOSSY_JUNGLE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.PALE_MOSSY_ACACIA_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.PALE_MOSSY_DARK_OAK_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.PALE_MOSSY_MANGROVE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.PALE_MOSSY_CHERRY_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.PALE_MOSSY_PALE_OAK_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.PALE_MOSSY_BAMBOO_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.PALE_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.PALE_MOSSY_CRIMSON_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.PALE_MOSSY_WARPED_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.PALE_MOSSY_STONE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.PALE_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.PALE_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.PALE_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.PALE_MOSSY_TUFF_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.PALE_MOSSY_TUFF_BRICK_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.PALE_MOSSY_BRICK_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.CRIMSON_MOSSY_OAK_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.CRIMSON_MOSSY_SPRUCE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.CRIMSON_MOSSY_BIRCH_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.CRIMSON_MOSSY_JUNGLE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.CRIMSON_MOSSY_ACACIA_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.CRIMSON_MOSSY_DARK_OAK_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.CRIMSON_MOSSY_MANGROVE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.CRIMSON_MOSSY_CHERRY_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.CRIMSON_MOSSY_PALE_OAK_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.CRIMSON_MOSSY_BAMBOO_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.CRIMSON_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.CRIMSON_MOSSY_CRIMSON_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.CRIMSON_MOSSY_WARPED_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.CRIMSON_MOSSY_STONE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.CRIMSON_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.CRIMSON_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.CRIMSON_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.CRIMSON_MOSSY_TUFF_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.CRIMSON_MOSSY_TUFF_BRICK_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.CRIMSON_MOSSY_BRICK_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.WARPED_MOSSY_OAK_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.WARPED_MOSSY_SPRUCE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.WARPED_MOSSY_BIRCH_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.WARPED_MOSSY_JUNGLE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.WARPED_MOSSY_ACACIA_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.WARPED_MOSSY_DARK_OAK_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.WARPED_MOSSY_MANGROVE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.WARPED_MOSSY_CHERRY_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.WARPED_MOSSY_PALE_OAK_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.WARPED_MOSSY_BAMBOO_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.WARPED_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.WARPED_MOSSY_CRIMSON_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.WARPED_MOSSY_WARPED_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.WARPED_MOSSY_STONE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.WARPED_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.WARPED_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.WARPED_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.WARPED_MOSSY_TUFF_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.WARPED_MOSSY_TUFF_BRICK_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.WARPED_MOSSY_BRICK_VERTICAL_SLAB);

        addDisplayItem(NemosVerticalItems.CUT_WHITE_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.SMOOTH_WHITE_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.WHITE_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.CUT_ORANGE_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.SMOOTH_ORANGE_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.ORANGE_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.CUT_BLACK_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.SMOOTH_BLACK_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.BLACK_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.BRIMSTONE_BRICK_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.FIR_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.PINE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.MAPLE_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.REDWOOD_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.MAHOGANY_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.JACARANDA_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.PALM_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.WILLOW_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.DEAD_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.MAGIC_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.UMBRAN_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.HELLBARK_VERTICAL_SLAB);
        addDisplayItem(NemosVerticalItems.EMPYREAL_VERTICAL_SLAB);
    }

    private static void addDisplayItem(Supplier<Item> itemSupplier) {
        if (itemSupplier != null) {
            DISPLAY_ITEMS.add(itemSupplier);
        }
    }

    private static Supplier<CreativeModeTab> register(String title, Supplier<Item> itemSupplier, List<Supplier<Item>> dispalyItemSuppliers) {
        return Services.REGISTRY_HELPER.registerCreativeModeTab(MOD_ID, () -> Services.REGISTRY_HELPER.createCreativeModeTab()
                .title(Component.translatable(title))
                .icon(() -> new ItemStack(itemSupplier.get()))
                .displayItems((parameters, output) -> {
                    for (Supplier<Item> displayItemSupplier : dispalyItemSuppliers) {
                        output.accept(displayItemSupplier.get());
                    }
                })
                .build());
    }
}
