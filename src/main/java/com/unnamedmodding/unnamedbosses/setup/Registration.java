package com.unnamedmodding.unnamedbosses.setup;

import com.unnamedmodding.unnamedbosses.UnnamedBosses;
import com.unnamedmodding.unnamedbosses.block.ModBlockRegistry;
import com.unnamedmodding.unnamedbosses.entities.ModEntityRegistry;
import com.unnamedmodding.unnamedbosses.item.ModItemRegistry;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registration
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, UnnamedBosses.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, UnnamedBosses.MOD_ID);
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, UnnamedBosses.MOD_ID);



    public static void register()
    {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(modBus);
        ITEMS.register(modBus);
        ENTITIES.register(modBus);

        ModItemRegistry.register();
        ModBlockRegistry.register();
        ModEntityRegistry.register();

    }


}
