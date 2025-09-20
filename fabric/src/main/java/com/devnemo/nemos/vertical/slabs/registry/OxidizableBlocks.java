package com.devnemo.nemos.vertical.slabs.registry;

import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;

import static com.devnemo.nemos.vertical.slabs.world.level.block.VerticalSlabBlocks.*;

public class OxidizableBlocks {

    public static void init() {
        OxidizableBlocksRegistry.registerOxidizableBlockPair(CUT_COPPER_VERTICAL_SLAB.get(), EXPOSED_CUT_COPPER_VERTICAL_SLAB.get());
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_CUT_COPPER_VERTICAL_SLAB.get(), WEATHERED_CUT_COPPER_VERTICAL_SLAB.get());
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_CUT_COPPER_VERTICAL_SLAB.get(), OXIDIZED_CUT_COPPER_VERTICAL_SLAB.get());

        OxidizableBlocksRegistry.registerWaxableBlockPair(CUT_COPPER_VERTICAL_SLAB.get(), WAXED_CUT_COPPER_VERTICAL_SLAB.get());
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_CUT_COPPER_VERTICAL_SLAB.get(), WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB.get());
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_CUT_COPPER_VERTICAL_SLAB.get(), WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB.get());
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_CUT_COPPER_VERTICAL_SLAB.get(), WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB.get());
    }
}
