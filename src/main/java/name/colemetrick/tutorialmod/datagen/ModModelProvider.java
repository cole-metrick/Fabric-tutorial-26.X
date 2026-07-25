package name.colemetrick.tutorialmod.datagen;

import name.colemetrick.tutorialmod.block.ModBlocks;
import name.colemetrick.tutorialmod.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.ModelTemplates;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        blockModelGenerators.createTrivialCube(ModBlocks.VIBRANIUM_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.RAW_VIBRANIUM_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.VIBRANIUM_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.VIBRANIUM_DEEPSLATE_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(ModItems.MONSTER, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.VIBRANIUM, ModelTemplates.FLAT_ITEM);
    }
}

/*
    IF ANYTHING IN THIS FILE IS CHANGED DATA GENERATION MUST BE RUN BEFORE TESTING THE GAME
 */
