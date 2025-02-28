package net.kaupenjoe.tutorialmod.client;

import net.kaupenjoe.tutorialmod.TutorialMod;
import net.kaupenjoe.tutorialmod.block.ModBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModClient {
    public static void onClientSetup(FMLClientSetupEvent event) {
        // Setze den Render-Typ für den Crop-Block
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CUSTOM_CROP.get(), RenderType.cutout());
    }
}