package com.devnemo.nemos.vertical.slabs.registry;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

import static com.devnemo.nemos.vertical.slabs.world.level.block.VerticalSlabBlocks.*;

public class FlammableBlocks {

    public static void init() {
        var encouragement = 5;
        var flammability = 20;

        FlammableBlockRegistry.getDefaultInstance().add(OAK_VERTICAL_SLAB, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(SPRUCE_VERTICAL_SLAB, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(BIRCH_VERTICAL_SLAB, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(JUNGLE_VERTICAL_SLAB, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ACACIA_VERTICAL_SLAB, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(CHERRY_VERTICAL_SLAB, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(DARK_OAK_VERTICAL_SLAB, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(PALE_OAK_VERTICAL_SLAB, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(MANGROVE_VERTICAL_SLAB, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(BAMBOO_VERTICAL_SLAB, encouragement, flammability);
        FlammableBlockRegistry.getDefaultInstance().add(BAMBOO_MOSAIC_VERTICAL_SLAB, encouragement, flammability);

        //TODO: Add mod comp block tag
    }
}
