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
        })
        .build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
