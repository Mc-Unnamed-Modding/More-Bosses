package com.unnamedmodding.unnamedbosses.datagen;

import com.unnamedmodding.unnamedbosses.UnnamedBosses;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider
{

    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, UnnamedBosses.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels()
    {
        //withExistingParent("NAME_OF_BLOCK", modLoc("block/NAME_OF_BLOCK"));

        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

        builder(itemGenerated, "queen_string");

    }

    private ItemModelBuilder builder(ModelFile itemGenerated, String name)
    {
        return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }
}
