package com.devnemo.nemos.vertical.slabs;

import com.devnemo.nemos.vertical.slabs.world.item.NemosVerticalCreativeModeTabs;
import com.devnemo.nemos.vertical.slabs.world.item.NemosVerticalItems;
import com.devnemo.nemos.vertical.slabs.world.level.block.NemosVerticalBlocks;

public class Common {

    public static void init() {
        Constants.LOG.info("Thank you for using Nemo's Vertical Slabs");

        NemosVerticalBlocks.init();
        NemosVerticalItems.init();
        NemosVerticalCreativeModeTabs.init();
    }
}