package com.segapop.luminsb.init;

import com.gempire.systems.injection.Crux;
import com.gempire.systems.injection.GemConditions;
import com.gempire.util.CruxType;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.ArrayList;

public class LuminSBCruxes {
//Moissanite
    public static GemConditions MOISS0_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = 0.8f;
        float gemTemperatureMax = 2.0f;
        Item primer = Items.NETHER_STAR;
        String essences = "white";
        gemCruxes.add(new Crux(Blocks.SOUL_SAND.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SOUL_SOIL.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.BASALT.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }

    public static GemConditions MOISS1_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = 0.8f;
        float gemTemperatureMax = 2.0f;
        Item primer = Items.NETHER_STAR;
        String essences = "white";
        gemCruxes.add(new Crux(Blocks.SOUL_SAND.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SOUL_SOIL.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.BASALT.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }

    public static GemConditions MOISS2_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = 0.8f;
        float gemTemperatureMax = 2.0f;
        Item primer = Items.NETHER_STAR;
        String essences = "white";
        gemCruxes.add(new Crux(Blocks.SOUL_SAND.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SOUL_SOIL.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.BASALT.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }

    public static GemConditions MOISS3_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = 0.8f;
        float gemTemperatureMax = 2.0f;
        Item primer = Items.NETHER_STAR;
        String essences = "white";
        gemCruxes.add(new Crux(Blocks.SOUL_SAND.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SOUL_SOIL.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.BASALT.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }

    public static GemConditions MOISS4_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = 0.8f;
        float gemTemperatureMax = 2.0f;
        Item primer = Items.NETHER_STAR;
        String essences = "white";
        gemCruxes.add(new Crux(Blocks.SOUL_SAND.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SOUL_SOIL.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.BASALT.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }

    public static GemConditions MOISS5_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = 0.8f;
        float gemTemperatureMax = 2.0f;
        Item primer = Items.NETHER_STAR;
        String essences = "white";
        gemCruxes.add(new Crux(Blocks.SOUL_SAND.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SOUL_SOIL.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.BASALT.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }


    public static GemConditions MOISS6_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = 0.8f;
        float gemTemperatureMax = 2.0f;
        Item primer = Items.NETHER_STAR;
        String essences = "white";
        gemCruxes.add(new Crux(Blocks.SOUL_SAND.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SOUL_SOIL.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.BASALT.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }

    public static GemConditions MOISS7_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = 0.8f;
        float gemTemperatureMax = 2.0f;
        Item primer = Items.NETHER_STAR;
        String essences = "white";
        gemCruxes.add(new Crux(Blocks.SOUL_SAND.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SOUL_SOIL.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.BASALT.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }

    public static GemConditions MOISS8_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = 0.8f;
        float gemTemperatureMax = 2.0f;
        Item primer = Items.NETHER_STAR;
        String essences = "white";
        gemCruxes.add(new Crux(Blocks.SOUL_SAND.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SOUL_SOIL.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.BASALT.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }

    public static GemConditions MOISS9_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = 0.8f;
        float gemTemperatureMax = 2.0f;
        Item primer = Items.NETHER_STAR;
        String essences = "white";
        gemCruxes.add(new Crux(Blocks.SOUL_SAND.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SOUL_SOIL.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.BASALT.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }

    public static GemConditions MOISS10_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = 0.8f;
        float gemTemperatureMax = 2.0f;
        Item primer = Items.NETHER_STAR;
        String essences = "white";
        gemCruxes.add(new Crux(Blocks.SOUL_SAND.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SOUL_SOIL.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.BASALT.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }

    public static GemConditions MOISS11_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = 0.8f;
        float gemTemperatureMax = 2.0f;
        Item primer = Items.NETHER_STAR;
        String essences = "white";
        gemCruxes.add(new Crux(Blocks.SOUL_SAND.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SOUL_SOIL.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.BASALT.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }

    public static GemConditions MOISS12_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = 0.8f;
        float gemTemperatureMax = 2.0f;
        Item primer = Items.NETHER_STAR;
        String essences = "white";
        gemCruxes.add(new Crux(Blocks.SOUL_SAND.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SOUL_SOIL.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.BASALT.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }


    public static GemConditions MOISS13_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = 0.8f;
        float gemTemperatureMax = 2.0f;
        Item primer = Items.NETHER_STAR;
        String essences = "white";
        gemCruxes.add(new Crux(Blocks.SOUL_SAND.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SOUL_SOIL.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.BASALT.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }

    public static GemConditions MOISS14_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = 0.8f;
        float gemTemperatureMax = 2.0f;
        Item primer = Items.NETHER_STAR;
        String essences = "white";
        gemCruxes.add(new Crux(Blocks.SOUL_SAND.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SOUL_SOIL.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.BASALT.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }

    public static GemConditions MOISS15_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = 0.8f;
        float gemTemperatureMax = 2.0f;
        Item primer = Items.NETHER_STAR;
        String essences = "white";
        gemCruxes.add(new Crux(Blocks.SOUL_SAND.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SOUL_SOIL.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.BASALT.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }
//Opal
public static GemConditions OPAL0_CONDITIONS() {
    ArrayList<Crux> gemCruxes = new ArrayList<>();
    float gemTemperatureMin = 0.8f;
    float gemTemperatureMax = 1.0f;
    Item primer = Items.WATER_BUCKET;
    String essences = "blue";
    gemCruxes.add(new Crux(Blocks.SANDSTONE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
    gemCruxes.add(new Crux(Blocks.RED_SANDSTONE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
    gemCruxes.add(new Crux(Blocks.WATER.getDefaultState(), 1, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
    gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
    gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
    gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
    gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
    return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
}

    public static GemConditions OPAL1_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = 0.8f;
        float gemTemperatureMax = 1.0f;
        Item primer = Items.WATER_BUCKET;
        String essences = "blue";
        gemCruxes.add(new Crux(Blocks.SANDSTONE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.RED_SANDSTONE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.WATER.getDefaultState(), 1, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }

    public static GemConditions OPAL2_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = 0.8f;
        float gemTemperatureMax = 1.0f;
        Item primer = Items.WATER_BUCKET;
        String essences = "blue";
        gemCruxes.add(new Crux(Blocks.SANDSTONE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.RED_SANDSTONE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.WATER.getDefaultState(), 1, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }

    public static GemConditions OPAL3_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = 0.8f;
        float gemTemperatureMax = 1.0f;
        Item primer = Items.WATER_BUCKET;
        String essences = "blue";
        gemCruxes.add(new Crux(Blocks.SANDSTONE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.RED_SANDSTONE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.WATER.getDefaultState(), 1, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }

    public static GemConditions OPAL4_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = 0.8f;
        float gemTemperatureMax = 1.0f;
        Item primer = Items.WATER_BUCKET;
        String essences = "blue";
        gemCruxes.add(new Crux(Blocks.SANDSTONE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.RED_SANDSTONE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.WATER.getDefaultState(), 1, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }

    public static GemConditions OPAL5_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = 0.8f;
        float gemTemperatureMax = 1.0f;
        Item primer = Items.WATER_BUCKET;
        String essences = "blue";
        gemCruxes.add(new Crux(Blocks.SANDSTONE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.RED_SANDSTONE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.WATER.getDefaultState(), 1, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }


    public static GemConditions OPAL6_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = 0.8f;
        float gemTemperatureMax = 1.0f;
        Item primer = Items.WATER_BUCKET;
        String essences = "blue";
        gemCruxes.add(new Crux(Blocks.SANDSTONE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.RED_SANDSTONE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.WATER.getDefaultState(), 1, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }

    public static GemConditions OPAL7_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = 0.8f;
        float gemTemperatureMax = 1.0f;
        Item primer = Items.WATER_BUCKET;
        String essences = "blue";
        gemCruxes.add(new Crux(Blocks.SANDSTONE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.RED_SANDSTONE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.WATER.getDefaultState(), 1, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }

    public static GemConditions OPAL8_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = 0.8f;
        float gemTemperatureMax = 1.0f;
        Item primer = Items.WATER_BUCKET;
        String essences = "blue";
        gemCruxes.add(new Crux(Blocks.SANDSTONE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.RED_SANDSTONE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.WATER.getDefaultState(), 1, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }

    public static GemConditions OPAL9_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = 0.8f;
        float gemTemperatureMax = 1.0f;
        Item primer = Items.WATER_BUCKET;
        String essences = "blue";
        gemCruxes.add(new Crux(Blocks.SANDSTONE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.RED_SANDSTONE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.WATER.getDefaultState(), 1, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }

    public static GemConditions OPAL10_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = 0.8f;
        float gemTemperatureMax = 1.0f;
        Item primer = Items.WATER_BUCKET;
        String essences = "blue";
        gemCruxes.add(new Crux(Blocks.SANDSTONE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.RED_SANDSTONE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.WATER.getDefaultState(), 1, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }

    public static GemConditions OPAL11_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = 0.8f;
        float gemTemperatureMax = 1.0f;
        Item primer = Items.WATER_BUCKET;
        String essences = "blue";
        gemCruxes.add(new Crux(Blocks.SANDSTONE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.RED_SANDSTONE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.WATER.getDefaultState(), 1, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }

    public static GemConditions OPAL12_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = 0.8f;
        float gemTemperatureMax = 1.0f;
        Item primer = Items.WATER_BUCKET;
        String essences = "blue";
        gemCruxes.add(new Crux(Blocks.SANDSTONE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.RED_SANDSTONE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.WATER.getDefaultState(), 1, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }


    public static GemConditions OPAL13_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = 0.8f;
        float gemTemperatureMax = 1.0f;
        Item primer = Items.WATER_BUCKET;
        String essences = "blue";
        gemCruxes.add(new Crux(Blocks.SANDSTONE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.RED_SANDSTONE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.WATER.getDefaultState(), 1, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }

    public static GemConditions OPAL14_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = 0.8f;
        float gemTemperatureMax = 1.0f;
        Item primer = Items.WATER_BUCKET;
        String essences = "blue";
        gemCruxes.add(new Crux(Blocks.SANDSTONE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.RED_SANDSTONE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.WATER.getDefaultState(), 1, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }

    public static GemConditions OPAL15_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = 0.8f;
        float gemTemperatureMax = 1.0f;
        Item primer = Items.WATER_BUCKET;
        String essences = "blue";
        gemCruxes.add(new Crux(Blocks.SANDSTONE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.RED_SANDSTONE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.WATER.getDefaultState(), 1, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }
//Jade
public static GemConditions JADE0_CONDITIONS() {
    ArrayList<Crux> gemCruxes = new ArrayList<>();
    float gemTemperatureMin = -0.7f;
    float gemTemperatureMax = 0.8f;
    Item primer = Items.QUARTZ;
    String essences = "pink-blue";
    gemCruxes.add(new Crux(Blocks.SPONGE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
    gemCruxes.add(new Crux(Blocks.NETHER_QUARTZ_ORE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
    gemCruxes.add(new Crux(Blocks.BASALT.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
    gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
    gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
    gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
    gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
    return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
}

    public static GemConditions JADE1_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = -0.7f;
        float gemTemperatureMax = 0.8f;
        Item primer = Items.QUARTZ;
        String essences = "pink-blue";
        gemCruxes.add(new Crux(Blocks.SPONGE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.NETHER_QUARTZ_ORE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.BASALT.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }

    public static GemConditions JADE2_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = -0.7f;
        float gemTemperatureMax = 0.8f;
        Item primer = Items.QUARTZ;
        String essences = "pink-blue";
        gemCruxes.add(new Crux(Blocks.SPONGE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.NETHER_QUARTZ_ORE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.BASALT.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }

    public static GemConditions JADE3_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = -0.7f;
        float gemTemperatureMax = 0.8f;
        Item primer = Items.QUARTZ;
        String essences = "pink-blue";
        gemCruxes.add(new Crux(Blocks.SPONGE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.NETHER_QUARTZ_ORE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.BASALT.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }

    public static GemConditions JADE4_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = -0.7f;
        float gemTemperatureMax = 0.8f;
        Item primer = Items.QUARTZ;
        String essences = "pink-blue";
        gemCruxes.add(new Crux(Blocks.SPONGE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.NETHER_QUARTZ_ORE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.BASALT.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }

    public static GemConditions JADE5_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = -0.7f;
        float gemTemperatureMax = 0.8f;
        Item primer = Items.QUARTZ;
        String essences = "pink-blue";
        gemCruxes.add(new Crux(Blocks.SPONGE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.NETHER_QUARTZ_ORE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.BASALT.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }


    public static GemConditions JADE6_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = -0.7f;
        float gemTemperatureMax = 0.8f;
        Item primer = Items.QUARTZ;
        String essences = "pink-blue";
        gemCruxes.add(new Crux(Blocks.SPONGE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.NETHER_QUARTZ_ORE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.BASALT.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }

    public static GemConditions JADE7_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = -0.7f;
        float gemTemperatureMax = 0.8f;
        Item primer = Items.QUARTZ;
        String essences = "pink-blue";
        gemCruxes.add(new Crux(Blocks.SPONGE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.NETHER_QUARTZ_ORE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.BASALT.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }

    public static GemConditions JADE8_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = -0.7f;
        float gemTemperatureMax = 0.8f;
        Item primer = Items.QUARTZ;
        String essences = "pink-blue";
        gemCruxes.add(new Crux(Blocks.SPONGE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.NETHER_QUARTZ_ORE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.BASALT.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }

    public static GemConditions JADE9_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = -0.7f;
        float gemTemperatureMax = 0.8f;
        Item primer = Items.QUARTZ;
        String essences = "pink-blue";
        gemCruxes.add(new Crux(Blocks.SPONGE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.NETHER_QUARTZ_ORE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.BASALT.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }

    public static GemConditions JADE10_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = -0.7f;
        float gemTemperatureMax = 0.8f;
        Item primer = Items.QUARTZ;
        String essences = "pink-blue";
        gemCruxes.add(new Crux(Blocks.SPONGE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.NETHER_QUARTZ_ORE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.BASALT.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }

    public static GemConditions JADE11_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = -0.7f;
        float gemTemperatureMax = 0.8f;
        Item primer = Items.QUARTZ;
        String essences = "pink-blue";
        gemCruxes.add(new Crux(Blocks.SPONGE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.NETHER_QUARTZ_ORE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.BASALT.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }

    public static GemConditions JADE12_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = -0.7f;
        float gemTemperatureMax = 0.8f;
        Item primer = Items.QUARTZ;
        String essences = "pink-blue";
        gemCruxes.add(new Crux(Blocks.SPONGE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.NETHER_QUARTZ_ORE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.BASALT.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }


    public static GemConditions JADE13_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = -0.7f;
        float gemTemperatureMax = 0.8f;
        Item primer = Items.QUARTZ;
        String essences = "pink-blue";
        gemCruxes.add(new Crux(Blocks.SPONGE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.NETHER_QUARTZ_ORE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.BASALT.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }

    public static GemConditions JADE14_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = -0.7f;
        float gemTemperatureMax = 0.8f;
        Item primer = Items.QUARTZ;
        String essences = "pink-blue";
        gemCruxes.add(new Crux(Blocks.SPONGE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.NETHER_QUARTZ_ORE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.BASALT.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }

    public static GemConditions JADE15_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = -0.7f;
        float gemTemperatureMax = 0.8f;
        Item primer = Items.QUARTZ;
        String essences = "pink-blue";
        gemCruxes.add(new Crux(Blocks.SPONGE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.NETHER_QUARTZ_ORE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.BASALT.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }
//Moonstone
public static GemConditions MOONST0_CONDITIONS() {
    ArrayList<Crux> gemCruxes = new ArrayList<>();
    float gemTemperatureMin = 0.25f;
    float gemTemperatureMax = 1.0f;
    Item primer = Items.QUARTZ;
    String essences = "white-yellow";
    gemCruxes.add(new Crux(Blocks.MAGMA_BLOCK.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
    gemCruxes.add(new Crux(Blocks.POLISHED_GRANITE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
    gemCruxes.add(new Crux(Blocks.BASALT.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
    gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
    gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
    gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
    gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
    return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
}

    public static GemConditions MOONST1_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = 0.25f;
        float gemTemperatureMax = 1.0f;
        Item primer = Items.QUARTZ;
        String essences = "white-yellow";
        gemCruxes.add(new Crux(Blocks.MAGMA_BLOCK.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.POLISHED_GRANITE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.BASALT.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }

    public static GemConditions MOONST2_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = 0.25f;
        float gemTemperatureMax = 1.0f;
        Item primer = Items.QUARTZ;
        String essences = "white-yellow";
        gemCruxes.add(new Crux(Blocks.MAGMA_BLOCK.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.POLISHED_GRANITE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.BASALT.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }

    public static GemConditions MOONST3_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = 0.25f;
        float gemTemperatureMax = 1.0f;
        Item primer = Items.QUARTZ;
        String essences = "white-yellow";
        gemCruxes.add(new Crux(Blocks.MAGMA_BLOCK.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.POLISHED_GRANITE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.BASALT.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }

    public static GemConditions MOONST4_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = 0.25f;
        float gemTemperatureMax = 1.0f;
        Item primer = Items.QUARTZ;
        String essences = "white-yellow";
        gemCruxes.add(new Crux(Blocks.MAGMA_BLOCK.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.POLISHED_GRANITE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.BASALT.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }

    public static GemConditions MOONST5_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = 0.25f;
        float gemTemperatureMax = 1.0f;
        Item primer = Items.QUARTZ;
        String essences = "white-yellow";
        gemCruxes.add(new Crux(Blocks.MAGMA_BLOCK.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.POLISHED_GRANITE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.BASALT.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }


    public static GemConditions MOONST6_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = 0.25f;
        float gemTemperatureMax = 1.0f;
        Item primer = Items.QUARTZ;
        String essences = "white-yellow";
        gemCruxes.add(new Crux(Blocks.MAGMA_BLOCK.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.POLISHED_GRANITE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.BASALT.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }

    public static GemConditions MOONST7_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = 0.25f;
        float gemTemperatureMax = 1.0f;
        Item primer = Items.QUARTZ;
        String essences = "white-yellow";
        gemCruxes.add(new Crux(Blocks.MAGMA_BLOCK.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.POLISHED_GRANITE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.BASALT.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }

    public static GemConditions MOONST8_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = 0.25f;
        float gemTemperatureMax = 1.0f;
        Item primer = Items.QUARTZ;
        String essences = "white-yellow";
        gemCruxes.add(new Crux(Blocks.MAGMA_BLOCK.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.POLISHED_GRANITE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.BASALT.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }

    public static GemConditions MOONST9_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = 0.25f;
        float gemTemperatureMax = 1.0f;
        Item primer = Items.QUARTZ;
        String essences = "white-yellow";
        gemCruxes.add(new Crux(Blocks.MAGMA_BLOCK.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.POLISHED_GRANITE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.BASALT.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }

    public static GemConditions MOONST10_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = 0.25f;
        float gemTemperatureMax = 1.0f;
        Item primer = Items.QUARTZ;
        String essences = "white-yellow";
        gemCruxes.add(new Crux(Blocks.MAGMA_BLOCK.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.POLISHED_GRANITE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.BASALT.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }

    public static GemConditions MOONST11_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = 0.25f;
        float gemTemperatureMax = 1.0f;
        Item primer = Items.QUARTZ;
        String essences = "white-yellow";
        gemCruxes.add(new Crux(Blocks.MAGMA_BLOCK.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.POLISHED_GRANITE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.BASALT.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }

    public static GemConditions MOONST12_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = 0.25f;
        float gemTemperatureMax = 1.0f;
        Item primer = Items.QUARTZ;
        String essences = "white-yellow";
        gemCruxes.add(new Crux(Blocks.MAGMA_BLOCK.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.POLISHED_GRANITE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.BASALT.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }


    public static GemConditions MOONST13_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = 0.25f;
        float gemTemperatureMax = 1.0f;
        Item primer = Items.QUARTZ;
        String essences = "white-yellow";
        gemCruxes.add(new Crux(Blocks.MAGMA_BLOCK.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.POLISHED_GRANITE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.BASALT.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }

    public static GemConditions MOONST14_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = 0.25f;
        float gemTemperatureMax = 1.0f;
        Item primer = Items.QUARTZ;
        String essences = "white-yellow";
        gemCruxes.add(new Crux(Blocks.MAGMA_BLOCK.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.POLISHED_GRANITE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.BASALT.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }

    public static GemConditions MOONST15_CONDITIONS() {
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        float gemTemperatureMin = 0.25f;
        float gemTemperatureMax = 1.0f;
        Item primer = Items.QUARTZ;
        String essences = "white-yellow";
        gemCruxes.add(new Crux(Blocks.MAGMA_BLOCK.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.POLISHED_GRANITE.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.BASALT.getDefaultState(), 9, CruxType.ORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.STONE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SAND.getDefaultState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        return new GemConditions(gemCruxes, essences, primer, 2, gemTemperatureMin, gemTemperatureMax);
    }
}
