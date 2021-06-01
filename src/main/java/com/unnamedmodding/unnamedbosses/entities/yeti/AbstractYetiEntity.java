package com.unnamedmodding.unnamedbosses.entities.yeti;

import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.world.World;

public abstract class AbstractYetiEntity extends AgeableEntity
{
    private final Inventory inventory = new Inventory(9);

    protected AbstractYetiEntity(EntityType<? extends AbstractYetiEntity> type, World world) {
        super(type, world);
    }

    //add finalize spawn
    //add sync data if needed



    public void addAdditionalSaveData(CompoundNBT p_213281_1_) {
        super.addAdditionalSaveData(p_213281_1_);
        p_213281_1_.put("Inventory", this.inventory.createTag());
    }

    public void readAdditionalSaveData(CompoundNBT p_70037_1_) {
        super.readAdditionalSaveData(p_70037_1_);
        this.inventory.fromTag(p_70037_1_.getList("Inventory", 10));
    }

    public Inventory getInventory() {
        return this.inventory;
    }

    @Override
    public boolean setSlot(int slot, ItemStack itemStack) {
        return super.setSlot(slot, itemStack);
    }







}

