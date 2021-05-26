package com.unnamedmodding.unnamedbosses.datagen;

import com.unnamedmodding.unnamedbosses.UnnamedBosses;
import com.unnamedmodding.unnamedbosses.block.ModBlockRegistry;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;


public class ModBlockTagsProvider extends BlockTagsProvider
{
    // p_i48256_1_ = generatorIn
    public ModBlockTagsProvider(DataGenerator p_i48256_1_, ExistingFileHelper existingFileHelper) {
        super(p_i48256_1_, UnnamedBosses.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags()
    {
       // getOrCreateRawBuilder(Tags.Blocks.ORES).add(ModBlockRegistry.NAME_OF_THE_ORE.get());

    }
}
