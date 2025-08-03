package com.devnemo.nemos.vertical.slabs;

import com.devnemo.nemos.vertical.slabs.platform.Services;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;

import static com.devnemo.nemos.vertical.slabs.Constants.MOD_ID;
import static com.devnemo.nemos.vertical.slabs.Constants.NEMOS_MOSSY_BLOCKS_MOD_ID;

public class FabricNemosVerticalSlabs implements ModInitializer {
    
    @Override
    public void onInitialize() {
        Common.init();

        if (Services.MOD_LOADER_HELPER.isModLoaded(NEMOS_MOSSY_BLOCKS_MOD_ID)) {
            registerBuiltInMossyVerticalSlabsResourcePack();
        }
    }

    private void registerBuiltInMossyVerticalSlabsResourcePack() {
        FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(container ->
                ResourceManagerHelper.registerBuiltinResourcePack(
                        ResourceLocation.fromNamespaceAndPath(MOD_ID, "mossy_vertical_slabs"),
                        container,
                        Component.literal("Mossy Vertical Slabs"),
                        ResourcePackActivationType.ALWAYS_ENABLED
                ));
    }
}
