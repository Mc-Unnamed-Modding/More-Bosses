package com.unnamedmodding.unnamedbosses.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public final class CreativeTab
{


    public static final ItemGroup UNNAMED_BOSSES_TAB = new ItemGroup("unnamedbossestab")
    {

        @Override
        public ItemStack makeIcon()
        {
            return new ItemStack(ModItemRegistry.QUEEN_STRING.get());
        }

        @Override
        public boolean hasSearchBar()
        {
            return true;
        }

    };


}