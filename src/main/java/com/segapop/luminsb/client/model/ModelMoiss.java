package com.segapop.luminsb.client.model;

import com.gempire.client.entity.model.ModelGem;
import com.gempire.entities.bases.EntityGem;
import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

/**
 * Moiss - Dbro2112g
 * Created using Tabula 8.0.0
 */
@OnlyIn(Dist.CLIENT)
public class ModelMoiss<T extends EntityGem> extends ModelGem<T> {
    public ModelRenderer gemhead;
    public ModelRenderer gembody;
    public ModelRenderer gemlarm;
    public ModelRenderer gemrarm;
    public ModelRenderer gemlthigh;
    public ModelRenderer gemrthigh;
    public ModelRenderer gemhair;
    public ModelRenderer gemlhwshoulder;
    public ModelRenderer gemrhwshoulder;
    public ModelRenderer gemlredshoulder;
    public ModelRenderer gemrredshoulder;
    public ModelRenderer gemlpurpleshoulder;
    public ModelRenderer gemrpurpleshoulder;
    public ModelRenderer gempurpleskirt;
    public ModelRenderer gemgreenskirt;
    public ModelRenderer gemcape;
    public ModelRenderer gemlleg;
    public ModelRenderer gemrleg;
    public ModelRenderer gemhairspike;
    public ModelRenderer gemlhorn;
    public ModelRenderer gemrhorn;

