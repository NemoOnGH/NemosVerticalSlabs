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

public class VerticalCreativeModeTabs {

    private static final List<Supplier<Item>> DISPLAY_ITEMS = new ArrayList<>();

    public static Supplier<CreativeModeTab> NEMOS_VERTICAL_SLABS = register(
            "itemGroup." + MOD_ID,
            VerticalSlabItems.OAK_VERTICAL_SLAB,
            DISPLAY_ITEMS
    );

    public static void init() {
        addDisplayItems();
    }

    private static void addDisplayItems() {
        addDisplayItem(VerticalSlabItems.OAK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.SPRUCE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BIRCH_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.JUNGLE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.ACACIA_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.DARK_OAK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.MANGROVE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CHERRY_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.PALE_OAK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BAMBOO_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BAMBOO_MOSAIC_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CRIMSON_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WARPED_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.STONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.COBBLESTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.MOSSY_COBBLESTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.SMOOTH_STONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.STONE_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.MOSSY_STONE_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.GRANITE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.POLISHED_GRANITE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.DIORITE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.POLISHED_DIORITE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.ANDESITE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.POLISHED_ANDESITE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.COBBLED_DEEPSLATE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.POLISHED_DEEPSLATE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.DEEPSLATE_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.DEEPSLATE_TILE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.TUFF_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.POLISHED_TUFF_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.TUFF_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.MUD_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.SMOOTH_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CUT_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.RED_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CUT_RED_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.PRISMARINE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.PRISMARINE_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.DARK_PRISMARINE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.NETHER_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.RED_NETHER_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BLACKSTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.POLISHED_BLACKSTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.END_STONE_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.PURPUR_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.QUARTZ_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.SMOOTH_QUARTZ_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CUT_COPPER_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.EXPOSED_CUT_COPPER_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WEATHERED_CUT_COPPER_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.OXIDIZED_CUT_COPPER_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WAXED_CUT_COPPER_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB);

        addDisplayItem(VerticalSlabItems.MOSSY_OAK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.MOSSY_SPRUCE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.MOSSY_BIRCH_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.MOSSY_JUNGLE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.MOSSY_ACACIA_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.MOSSY_DARK_OAK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.MOSSY_MANGROVE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.MOSSY_CHERRY_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.MOSSY_PALE_OAK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.MOSSY_BAMBOO_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.MOSSY_CRIMSON_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.MOSSY_WARPED_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.MOSSY_STONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.MOSSY_TUFF_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.MOSSY_TUFF_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.MOSSY_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.PALE_MOSSY_OAK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.PALE_MOSSY_SPRUCE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.PALE_MOSSY_BIRCH_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.PALE_MOSSY_JUNGLE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.PALE_MOSSY_ACACIA_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.PALE_MOSSY_DARK_OAK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.PALE_MOSSY_MANGROVE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.PALE_MOSSY_CHERRY_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.PALE_MOSSY_PALE_OAK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.PALE_MOSSY_BAMBOO_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.PALE_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.PALE_MOSSY_CRIMSON_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.PALE_MOSSY_WARPED_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.PALE_MOSSY_STONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.PALE_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.PALE_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.PALE_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.PALE_MOSSY_TUFF_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.PALE_MOSSY_TUFF_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.PALE_MOSSY_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CRIMSON_MOSSY_OAK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CRIMSON_MOSSY_SPRUCE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CRIMSON_MOSSY_BIRCH_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CRIMSON_MOSSY_JUNGLE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CRIMSON_MOSSY_ACACIA_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CRIMSON_MOSSY_DARK_OAK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CRIMSON_MOSSY_MANGROVE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CRIMSON_MOSSY_CHERRY_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CRIMSON_MOSSY_PALE_OAK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CRIMSON_MOSSY_BAMBOO_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CRIMSON_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CRIMSON_MOSSY_CRIMSON_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CRIMSON_MOSSY_WARPED_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CRIMSON_MOSSY_STONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CRIMSON_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CRIMSON_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CRIMSON_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CRIMSON_MOSSY_TUFF_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CRIMSON_MOSSY_TUFF_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CRIMSON_MOSSY_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WARPED_MOSSY_OAK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WARPED_MOSSY_SPRUCE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WARPED_MOSSY_BIRCH_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WARPED_MOSSY_JUNGLE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WARPED_MOSSY_ACACIA_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WARPED_MOSSY_DARK_OAK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WARPED_MOSSY_MANGROVE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WARPED_MOSSY_CHERRY_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WARPED_MOSSY_PALE_OAK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WARPED_MOSSY_BAMBOO_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WARPED_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WARPED_MOSSY_CRIMSON_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WARPED_MOSSY_WARPED_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WARPED_MOSSY_STONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WARPED_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WARPED_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WARPED_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WARPED_MOSSY_TUFF_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WARPED_MOSSY_TUFF_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WARPED_MOSSY_BRICK_VERTICAL_SLAB);

        addDisplayItem(VerticalSlabItems.CUT_WHITE_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.SMOOTH_WHITE_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WHITE_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CUT_ORANGE_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.SMOOTH_ORANGE_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.ORANGE_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.CUT_BLACK_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.SMOOTH_BLACK_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BLACK_SANDSTONE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.BRIMSTONE_BRICK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.FIR_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.PINE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.MAPLE_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.REDWOOD_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.MAHOGANY_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.JACARANDA_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.PALM_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.WILLOW_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.DEAD_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.MAGIC_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.UMBRAN_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.HELLBARK_VERTICAL_SLAB);
        addDisplayItem(VerticalSlabItems.EMPYREAL_VERTICAL_SLAB);
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
