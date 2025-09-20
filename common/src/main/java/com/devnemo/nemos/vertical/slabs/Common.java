package com.devnemo.nemos.vertical.slabs;

import com.devnemo.nemos.vertical.slabs.world.item.VerticalCreativeModeTabs;
import com.devnemo.nemos.vertical.slabs.world.item.VerticalSlabItems;
import com.devnemo.nemos.vertical.slabs.world.level.block.VerticalSlabBlocks;

public class Common {

    public static void init() {
        Constants.LOG.info("Thank you for using Nemo's Vertical Slabs");

        VerticalSlabBlocks.init();
        VerticalSlabItems.init();
        VerticalCreativeModeTabs.init();
    }
}