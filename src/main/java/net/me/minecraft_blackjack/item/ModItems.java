package net.me.minecraft_blackjack.item;

import net.me.minecraft_blackjack.blackjack;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, blackjack.MODID);

    public static final RegistryObject<Item> CARD_ACE_OF_HEARTS = ITEMS.register("ace_of_hearts", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CARD_TWO_OF_HEARTS = ITEMS.register("two_of_hearts", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CARD_THREE_OF_HEARTS = ITEMS.register("three_of_hearts", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CARD_FOUR_OF_HEARTS = ITEMS.register("four_of_hearts", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CARD_FIVE_OF_HEARTS = ITEMS.register("five_of_hearts", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CARD_SIX_OF_HEARTS = ITEMS.register("six_of_hearts", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CARD_SEVEN_OF_HEARTS = ITEMS.register("seven_of_hearts", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CARD_EIGHT_OF_HEARTS = ITEMS.register("eight_of_hearts", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CARD_NINE_OF_HEARTS = ITEMS.register("nine_of_hearts", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CARD_TEN_OF_HEARTS = ITEMS.register("ten_of_hearts", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CARD_JACK_OF_HEARTS = ITEMS.register("jack_of_hearts", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CARD_QUEEN_OF_HEARTS = ITEMS.register("queen_of_hearts", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CARD_KING_OF_HEARTS = ITEMS.register("king_of_hearts", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
