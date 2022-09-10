package net.thesadpie.randomthings;

import net.fabricmc.api.ModInitializer;
import net.thesadpie.randomthings.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RandomThings implements ModInitializer {
	public static final String MOD_ID = "randomthings";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}
