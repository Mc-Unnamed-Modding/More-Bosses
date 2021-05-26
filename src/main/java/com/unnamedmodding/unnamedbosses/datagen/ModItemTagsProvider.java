package com.unnamedmodding.unnamedbosses.datagen;

import com.unnamedmodding.unnamedbosses.UnnamedBosses;
import com.unnamedmodding.unnamedbosses.item.ModItemRegistry;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraft.tags.ITag;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

public class ModItemTagsProvider extends ItemTagsProvider
{
    // p_i232552_1_ = dataGenerator
    //p_i232552_2_ = blocTagProvider
    public ModItemTagsProvider(DataGenerator p_i232552_1_, BlockTagsProvider p_i232552_2_, ExistingFileHelper existingFileHelper) {
        super(p_i232552_1_, p_i232552_2_, UnnamedBosses.MOD_ID, existingFileHelper);
    }



    @Override
    protected void addTags()
    {

       tag(ModTags.Items.YETI_LOVED).add(ModItemRegistry.QUEEN_STRING.get());
    }
}
