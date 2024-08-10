package net.gecko95.oresmod.item;

import net.gecko95.oresmod.effect.ModEffects;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent RAW_FLESH = new FoodComponent.Builder().nutrition(4).saturationModifier(0.4f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 600, 0), 0.1f).build();
    public static final FoodComponent COOKED_FLESH = new FoodComponent.Builder().nutrition(8).saturationModifier(0.8f).build();
    public static final FoodComponent NICKEL_APPLE = new FoodComponent.Builder().nutrition(4).saturationModifier(1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 2400, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 2400, 0), 1.0f).alwaysEdible().build();
    public static final FoodComponent NICKEL_BEETROOT = new FoodComponent.Builder().nutrition(8).saturationModifier(0.2f).build();
    public static final FoodComponent STEEL_APPLE = new FoodComponent.Builder().nutrition(4).saturationModifier(1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1200, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 2400, 1), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 2400, 3), 1.0f).alwaysEdible().build();
    public static final FoodComponent STEEL_BEETROOT = new FoodComponent.Builder().nutrition(8).saturationModifier(0.4f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 600, 0), 0.5f).build();
    public static final FoodComponent RUSTED_STEEL_APPLE = new FoodComponent.Builder().nutrition(4).saturationModifier(1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1200, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 2400, 1), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 2400, 3), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 600, 0), 1.0f).alwaysEdible().build();
    public static final FoodComponent RUSTED_STEEL_BEETROOT = new FoodComponent.Builder().nutrition(8).saturationModifier(0.4f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 600, 0), 0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 600, 0), 1.0f).build();
    public static final FoodComponent FROZEN_FLESH = new FoodComponent.Builder().nutrition(4).saturationModifier(0.4f)
            .statusEffect(new StatusEffectInstance(ModEffects.FROSTBITE, 600, 0), 0.8f).meat().build();
    public static final FoodComponent SILVER_STEW = ModFoodComponents.createStew(4)
            .statusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 600, 0), 1.0f).build();

    public static final FoodComponent COBBLENUT = new FoodComponent.Builder().nutrition(2).saturationModifier(0.1f).snack().build();

    public static final FoodComponent STUFFED_COBBLENUT = new FoodComponent.Builder().nutrition(10).saturationModifier(1.3f).build();

    private static FoodComponent.Builder createStew(int hunger) {
        return new FoodComponent.Builder().nutrition(hunger).saturationModifier(0.6f);
    }
}
