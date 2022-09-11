package net.thesadpie.randomthings.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.thesadpie.randomthings.RandomThings;

public class ModItemGroup {
    public static final ItemGroup VIBRANIUM = FabricItemGroupBuilder.build(
            new Identifier(RandomThings.MOD_ID, "vibranium"), () -> new ItemStack(ModItems.VIBRANIUM));

}
