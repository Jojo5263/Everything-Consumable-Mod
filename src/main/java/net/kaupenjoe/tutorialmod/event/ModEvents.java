package net.kaupenjoe.tutorialmod.event;

import net.kaupenjoe.tutorialmod.item.ModItems;
import net.kaupenjoe.tutorialmod.potion.ModPotions;
import net.minecraft.world.entity.animal.frog.Frog;
import net.minecraft.world.entity.animal.horse.Horse;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionBrewing;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraftforge.event.brewing.BrewingRecipeRegisterEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "tutorialmod") // 1. Mod-ID hinzufügen
public class ModEvents {

    @SubscribeEvent
    public static void onFrogKilledByPlayer(LivingDeathEvent event) {
        // 2. Überprüfen ob die Entität ein Frosch ist
        if (!(event.getEntity() instanceof Frog frog)) {
            return;
        }



        // 3. Überprüfen ob der Schaden von einem Spieler kommt
        if (event.getSource().getEntity() instanceof Player player) {
            // 4. Nur auf Server-Seite ausführen
            if (!frog.level().isClientSide()) { // 5. level() statt level verwenden
                // 6. Item mit zufälliger Menge droppen
                int amount = 1;
                frog.spawnAtLocation(new ItemStack(ModItems.FIVEMEODMT.get(), amount));
            }
        }
    }

    @SubscribeEvent
    public static void onHorseKilledByPlayer(LivingDeathEvent event) {
        // 2. Überprüfen ob die Entität ein Frosch ist
        if (!(event.getEntity() instanceof Horse horse)) {
            return;
        }



        // 3. Überprüfen ob der Schaden von einem Spieler kommt
        if (event.getSource().getEntity() instanceof Player player) {
            // 4. Nur auf Server-Seite ausführen
            if (!horse.level().isClientSide()) { // 5. level() statt level verwenden
                // 6. Item mit zufälliger Menge droppen
                int amount = 1;
                horse.spawnAtLocation(new ItemStack(ModItems.KETAMINE.get(), amount));
            }
        }
    }

    @SubscribeEvent
    public static void onBrewingRecipeRegister (BrewingRecipeRegisterEvent event) {
        PotionBrewing.Builder builder = event.getBuilder();

        builder.addMix(Potions.WATER, Items.APPLE, ModPotions.APPLE_JUICE.getHolder().get());
        builder.addMix(Potions.WATER, Items.POTATO, ModPotions.VODKA.getHolder().get());

    }
}