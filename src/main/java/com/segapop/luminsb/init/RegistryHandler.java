package com.segapop.luminsb.init;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class RegistryHandler {
    public static void init(){
        LuminSBBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        LuminSBItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        LuminSBEntities.ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}