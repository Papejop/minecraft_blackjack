package net.me.minecraft_blackjack.block.custom;


import net.me.minecraft_blackjack.entity.ModEntities;
import net.me.minecraft_blackjack.entity.custom.SittingEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;


public class BlackJackPlayerChair extends Block {

    public static final VoxelShape SHAPE = Block.box(0.5,0,0.5,15.5,8.5,15.5);
    public BlackJackPlayerChair(Properties pProperties) {
        super(pProperties);
    }
    @Override
    protected VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPE;
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, BlockHitResult pHitResult) {
        if(!pLevel.isClientSide()){
            ServerLevel level =(ServerLevel) pLevel;
                SittingEntity chairEntity = ModEntities.BLACKJACK_PLAYER_CHAIR_ENTITY.get().create(level);
                chairEntity.setPos(pPos.getX()+0.5f,pPos.getY(),pPos.getZ()+0.5f);
                level.addFreshEntity(chairEntity);
                pPlayer.startRiding(chairEntity);
        }
        return InteractionResult.SUCCESS;
    }
}
