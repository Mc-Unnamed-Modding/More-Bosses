package com.unnamedmodding.unnamedbosses;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.entity.monster.VindicatorEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(modid = UnnamedBosses.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEntities
{
    public static EntityType<VindicatorEntity> YETI;

    public static void init()
    {
        YETI = EntityType.Builder.of(VindicatorEntity::new, EntityClassification.MONSTER).fireImmune().sized(0.6F, 1.8F).clientTrackingRange(8).build(getEntityResource("yeti").toString());
    }

    @SubscribeEvent
    public static void registerEntities(RegistryEvent.Register<EntityType<?>> e)
    {
        final IForgeRegistry<EntityType<?>> registry = e.getRegistry();
        registry.register(YETI.setRegistryName(UnnamedBosses.MOD_ID, "yeti"));
    }

    @SubscribeEvent
    public static void registerSpawnEggs(final RegistryEvent.Register<Item> event)
    {
        init();
        event.getRegistry().registerAll(
                new SpawnEggItem(YETI, 4411786, 16775294, new Item.Properties().tab(ItemGroup.TAB_MISC)).setRegistryName(UnnamedBosses.MOD_ID, "yeti_spawn_egg"));
    }

    public static void registerEntityAttributes()
    {
        GlobalEntityTypeAttributes.put(YETI, VindicatorEntity.createAttributes().build());
    }

    private static ResourceLocation getEntityResource(String entityName)
    {
        return new ResourceLocation(UnnamedBosses.MOD_ID, entityName);
    }
}
