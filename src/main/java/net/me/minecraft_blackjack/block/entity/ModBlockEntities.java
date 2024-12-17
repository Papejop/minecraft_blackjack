package net.me.minecraft_blackjack.block.entity;

import net.me.minecraft_blackjack.blackjack;
import net.me.minecraft_blackjack.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, blackjack.MODID);

    public static final RegistryObject<BlockEntityType<BlackJackPlayerTableBlockEntity>> BJ_PlAYER_TABLE_BE =
            BLOCK_ENTITIES.register("bj_player_table_be", () ->
                    BlockEntityType.Builder.of(BlackJackPlayerTableBlockEntity::new,
                            ModBlocks.BLACKJACK_PLAYER_TABLE.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}