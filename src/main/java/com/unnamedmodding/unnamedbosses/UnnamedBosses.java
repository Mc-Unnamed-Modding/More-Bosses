package com.unnamedmodding.unnamedbosses;

import com.unnamedmodding.unnamedbosses.entities.ModEntityRegistry;
import com.unnamedmodding.unnamedbosses.entities.YetiEntity;
import com.unnamedmodding.unnamedbosses.entities.render.RenderYeti;
import com.unnamedmodding.unnamedbosses.setup.Registration;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(UnnamedBosses.MOD_ID)
public class UnnamedBosses
{
    public static final String MOD_ID = "unnamedbosses";

    public static void add()
    {

    }

    public UnnamedBosses()
    {
        Registration.register();


        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        DeferredWorkQueue.runLater(() -> {
            GlobalEntityTypeAttributes.put(ModEntityRegistry.LOST_YETI.get(), YetiEntity.setCustomAttributes().build());
        });
    }



    private void doClientStuff(final FMLClientSetupEvent event)
    {
        RenderingRegistry.registerEntityRenderingHandler(ModEntityRegistry.LOST_YETI.get(), RenderYeti::new);
    }
}
