package com.devnemo.nemos.vertical.slabs.platform.services;

public interface IModLoaderHelper {

    String getModLoaderName();

    boolean isModLoaded(String modId);

    boolean isDevelopmentEnvironment();
}