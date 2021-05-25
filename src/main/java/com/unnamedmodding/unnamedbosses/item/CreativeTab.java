package com.unnamedmodding.unnamedbosses.item;

import com.unnamedmodding.unnamedbosses.UnnamedBosses;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public final class CreativeTab
{
    public static final ItemGroup UNNAMED_BOSSES = new ItemGroup(UnnamedBosses.MOD_ID)
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