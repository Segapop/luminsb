package com.segapop.luminsb.client.render;

import com.gempire.client.entity.render.layers.*;
import com.segapop.luminsb.luminsb;
import com.segapop.luminsb.client.model.ModelOpal;
import com.segapop.luminsb.entities.gems.EntityOpal0;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class RenderOpal extends MobRenderer<EntityOpal0, ModelOpal<EntityOpal0>> {

    public RenderOpal(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ModelOpal<>(), .25f);
        this.addLayer(new SkinLayer(this));
        this.addLayer(new FaceLayer(this));
        this.addLayer(new HairLayer(this));
        this.addLayer(new OutfitLayer(this));
        this.addLayer(new InsigniaLayer(this));
        this.addLayer(new GemPlacementLayer(this));
    }

    @Override
    protected void preRenderCallback(EntityOpal0 entitylivingbaseIn, MatrixStack matrixStackIn, float partialTickTime) {
        matrixStackIn.scale(.8f, .8f, .8f);
        super.preRenderCallback(entitylivingbaseIn, matrixStackIn, partialTickTime);
    }
    @Override
    public ResourceLocation getEntityTexture(EntityOpal0 entity) {
        return new ResourceLocation(luminsb.MODID+":textures/entity/opal0/blank.png");
    }
    @Override
    protected void renderName(EntityOpal0 entityIn, ITextComponent displayNameIn, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
        super.renderName(entityIn, displayNameIn, matrixStackIn, bufferIn, packedLightIn);
    }
}