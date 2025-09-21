package com.devnemo.nemos.vertical.slabs.datagen;

import com.devnemo.nemos.vertical.slabs.tags.VerticalSlabItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

import static com.devnemo.nemos.vertical.slabs.world.item.VerticalSlabItems.*;

public class ItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public ItemTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.valueLookupBuilder(VerticalSlabItemTags.WOODEN_VERTICAL_SLABS)
                .add(OAK_VERTICAL_SLAB)
                .add(SPRUCE_VERTICAL_SLAB)
                .add(BIRCH_VERTICAL_SLAB)
                .add(JUNGLE_VERTICAL_SLAB)
                .add(ACACIA_VERTICAL_SLAB)
                .add(DARK_OAK_VERTICAL_SLAB)
                .add(PALE_OAK_VERTICAL_SLAB)
                .add(CRIMSON_VERTICAL_SLAB)
                .add(WARPED_VERTICAL_SLAB)
                .add(MANGROVE_VERTICAL_SLAB)
                .add(BAMBOO_VERTICAL_SLAB)
                .add(CHERRY_VERTICAL_SLAB);
    }

    //TODO: Add mod comp items
}
