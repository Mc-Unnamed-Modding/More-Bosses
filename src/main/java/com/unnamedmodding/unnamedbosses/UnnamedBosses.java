package com.unnamedmodding.unnamedbosses;

import com.unnamedmodding.unnamedbosses.client.render.entity.RenderYeti;
import com.unnamedmodding.unnamedbosses.entities.ModEntities;
import com.unnamedmodding.unnamedbosses.entities.ModSpawns;
import com.unnamedmodding.unnamedbosses.setup.Registration;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(UnnamedBosses.MOD_ID)
public class UnnamedBosses
{
    public static final String MOD_ID = "unnamedbosses";

    public UnnamedBosses()
    {
        Registration.register();


        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        MinecraftForge.EVENT_BUS.register(new ModSpawns());

        ModEntities.registerEntityAttributes();
    }



    private void doClientStuff(final FMLClientSetupEvent event)
    {
        RenderingRegistry.registerEntityRenderingHandler(ModEntities.YETI, RenderYeti::new);
    }
}
