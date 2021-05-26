package com.unnamedmodding.unnamedbosses.entities.render;

import com.unnamedmodding.unnamedbosses.UnnamedBosses;
import com.unnamedmodding.unnamedbosses.entities.model.ModelYeti;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;


import net.minecraft.util.ResourceLocation;

public class RenderYeti extends MobRenderer<YetiEntity, ModelYeti<YetiEntity>>
{

    public RenderYeti(EntityRendererManager p_i50961_1_) {
        super(p_i50961_1_, new ModelYeti<>(), 0.9f);
    }

    @Override
    public ResourceLocation getTextureLocation(YetiEntity p_110775_1_) {
        return new ResourceLocation(UnnamedBosses.MOD_ID, "texture/entity/lost_yeti");
    }
}
