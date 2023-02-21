package com.segapop.luminsb.init;
import com.gempire.init.AddonHandler;
import com.gempire.init.ModEntities;
import com.gempire.systems.injection.GemFormation;
import com.segapop.luminsb.entities.gems.EntityJade0;
import com.segapop.luminsb.entities.gems.EntityMoonst0;
import com.segapop.luminsb.entities.gems.EntityOpal0;
import com.segapop.luminsb.luminsb;
import com.segapop.luminsb.entities.gems.EntityMoiss0;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class LuminSBEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, luminsb.MODID);
//Moissanite
    public static final RegistryObject<EntityType<EntityMoiss0>> MOISS0 = ENTITIES.register("moiss0",
        () -> EntityType.Builder.create(EntityMoiss0::new, EntityClassification.CREATURE)
                .size(.5f, 1.99f) // Hitbox Size
                .build(new ResourceLocation(luminsb.MODID, "moiss0").toString()));

    public static final RegistryObject<EntityType<EntityMoiss0>> MOISS1 = ENTITIES.register("moiss1",
            () -> EntityType.Builder.create(EntityMoiss0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "moiss1").toString()));

    public static final RegistryObject<EntityType<EntityMoiss0>> MOISS2 = ENTITIES.register("moiss2",
            () -> EntityType.Builder.create(EntityMoiss0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "moiss2").toString()));

    public static final RegistryObject<EntityType<EntityMoiss0>> MOISS3 = ENTITIES.register("moiss3",
            () -> EntityType.Builder.create(EntityMoiss0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "moiss3").toString()));

    public static final RegistryObject<EntityType<EntityMoiss0>> MOISS4 = ENTITIES.register("moiss4",
            () -> EntityType.Builder.create(EntityMoiss0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "moiss4").toString()));

    public static final RegistryObject<EntityType<EntityMoiss0>> MOISS5 = ENTITIES.register("moiss5",
            () -> EntityType.Builder.create(EntityMoiss0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "moiss5").toString()));

    public static final RegistryObject<EntityType<EntityMoiss0>> MOISS6 = ENTITIES.register("moiss6",
            () -> EntityType.Builder.create(EntityMoiss0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "moiss6").toString()));

    public static final RegistryObject<EntityType<EntityMoiss0>> MOISS7 = ENTITIES.register("moiss7",
            () -> EntityType.Builder.create(EntityMoiss0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "moiss7").toString()));

    public static final RegistryObject<EntityType<EntityMoiss0>> MOISS8 = ENTITIES.register("moiss8",
            () -> EntityType.Builder.create(EntityMoiss0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "moiss8").toString()));

    public static final RegistryObject<EntityType<EntityMoiss0>> MOISS9 = ENTITIES.register("moiss9",
            () -> EntityType.Builder.create(EntityMoiss0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "moiss9").toString()));

    public static final RegistryObject<EntityType<EntityMoiss0>> MOISS10 = ENTITIES.register("moiss10",
            () -> EntityType.Builder.create(EntityMoiss0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "moiss10").toString()));

    public static final RegistryObject<EntityType<EntityMoiss0>> MOISS11 = ENTITIES.register("moiss11",
            () -> EntityType.Builder.create(EntityMoiss0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "moiss11").toString()));

    public static final RegistryObject<EntityType<EntityMoiss0>> MOISS12 = ENTITIES.register("moiss12",
            () -> EntityType.Builder.create(EntityMoiss0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "moiss12").toString()));

    public static final RegistryObject<EntityType<EntityMoiss0>> MOISS13 = ENTITIES.register("moiss13",
            () -> EntityType.Builder.create(EntityMoiss0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "moiss13").toString()));

    public static final RegistryObject<EntityType<EntityMoiss0>> MOISS14 = ENTITIES.register("moiss14",
            () -> EntityType.Builder.create(EntityMoiss0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "moiss14").toString()));

    public static final RegistryObject<EntityType<EntityMoiss0>> MOISS15 = ENTITIES.register("moiss15",
            () -> EntityType.Builder.create(EntityMoiss0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "moiss15").toString()));
