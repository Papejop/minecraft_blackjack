package net.me.minecraft_blackjack.datagen;

import net.me.minecraft_blackjack.blackjack;
import net.me.minecraft_blackjack.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, blackjack.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.BLACKJACK_PLAYER_TABLE.get(),
            new ModelFile.UncheckedModelFile(modLoc("block/blackjack_player_table")));
        simpleBlock(ModBlocks.ONE_ARMED_BANDIT_BLOCK.get(),
            new ModelFile.UncheckedModelFile(modLoc("block/casino_block")));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
        // TODO Auto-generated method stub
    }
}


