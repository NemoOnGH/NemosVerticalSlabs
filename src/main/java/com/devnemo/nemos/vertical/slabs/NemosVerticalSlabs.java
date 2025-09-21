package com.devnemo.nemos.vertical.slabs;

import com.devnemo.nemos.vertical.slabs.registry.FlammableBlocks;
import com.devnemo.nemos.vertical.slabs.registry.FuelItems;
import com.devnemo.nemos.vertical.slabs.registry.OxidizableBlocks;
import com.devnemo.nemos.vertical.slabs.world.item.VerticalCreativeModeTabs;
import com.devnemo.nemos.vertical.slabs.world.item.VerticalSlabItems;
import com.devnemo.nemos.vertical.slabs.world.level.block.VerticalSlabBlocks;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NemosVerticalSlabs implements ModInitializer {

	public static final String MOD_ID = "nemos_vertical_slabs";
	public static final String NEMOS_MOSSY_BLOCKS_MOD_ID = "nemos_mossy_blocks";
	public static final String BIOMES_O_PLENTY_MOD_ID = "biomesoplenty";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Thank you for using Nemo's Vertical Slabs");

		VerticalSlabBlocks.init();
		VerticalSlabItems.init();
		VerticalCreativeModeTabs.init();

		registerBuiltInVerticalSlabsResourcePack(NEMOS_MOSSY_BLOCKS_MOD_ID, "mossy_vertical_slabs", "Mossy Vertical Slabs");
		registerBuiltInVerticalSlabsResourcePack(BIOMES_O_PLENTY_MOD_ID, "biomesoplenty_vertical_slabs", "Biomes O' Plenty Vertical Slabs");

		OxidizableBlocks.init();
		FlammableBlocks.init();
		FuelItems.init();
	}

	private void registerBuiltInVerticalSlabsResourcePack(String modId, String packId, String packName) {
		if (!FabricLoader.getInstance().isModLoaded(modId)) {
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