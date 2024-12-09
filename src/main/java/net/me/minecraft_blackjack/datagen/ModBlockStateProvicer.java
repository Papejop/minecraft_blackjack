package net.me.minecraft_blackjack.datagen;

import net.me.minecraft_blackjack.blackjack;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.level.block.Block;
import net.me.minecraft_blackjack.block.ModBlocks;

public class ModBlockStateProvicer extends BlockStateProvider {
    public ModBlockStateProvicer(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, blackjack.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // TODO Auto-generated method stub
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
        // TODO Auto-generated method stub
    }
}


