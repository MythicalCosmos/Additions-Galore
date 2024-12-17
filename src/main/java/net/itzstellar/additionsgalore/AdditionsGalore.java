package net.itzstellar.additionsgalore;

import net.fabricmc.api.ModInitializer;

import net.itzstellar.additionsgalore.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdditionsGalore implements ModInitializer {
	public static final String MOD_ID = "additionsgalore";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}