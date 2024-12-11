package net.me.minecraft_blackjack.block.custom;


import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockState;
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
}
