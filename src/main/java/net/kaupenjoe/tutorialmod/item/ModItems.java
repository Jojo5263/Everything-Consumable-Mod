package net.kaupenjoe.tutorialmod.item;

import net.kaupenjoe.tutorialmod.TutorialMod;
import net.kaupenjoe.tutorialmod.block.ModBlocks;
import net.kaupenjoe.tutorialmod.item.custom.ChiselItem;
import net.kaupenjoe.tutorialmod.item.custom.FuelItem;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> ALEXANDRITE = ITEMS.register("alexandrite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ALEXANDRITE = ITEMS.register("raw_alexandrite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHISEL = ITEMS.register("chisel",
            () -> new ChiselItem(new Item.Properties().durability(32)));

    public static final RegistryObject<Item> KOHLRABI = ITEMS.register("kohlrabi",
            () -> new Item(new Item.Properties().food(ModFoodProperties.KOHLRABI)) {
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    pTooltipComponents.add(Component.translatable("tooltip.tutorialmod.kohlrabi"));
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });
    public static final RegistryObject<Item> AURORA_ASHES = ITEMS.register("aurora_ashes",
            () -> new FuelItem(new Item.Properties(), 1200));


    public static final RegistryObject<Item> POPPY_CAPSULE_CUT = ITEMS.register("poppy_capsule_cut",
            () -> new Item(new Item.Properties()));






    public static final RegistryObject<Item> COCAIN = ITEMS.register("cocain",
            () -> new Item(new Item.Properties().food(ModFoodProperties.COCAIN)));

    public static final RegistryObject<Item> WEED = ITEMS.register("weed",
            () -> new Item(new Item.Properties().food(ModFoodProperties.WEED)));

    public static final RegistryObject<Item> JOINT = ITEMS.register("joint",
            () -> new Item(new Item.Properties().food(ModFoodProperties.JOINT)));

    public static final RegistryObject<Item> FIVEMEODMT = ITEMS.register("5meodmt",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FIVEMEODMT)));

    public static final RegistryObject<Item> KETAMINE = ITEMS.register("ketamine",
            () -> new Item(new Item.Properties().food(ModFoodProperties.KETAMINE)));

    //Apfelsaft im Braustand
    //Ritual für Superdroge





    public static final RegistryObject<Item> CUSTOM_SEEDS = ITEMS.register("custom_seeds",
            () -> new ItemNameBlockItem(ModBlocks.CUSTOM_CROP.get(), new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
