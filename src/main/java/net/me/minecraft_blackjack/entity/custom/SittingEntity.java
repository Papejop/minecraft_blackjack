package net.me.minecraft_blackjack.entity.custom;

import net.me.minecraft_blackjack.block.custom.BlackJackPlayerChair;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class SittingEntity extends Entity {

    public SittingEntity(EntityType<?> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }


    @Override
    public void tick() {
        super.tick();
        if(!((this.level().getBlockState(this.blockPosition())).getBlock() instanceof BlackJackPlayerChair)){
            kill();
        }
        if(this.getPassengers().isEmpty()){
            kill();
        }
        for(Entity passengers : this.getPassengers()){
            if(passengers.isShiftKeyDown()){
                passengers.stopRiding();
            }
        }
    }

    @Override
    protected void defineSynchedData(SynchedEntityData.Builder pBuilder) {

    }

    @Override
    protected void readAdditionalSaveData(CompoundTag pCompound) {

    }

    @Override
    protected void addAdditionalSaveData(CompoundTag pCompound) {

    }
}
