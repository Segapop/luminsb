package com.segapop.luminsb.init;

import com.segapop.luminsb.luminsb;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.particles.ParticleTypes;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class LuminSBBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, luminsb.MODID);
    public static final RegistryObject<Block> COAL_TORCH = BLOCKS.register("coal_torch", () ->
            new TorchBlock(AbstractBlock.Properties
                    .create(Material.MISCELLANEOUS)
                    .doesNotBlockMovement()
                    .zeroHardnessAndResistance()
                    .setLightLevel((state) -> { return 14;})
                    .sound(SoundType.STONE), ParticleTypes.FLAME));
}