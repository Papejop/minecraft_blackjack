package net.me.minecraft_blackjack.block;

import java.util.function.Supplier;

import net.me.minecraft_blackjack.blackjack;
import net.me.minecraft_blackjack.block.custom.BlackJackPlayerChair;
import net.me.minecraft_blackjack.block.custom.BlackJackPlayerTableBlock;
import net.me.minecraft_blackjack.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, blackjack.MODID);

    public static final RegistryObject<Block> BLACKJACK_PLAYER_TABLE = registerBlock("blackjack_player_table", 
        () -> new BlackJackPlayerTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).noOcclusion()));
    public static final RegistryObject<Block> BLACKJACK_PLAYER_CHAIR = registerBlock("blackjack_player_chair",
        () -> new BlackJackPlayerChair(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).noOcclusion().noLootTable()));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block)
    {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block)
    {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }
}
