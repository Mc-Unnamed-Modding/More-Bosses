package com.unnamedmodding.unnamedbosses.entities.yeti;

import com.google.common.collect.ImmutableSet;
import com.unnamedmodding.unnamedbosses.item.ModItemRegistry;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileItemEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import org.lwjgl.system.CallbackI;

import javax.annotation.Nullable;
import java.util.Set;


public class YetiEntity extends AbstractYetiEntity
{
    private static final Set<Item> WANTED_ITEMS = ImmutableSet.of(ModItemRegistry.QUEEN_STRING.get(), Items.WHEAT);

    // p_i231570_1_ = type
    // p_i231570_2_ = worldIn
    public YetiEntity(EntityType<YetiEntity> entityEntityType,World world)
    {
        super(entityEntityType, world);
        this.setCanPickUpLoot(true);
    }


    public void addAdditionalSaveData(CompoundNBT compoundNBT)
    {
        super.addAdditionalSaveData(compoundNBT);
    }


    public void readAdditionalSaveData(CompoundNBT p_70037_1_)
    {
        super.readAdditionalSaveData(p_70037_1_);
        this.setCanPickUpLoot(true);
    }


    public static AttributeModifierMap.MutableAttribute setCustomAttributes()
    {
        return MobEntity.createMobAttributes().add(Attributes.MAX_HEALTH, 20D).add(Attributes.MOVEMENT_SPEED, 0.35D);
    }

    protected void pickUpItem(ItemEntity itemEntity)
    {
        ItemStack itemStack = itemEntity.getItem();
        if (this.wantsToPickUp(itemStack))
        {
            Inventory inventory = this.getInventory();
            boolean flag = inventory.canAddItem(itemStack);
            if(!flag)
            {
                return;
            }

            this.onItemPickup(itemEntity);
            this.take(itemEntity, itemStack.getCount());
            ItemStack itemStack1 = inventory.addItem(itemStack);
            if (itemStack1.isEmpty())
            {
                itemEntity.remove();
            }
            else
            {
                itemStack.setCount(itemStack1.getCount());
            }
        }
    }

    public boolean wantsToPickUp(ItemStack itemStack)
    {
        Item item = itemStack.getItem();
        return  (WANTED_ITEMS.contains(item)) && this.getInventory().canAddItem(itemStack);
    }




    @Override
    protected void registerGoals()
    {
        super.registerGoals();

        this.goalSelector.addGoal(0, new RandomWalkingGoal(this, 1.0D));
        this.goalSelector.addGoal(1, new LookAtGoal(this, PlayerEntity.class, 8f));
    }


    @Nullable
    @Override
    public AgeableEntity getBreedOffspring(ServerWorld serverWorld, AgeableEntity ageableEntity) {
        return null;
    }
}