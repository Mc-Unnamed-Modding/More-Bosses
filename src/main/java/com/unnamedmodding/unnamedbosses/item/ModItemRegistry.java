package com.unnamedmodding.unnamedbosses.item;

import com.unnamedmodding.unnamedbosses.setup.Registration;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

public class ModItemRegistry
{
    public static RegistryObject<Item> QUEEN_STRING = Registration.ITEMS.register("queen_string", () -> new Item(new Item.Properties().tab(CreativeTab.UNNAMED_BOSSES_TAB)));

    public static void register() {}

}