//Opal
    public static final RegistryObject<EntityType<EntityOpal0>> OPAL0 = ENTITIES.register("opal0",
        () -> EntityType.Builder.create(EntityOpal0::new, EntityClassification.CREATURE)
                .size(.5f, 1.99f) // Hitbox Size
                .build(new ResourceLocation(luminsb.MODID, "opal0").toString()));

    public static final RegistryObject<EntityType<EntityOpal0>> OPAL1 = ENTITIES.register("opal1",
            () -> EntityType.Builder.create(EntityOpal0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "opal1").toString()));

    public static final RegistryObject<EntityType<EntityOpal0>> OPAL2 = ENTITIES.register("opal2",
            () -> EntityType.Builder.create(EntityOpal0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "opal2").toString()));

    public static final RegistryObject<EntityType<EntityOpal0>> OPAL3 = ENTITIES.register("opal3",
            () -> EntityType.Builder.create(EntityOpal0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "opal3").toString()));

    public static final RegistryObject<EntityType<EntityOpal0>> OPAL4 = ENTITIES.register("opal4",
            () -> EntityType.Builder.create(EntityOpal0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "opal4").toString()));

    public static final RegistryObject<EntityType<EntityOpal0>> OPAL5 = ENTITIES.register("opal5",
            () -> EntityType.Builder.create(EntityOpal0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "opal5").toString()));

    public static final RegistryObject<EntityType<EntityOpal0>> OPAL6 = ENTITIES.register("opal6",
            () -> EntityType.Builder.create(EntityOpal0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "opal6").toString()));

    public static final RegistryObject<EntityType<EntityOpal0>> OPAL7 = ENTITIES.register("opal7",
            () -> EntityType.Builder.create(EntityOpal0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "opal7").toString()));

    public static final RegistryObject<EntityType<EntityOpal0>> OPAL8 = ENTITIES.register("opal8",
            () -> EntityType.Builder.create(EntityOpal0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "opal8").toString()));

    public static final RegistryObject<EntityType<EntityOpal0>> OPAL9 = ENTITIES.register("opal9",
            () -> EntityType.Builder.create(EntityOpal0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "opal9").toString()));

    public static final RegistryObject<EntityType<EntityOpal0>> OPAL10 = ENTITIES.register("opal10",
            () -> EntityType.Builder.create(EntityOpal0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "opal10").toString()));

    public static final RegistryObject<EntityType<EntityOpal0>> OPAL11 = ENTITIES.register("opal11",
            () -> EntityType.Builder.create(EntityOpal0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "opal11").toString()));

    public static final RegistryObject<EntityType<EntityOpal0>> OPAL12 = ENTITIES.register("opal12",
            () -> EntityType.Builder.create(EntityOpal0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "opal12").toString()));

    public static final RegistryObject<EntityType<EntityOpal0>> OPAL13 = ENTITIES.register("opal13",
            () -> EntityType.Builder.create(EntityOpal0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "opal13").toString()));

    public static final RegistryObject<EntityType<EntityOpal0>> OPAL14 = ENTITIES.register("opal14",
            () -> EntityType.Builder.create(EntityOpal0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "opal14").toString()));

    public static final RegistryObject<EntityType<EntityOpal0>> OPAL15 = ENTITIES.register("opal15",
            () -> EntityType.Builder.create(EntityOpal0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "opal15").toString()));
