package com.mcmoddev.fantasymetals.init;

import com.mcmoddev.fantasymetals.util.Config.Options;

/**
 * This class initializes all items in Fantasy Metals.
 *
 * @author DrCyano
 *
 */
public class Items extends cyano.basemetals.init.Items {

	private static boolean initDone = false;

	/**
	 *
	 */
	public static void init() {
		if (initDone) {
			return;
		}

		Blocks.init();

		if (Options.ENABLE_ENDERIUM) {
			createItemsFull(Materials.enderium);
		}

		if (Options.ENABLE_LUMIUM) {
			createItemsFull(Materials.lumium);
		}

		if (Options.ENABLE_PRISMARINIUM) {
			createItemsFull(Materials.prismarinium);
		}

		if (Options.ENABLE_SIGNALUM) {
			createItemsFull(Materials.signalum);
		}

		initDone = true;
	}
}
