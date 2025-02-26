package net.kaupenjoe.tutorialmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties KOHLRABI = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f)
            .effect(new MobEffectInstance(MobEffects.INVISIBILITY, 400), 0.20f).build();

    public static final FoodProperties COCAIN = new FoodProperties.Builder().nutrition(0).saturationModifier(0f).alwaysEdible()
            .effect(new MobEffectInstance(MobEffects.DIG_SPEED,  1000), 1f)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,  1000), 1f)
            .build();

    public static final FoodProperties WEED = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 400), 1).build();



}