//Jade
public static final RegistryObject<EntityType<EntityJade0>> JADE0 = ENTITIES.register("jade0",
        () -> EntityType.Builder.create(EntityJade0::new, EntityClassification.CREATURE)
                .size(.5f, 1.99f) // Hitbox Size
                .build(new ResourceLocation(luminsb.MODID, "jade0").toString()));

    public static final RegistryObject<EntityType<EntityJade0>> JADE1 = ENTITIES.register("jade1",
            () -> EntityType.Builder.create(EntityJade0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "jade1").toString()));

    public static final RegistryObject<EntityType<EntityJade0>> JADE2 = ENTITIES.register("jade2",
            () -> EntityType.Builder.create(EntityJade0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "jade2").toString()));

    public static final RegistryObject<EntityType<EntityJade0>> JADE3 = ENTITIES.register("jade3",
            () -> EntityType.Builder.create(EntityJade0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "jade3").toString()));

    public static final RegistryObject<EntityType<EntityJade0>> JADE4 = ENTITIES.register("jade4",
            () -> EntityType.Builder.create(EntityJade0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "jade4").toString()));

    public static final RegistryObject<EntityType<EntityJade0>> JADE5 = ENTITIES.register("jade5",
            () -> EntityType.Builder.create(EntityJade0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "jade5").toString()));

    public static final RegistryObject<EntityType<EntityJade0>> JADE6 = ENTITIES.register("jade6",
            () -> EntityType.Builder.create(EntityJade0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "jade6").toString()));

    public static final RegistryObject<EntityType<EntityJade0>> JADE7 = ENTITIES.register("jade7",
            () -> EntityType.Builder.create(EntityJade0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "jade7").toString()));

    public static final RegistryObject<EntityType<EntityJade0>> JADE8 = ENTITIES.register("jade8",
            () -> EntityType.Builder.create(EntityJade0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "jade8").toString()));

    public static final RegistryObject<EntityType<EntityJade0>> JADE9 = ENTITIES.register("jade9",
            () -> EntityType.Builder.create(EntityJade0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "jade9").toString()));

    public static final RegistryObject<EntityType<EntityJade0>> JADE10 = ENTITIES.register("jade10",
            () -> EntityType.Builder.create(EntityJade0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "jade10").toString()));

    public static final RegistryObject<EntityType<EntityJade0>> JADE11 = ENTITIES.register("jade11",
            () -> EntityType.Builder.create(EntityJade0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "jade11").toString()));

    public static final RegistryObject<EntityType<EntityJade0>> JADE12 = ENTITIES.register("jade12",
            () -> EntityType.Builder.create(EntityJade0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "jade12").toString()));

    public static final RegistryObject<EntityType<EntityJade0>> JADE13 = ENTITIES.register("jade13",
            () -> EntityType.Builder.create(EntityJade0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "jade13").toString()));

    public static final RegistryObject<EntityType<EntityJade0>> JADE14 = ENTITIES.register("jade14",
            () -> EntityType.Builder.create(EntityJade0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "jade14").toString()));

    public static final RegistryObject<EntityType<EntityJade0>> JADE15 = ENTITIES.register("jade15",
            () -> EntityType.Builder.create(EntityJade0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "jade15").toString()));
