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

    public static final FoodProperties JOINT = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f)
            .effect(new MobEffectInstance(MobEffects.LEVITATION, 400), 1)
            .effect(new MobEffectInstance(MobEffects.CONFUSION, 400), 1)
            .build();

    public static final FoodProperties FIVEMEODMT = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 1500), 1)
            .effect(new MobEffectInstance(MobEffects.CONFUSION, 1500), 1)
            .effect(new MobEffectInstance(MobEffects.BLINDNESS, 1500), 1)
            .effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 5000), 1)
            .effect(new MobEffectInstance(MobEffects.HEAL, 1500), 1)
            .build();

    public static final FoodProperties KETAMINE = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 500), 1)
            .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 500), 1)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 500), 1)
            .build();



}
