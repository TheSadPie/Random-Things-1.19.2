package net.thesadpie.randomthings.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.thesadpie.randomthings.RandomThings;
import net.thesadpie.randomthings.item.ModItemGroup;

public class ModBlocks {

    public static final Block VIBRANIUM_BLOCK = registerBlock("vibranium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroup.VIBRANIUM);

    public static final Block VIBRANIUM_ORE = registerBlock("vibranium_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(),
                    UniformIntProvider.create(2, 7)), ModItemGroup.VIBRANIUM);
    public static final Block DEEPSLATE_VIBRANIUM_ORE = registerBlock("deepslate_vibranium_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(),
                    UniformIntProvider.create(2, 7)), ModItemGroup.VIBRANIUM);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(RandomThings.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(RandomThings.MOD_ID),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks(){
        RandomThings.LOGGER.debug("Registering Mod Blocks for " + RandomThings.MOD_ID);
    }
}