//Moonstone
public static final RegistryObject<EntityType<EntityMoonst0>> MOONST0 = ENTITIES.register("moonst0",
        () -> EntityType.Builder.create(EntityMoonst0::new, EntityClassification.CREATURE)
                .size(.5f, 1.99f) // Hitbox Size
                .build(new ResourceLocation(luminsb.MODID, "moonst0").toString()));

    public static final RegistryObject<EntityType<EntityMoonst0>> MOONST1 = ENTITIES.register("moonst1",
            () -> EntityType.Builder.create(EntityMoonst0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "moonst1").toString()));

    public static final RegistryObject<EntityType<EntityMoonst0>> MOONST2 = ENTITIES.register("moonst2",
            () -> EntityType.Builder.create(EntityMoonst0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "moonst2").toString()));

    public static final RegistryObject<EntityType<EntityMoonst0>> MOONST3 = ENTITIES.register("moonst3",
            () -> EntityType.Builder.create(EntityMoonst0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "moonst3").toString()));

    public static final RegistryObject<EntityType<EntityMoonst0>> MOONST4 = ENTITIES.register("moonst4",
            () -> EntityType.Builder.create(EntityMoonst0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "moonst4").toString()));

    public static final RegistryObject<EntityType<EntityMoonst0>> MOONST5 = ENTITIES.register("moonst5",
            () -> EntityType.Builder.create(EntityMoonst0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "moonst5").toString()));

    public static final RegistryObject<EntityType<EntityMoonst0>> MOONST6 = ENTITIES.register("moonst6",
            () -> EntityType.Builder.create(EntityMoonst0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "moonst6").toString()));

    public static final RegistryObject<EntityType<EntityMoonst0>> MOONST7 = ENTITIES.register("moonst7",
            () -> EntityType.Builder.create(EntityMoonst0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "moonst7").toString()));

    public static final RegistryObject<EntityType<EntityMoonst0>> MOONST8 = ENTITIES.register("moonst8",
            () -> EntityType.Builder.create(EntityMoonst0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "moonst8").toString()));

    public static final RegistryObject<EntityType<EntityMoonst0>> MOONST9 = ENTITIES.register("moonst9",
            () -> EntityType.Builder.create(EntityMoonst0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "moonst9").toString()));

    public static final RegistryObject<EntityType<EntityMoonst0>> MOONST10 = ENTITIES.register("moonst10",
            () -> EntityType.Builder.create(EntityMoonst0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "moonst10").toString()));

    public static final RegistryObject<EntityType<EntityMoonst0>> MOONST11 = ENTITIES.register("moonst11",
            () -> EntityType.Builder.create(EntityMoonst0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "moonst11").toString()));

    public static final RegistryObject<EntityType<EntityMoonst0>> MOONST12 = ENTITIES.register("moonst12",
            () -> EntityType.Builder.create(EntityMoonst0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "moonst12").toString()));

    public static final RegistryObject<EntityType<EntityMoonst0>> MOONST13 = ENTITIES.register("moonst13",
            () -> EntityType.Builder.create(EntityMoonst0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "moonst13").toString()));

    public static final RegistryObject<EntityType<EntityMoonst0>> MOONST14 = ENTITIES.register("moonst14",
            () -> EntityType.Builder.create(EntityMoonst0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "moonst14").toString()));

    public static final RegistryObject<EntityType<EntityMoonst0>> MOONST15 = ENTITIES.register("moonst15",
            () -> EntityType.Builder.create(EntityMoonst0::new, EntityClassification.CREATURE)
                    .size(.5f, 1.99f) // Hitbox Size
                    .build(new ResourceLocation(luminsb.MODID, "moonst15").toString()));

    public static void registerEntitiesToGempire(){
//Moissanite
        ModEntities.CRUXTOGEM.put("moiss0", LuminSBCruxes.MOISS0_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("moiss0");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("moiss0", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("moiss1", LuminSBCruxes.MOISS1_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("moiss1");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("moiss1", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("moiss2", LuminSBCruxes.MOISS2_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("moiss2");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("moiss2", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("moiss3", LuminSBCruxes.MOISS3_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("moiss3");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("moiss3", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("moiss4", LuminSBCruxes.MOISS4_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("moiss4");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("moiss4", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("moiss5", LuminSBCruxes.MOISS5_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("moiss5");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("moiss5", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("moiss6", LuminSBCruxes.MOISS6_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("moiss6");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("moiss6", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("moiss7", LuminSBCruxes.MOISS7_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("moiss7");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("moiss7", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("moiss8", LuminSBCruxes.MOISS8_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("moiss8");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("moiss8", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("moiss9", LuminSBCruxes.MOISS9_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("moiss9");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("moiss9", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("moiss10", LuminSBCruxes.MOISS10_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("moiss10");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("moiss10", LuminSBEntities.class);


        ModEntities.CRUXTOGEM.put("moiss11", LuminSBCruxes.MOISS11_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("moiss11");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("moiss11", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("moiss12", LuminSBCruxes.MOISS12_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("moiss12");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("moiss12", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("moiss13", LuminSBCruxes.MOISS13_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("moiss13");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("moiss13", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("moiss14", LuminSBCruxes.MOISS14_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("moiss14");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("moiss14", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("moiss15", LuminSBCruxes.MOISS15_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("moiss15");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("moiss15", LuminSBEntities.class);
//Opal
        ModEntities.CRUXTOGEM.put("opal0", LuminSBCruxes.OPAL0_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("opal0");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("opal0", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("opal1", LuminSBCruxes.OPAL1_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("opal1");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("opal1", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("opal2", LuminSBCruxes.OPAL2_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("opal2");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("opal2", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("opal3", LuminSBCruxes.OPAL3_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("opal3");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("opal3", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("opal4", LuminSBCruxes.OPAL4_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("opal4");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("opal4", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("opal5", LuminSBCruxes.OPAL5_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("opal5");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("opal5", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("opal6", LuminSBCruxes.OPAL6_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("opal6");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("opal6", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("opal7", LuminSBCruxes.OPAL7_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("opal7");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("opal7", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("opal8", LuminSBCruxes.OPAL8_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("opal8");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("opal8", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("opal9", LuminSBCruxes.OPAL9_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("opal9");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("opal9", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("opal10", LuminSBCruxes.OPAL10_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("opal10");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("opal10", LuminSBEntities.class);


        ModEntities.CRUXTOGEM.put("opal11", LuminSBCruxes.OPAL11_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("opal11");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("opal11", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("opal12", LuminSBCruxes.OPAL12_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("opal12");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("opal12", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("opal13", LuminSBCruxes.OPAL13_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("opal13");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("opal13", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("opal14", LuminSBCruxes.OPAL14_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("opal14");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("opal14", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("opal15", LuminSBCruxes.OPAL15_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("opal15");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("opal15", LuminSBEntities.class);
//Jade
        ModEntities.CRUXTOGEM.put("jade0", LuminSBCruxes.JADE0_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("jade0");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("jade0", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("jade1", LuminSBCruxes.JADE1_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("jade1");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("jade1", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("jade2", LuminSBCruxes.JADE2_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("jade2");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("jade2", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("jade3", LuminSBCruxes.JADE3_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("jade3");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("jade3", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("jade4", LuminSBCruxes.JADE4_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("jade4");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("jade4", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("jade5", LuminSBCruxes.JADE5_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("jade5");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("jade5", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("jade6", LuminSBCruxes.JADE6_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("jade6");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("jade6", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("jade7", LuminSBCruxes.JADE7_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("jade7");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("jade7", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("jade8", LuminSBCruxes.JADE8_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("jade8");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("jade8", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("jade9", LuminSBCruxes.JADE9_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("jade9");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("jade9", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("jade10", LuminSBCruxes.JADE10_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("jade10");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("jade10", LuminSBEntities.class);


        ModEntities.CRUXTOGEM.put("jade11", LuminSBCruxes.JADE11_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("jade11");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("jade11", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("jade12", LuminSBCruxes.JADE12_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("jade12");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("jade12", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("jade13", LuminSBCruxes.JADE13_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("jade13");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("jade13", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("jade14", LuminSBCruxes.JADE14_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("jade14");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("jade14", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("jade15", LuminSBCruxes.JADE15_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("jade15");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("jade15", LuminSBEntities.class);
//Moonstone
        ModEntities.CRUXTOGEM.put("moonst0", LuminSBCruxes.MOONST0_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("moonst0");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("moonst0", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("moonst1", LuminSBCruxes.MOONST1_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("moonst1");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("moonst1", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("moonst2", LuminSBCruxes.MOONST2_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("moonst2");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("moonst2", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("moonst3", LuminSBCruxes.MOONST3_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("moonst3");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("moonst3", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("moonst4", LuminSBCruxes.MOONST4_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("moonst4");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("moonst4", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("moonst5", LuminSBCruxes.MOONST5_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("moonst5");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("moonst5", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("moonst6", LuminSBCruxes.MOONST6_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("moonst6");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("moonst6", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("moonst7", LuminSBCruxes.MOONST7_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("moonst7");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("moonst7", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("moonst8", LuminSBCruxes.MOONST8_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("moonst8");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("moonst8", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("moonst9", LuminSBCruxes.MOONST9_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("moonst9");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("moonst9", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("moonst10", LuminSBCruxes.MOONST10_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("moonst10");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("moonst10", LuminSBEntities.class);


        ModEntities.CRUXTOGEM.put("moonst11", LuminSBCruxes.MOONST11_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("moonst11");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("moonst11", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("moonst12", LuminSBCruxes.MOONST12_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("moonst12");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("moonst12", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("moonst13", LuminSBCruxes.MOONST13_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("moonst13");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("moonst13", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("moonst14", LuminSBCruxes.MOONST14_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("moonst14");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("moonst14", LuminSBEntities.class);

        ModEntities.CRUXTOGEM.put("moonst15", LuminSBCruxes.MOONST15_CONDITIONS());
        GemFormation.POSSIBLE_GEMS.add("moonst15");
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("moonst15", LuminSBEntities.class);
        AddonHandler.ADDON_ENTITY_REGISTRIES.put("luminsb", LuminSBEntities.class);
    }
}