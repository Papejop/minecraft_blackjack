package net.me.minecraft_blackjack.datagen;

import net.me.minecraft_blackjack.blackjack;
import net.me.minecraft_blackjack.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, blackjack.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.CARD_ACE_OF_HEARTS);
        simpleItem(ModItems.CARD_TWO_OF_HEARTS);
        simpleItem(ModItems.CARD_THREE_OF_HEARTS);
        simpleItem(ModItems.CARD_FOUR_OF_HEARTS);
        simpleItem(ModItems.CARD_FIVE_OF_HEARTS);
        simpleItem(ModItems.CARD_SIX_OF_HEARTS);
        simpleItem(ModItems.CARD_SEVEN_OF_HEARTS);
        simpleItem(ModItems.CARD_EIGHT_OF_HEARTS);
        simpleItem(ModItems.CARD_NINE_OF_HEARTS);
        simpleItem(ModItems.CARD_TEN_OF_HEARTS);
        simpleItem(ModItems.CARD_JACK_OF_HEARTS);
        simpleItem(ModItems.CARD_QUEEN_OF_HEARTS);
        simpleItem(ModItems.CARD_KING_OF_HEARTS);

        simpleItem(ModItems.CARD_ACE_OF_DIAMONDS);
        simpleItem(ModItems.CARD_TWO_OF_DIAMONDS);
        simpleItem(ModItems.CARD_THREE_OF_DIAMONDS);
        simpleItem(ModItems.CARD_FOUR_OF_DIAMONDS);
        simpleItem(ModItems.CARD_FIVE_OF_DIAMONDS);
        simpleItem(ModItems.CARD_SIX_OF_DIAMONDS);
        simpleItem(ModItems.CARD_SEVEN_OF_DIAMONDS);
        simpleItem(ModItems.CARD_EIGHT_OF_DIAMONDS);
        simpleItem(ModItems.CARD_NINE_OF_DIAMONDS);
        simpleItem(ModItems.CARD_TEN_OF_DIAMONDS);
        simpleItem(ModItems.CARD_JACK_OF_DIAMONDS);
        simpleItem(ModItems.CARD_QUEEN_OF_DIAMONDS);
        simpleItem(ModItems.CARD_KING_OF_DIAMONDS);

        simpleItem(ModItems.CARD_ACE_OF_CLUBS);
        simpleItem(ModItems.CARD_TWO_OF_CLUBS);
        simpleItem(ModItems.CARD_THREE_OF_CLUBS);
        simpleItem(ModItems.CARD_FOUR_OF_CLUBS);
        simpleItem(ModItems.CARD_FIVE_OF_CLUBS);
        simpleItem(ModItems.CARD_SIX_OF_CLUBS);
        simpleItem(ModItems.CARD_SEVEN_OF_CLUBS);
        simpleItem(ModItems.CARD_EIGHT_OF_CLUBS);
        simpleItem(ModItems.CARD_NINE_OF_CLUBS);
        simpleItem(ModItems.CARD_TEN_OF_CLUBS);
        simpleItem(ModItems.CARD_JACK_OF_CLUBS);
        simpleItem(ModItems.CARD_QUEEN_OF_CLUBS);
        simpleItem(ModItems.CARD_KING_OF_CLUBS);

        simpleItem(ModItems.CARD_ACE_OF_SPADES);
        simpleItem(ModItems.CARD_TWO_OF_SPADES);
        simpleItem(ModItems.CARD_THREE_OF_SPADES);
        simpleItem(ModItems.CARD_FOUR_OF_SPADES);
        simpleItem(ModItems.CARD_FIVE_OF_SPADES);
        simpleItem(ModItems.CARD_SIX_OF_SPADES);
        simpleItem(ModItems.CARD_SEVEN_OF_SPADES);
        simpleItem(ModItems.CARD_EIGHT_OF_SPADES);
        simpleItem(ModItems.CARD_NINE_OF_SPADES);
        simpleItem(ModItems.CARD_TEN_OF_SPADES);
        simpleItem(ModItems.CARD_JACK_OF_SPADES);
        simpleItem(ModItems.CARD_QUEEN_OF_SPADES);
        simpleItem(ModItems.CARD_KING_OF_SPADES);

        simpleItem(ModItems.CHIP_10);
        simpleItem(ModItems.CHIP_20);
        simpleItem(ModItems.CHIP_50);
        simpleItem(ModItems.CHIP_100);
    }

    private ItemModelBuilder    simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(blackjack.MODID,"item/" + item.getId().getPath()));
    }
}