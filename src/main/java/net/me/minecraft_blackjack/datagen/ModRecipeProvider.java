package net.me.minecraft_blackjack.datagen;

import net.me.minecraft_blackjack.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import javax.annotation.Nonnull;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(pOutput, completableFuture);
    }

    @Override
    protected void buildRecipes(@Nonnull RecipeOutput pRecipeOutput) {
        // Example recipe
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLACKJACK_PLAYER_TABLE.get())
            .pattern("###")
            .pattern("# #")
            .pattern("###")
            .define('#', Items.IRON_INGOT)
            .unlockedBy("has_example_block", has(ModBlocks.BLACKJACK_PLAYER_TABLE.get()))
            .save(pRecipeOutput);
    }
}