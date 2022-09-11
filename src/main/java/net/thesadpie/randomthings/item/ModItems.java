package net.thesadpie.randomthings.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.thesadpie.randomthings.RandomThings;

public class ModItems {

    public static final Item RAW_VIBRANIUM = registerItem("raw_vibranium",
            new Item(new FabricItemSettings().group(ModItemGroup.VIBRANIUM)));
    public static final Item VIBRANIUM = registerItem("vibranium",
            new Item(new FabricItemSettings().group(ModItemGroup.VIBRANIUM)));



    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(RandomThings.MOD_ID, name), item);
    }

    public static void registerModItems(){
        RandomThings.LOGGER.debug("Registering Mod Items for " + RandomThings.MOD_ID);
    }
}
