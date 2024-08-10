package net.gecko95.oresmod.item;

import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {
    FROSITE(BlockTags.INCORRECT_FOR_IRON_TOOL, 156, 8.8f, 2.2f, 12,
            () -> Ingredient.ofItems(ModItems.FROSITE)),
    COPPER(BlockTags.INCORRECT_FOR_STONE_TOOL, 160, 7.0f, 1.0f, 10,
            () -> Ingredient.ofItems(Items.COPPER_INGOT)),
    NICKEL(BlockTags.INCORRECT_FOR_STONE_TOOL, 375, 4.5f, 2.5f, 7,
            () -> Ingredient.ofItems(ModItems.NICKEL_INGOT)),
    ALUMINUM(BlockTags.INCORRECT_FOR_IRON_TOOL, 190, 5.5f, 1.5f, 9,
            () -> Ingredient.ofItems(ModItems.ALUMINUM_INGOT)),
    STEEL (BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1975, 9.3f, 3.9f, 10,
            () -> Ingredient.ofItems(ModItems.STEEL_INGOT)),
    TITANIUM (BlockTags.INCORRECT_FOR_IRON_TOOL, 906, 6.5f, 3.5f, 3,
            () -> Ingredient.ofItems(ModItems.TITANIUM_INGOT)),
    TUNGSTEN (BlockTags.INCORRECT_FOR_IRON_TOOL, 828, 4.8f, 1.0f, 25,
            () -> Ingredient.ofItems(ModItems.TUNGSTEN_INGOT)),
    TITANIUM_ALLOY (BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1734, 5.7f, 4.5f, 14,
            () -> Ingredient.ofItems(ModItems.TITANIUM_ALLOY_INGOT)),
    COBALT (BlockTags.INCORRECT_FOR_IRON_TOOL, 578, 10.5f, 1.7f, 17,
            () -> Ingredient.ofItems(ModItems.COBALT_INGOT)),
    BEDROCK (BlockTags.INCORRECT_FOR_STONE_TOOL, 65, 0.5f, 5.0f, 1,
            () -> Ingredient.ofItems(ModItems.BEDROCK_SHARD)),
    FLINT (BlockTags.INCORRECT_FOR_STONE_TOOL, 29, 5.0f, 0.5f, 7,
            () -> Ingredient.ofItems(Items.FLINT)),
    SANDITE(BlockTags.INCORRECT_FOR_IRON_TOOL, 156, 7.7f, 3.3f, 12,
            () -> Ingredient.ofItems(ModItems.SANDITE)),
    LEAFITE(BlockTags.INCORRECT_FOR_IRON_TOOL, 156, 9.9f, 1.2f, 12,
            () -> Ingredient.ofItems(ModItems.LEAFITE)),
    END_ITE(BlockTags.INCORRECT_FOR_IRON_TOOL, 156, 6.6f, 4.4f, 12,
            () -> Ingredient.ofItems(ModItems.END_ITE)),
    PLATINUM (BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 1415, 11.5f, 3.0f, 8,
            () -> Ingredient.ofItems(ModItems.PLATINUM_INGOT)),
    CLUB(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 268, 0.0f, 2.0f, 2,
            () -> Ingredient.ofItems(ModItems.SILVER_SCALE)),
    ICY_DAGGER(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 576, 2.0f, 4.0f, 15,
            () -> Ingredient.ofItems(ModItems.ICE_CHUNK)),
    SILVER_DAGGER(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 720, 2.0f, 3.0f, 10,
            () -> Ingredient.ofItems(ModItems.SILVER_SCALE)),
    MANDIBLE_HATCHET(BlockTags.INCORRECT_FOR_IRON_TOOL, 1440, 5.0f, 4.5f, 10,
            () -> Ingredient.ofItems(ModItems.SILVER_SCALE)),
    POWER_IRON (BlockTags.INCORRECT_FOR_WOODEN_TOOL, 500, 12f, 1.0f, 7,
            () -> Ingredient.ofItems(Items.REDSTONE)),
    POWER_DIAMOND (BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 3122, 16f, 1.5f, 5,
                        () -> Ingredient.ofItems(Items.REDSTONE)),
    POWER_GOLD (BlockTags.INCORRECT_FOR_GOLD_TOOL, 64, 24f, 0.0f, 11,
            () -> Ingredient.ofItems(Items.REDSTONE)),
    POWER_NETHERITE (BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 4062, 18f, 2.0f, 8,
            () -> Ingredient.ofItems(ModItems.COPPER_DRIVE)),
    POWER_FROSITE (BlockTags.INCORRECT_FOR_IRON_TOOL, 312, 17.6f, 1.1f, 6,
                        () -> Ingredient.ofItems(Items.REDSTONE)),
    POWER_SANDITE (BlockTags.INCORRECT_FOR_IRON_TOOL, 312, 15.4f, 1.6f, 6,
            () -> Ingredient.ofItems(Items.REDSTONE)),
    POWER_LEAFITE (BlockTags.INCORRECT_FOR_IRON_TOOL, 312, 19.8f, 0.5f, 6,
            () -> Ingredient.ofItems(Items.REDSTONE)),
    POWER_END_ITE (BlockTags.INCORRECT_FOR_IRON_TOOL, 312, 13.2f, 2.2f, 6,
            () -> Ingredient.ofItems(Items.REDSTONE)),
    POWER_COPPER(BlockTags.INCORRECT_FOR_STONE_TOOL, 320, 14.0f, 0.5f, 5,
            () -> Ingredient.ofItems(Items.REDSTONE)),
    POWER_NICKEL(BlockTags.INCORRECT_FOR_STONE_TOOL, 750, 9.0f, 1.25f, 3,
            () -> Ingredient.ofItems(Items.REDSTONE)),
    POWER_ALUMINUM (BlockTags.INCORRECT_FOR_IRON_TOOL, 380, 11.0f, 0.75f, 4,
                        () -> Ingredient.ofItems(Items.REDSTONE)),
    POWER_STEEL (BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 3950, 18.6f, 1.95f, 5,
            () -> Ingredient.ofItems(ModItems.COPPER_DRIVE)),
    POWER_TITANIUM (BlockTags.INCORRECT_FOR_IRON_TOOL, 1812, 13.0f, 1.75f, 1,
            () -> Ingredient.ofItems(ModItems.COPPER_DRIVE)),
    POWER_TUNGSTEN (BlockTags.INCORRECT_FOR_IRON_TOOL, 1656, 9.6f, 0.5f, 12,
            () -> Ingredient.ofItems(ModItems.COPPER_DRIVE)),
    POWER_TITANIUM_ALLOY (BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 3468, 11.4f, 2.25f, 7,
            () -> Ingredient.ofItems(ModItems.COPPER_DRIVE)),
    POWER_COBALT (BlockTags.INCORRECT_FOR_IRON_TOOL, 1156, 21.0f, 0.85f, 8,
            () -> Ingredient.ofItems(ModItems.COPPER_DRIVE));

    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterial(TagKey<Block> inverseTag, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return inverseTag;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
