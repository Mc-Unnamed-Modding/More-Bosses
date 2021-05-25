package com.unnamedmodding.unnamedbosses.entities.render.entity;

import com.unnamedmodding.unnamedbosses.entities.model.ModelYeti;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.entity.monster.VindicatorEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class RenderYeti extends MobRenderer<VindicatorEntity, ModelYeti<VindicatorEntity>>
{
    private static final ResourceLocation YETI_TEXTURES = new ResourceLocation("unnamedbosses:textures/entity/yeti.png");

    public RenderYeti(EntityRendererManager renderManagerIn)
    {
        super(renderManagerIn, new ModelYeti<>(), 0.5F);
    }

    /**
     * Returns the location of an entity's texture.
     */
    public ResourceLocation getTextureLocation(VindicatorEntity entity)
    {
        return YETI_TEXTURES;
    }
}
