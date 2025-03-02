package net.kaupenjoe.tutorialmod.potion;

import net.kaupenjoe.tutorialmod.TutorialMod;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPotions {
    public static final DeferredRegister<Potion> POTIONS =
            DeferredRegister.create(ForgeRegistries.POTIONS, TutorialMod.MOD_ID);

    public static final RegistryObject<Potion> APPLE_JUICE = POTIONS.register("tutorialmod_apple_juice",
            () -> new Potion(new MobEffectInstance(MobEffects.HEALTH_BOOST, 3600)));



    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }
}
