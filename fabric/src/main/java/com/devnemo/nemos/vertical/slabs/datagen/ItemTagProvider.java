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
                .add(OAK_VERTICAL_SLAB.get())
                .add(SPRUCE_VERTICAL_SLAB.get())
                .add(BIRCH_VERTICAL_SLAB.get())
                .add(JUNGLE_VERTICAL_SLAB.get())
                .add(ACACIA_VERTICAL_SLAB.get())
                .add(DARK_OAK_VERTICAL_SLAB.get())
                .add(PALE_OAK_VERTICAL_SLAB.get())
                .add(CRIMSON_VERTICAL_SLAB.get())
                .add(WARPED_VERTICAL_SLAB.get())
                .add(MANGROVE_VERTICAL_SLAB.get())
                .add(BAMBOO_VERTICAL_SLAB.get())
                .add(CHERRY_VERTICAL_SLAB.get());
    }
}
