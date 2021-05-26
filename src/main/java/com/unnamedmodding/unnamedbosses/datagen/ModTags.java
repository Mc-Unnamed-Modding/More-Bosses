package com.unnamedmodding.unnamedbosses.datagen;

import com.unnamedmodding.unnamedbosses.UnnamedBosses;
import net.minecraft.item.Item;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.ITag;
import net.minecraft.util.ResourceLocation;

public class ModTags
{
    public static final class Items
    {

        public static final  ITag.INamedTag<Item>  YETI_LOVED = forge("yeti_loved");

        private static ITag.INamedTag<Item> forge(String path) {
            return ItemTags.bind(new ResourceLocation("forge", path).toString());
        }

        private static ITag.INamedTag<Item> mod(String path) {
            return ItemTags.bind(new ResourceLocation(UnnamedBosses.MOD_ID, path).toString());
        }
    }

}

