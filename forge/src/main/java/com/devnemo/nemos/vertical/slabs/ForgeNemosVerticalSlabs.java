package com.devnemo.nemos.vertical.slabs;

import com.devnemo.nemos.vertical.slabs.platform.Services;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.server.packs.PackLocationInfo;
import net.minecraft.server.packs.PackSelectionConfig;
import net.minecraft.server.packs.PathPackResources;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.AddPackFindersEvent;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;

import java.util.Optional;

import static com.devnemo.nemos.vertical.slabs.Constants.MOD_ID;
import static com.devnemo.nemos.vertical.slabs.Constants.NEMOS_MOSSY_BLOCKS_MOD_ID;

@Mod(MOD_ID)
@Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ForgeNemosVerticalSlabs {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);

    public ForgeNemosVerticalSlabs(FMLJavaModLoadingContext context) {
        final var modBusGroup = context.getModBusGroup();
        Common.init();

        BLOCKS.register(modBusGroup);
        ITEMS.register(modBusGroup);
        CREATIVE_TABS.register(modBusGroup);
    }

    @SubscribeEvent
    public static void addBuiltInResourcePack(AddPackFindersEvent event) {
        if (Services.MOD_LOADER_HELPER.isModLoaded(NEMOS_MOSSY_BLOCKS_MOD_ID)) {
            var resourcePath = ModList.get().getModFileById(MOD_ID).getFile().findResource("resourcepacks/mossy_vertical_slabs");
            var packLocationInfo = new PackLocationInfo(
                    "builtin/mossy_vertical_slabs",
                    Component.literal("Mossy Vertical Slabs"),
                    PackSource.BUILT_IN,
                    Optional.empty());
            var pathResourcesSupplier = new PathPackResources.PathResourcesSupplier(resourcePath);
            var packSelectionConfig = new PackSelectionConfig(true, Pack.Position.TOP, false);
            var pack = Pack.readMetaAndCreate(packLocationInfo,
                    pathResourcesSupplier,
                    event.getPackType(),
                    packSelectionConfig);

            event.addRepositorySource((packConsumer) -> packConsumer.accept(pack));
        }
    }
}