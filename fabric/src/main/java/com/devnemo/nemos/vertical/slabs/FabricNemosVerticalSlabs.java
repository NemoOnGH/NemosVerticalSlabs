package com.devnemo.nemos.vertical.slabs;

import com.devnemo.nemos.vertical.slabs.platform.Services;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;

import static com.devnemo.nemos.vertical.slabs.Constants.*;

public class FabricNemosVerticalSlabs implements ModInitializer {
    
    @Override
    public void onInitialize() {
        Common.init();

        registerBuiltInVerticalSlabsResourcePack(NEMOS_MOSSY_BLOCKS_MOD_ID, "mossy_vertical_slabs", "Mossy Vertical Slabs");
        registerBuiltInVerticalSlabsResourcePack(BIOMES_O_PLENTY_MOD_ID, "biomesoplenty_vertical_slabs", "Biomes O' Plenty Vertical Slabs");
    }

    private void registerBuiltInVerticalSlabsResourcePack(String modId, String packId, String packName) {
        if (!Services.MOD_LOADER_HELPER.isModLoaded(modId)) {
            return;
        }

        FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(container ->
                ResourceManagerHelper.registerBuiltinResourcePack(
                        ResourceLocation.fromNamespaceAndPath(MOD_ID, packId),
                        container,
                        Component.literal(packName),
                        ResourcePackActivationType.ALWAYS_ENABLED
                ));
    }
}
