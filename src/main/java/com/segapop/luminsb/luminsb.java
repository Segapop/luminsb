package com.segapop.luminsb;

import com.segapop.luminsb.entities.gems.*;
import com.segapop.luminsb.init.RegistryHandler;
import com.segapop.luminsb.init.LuminSBEntities;
import net.minecraft.block.Block;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(luminsb.MODID)
public class luminsb
{
    public static final String MODID = "luminsb";

    public static final String VERSION = "1.0";
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public luminsb() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);

        RegistryHandler.init();
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        DeferredWorkQueue.runLater(() -> {
            //Moissanite
            GlobalEntityTypeAttributes.put(LuminSBEntities.MOISS0.get(), EntityMoiss0.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.MOISS1.get(), EntityMoiss0.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.MOISS2.get(), EntityMoiss0.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.MOISS3.get(), EntityMoiss0.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.MOISS4.get(), EntityMoiss0.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.MOISS5.get(), EntityMoiss0.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.MOISS6.get(), EntityMoiss0.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.MOISS7.get(), EntityMoiss0.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.MOISS8.get(), EntityMoiss0.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.MOISS9.get(), EntityMoiss0.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.MOISS10.get(), EntityMoiss0.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.MOISS11.get(), EntityMoiss0.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.MOISS12.get(), EntityMoiss0.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.MOISS13.get(), EntityMoiss0.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.MOISS14.get(), EntityMoiss0.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.MOISS15.get(), EntityMoiss0.setCustomAttributes().create());
            //Opal
            GlobalEntityTypeAttributes.put(LuminSBEntities.OPAL0.get(), EntityOpal0.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.OPAL1.get(), EntityOpal1.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.OPAL2.get(), EntityOpal2.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.OPAL3.get(), EntityOpal3.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.OPAL4.get(), EntityOpal4.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.OPAL5.get(), EntityOpal5.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.OPAL6.get(), EntityOpal6.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.OPAL7.get(), EntityOpal7.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.OPAL8.get(), EntityOpal8.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.OPAL9.get(), EntityOpal9.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.OPAL10.get(), EntityOpal10.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.OPAL11.get(), EntityOpal11.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.OPAL12.get(), EntityOpal12.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.OPAL13.get(), EntityOpal13.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.OPAL14.get(), EntityOpal14.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.OPAL15.get(), EntityOpal15.setCustomAttributes().create());
            //Jade
            GlobalEntityTypeAttributes.put(LuminSBEntities.JADE0.get(), EntityJade0.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.JADE1.get(), EntityJade1.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.JADE2.get(), EntityJade2.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.JADE3.get(), EntityJade3.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.JADE4.get(), EntityJade4.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.JADE5.get(), EntityJade5.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.JADE6.get(), EntityJade6.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.JADE7.get(), EntityJade7.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.JADE8.get(), EntityJade8.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.JADE9.get(), EntityJade9.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.JADE10.get(), EntityJade10.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.JADE11.get(), EntityJade11.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.JADE12.get(), EntityJade12.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.JADE13.get(), EntityJade13.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.JADE14.get(), EntityJade14.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.JADE15.get(), EntityJade15.setCustomAttributes().create());
            //Moonstone
            GlobalEntityTypeAttributes.put(LuminSBEntities.MOONST0.get(), EntityMoonst0.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.MOONST1.get(), EntityMoonst1.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.MOONST2.get(), EntityMoonst2.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.MOONST3.get(), EntityMoonst3.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.MOONST4.get(), EntityMoonst4.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.MOONST5.get(), EntityMoonst5.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.MOONST6.get(), EntityMoonst6.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.MOONST7.get(), EntityMoonst7.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.MOONST8.get(), EntityMoonst8.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.MOONST9.get(), EntityMoonst9.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.MOONST10.get(), EntityMoonst10.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.MOONST11.get(), EntityMoonst11.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.MOONST12.get(), EntityMoonst12.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.MOONST13.get(), EntityMoonst13.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.MOONST14.get(), EntityMoonst14.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(LuminSBEntities.MOONST15.get(), EntityMoonst15.setCustomAttributes().create());
        });
        LuminSBEntities.registerEntitiesToGempire();
    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {
        // some example code to dispatch IMC to another mod
        InterModComms.sendTo("luminsb", "helloworld", () -> { LOGGER.info("Hello world from the MDK"); return "Hello world";});
    }

    private void processIMC(final InterModProcessEvent event)
    {
        // some example code to receive and process InterModComms from other mods
        LOGGER.info("Got IMC {}", event.getIMCStream().
                map(m->m.getMessageSupplier().get()).
                collect(Collectors.toList()));
    }
    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
            // register a new block heref
            LOGGER.info("HELLO from Register Block");
        }
    }
}