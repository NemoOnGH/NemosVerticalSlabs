package com.devnemo.nemos.vertical.slabs.datagen;

import biomesoplenty.api.item.BOPItems;
import com.devnemo.nemos.mossy.blocks.world.item.NemosMossyItems;
import com.devnemo.nemos.vertical.slabs.world.item.NemosVerticalItems;
import com.devnemo.nemos.vertical.slabs.world.level.block.NemosVerticalBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class NemosVerticalRecipeProvider extends FabricRecipeProvider {

    public NemosVerticalRecipeProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> providerCompletableFuture) {
        super(output, providerCompletableFuture);
    }

    @Override
    protected @NotNull RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
        return new RecipeProvider(provider, recipeOutput) {

            @Override
            public void buildRecipes() {
                createWoodenVerticalSlabRecipe(NemosVerticalItems.OAK_VERTICAL_SLAB.get(), Items.OAK_PLANKS);
                createWoodenVerticalSlabRecipe(NemosVerticalItems.SPRUCE_VERTICAL_SLAB.get(), Items.SPRUCE_PLANKS);
                createWoodenVerticalSlabRecipe(NemosVerticalItems.BIRCH_VERTICAL_SLAB.get(), Items.BIRCH_PLANKS);
                createWoodenVerticalSlabRecipe(NemosVerticalItems.JUNGLE_VERTICAL_SLAB.get(), Items.JUNGLE_PLANKS);
                createWoodenVerticalSlabRecipe(NemosVerticalItems.ACACIA_VERTICAL_SLAB.get(), Items.ACACIA_PLANKS);
                createWoodenVerticalSlabRecipe(NemosVerticalItems.DARK_OAK_VERTICAL_SLAB.get(), Items.DARK_OAK_PLANKS);
                createWoodenVerticalSlabRecipe(NemosVerticalItems.MANGROVE_VERTICAL_SLAB.get(), Items.MANGROVE_PLANKS);
                createWoodenVerticalSlabRecipe(NemosVerticalItems.CHERRY_VERTICAL_SLAB.get(), Items.CHERRY_PLANKS);
                createWoodenVerticalSlabRecipe(NemosVerticalItems.PALE_OAK_VERTICAL_SLAB.get(), Items.PALE_OAK_PLANKS);
                createWoodenVerticalSlabRecipe(NemosVerticalItems.BAMBOO_VERTICAL_SLAB.get(), Items.BAMBOO_PLANKS);
                createWoodenVerticalSlabRecipe(NemosVerticalItems.BAMBOO_MOSAIC_VERTICAL_SLAB.get(), Items.BAMBOO_MOSAIC);
                createWoodenVerticalSlabRecipe(NemosVerticalItems.CRIMSON_VERTICAL_SLAB.get(), Items.CRIMSON_PLANKS);
                createWoodenVerticalSlabRecipe(NemosVerticalItems.WARPED_VERTICAL_SLAB.get(), Items.WARPED_PLANKS);
                createVerticalSlabRecipe(NemosVerticalItems.STONE_VERTICAL_SLAB.get(), Items.STONE);
                createVerticalSlabRecipe(NemosVerticalItems.COBBLESTONE_VERTICAL_SLAB.get(), Items.COBBLESTONE);
                createVerticalSlabRecipe(NemosVerticalItems.MOSSY_COBBLESTONE_VERTICAL_SLAB.get(), Items.MOSSY_COBBLESTONE);
                createVerticalSlabRecipe(NemosVerticalItems.SMOOTH_STONE_VERTICAL_SLAB.get(), Items.SMOOTH_STONE);
                createVerticalSlabRecipe(NemosVerticalItems.STONE_BRICK_VERTICAL_SLAB.get(), Items.STONE_BRICKS);
                createVerticalSlabRecipe(NemosVerticalItems.MOSSY_STONE_BRICK_VERTICAL_SLAB.get(), Items.MOSSY_STONE_BRICKS);
                createVerticalSlabRecipe(NemosVerticalItems.GRANITE_VERTICAL_SLAB.get(), Items.GRANITE);
                createVerticalSlabRecipe(NemosVerticalItems.POLISHED_GRANITE_VERTICAL_SLAB.get(), Items.POLISHED_GRANITE);
                createVerticalSlabRecipe(NemosVerticalItems.DIORITE_VERTICAL_SLAB.get(), Items.DIORITE);
                createVerticalSlabRecipe(NemosVerticalItems.POLISHED_DIORITE_VERTICAL_SLAB.get(), Items.POLISHED_DIORITE);
                createVerticalSlabRecipe(NemosVerticalItems.ANDESITE_VERTICAL_SLAB.get(), Items.ANDESITE);
                createVerticalSlabRecipe(NemosVerticalItems.POLISHED_ANDESITE_VERTICAL_SLAB.get(), Items.POLISHED_ANDESITE);
                createVerticalSlabRecipe(NemosVerticalItems.COBBLED_DEEPSLATE_VERTICAL_SLAB.get(), Items.COBBLED_DEEPSLATE);
                createVerticalSlabRecipe(NemosVerticalItems.POLISHED_DEEPSLATE_VERTICAL_SLAB.get(), Items.POLISHED_DEEPSLATE);
                createVerticalSlabRecipe(NemosVerticalItems.DEEPSLATE_BRICK_VERTICAL_SLAB.get(), Items.DEEPSLATE_BRICKS);
                createVerticalSlabRecipe(NemosVerticalItems.DEEPSLATE_TILE_VERTICAL_SLAB.get(), Items.DEEPSLATE_TILES);
                createVerticalSlabRecipe(NemosVerticalItems.TUFF_VERTICAL_SLAB.get(), Items.TUFF);
                createVerticalSlabRecipe(NemosVerticalItems.POLISHED_TUFF_VERTICAL_SLAB.get(), Items.POLISHED_TUFF);
                createVerticalSlabRecipe(NemosVerticalItems.TUFF_BRICK_VERTICAL_SLAB.get(), Items.TUFF_BRICKS);
                createVerticalSlabRecipe(NemosVerticalItems.BRICK_VERTICAL_SLAB.get(), Items.BRICKS);
                createVerticalSlabRecipe(NemosVerticalItems.MUD_BRICK_VERTICAL_SLAB.get(), Items.MUD_BRICKS);
                createVerticalSlabRecipe(NemosVerticalItems.SANDSTONE_VERTICAL_SLAB.get(), Items.SANDSTONE);
                createVerticalSlabRecipe(NemosVerticalItems.SMOOTH_SANDSTONE_VERTICAL_SLAB.get(), Items.SMOOTH_SANDSTONE);
                createVerticalSlabRecipe(NemosVerticalItems.CUT_SANDSTONE_VERTICAL_SLAB.get(), Items.CUT_SANDSTONE);
                createVerticalSlabRecipe(NemosVerticalItems.RED_SANDSTONE_VERTICAL_SLAB.get(), Items.RED_SANDSTONE);
                createVerticalSlabRecipe(NemosVerticalItems.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB.get(), Items.SMOOTH_RED_SANDSTONE);
                createVerticalSlabRecipe(NemosVerticalItems.CUT_RED_SANDSTONE_VERTICAL_SLAB.get(), Items.CUT_RED_SANDSTONE);
                createVerticalSlabRecipe(NemosVerticalItems.PRISMARINE_VERTICAL_SLAB.get(), Items.PRISMARINE);
                createVerticalSlabRecipe(NemosVerticalItems.PRISMARINE_BRICK_VERTICAL_SLAB.get(), Items.PRISMARINE_BRICKS);
                createVerticalSlabRecipe(NemosVerticalItems.DARK_PRISMARINE_VERTICAL_SLAB.get(), Items.DARK_PRISMARINE);
                createVerticalSlabRecipe(NemosVerticalItems.NETHER_BRICK_VERTICAL_SLAB.get(), Items.NETHER_BRICKS);
                createVerticalSlabRecipe(NemosVerticalItems.RED_NETHER_BRICK_VERTICAL_SLAB.get(), Items.RED_NETHER_BRICKS);
                createVerticalSlabRecipe(NemosVerticalItems.BLACKSTONE_VERTICAL_SLAB.get(), Items.BLACKSTONE);
                createVerticalSlabRecipe(NemosVerticalItems.POLISHED_BLACKSTONE_VERTICAL_SLAB.get(), Items.POLISHED_BLACKSTONE);
                createVerticalSlabRecipe(NemosVerticalItems.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB.get(), Items.POLISHED_BLACKSTONE_BRICKS);
                createVerticalSlabRecipe(NemosVerticalItems.END_STONE_BRICK_VERTICAL_SLAB.get(), Items.END_STONE_BRICKS);
                createVerticalSlabRecipe(NemosVerticalItems.PURPUR_VERTICAL_SLAB.get(), Items.PURPUR_BLOCK);
                createVerticalSlabRecipe(NemosVerticalItems.QUARTZ_VERTICAL_SLAB.get(), Items.QUARTZ_BLOCK);
                createVerticalSlabRecipe(NemosVerticalItems.SMOOTH_QUARTZ_VERTICAL_SLAB.get(), Items.SMOOTH_QUARTZ);
                createVerticalSlabRecipe(NemosVerticalItems.CUT_COPPER_VERTICAL_SLAB.get(), Items.CUT_COPPER);
                createVerticalSlabRecipe(NemosVerticalItems.EXPOSED_CUT_COPPER_VERTICAL_SLAB.get(), Items.EXPOSED_CUT_COPPER);
                createVerticalSlabRecipe(NemosVerticalItems.WEATHERED_CUT_COPPER_VERTICAL_SLAB.get(), Items.WEATHERED_CUT_COPPER);
                createVerticalSlabRecipe(NemosVerticalItems.OXIDIZED_CUT_COPPER_VERTICAL_SLAB.get(), Items.OXIDIZED_CUT_COPPER);
                createVerticalSlabRecipe(NemosVerticalItems.WAXED_CUT_COPPER_VERTICAL_SLAB.get(), Items.WAXED_CUT_COPPER);
                createVerticalSlabRecipe(NemosVerticalItems.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB.get(), Items.WAXED_EXPOSED_CUT_COPPER);
                createVerticalSlabRecipe(NemosVerticalItems.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB.get(), Items.WAXED_WEATHERED_CUT_COPPER);
                createVerticalSlabRecipe(NemosVerticalItems.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB.get(), Items.WAXED_OXIDIZED_CUT_COPPER);

                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.STONE_VERTICAL_SLAB.get(), Items.STONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.STONE_BRICK_VERTICAL_SLAB.get(), Items.STONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.COBBLESTONE_VERTICAL_SLAB.get(), Items.COBBLESTONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.MOSSY_COBBLESTONE_VERTICAL_SLAB.get(), Items.MOSSY_COBBLESTONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.SMOOTH_STONE_VERTICAL_SLAB.get(), Items.SMOOTH_STONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.STONE_BRICK_VERTICAL_SLAB.get(), Items.STONE_BRICKS, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.MOSSY_STONE_BRICK_VERTICAL_SLAB.get(), Items.MOSSY_STONE_BRICKS, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.GRANITE_VERTICAL_SLAB.get(), Items.GRANITE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.POLISHED_GRANITE_VERTICAL_SLAB.get(), Items.GRANITE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.POLISHED_GRANITE_VERTICAL_SLAB.get(), Items.POLISHED_GRANITE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.DIORITE_VERTICAL_SLAB.get(), Items.DIORITE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.POLISHED_DIORITE_VERTICAL_SLAB.get(), Items.DIORITE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.POLISHED_DIORITE_VERTICAL_SLAB.get(), Items.POLISHED_DIORITE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.ANDESITE_VERTICAL_SLAB.get(), Items.ANDESITE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.POLISHED_ANDESITE_VERTICAL_SLAB.get(), Items.ANDESITE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.POLISHED_ANDESITE_VERTICAL_SLAB.get(), Items.POLISHED_ANDESITE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.COBBLED_DEEPSLATE_VERTICAL_SLAB.get(), Items.COBBLED_DEEPSLATE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.DEEPSLATE_BRICK_VERTICAL_SLAB.get(), Items.COBBLED_DEEPSLATE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.DEEPSLATE_TILE_VERTICAL_SLAB.get(), Items.COBBLED_DEEPSLATE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.POLISHED_DEEPSLATE_VERTICAL_SLAB.get(), Items.COBBLED_DEEPSLATE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.POLISHED_DEEPSLATE_VERTICAL_SLAB.get(), Items.POLISHED_DEEPSLATE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.DEEPSLATE_BRICK_VERTICAL_SLAB.get(), Items.POLISHED_DEEPSLATE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.DEEPSLATE_TILE_VERTICAL_SLAB.get(), Items.POLISHED_DEEPSLATE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.DEEPSLATE_BRICK_VERTICAL_SLAB.get(), Items.DEEPSLATE_BRICKS, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.DEEPSLATE_TILE_VERTICAL_SLAB.get(), Items.DEEPSLATE_BRICKS, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.DEEPSLATE_TILE_VERTICAL_SLAB.get(), Items.DEEPSLATE_TILES, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.TUFF_VERTICAL_SLAB.get(), Items.TUFF, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.POLISHED_TUFF_VERTICAL_SLAB.get(), Items.TUFF, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.TUFF_BRICK_VERTICAL_SLAB.get(), Items.TUFF, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.TUFF_VERTICAL_SLAB.get(), Items.POLISHED_TUFF, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.TUFF_BRICK_VERTICAL_SLAB.get(), Items.POLISHED_TUFF, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.TUFF_BRICK_VERTICAL_SLAB.get(), Items.TUFF_BRICKS, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.BRICK_VERTICAL_SLAB.get(), Items.BRICKS, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.MUD_BRICK_VERTICAL_SLAB.get(), Items.MUD_BRICKS, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.SANDSTONE_VERTICAL_SLAB.get(), Items.SANDSTONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.CUT_SANDSTONE_VERTICAL_SLAB.get(), Items.SANDSTONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.SMOOTH_SANDSTONE_VERTICAL_SLAB.get(), Items.SMOOTH_SANDSTONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.CUT_SANDSTONE_VERTICAL_SLAB.get(), Items.CUT_SANDSTONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.RED_SANDSTONE_VERTICAL_SLAB.get(), Items.RED_SANDSTONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.CUT_RED_SANDSTONE_VERTICAL_SLAB.get(), Items.RED_SANDSTONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB.get(), Items.SMOOTH_RED_SANDSTONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.CUT_RED_SANDSTONE_VERTICAL_SLAB.get(), Items.CUT_RED_SANDSTONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.PRISMARINE_VERTICAL_SLAB.get(), Items.PRISMARINE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.PRISMARINE_BRICK_VERTICAL_SLAB.get(), Items.PRISMARINE_BRICKS, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.DARK_PRISMARINE_VERTICAL_SLAB.get(), Items.DARK_PRISMARINE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.NETHER_BRICK_VERTICAL_SLAB.get(), Items.NETHER_BRICKS, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.RED_NETHER_BRICK_VERTICAL_SLAB.get(), Items.RED_NETHER_BRICKS, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.BLACKSTONE_VERTICAL_SLAB.get(), Items.BLACKSTONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.POLISHED_BLACKSTONE_VERTICAL_SLAB.get(), Items.BLACKSTONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB.get(), Items.BLACKSTONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.POLISHED_BLACKSTONE_VERTICAL_SLAB.get(), Items.POLISHED_BLACKSTONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB.get(), Items.POLISHED_BLACKSTONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB.get(), Items.POLISHED_BLACKSTONE_BRICKS, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.END_STONE_BRICK_VERTICAL_SLAB.get(), Items.END_STONE_BRICKS, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.PURPUR_VERTICAL_SLAB.get(), Items.PURPUR_BLOCK, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.QUARTZ_VERTICAL_SLAB.get(), Items.QUARTZ_BLOCK, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.SMOOTH_QUARTZ_VERTICAL_SLAB.get(), Items.SMOOTH_QUARTZ, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.CUT_COPPER_VERTICAL_SLAB.get(), Items.COPPER_BLOCK, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.CUT_COPPER_VERTICAL_SLAB.get(), Items.CUT_COPPER, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.EXPOSED_CUT_COPPER_VERTICAL_SLAB.get(), Items.EXPOSED_CUT_COPPER, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.EXPOSED_CUT_COPPER_VERTICAL_SLAB.get(), Items.EXPOSED_COPPER, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.WEATHERED_CUT_COPPER_VERTICAL_SLAB.get(), Items.WEATHERED_CUT_COPPER, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.WEATHERED_CUT_COPPER_VERTICAL_SLAB.get(), Items.WEATHERED_COPPER, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.OXIDIZED_CUT_COPPER_VERTICAL_SLAB.get(), Items.OXIDIZED_CUT_COPPER, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.OXIDIZED_CUT_COPPER_VERTICAL_SLAB.get(), Items.OXIDIZED_COPPER, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.WAXED_CUT_COPPER_VERTICAL_SLAB.get(), Items.WAXED_CUT_COPPER, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.WAXED_CUT_COPPER_VERTICAL_SLAB.get(), Items.WAXED_COPPER_BLOCK, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB.get(), Items.WAXED_EXPOSED_CUT_COPPER, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB.get(), Items.WAXED_EXPOSED_COPPER, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB.get(), Items.WAXED_WEATHERED_CUT_COPPER, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB.get(), Items.WAXED_WEATHERED_COPPER, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB.get(), Items.WAXED_OXIDIZED_CUT_COPPER, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB.get(), Items.WAXED_OXIDIZED_COPPER, 2);

                createWoodenVerticalSlabRecipe(NemosVerticalItems.MOSSY_OAK_VERTICAL_SLAB.get(), NemosMossyItems.MOSSY_OAK_PLANKS.get());
                createWoodenVerticalSlabRecipe(NemosVerticalItems.MOSSY_SPRUCE_VERTICAL_SLAB.get(), NemosMossyItems.MOSSY_SPRUCE_PLANKS.get());
                createWoodenVerticalSlabRecipe(NemosVerticalItems.MOSSY_BIRCH_VERTICAL_SLAB.get(), NemosMossyItems.MOSSY_BIRCH_PLANKS.get());
                createWoodenVerticalSlabRecipe(NemosVerticalItems.MOSSY_JUNGLE_VERTICAL_SLAB.get(), NemosMossyItems.MOSSY_JUNGLE_PLANKS.get());
                createWoodenVerticalSlabRecipe(NemosVerticalItems.MOSSY_ACACIA_VERTICAL_SLAB.get(), NemosMossyItems.MOSSY_ACACIA_PLANKS.get());
                createWoodenVerticalSlabRecipe(NemosVerticalItems.MOSSY_DARK_OAK_VERTICAL_SLAB.get(), NemosMossyItems.MOSSY_DARK_OAK_PLANKS.get());
                createWoodenVerticalSlabRecipe(NemosVerticalItems.MOSSY_MANGROVE_VERTICAL_SLAB.get(), NemosMossyItems.MOSSY_MANGROVE_PLANKS.get());
                createWoodenVerticalSlabRecipe(NemosVerticalItems.MOSSY_CHERRY_VERTICAL_SLAB.get(), NemosMossyItems.MOSSY_CHERRY_PLANKS.get());
                createWoodenVerticalSlabRecipe(NemosVerticalItems.MOSSY_PALE_OAK_VERTICAL_SLAB.get(), NemosMossyItems.MOSSY_CHERRY_PLANKS.get());
                createWoodenVerticalSlabRecipe(NemosVerticalItems.MOSSY_BAMBOO_VERTICAL_SLAB.get(), NemosMossyItems.MOSSY_BAMBOO_PLANKS.get());
                createWoodenVerticalSlabRecipe(NemosVerticalItems.MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB.get(), NemosMossyItems.MOSSY_BAMBOO_MOSAIC.get());
                createWoodenVerticalSlabRecipe(NemosVerticalItems.MOSSY_CRIMSON_VERTICAL_SLAB.get(), NemosMossyItems.MOSSY_CRIMSON_PLANKS.get());
                createWoodenVerticalSlabRecipe(NemosVerticalItems.MOSSY_WARPED_VERTICAL_SLAB.get(), NemosMossyItems.MOSSY_WARPED_PLANKS.get());
                createVerticalSlabRecipe(NemosVerticalItems.MOSSY_STONE_VERTICAL_SLAB.get(), NemosMossyItems.MOSSY_STONE.get());
                createVerticalSlabRecipe(NemosVerticalItems.MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB.get(), NemosMossyItems.MOSSY_COBBLED_DEEPSLATE.get());
                createVerticalSlabRecipe(NemosVerticalItems.MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB.get(), NemosMossyItems.MOSSY_DEEPSLATE_BRICKS.get());
                createVerticalSlabRecipe(NemosVerticalItems.MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB.get(), NemosMossyItems.MOSSY_DEEPSLATE_TILES.get());
                createVerticalSlabRecipe(NemosVerticalItems.MOSSY_TUFF_VERTICAL_SLAB.get(), NemosMossyItems.MOSSY_TUFF.get());
                createVerticalSlabRecipe(NemosVerticalItems.MOSSY_TUFF_BRICK_VERTICAL_SLAB.get(), NemosMossyItems.MOSSY_TUFF_BRICKS.get());
                createVerticalSlabRecipe(NemosVerticalItems.MOSSY_BRICK_VERTICAL_SLAB.get(), NemosMossyItems.MOSSY_BRICKS.get());

                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.MOSSY_STONE_VERTICAL_SLAB.get(), NemosMossyItems.MOSSY_STONE.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB.get(), NemosMossyItems.MOSSY_COBBLED_DEEPSLATE.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB.get(), NemosMossyItems.MOSSY_DEEPSLATE_BRICKS.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB.get(), NemosMossyItems.MOSSY_DEEPSLATE_TILES.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.MOSSY_TUFF_VERTICAL_SLAB.get(), NemosMossyItems.MOSSY_TUFF.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.MOSSY_TUFF_BRICK_VERTICAL_SLAB.get(), NemosMossyItems.MOSSY_TUFF_BRICKS.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.MOSSY_BRICK_VERTICAL_SLAB.get(), NemosMossyItems.MOSSY_BRICKS.get(), 2);

                createWoodenVerticalSlabRecipe(NemosVerticalItems.PALE_MOSSY_OAK_VERTICAL_SLAB.get(), NemosMossyItems.PALE_MOSSY_OAK_PLANKS.get());
                createWoodenVerticalSlabRecipe(NemosVerticalItems.PALE_MOSSY_SPRUCE_VERTICAL_SLAB.get(), NemosMossyItems.PALE_MOSSY_SPRUCE_PLANKS.get());
                createWoodenVerticalSlabRecipe(NemosVerticalItems.PALE_MOSSY_BIRCH_VERTICAL_SLAB.get(), NemosMossyItems.PALE_MOSSY_BIRCH_PLANKS.get());
                createWoodenVerticalSlabRecipe(NemosVerticalItems.PALE_MOSSY_JUNGLE_VERTICAL_SLAB.get(), NemosMossyItems.PALE_MOSSY_JUNGLE_PLANKS.get());
                createWoodenVerticalSlabRecipe(NemosVerticalItems.PALE_MOSSY_ACACIA_VERTICAL_SLAB.get(), NemosMossyItems.PALE_MOSSY_ACACIA_PLANKS.get());
                createWoodenVerticalSlabRecipe(NemosVerticalItems.PALE_MOSSY_DARK_OAK_VERTICAL_SLAB.get(), NemosMossyItems.PALE_MOSSY_DARK_OAK_PLANKS.get());
                createWoodenVerticalSlabRecipe(NemosVerticalItems.PALE_MOSSY_MANGROVE_VERTICAL_SLAB.get(), NemosMossyItems.PALE_MOSSY_MANGROVE_PLANKS.get());
                createWoodenVerticalSlabRecipe(NemosVerticalItems.PALE_MOSSY_CHERRY_VERTICAL_SLAB.get(), NemosMossyItems.PALE_MOSSY_CHERRY_PLANKS.get());
                createWoodenVerticalSlabRecipe(NemosVerticalItems.PALE_MOSSY_PALE_OAK_VERTICAL_SLAB.get(), NemosMossyItems.PALE_MOSSY_CHERRY_PLANKS.get());
                createWoodenVerticalSlabRecipe(NemosVerticalItems.PALE_MOSSY_BAMBOO_VERTICAL_SLAB.get(), NemosMossyItems.PALE_MOSSY_BAMBOO_PLANKS.get());
                createWoodenVerticalSlabRecipe(NemosVerticalItems.PALE_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB.get(), NemosMossyItems.PALE_MOSSY_BAMBOO_MOSAIC.get());
                createWoodenVerticalSlabRecipe(NemosVerticalItems.PALE_MOSSY_CRIMSON_VERTICAL_SLAB.get(), NemosMossyItems.PALE_MOSSY_CRIMSON_PLANKS.get());
                createWoodenVerticalSlabRecipe(NemosVerticalItems.PALE_MOSSY_WARPED_VERTICAL_SLAB.get(), NemosMossyItems.PALE_MOSSY_WARPED_PLANKS.get());
                createVerticalSlabRecipe(NemosVerticalItems.PALE_MOSSY_STONE_VERTICAL_SLAB.get(), NemosMossyItems.PALE_MOSSY_STONE.get());
                createVerticalSlabRecipe(NemosVerticalItems.PALE_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB.get(), NemosMossyItems.PALE_MOSSY_COBBLED_DEEPSLATE.get());
                createVerticalSlabRecipe(NemosVerticalItems.PALE_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB.get(), NemosMossyItems.PALE_MOSSY_DEEPSLATE_BRICKS.get());
                createVerticalSlabRecipe(NemosVerticalItems.PALE_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB.get(), NemosMossyItems.PALE_MOSSY_DEEPSLATE_TILES.get());
                createVerticalSlabRecipe(NemosVerticalItems.PALE_MOSSY_TUFF_VERTICAL_SLAB.get(), NemosMossyItems.PALE_MOSSY_TUFF.get());
                createVerticalSlabRecipe(NemosVerticalItems.PALE_MOSSY_TUFF_BRICK_VERTICAL_SLAB.get(), NemosMossyItems.PALE_MOSSY_TUFF_BRICKS.get());
                createVerticalSlabRecipe(NemosVerticalItems.PALE_MOSSY_BRICK_VERTICAL_SLAB.get(), NemosMossyItems.PALE_MOSSY_BRICKS.get());

                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.PALE_MOSSY_STONE_VERTICAL_SLAB.get(), NemosMossyItems.PALE_MOSSY_STONE.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.PALE_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB.get(), NemosMossyItems.PALE_MOSSY_COBBLED_DEEPSLATE.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.PALE_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB.get(), NemosMossyItems.PALE_MOSSY_DEEPSLATE_BRICKS.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.PALE_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB.get(), NemosMossyItems.PALE_MOSSY_DEEPSLATE_TILES.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.PALE_MOSSY_TUFF_VERTICAL_SLAB.get(), NemosMossyItems.PALE_MOSSY_TUFF.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.PALE_MOSSY_TUFF_BRICK_VERTICAL_SLAB.get(), NemosMossyItems.PALE_MOSSY_TUFF_BRICKS.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.PALE_MOSSY_BRICK_VERTICAL_SLAB.get(), NemosMossyItems.PALE_MOSSY_BRICKS.get(), 2);

                createWoodenVerticalSlabRecipe(NemosVerticalItems.CRIMSON_MOSSY_OAK_VERTICAL_SLAB.get(), NemosMossyItems.CRIMSON_MOSSY_OAK_PLANKS.get());
                createWoodenVerticalSlabRecipe(NemosVerticalItems.CRIMSON_MOSSY_SPRUCE_VERTICAL_SLAB.get(), NemosMossyItems.CRIMSON_MOSSY_SPRUCE_PLANKS.get());
                createWoodenVerticalSlabRecipe(NemosVerticalItems.CRIMSON_MOSSY_BIRCH_VERTICAL_SLAB.get(), NemosMossyItems.CRIMSON_MOSSY_BIRCH_PLANKS.get());
                createWoodenVerticalSlabRecipe(NemosVerticalItems.CRIMSON_MOSSY_JUNGLE_VERTICAL_SLAB.get(), NemosMossyItems.CRIMSON_MOSSY_JUNGLE_PLANKS.get());
                createWoodenVerticalSlabRecipe(NemosVerticalItems.CRIMSON_MOSSY_ACACIA_VERTICAL_SLAB.get(), NemosMossyItems.CRIMSON_MOSSY_ACACIA_PLANKS.get());
                createWoodenVerticalSlabRecipe(NemosVerticalItems.CRIMSON_MOSSY_DARK_OAK_VERTICAL_SLAB.get(), NemosMossyItems.CRIMSON_MOSSY_DARK_OAK_PLANKS.get());
                createWoodenVerticalSlabRecipe(NemosVerticalItems.CRIMSON_MOSSY_MANGROVE_VERTICAL_SLAB.get(), NemosMossyItems.CRIMSON_MOSSY_MANGROVE_PLANKS.get());
                createWoodenVerticalSlabRecipe(NemosVerticalItems.CRIMSON_MOSSY_CHERRY_VERTICAL_SLAB.get(), NemosMossyItems.CRIMSON_MOSSY_CHERRY_PLANKS.get());
                createWoodenVerticalSlabRecipe(NemosVerticalItems.CRIMSON_MOSSY_PALE_OAK_VERTICAL_SLAB.get(), NemosMossyItems.CRIMSON_MOSSY_CHERRY_PLANKS.get());
                createWoodenVerticalSlabRecipe(NemosVerticalItems.CRIMSON_MOSSY_BAMBOO_VERTICAL_SLAB.get(), NemosMossyItems.CRIMSON_MOSSY_BAMBOO_PLANKS.get());
                createWoodenVerticalSlabRecipe(NemosVerticalItems.CRIMSON_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB.get(), NemosMossyItems.CRIMSON_MOSSY_BAMBOO_MOSAIC.get());
                createWoodenVerticalSlabRecipe(NemosVerticalItems.CRIMSON_MOSSY_CRIMSON_VERTICAL_SLAB.get(), NemosMossyItems.CRIMSON_MOSSY_CRIMSON_PLANKS.get());
                createWoodenVerticalSlabRecipe(NemosVerticalItems.CRIMSON_MOSSY_WARPED_VERTICAL_SLAB.get(), NemosMossyItems.CRIMSON_MOSSY_WARPED_PLANKS.get());
                createVerticalSlabRecipe(NemosVerticalItems.CRIMSON_MOSSY_STONE_VERTICAL_SLAB.get(), NemosMossyItems.CRIMSON_MOSSY_STONE.get());
                createVerticalSlabRecipe(NemosVerticalItems.CRIMSON_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB.get(), NemosMossyItems.CRIMSON_MOSSY_COBBLED_DEEPSLATE.get());
                createVerticalSlabRecipe(NemosVerticalItems.CRIMSON_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB.get(), NemosMossyItems.CRIMSON_MOSSY_DEEPSLATE_BRICKS.get());
                createVerticalSlabRecipe(NemosVerticalItems.CRIMSON_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB.get(), NemosMossyItems.CRIMSON_MOSSY_DEEPSLATE_TILES.get());
                createVerticalSlabRecipe(NemosVerticalItems.CRIMSON_MOSSY_TUFF_VERTICAL_SLAB.get(), NemosMossyItems.CRIMSON_MOSSY_TUFF.get());
                createVerticalSlabRecipe(NemosVerticalItems.CRIMSON_MOSSY_TUFF_BRICK_VERTICAL_SLAB.get(), NemosMossyItems.CRIMSON_MOSSY_TUFF_BRICKS.get());
                createVerticalSlabRecipe(NemosVerticalItems.CRIMSON_MOSSY_BRICK_VERTICAL_SLAB.get(), NemosMossyItems.CRIMSON_MOSSY_BRICKS.get());

                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.CRIMSON_MOSSY_STONE_VERTICAL_SLAB.get(), NemosMossyItems.CRIMSON_MOSSY_STONE.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.CRIMSON_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB.get(), NemosMossyItems.CRIMSON_MOSSY_COBBLED_DEEPSLATE.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.CRIMSON_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB.get(), NemosMossyItems.CRIMSON_MOSSY_DEEPSLATE_BRICKS.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.CRIMSON_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB.get(), NemosMossyItems.CRIMSON_MOSSY_DEEPSLATE_TILES.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.CRIMSON_MOSSY_TUFF_VERTICAL_SLAB.get(), NemosMossyItems.CRIMSON_MOSSY_TUFF.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.CRIMSON_MOSSY_TUFF_BRICK_VERTICAL_SLAB.get(), NemosMossyItems.CRIMSON_MOSSY_TUFF_BRICKS.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.CRIMSON_MOSSY_BRICK_VERTICAL_SLAB.get(), NemosMossyItems.CRIMSON_MOSSY_BRICKS.get(), 2);

                createWoodenVerticalSlabRecipe(NemosVerticalItems.WARPED_MOSSY_OAK_VERTICAL_SLAB.get(), NemosMossyItems.WARPED_MOSSY_OAK_PLANKS.get());
                createWoodenVerticalSlabRecipe(NemosVerticalItems.WARPED_MOSSY_SPRUCE_VERTICAL_SLAB.get(), NemosMossyItems.WARPED_MOSSY_SPRUCE_PLANKS.get());
                createWoodenVerticalSlabRecipe(NemosVerticalItems.WARPED_MOSSY_BIRCH_VERTICAL_SLAB.get(), NemosMossyItems.WARPED_MOSSY_BIRCH_PLANKS.get());
                createWoodenVerticalSlabRecipe(NemosVerticalItems.WARPED_MOSSY_JUNGLE_VERTICAL_SLAB.get(), NemosMossyItems.WARPED_MOSSY_JUNGLE_PLANKS.get());
                createWoodenVerticalSlabRecipe(NemosVerticalItems.WARPED_MOSSY_ACACIA_VERTICAL_SLAB.get(), NemosMossyItems.WARPED_MOSSY_ACACIA_PLANKS.get());
                createWoodenVerticalSlabRecipe(NemosVerticalItems.WARPED_MOSSY_DARK_OAK_VERTICAL_SLAB.get(), NemosMossyItems.WARPED_MOSSY_DARK_OAK_PLANKS.get());
                createWoodenVerticalSlabRecipe(NemosVerticalItems.WARPED_MOSSY_MANGROVE_VERTICAL_SLAB.get(), NemosMossyItems.WARPED_MOSSY_MANGROVE_PLANKS.get());
                createWoodenVerticalSlabRecipe(NemosVerticalItems.WARPED_MOSSY_CHERRY_VERTICAL_SLAB.get(), NemosMossyItems.WARPED_MOSSY_CHERRY_PLANKS.get());
                createWoodenVerticalSlabRecipe(NemosVerticalItems.WARPED_MOSSY_PALE_OAK_VERTICAL_SLAB.get(), NemosMossyItems.WARPED_MOSSY_CHERRY_PLANKS.get());
                createWoodenVerticalSlabRecipe(NemosVerticalItems.WARPED_MOSSY_BAMBOO_VERTICAL_SLAB.get(), NemosMossyItems.WARPED_MOSSY_BAMBOO_PLANKS.get());
                createWoodenVerticalSlabRecipe(NemosVerticalItems.WARPED_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB.get(), NemosMossyItems.WARPED_MOSSY_BAMBOO_MOSAIC.get());
                createWoodenVerticalSlabRecipe(NemosVerticalItems.WARPED_MOSSY_CRIMSON_VERTICAL_SLAB.get(), NemosMossyItems.WARPED_MOSSY_CRIMSON_PLANKS.get());
                createWoodenVerticalSlabRecipe(NemosVerticalItems.WARPED_MOSSY_WARPED_VERTICAL_SLAB.get(), NemosMossyItems.WARPED_MOSSY_WARPED_PLANKS.get());
                createVerticalSlabRecipe(NemosVerticalItems.WARPED_MOSSY_STONE_VERTICAL_SLAB.get(), NemosMossyItems.WARPED_MOSSY_STONE.get());
                createVerticalSlabRecipe(NemosVerticalItems.WARPED_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB.get(), NemosMossyItems.WARPED_MOSSY_COBBLED_DEEPSLATE.get());
                createVerticalSlabRecipe(NemosVerticalItems.WARPED_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB.get(), NemosMossyItems.WARPED_MOSSY_DEEPSLATE_BRICKS.get());
                createVerticalSlabRecipe(NemosVerticalItems.WARPED_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB.get(), NemosMossyItems.WARPED_MOSSY_DEEPSLATE_TILES.get());
                createVerticalSlabRecipe(NemosVerticalItems.WARPED_MOSSY_TUFF_VERTICAL_SLAB.get(), NemosMossyItems.WARPED_MOSSY_TUFF.get());
                createVerticalSlabRecipe(NemosVerticalItems.WARPED_MOSSY_TUFF_BRICK_VERTICAL_SLAB.get(), NemosMossyItems.WARPED_MOSSY_TUFF_BRICKS.get());
                createVerticalSlabRecipe(NemosVerticalItems.WARPED_MOSSY_BRICK_VERTICAL_SLAB.get(), NemosMossyItems.WARPED_MOSSY_BRICKS.get());

                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.WARPED_MOSSY_STONE_VERTICAL_SLAB.get(), NemosMossyItems.WARPED_MOSSY_STONE.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.WARPED_MOSSY_COBBLED_DEEPSLATE_VERTICAL_SLAB.get(), NemosMossyItems.WARPED_MOSSY_COBBLED_DEEPSLATE.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.WARPED_MOSSY_DEEPSLATE_BRICK_VERTICAL_SLAB.get(), NemosMossyItems.WARPED_MOSSY_DEEPSLATE_BRICKS.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.WARPED_MOSSY_DEEPSLATE_TILE_VERTICAL_SLAB.get(), NemosMossyItems.WARPED_MOSSY_DEEPSLATE_TILES.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.WARPED_MOSSY_TUFF_VERTICAL_SLAB.get(), NemosMossyItems.WARPED_MOSSY_TUFF.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.WARPED_MOSSY_TUFF_BRICK_VERTICAL_SLAB.get(), NemosMossyItems.WARPED_MOSSY_TUFF_BRICKS.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.WARPED_MOSSY_BRICK_VERTICAL_SLAB.get(), NemosMossyItems.WARPED_MOSSY_BRICKS.get(), 2);

                createVerticalSlabRecipe(NemosVerticalBlocks.CUT_WHITE_SANDSTONE_VERTICAL_SLAB.get(), BOPItems.CUT_WHITE_SANDSTONE);
                createVerticalSlabRecipe(NemosVerticalBlocks.SMOOTH_WHITE_SANDSTONE_VERTICAL_SLAB.get(), BOPItems.SMOOTH_WHITE_SANDSTONE);
                createVerticalSlabRecipe(NemosVerticalBlocks.WHITE_SANDSTONE_VERTICAL_SLAB.get(), BOPItems.WHITE_SANDSTONE);
                createVerticalSlabRecipe(NemosVerticalBlocks.CUT_ORANGE_SANDSTONE_VERTICAL_SLAB.get(), BOPItems.CUT_ORANGE_SANDSTONE);
                createVerticalSlabRecipe(NemosVerticalBlocks.SMOOTH_ORANGE_SANDSTONE_VERTICAL_SLAB.get(), BOPItems.SMOOTH_ORANGE_SANDSTONE);
                createVerticalSlabRecipe(NemosVerticalBlocks.ORANGE_SANDSTONE_VERTICAL_SLAB.get(), BOPItems.ORANGE_SANDSTONE);
                createVerticalSlabRecipe(NemosVerticalBlocks.CUT_BLACK_SANDSTONE_VERTICAL_SLAB.get(), BOPItems.CUT_BLACK_SANDSTONE);
                createVerticalSlabRecipe(NemosVerticalBlocks.SMOOTH_BLACK_SANDSTONE_VERTICAL_SLAB.get(), BOPItems.SMOOTH_BLACK_SANDSTONE);
                createVerticalSlabRecipe(NemosVerticalBlocks.BLACK_SANDSTONE_VERTICAL_SLAB.get(), BOPItems.BLACK_SANDSTONE);
                createVerticalSlabRecipe(NemosVerticalBlocks.BRIMSTONE_BRICK_VERTICAL_SLAB.get(), BOPItems.BRIMSTONE_BRICKS);
                createWoodenVerticalSlabRecipe(NemosVerticalBlocks.FIR_VERTICAL_SLAB.get(), BOPItems.FIR_PLANKS);
                createWoodenVerticalSlabRecipe(NemosVerticalBlocks.PINE_VERTICAL_SLAB.get(), BOPItems.PINE_PLANKS);
                createWoodenVerticalSlabRecipe(NemosVerticalBlocks.MAPLE_VERTICAL_SLAB.get(), BOPItems.MAPLE_PLANKS);
                createWoodenVerticalSlabRecipe(NemosVerticalBlocks.REDWOOD_VERTICAL_SLAB.get(), BOPItems.REDWOOD_PLANKS);
                createWoodenVerticalSlabRecipe(NemosVerticalBlocks.MAHOGANY_VERTICAL_SLAB.get(), BOPItems.MAHOGANY_PLANKS);
                createWoodenVerticalSlabRecipe(NemosVerticalBlocks.JACARANDA_VERTICAL_SLAB.get(), BOPItems.JACARANDA_PLANKS);
                createWoodenVerticalSlabRecipe(NemosVerticalBlocks.PALM_VERTICAL_SLAB.get(), BOPItems.PALM_PLANKS);
                createWoodenVerticalSlabRecipe(NemosVerticalBlocks.WILLOW_VERTICAL_SLAB.get(), BOPItems.WILLOW_PLANKS);
                createWoodenVerticalSlabRecipe(NemosVerticalBlocks.DEAD_VERTICAL_SLAB.get(), BOPItems.DEAD_PLANKS);
                createWoodenVerticalSlabRecipe(NemosVerticalBlocks.MAGIC_VERTICAL_SLAB.get(), BOPItems.MAGIC_PLANKS);
                createWoodenVerticalSlabRecipe(NemosVerticalBlocks.UMBRAN_VERTICAL_SLAB.get(), BOPItems.UMBRAN_PLANKS);
                createWoodenVerticalSlabRecipe(NemosVerticalBlocks.HELLBARK_VERTICAL_SLAB.get(), BOPItems.HELLBARK_PLANKS);
                createWoodenVerticalSlabRecipe(NemosVerticalBlocks.EMPYREAL_VERTICAL_SLAB.get(), BOPItems.EMPYREAL_PLANKS);

                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.WHITE_SANDSTONE_VERTICAL_SLAB.get(), BOPItems.WHITE_SANDSTONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.CUT_WHITE_SANDSTONE_VERTICAL_SLAB.get(), BOPItems.WHITE_SANDSTONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.SMOOTH_WHITE_SANDSTONE_VERTICAL_SLAB.get(), BOPItems.SMOOTH_WHITE_SANDSTONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.CUT_WHITE_SANDSTONE_VERTICAL_SLAB.get(), BOPItems.CUT_WHITE_SANDSTONE, 2);

                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.ORANGE_SANDSTONE_VERTICAL_SLAB.get(), BOPItems.ORANGE_SANDSTONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.CUT_ORANGE_SANDSTONE_VERTICAL_SLAB.get(), BOPItems.ORANGE_SANDSTONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.SMOOTH_ORANGE_SANDSTONE_VERTICAL_SLAB.get(), BOPItems.SMOOTH_ORANGE_SANDSTONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.CUT_ORANGE_SANDSTONE_VERTICAL_SLAB.get(), BOPItems.CUT_ORANGE_SANDSTONE, 2);

                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.BLACK_SANDSTONE_VERTICAL_SLAB.get(), BOPItems.BLACK_SANDSTONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.CUT_BLACK_SANDSTONE_VERTICAL_SLAB.get(), BOPItems.BLACK_SANDSTONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.SMOOTH_BLACK_SANDSTONE_VERTICAL_SLAB.get(), BOPItems.SMOOTH_BLACK_SANDSTONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, NemosVerticalItems.CUT_BLACK_SANDSTONE_VERTICAL_SLAB.get(), BOPItems.CUT_BLACK_SANDSTONE, 2);
            }

            public void createWoodenVerticalSlabRecipe(ItemLike result, ItemLike input) {
                this.shaped(RecipeCategory.BUILDING_BLOCKS, result, 6)
                        .define('#', input)
                        .pattern("#")
                        .pattern("#")
                        .pattern("#")
                        .unlockedBy("has_wood", this.has(ItemTags.PLANKS))
                        .save(this.output);
            }

            public void createVerticalSlabRecipe(ItemLike result, ItemLike input) {
                this.shaped(RecipeCategory.BUILDING_BLOCKS, result, 6)
                        .define('#', input)
                        .pattern("#")
                        .pattern("#")
                        .pattern("#")
                        .unlockedBy(getHasName(input), this.has(input))
                        .save(this.output);
            }
        };
    }

    @Override
    public @NotNull String getName() {
        return "Nemo's Vertical Slabs Recipes";
    }
}
