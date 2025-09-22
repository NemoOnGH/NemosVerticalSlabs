package com.devnemo.nemos.vertical.slabs.datagen;

import com.devnemo.nemos.vertical.slabs.tags.VerticalSlabItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

import java.util.concurrent.CompletableFuture;

import static com.devnemo.nemos.vertical.slabs.world.item.VerticalSlabItems.*;

public class ItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public ItemTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.getOrCreateRawBuilder(VerticalSlabItemTags.WOODEN_VERTICAL_SLABS)
                .addElement(getResourceLocationFromItemRegistry(OAK_VERTICAL_SLAB))
                .addElement(getResourceLocationFromItemRegistry(SPRUCE_VERTICAL_SLAB))
                .addElement(getResourceLocationFromItemRegistry(BIRCH_VERTICAL_SLAB))
                .addElement(getResourceLocationFromItemRegistry(JUNGLE_VERTICAL_SLAB))
                .addElement(getResourceLocationFromItemRegistry(ACACIA_VERTICAL_SLAB))
                .addElement(getResourceLocationFromItemRegistry(DARK_OAK_VERTICAL_SLAB))
                .addElement(getResourceLocationFromItemRegistry(PALE_OAK_VERTICAL_SLAB))
                .addElement(getResourceLocationFromItemRegistry(CRIMSON_VERTICAL_SLAB))
                .addElement(getResourceLocationFromItemRegistry(WARPED_VERTICAL_SLAB))
                .addElement(getResourceLocationFromItemRegistry(MANGROVE_VERTICAL_SLAB))
                .addElement(getResourceLocationFromItemRegistry(BAMBOO_VERTICAL_SLAB))
                .addElement(getResourceLocationFromItemRegistry(CHERRY_VERTICAL_SLAB))

                .addOptionalElement(getResourceLocationFromItemRegistry(MOSSY_OAK_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(MOSSY_SPRUCE_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(MOSSY_BIRCH_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(MOSSY_JUNGLE_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(MOSSY_ACACIA_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(MOSSY_DARK_OAK_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(MOSSY_PALE_OAK_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(MOSSY_CRIMSON_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(MOSSY_WARPED_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(MOSSY_MANGROVE_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(MOSSY_BAMBOO_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(MOSSY_CHERRY_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(PALE_MOSSY_OAK_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(PALE_MOSSY_SPRUCE_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(PALE_MOSSY_BIRCH_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(PALE_MOSSY_JUNGLE_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(PALE_MOSSY_ACACIA_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(PALE_MOSSY_DARK_OAK_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(PALE_MOSSY_PALE_OAK_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(PALE_MOSSY_CRIMSON_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(PALE_MOSSY_WARPED_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(PALE_MOSSY_MANGROVE_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(PALE_MOSSY_BAMBOO_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(PALE_MOSSY_CHERRY_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(CRIMSON_MOSSY_OAK_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(CRIMSON_MOSSY_SPRUCE_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(CRIMSON_MOSSY_BIRCH_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(CRIMSON_MOSSY_JUNGLE_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(CRIMSON_MOSSY_ACACIA_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(CRIMSON_MOSSY_DARK_OAK_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(CRIMSON_MOSSY_PALE_OAK_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(CRIMSON_MOSSY_CRIMSON_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(CRIMSON_MOSSY_WARPED_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(CRIMSON_MOSSY_MANGROVE_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(CRIMSON_MOSSY_BAMBOO_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(CRIMSON_MOSSY_CHERRY_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(WARPED_MOSSY_OAK_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(WARPED_MOSSY_SPRUCE_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(WARPED_MOSSY_BIRCH_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(WARPED_MOSSY_JUNGLE_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(WARPED_MOSSY_ACACIA_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(WARPED_MOSSY_DARK_OAK_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(WARPED_MOSSY_PALE_OAK_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(WARPED_MOSSY_CRIMSON_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(WARPED_MOSSY_WARPED_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(WARPED_MOSSY_MANGROVE_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(WARPED_MOSSY_BAMBOO_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(WARPED_MOSSY_CHERRY_VERTICAL_SLAB))

                .addOptionalElement(getResourceLocationFromItemRegistry(FIR_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(PINE_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(MAPLE_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(REDWOOD_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(MAHOGANY_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(JACARANDA_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(PALM_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(WILLOW_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(DEAD_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(UMBRAN_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(HELLBARK_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(EMPYREAL_VERTICAL_SLAB))

                .addOptionalElement(getResourceLocationFromItemRegistry(BIOMES_WEVE_GONE_ASPEN_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(BIOMES_WEVE_GONE_BOABAB_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(BIOMES_WEVE_GONE_BLUE_ENCHANTED_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(BIOMES_WEVE_GONE_CIKA_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(BIOMES_WEVE_GONE_CYPRESS_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(BIOMES_WEVE_GONE_EBONY_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(BIOMES_WEVE_GONE_FIR_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(BIOMES_WEVE_GONE_FLORUS_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(BIOMES_WEVE_GONE_GREEN_ENCHANTED_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(BIOMES_WEVE_GONE_HOLLY_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(BIOMES_WEVE_GONE_IRONWOOD_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(BIOMES_WEVE_GONE_JACARANDA_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(BIOMES_WEVE_GONE_MAHOGANY_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(BIOMES_WEVE_GONE_MAPLE_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(BIOMES_WEVE_GONE_PALM_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(BIOMES_WEVE_GONE_PINE_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(BIOMES_WEVE_GONE_RAINBOW_EUCALYPTUS_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(BIOMES_WEVE_GONE_REDWOOD_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(BIOMES_WEVE_GONE_SAKURA_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(BIOMES_WEVE_GONE_SKYRIS_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(BIOMES_WEVE_GONE_SPIRIT_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(BIOMES_WEVE_GONE_WHITE_MANGROVE_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(BIOMES_WEVE_GONE_WILLOW_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(BIOMES_WEVE_GONE_WITCH_HAZEL_VERTICAL_SLAB))
                .addOptionalElement(getResourceLocationFromItemRegistry(BIOMES_WEVE_GONE_ZELKOVA_VERTICAL_SLAB));
    }

    private ResourceLocation getResourceLocationFromItemRegistry(Item item) {
        return BuiltInRegistries.ITEM.getKey(item);
    }
}
