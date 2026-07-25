package name.colemetrick.tutorialmod.creativemodetab;

import name.colemetrick.tutorialmod.TutorialMod;
import name.colemetrick.tutorialmod.block.ModBlocks;
import name.colemetrick.tutorialmod.item.ModItems;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {

    public static final CreativeModeTab MOD_ITEMS_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, "mod_items"),
            FabricCreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.MONSTER))
                    .title(Component.translatable("creativemodetab.tutorialmod.mod_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.MONSTER);
                        output.accept(ModItems.VIBRANIUM);
                        output.accept(ModItems.RAW_VIBRANIUM);;
                    }).build());

    public static final CreativeModeTab MOD_BLOCKS_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, "mod_blocks"),
            FabricCreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.VIBRANIUM_ORE))
                    .title(Component.translatable("creativemodetab.tutorialmod.mod_blocks"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModBlocks.VIBRANIUM_ORE);
                        output.accept(ModBlocks.RAW_VIBRANIUM_BLOCK);
                        output.accept(ModBlocks.VIBRANIUM_BLOCK);
                        output.accept(ModBlocks.VIBRANIUM_DEEPSLATE_ORE);
                    }).build());


    public static void registerModCreativeModeTabs() {
        TutorialMod.LOGGER.info("Registering Creative Mode Tabs for " + TutorialMod.MOD_ID);
    }
}
