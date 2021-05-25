package com.unnamedmodding.unnamedbosses.entities;

import com.unnamedmodding.unnamedbosses.UnnamedBosses;
import com.unnamedmodding.unnamedbosses.setup.Registration;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;

public class ModEntityRegistry
{
    public static final RegistryObject<EntityType<YetiEntity>>  LOST_YETI = Registration.ENTITIES.register("lost_yeti",
            () -> EntityType.Builder.of(YetiEntity::new, EntityClassification.MONSTER)
    .sized(0.6F, 1.8F).fireImmune().clientTrackingRange(8)
    .build(new ResourceLocation(UnnamedBosses.MOD_ID + "lost_yeti").toString()));

    public static void register() { }
}
