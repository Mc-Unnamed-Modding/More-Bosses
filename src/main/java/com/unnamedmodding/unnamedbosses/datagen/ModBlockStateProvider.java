package com.unnamedmodding.unnamedbosses.datagen;

import com.unnamedmodding.unnamedbosses.UnnamedBosses;
import com.unnamedmodding.unnamedbosses.block.ModBlockRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider
{

    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, UnnamedBosses.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels()
    {
        //simpleBlock(ModBlockRegistry.NAME_OF_BLOCK.get());
    }
}
