package com.devnemo.nemos.vertical.slabs.registry;

import com.devnemo.nemos.vertical.slabs.tags.VerticalSlabItemTags;
import net.fabricmc.fabric.api.registry.FuelRegistryEvents;

public class FuelItems {

    public static void init() {
        FuelRegistryEvents.BUILD.register(((builder, context) -> {
            var smeltingTime = context.baseSmeltTime();
            builder.add(VerticalSlabItemTags.WOODEN_VERTICAL_SLABS, smeltingTime * 3 / 4);
        }));
    }

}