    public ModelMoiss() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.gemhair = new ModelRenderer(this, 32, 0);
        this.gemhair.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.gemhair.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.5F, 0.5F, 0.5F);
        this.gemrhwshoulder = new ModelRenderer(this, 0, 49);
        this.gemrhwshoulder.setRotationPoint(3.0F, 1.0F, 0.0F);
        this.gemrhwshoulder.addBox(1.0F, -1.5F, -1.0F, 2.0F, 2.5F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.gemlpurpleshoulder = new ModelRenderer(this, 13, 38);
        this.gemlpurpleshoulder.setRotationPoint(-3.0F, 1.0F, 0.0F);
        this.gemlpurpleshoulder.addBox(-4.0F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.gemrthigh = new ModelRenderer(this, 19, 30);
        this.gemrthigh.setRotationPoint(1.5F, 10.0F, 0.0F);
        this.gemrthigh.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.gemgreenskirt = new ModelRenderer(this, 8, 45);
        this.gemgreenskirt.setRotationPoint(0.5F, 15.0F, 1.5F);
        this.gemgreenskirt.addBox(-4.0F, -8.0F, -4.0F, 7.0F, 14.0F, 5.0F, 0.0F, 0.0F, 0.0F);
        this.gemrpurpleshoulder = new ModelRenderer(this, 13, 38);
        this.gemrpurpleshoulder.setRotationPoint(3.0F, 1.0F, 0.0F);
        this.gemrpurpleshoulder.addBox(0.0F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.gemlthigh = new ModelRenderer(this, 5, 30);
        this.gemlthigh.setRotationPoint(-1.5F, 10.0F, 0.0F);
        this.gemlthigh.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.gemlleg = new ModelRenderer(this, 0, 38);
        this.gemlleg.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.gemlleg.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 9.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.gemlhorn = new ModelRenderer(this, 0, 0);
        this.gemlhorn.setRotationPoint(-3.5F, -7.5F, 0.0F);
        this.gemlhorn.addBox(-1.0F, -5.0F, 0.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(gemlhorn, 0.0F, 0.0F, -0.7853981633974483F);
        this.gembody = new ModelRenderer(this, 8, 16);
        this.gembody.setRotationPoint(1.0F, 8.0F, 2.0F);
        this.gembody.addBox(-4.0F, -8.0F, -4.0F, 6.0F, 10.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.gemrarm = new ModelRenderer(this, 28, 16);
        this.gemrarm.setRotationPoint(3.0F, 1.0F, 0.0F);
        this.gemrarm.addBox(0.0F, -1.0F, -1.0F, 2.0F, 13.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.gemhairspike = new ModelRenderer(this, 32, 48);
        this.gemhairspike.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.gemhairspike.addBox(-8.5F, -8.0F, 0.5F, 8.0F, 8.0F, 8.0F, 0.5F, 0.5F, 0.5F);
        this.setRotateAngle(gemhairspike, 0.6632251157578453F, 0.6632251157578453F, 0.45378560551852565F);
        this.gemhead = new ModelRenderer(this, 0, 0);
        this.gemhead.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.gemhead.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, 0.0F, 0.0F);
        this.gemlredshoulder = new ModelRenderer(this, 50, 34);
        this.gemlredshoulder.setRotationPoint(-3.0F, 1.0F, 0.0F);
        this.gemlredshoulder.addBox(-3.5F, 1.0F, -1.5F, 3.5F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.gempurpleskirt = new ModelRenderer(this, 44, 16);
        this.gempurpleskirt.setRotationPoint(1.0F, 18.0F, 2.0F);
        this.gempurpleskirt.addBox(-4.0F, -8.0F, -4.0F, 6.0F, 14.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.gemcape = new ModelRenderer(this, 35, 34);
        this.gemcape.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.gemcape.addBox(-3.0F, 2.0F, 0.0F, 6.0F, 14.0F, 0.0F, 0.0F, 2.0F, 0.0F);
        this.setRotateAngle(gemcape, 0.08726646259971647F, 0.0F, 0.0F);
        this.gemrleg = new ModelRenderer(this, 27, 38);
        this.gemrleg.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.gemrleg.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 9.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.gemrhorn = new ModelRenderer(this, 4, 0);
        this.gemrhorn.setRotationPoint(3.5F, -7.5F, 0.0F);
        this.gemrhorn.addBox(-1.0F, -5.0F, 0.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(gemrhorn, 0.0F, 0.0F, 0.7853981633974483F);
        this.gemlarm = new ModelRenderer(this, 0, 16);
        this.gemlarm.setRotationPoint(-3.0F, 1.0F, 0.0F);
        this.gemlarm.addBox(-2.0F, -1.0F, -1.0F, 2.0F, 13.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.gemrredshoulder = new ModelRenderer(this, 50, 34);
        this.gemrredshoulder.mirror = true;
        this.gemrredshoulder.setRotationPoint(3.0F, 1.0F, 0.0F);
        this.gemrredshoulder.addBox(0.0F, 1.0F, -1.5F, 3.5F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.gemlhwshoulder = new ModelRenderer(this, 0, 49);
        this.gemlhwshoulder.setRotationPoint(-3.0F, 1.0F, 0.0F);
        this.gemlhwshoulder.addBox(-3.0F, -1.5F, -1.0F, 2.0F, 2.5F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.gemlthigh.addChild(this.gemlleg);
        this.gemhair.addChild(this.gemlhorn);
        this.gemhair.addChild(this.gemhairspike);
        this.gemrthigh.addChild(this.gemrleg);
        this.gemhair.addChild(this.gemrhorn);
    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        ImmutableList.of(this.gemhair, this.gemrhwshoulder, this.gemlpurpleshoulder, this.gemrthigh, this.gemgreenskirt, this.gemrpurpleshoulder, this.gemlthigh, this.gembody, this.gemrarm, this.gemhead, this.gemlredshoulder, this.gempurpleskirt, this.gemcape, this.gemlarm, this.gemrredshoulder, this.gemlhwshoulder).forEach((modelRenderer) -> {
            modelRenderer.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        });
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.setRotateAngle(this.gemhead, headPitch * 0.9f * ((float)Math.PI / 180F), netHeadYaw * ((float)Math.PI / 180F), 0);
        this.setRotateAngle(this.gemhair, headPitch * 0.9f * ((float)Math.PI / 180F), netHeadYaw * ((float)Math.PI / 180F), 0);
        this.setRotateAngle(this.gemlarm, MathHelper.cos(limbSwing * 0.5F + (float)Math.PI) * 1.5F * limbSwingAmount * 0.8f, 0, 0);
        this.setRotateAngle(this.gemrarm, MathHelper.cos(limbSwing * 0.5F) * 1.5F * limbSwingAmount * 0.8f, 0, 0);
        this.setRotateAngle(this.gemlthigh, MathHelper.cos(limbSwing * 0.5F) * 1.5F * limbSwingAmount * 0.8f, 0, 0);
        this.setRotateAngle(this.gemrthigh, MathHelper.cos(limbSwing * 0.5F + (float)Math.PI) * 1.5F * limbSwingAmount * 0.8f, 0, 0);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
