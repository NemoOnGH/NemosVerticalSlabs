package com.devnemo.nemos.vertical.slabs;

import com.devnemo.nemos.vertical.slabs.datagen.BlockTagProvider;
import com.devnemo.nemos.vertical.slabs.datagen.LootTableProvider;
import com.devnemo.nemos.vertical.slabs.datagen.ModelProvider;
import com.devnemo.nemos.vertical.slabs.datagen.NemosVerticalRecipeProvider;
import com.devnemo.nemos.vertical.slabs.datagen.lang.EnglishLanguageProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class DataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ModelProvider::new);
        pack.addProvider(EnglishLanguageProvider::new);
        pack.addProvider(BlockTagProvider::new);
        pack.addProvider(LootTableProvider::new);
        pack.addProvider(NemosVerticalRecipeProvider::new);
    }
}
