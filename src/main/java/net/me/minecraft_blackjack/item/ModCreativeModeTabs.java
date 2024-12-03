package net.me.minecraft_blackjack.item;

import net.me.minecraft_blackjack.blackjack;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;
 


public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, blackjack.MODID);


    public static final RegistryObject<CreativeModeTab> BLACKJACK_TAB = CREATIVE_MODE_TABS.register("blackjack_tab",
        () -> CreativeModeTab.builder()
        .icon(() -> new ItemStack(ModItems.CARD_ACE_OF_HEARTS.get()))
        .title(Component.translatable("blackjack"))
        .displayItems((pParameters, pOutput) -> {
            pOutput.accept(ModItems.CARD_ACE_OF_HEARTS.get());
            pOutput.accept(ModItems.CARD_TWO_OF_HEARTS.get());
            pOutput.accept(ModItems.CARD_THREE_OF_HEARTS.get());
            pOutput.accept(ModItems.CARD_FOUR_OF_HEARTS.get());
            pOutput.accept(ModItems.CARD_FIVE_OF_HEARTS.get());
            pOutput.accept(ModItems.CARD_SIX_OF_HEARTS.get());
            pOutput.accept(ModItems.CARD_SEVEN_OF_HEARTS.get());
            pOutput.accept(ModItems.CARD_EIGHT_OF_HEARTS.get());
            pOutput.accept(ModItems.CARD_NINE_OF_HEARTS.get());
            pOutput.accept(ModItems.CARD_TEN_OF_HEARTS.get());
            pOutput.accept(ModItems.CARD_JACK_OF_HEARTS.get());
            pOutput.accept(ModItems.CARD_QUEEN_OF_HEARTS.get());
            pOutput.accept(ModItems.CARD_KING_OF_HEARTS.get());

            pOutput.accept(ModItems.CARD_ACE_OF_DIAMONDS.get());
            pOutput.accept(ModItems.CARD_TWO_OF_DIAMONDS.get());
            pOutput.accept(ModItems.CARD_THREE_OF_DIAMONDS.get());
            pOutput.accept(ModItems.CARD_FOUR_OF_DIAMONDS.get());
            pOutput.accept(ModItems.CARD_FIVE_OF_DIAMONDS.get());
            pOutput.accept(ModItems.CARD_SIX_OF_DIAMONDS.get());
            pOutput.accept(ModItems.CARD_SEVEN_OF_DIAMONDS.get());
            pOutput.accept(ModItems.CARD_EIGHT_OF_DIAMONDS.get());
            pOutput.accept(ModItems.CARD_NINE_OF_DIAMONDS.get());
            pOutput.accept(ModItems.CARD_TEN_OF_DIAMONDS.get());
            pOutput.accept(ModItems.CARD_JACK_OF_DIAMONDS.get());
            pOutput.accept(ModItems.CARD_QUEEN_OF_DIAMONDS.get());
            pOutput.accept(ModItems.CARD_KING_OF_DIAMONDS.get());

            pOutput.accept(ModItems.CARD_ACE_OF_CLUBS.get());
            pOutput.accept(ModItems.CARD_TWO_OF_CLUBS.get());
            pOutput.accept(ModItems.CARD_THREE_OF_CLUBS.get());
            pOutput.accept(ModItems.CARD_FOUR_OF_CLUBS.get());
            pOutput.accept(ModItems.CARD_FIVE_OF_CLUBS.get());
            pOutput.accept(ModItems.CARD_SIX_OF_CLUBS.get());
            pOutput.accept(ModItems.CARD_SEVEN_OF_CLUBS.get());
            pOutput.accept(ModItems.CARD_EIGHT_OF_CLUBS.get());
            pOutput.accept(ModItems.CARD_NINE_OF_CLUBS.get());
            pOutput.accept(ModItems.CARD_TEN_OF_CLUBS.get());
            pOutput.accept(ModItems.CARD_JACK_OF_CLUBS.get());
            pOutput.accept(ModItems.CARD_QUEEN_OF_CLUBS.get());
            pOutput.accept(ModItems.CARD_KING_OF_CLUBS.get());

            pOutput.accept(ModItems.CARD_ACE_OF_SPADES.get());
            pOutput.accept(ModItems.CARD_TWO_OF_SPADES.get());
            pOutput.accept(ModItems.CARD_THREE_OF_SPADES.get());
            pOutput.accept(ModItems.CARD_FOUR_OF_SPADES.get());
            pOutput.accept(ModItems.CARD_FIVE_OF_SPADES.get());
            pOutput.accept(ModItems.CARD_SIX_OF_SPADES.get());
            pOutput.accept(ModItems.CARD_SEVEN_OF_SPADES.get());
            pOutput.accept(ModItems.CARD_EIGHT_OF_SPADES.get());
            pOutput.accept(ModItems.CARD_NINE_OF_SPADES.get());
            pOutput.accept(ModItems.CARD_TEN_OF_SPADES.get());
            pOutput.accept(ModItems.CARD_JACK_OF_SPADES.get());
            pOutput.accept(ModItems.CARD_QUEEN_OF_SPADES.get());
            pOutput.accept(ModItems.CARD_KING_OF_SPADES.get());

        })
        .build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
