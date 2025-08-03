package com.devnemo.nemos.vertical.slabs.platform;

import com.devnemo.nemos.vertical.slabs.Constants;
import com.devnemo.nemos.vertical.slabs.platform.services.IModLoaderHelper;
import com.devnemo.nemos.vertical.slabs.platform.services.IRegistryHelper;

import java.util.ServiceLoader;

public class Services {

    public static final IModLoaderHelper MOD_LOADER_HELPER = load(IModLoaderHelper.class);
    public static final IRegistryHelper REGISTRY_HELPER = load(IRegistryHelper.class);

    public static <T> T load(Class<T> clazz) {
        final T loadedService = ServiceLoader.load(clazz)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Failed to load service for " + clazz.getName()));

        Constants.LOG.debug("Loaded {} for service {}", loadedService, clazz);

        return loadedService;
    }
}