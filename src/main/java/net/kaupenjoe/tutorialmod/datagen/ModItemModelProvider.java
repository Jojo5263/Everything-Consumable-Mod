package net.kaupenjoe.tutorialmod.datagen;

import net.kaupenjoe.tutorialmod.TutorialMod;
import net.kaupenjoe.tutorialmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TutorialMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.ALEXANDRITE.get());
        basicItem(ModItems.RAW_ALEXANDRITE.get());
        basicItem(ModItems.COCAIN.get());
        basicItem(ModItems.WEED.get());
        basicItem(ModItems.CUSTOM_SEEDS.get());
        basicItem(ModItems.JOINT.get());
        basicItem(ModItems.POPPY_CAPSULE_CUT.get());
        basicItem(ModItems.POPPY_CAPSULE_CUT.get());
        basicItem(ModItems.FIVEMEODMT.get());
        basicItem(ModItems.KETAMINE.get());
        basicItem(ModItems.LSD.get());
        basicItem(ModItems.ECSTASY.get());

        basicItem(ModItems.CHISEL.get());
        basicItem(ModItems.KOHLRABI.get());
        basicItem(ModItems.AURORA_ASHES.get());
    }
}
