package net.me.minecraft_blackjack.entity;

import net.me.minecraft_blackjack.blackjack;
import net.me.minecraft_blackjack.block.custom.BlackJackPlayerChair;
import net.me.minecraft_blackjack.block.custom.BlackJackPlayerTableBlock;
import net.me.minecraft_blackjack.entity.custom.SittingEntity;
import net.me.minecraft_blackjack.item.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.monster.piglin.StopAdmiringIfItemTooFarAway;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, blackjack.MODID);
    public static final RegistryObject<EntityType<SittingEntity>> BLACKJACK_PLAYER_CHAIR_ENTITY = ENTITIES.register("blackjack_player_chair_entity",
            () -> EntityType.Builder.<SittingEntity>of(SittingEntity::new,MobCategory.MISC)
                    .sized(1f,0.55f)
                    .build(new ResourceLocation(blackjack.MODID,"blackjack_player_chair_entity").toString()));
    public static void register(IEventBus eventBus)
    {
        ENTITIES.register(eventBus);
    }
}
