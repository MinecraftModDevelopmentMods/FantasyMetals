package com.mcmoddev.fantasymetals.init;

import com.mcmoddev.fantasymetals.util.Config.Options;

/**
 * This class initializes all blocks in Fantasy Metals.
 *
 * @author Jasmine Iwanek
 *
 */
public class Blocks extends com.mcmoddev.lib.init.Blocks {

	private static boolean initDone = false;

	/**
	 *
	 */
	public static void init() {
		if (initDone) {
			return;
		}

		Materials.init();
		ItemGroups.init();

		if (Options.ENABLE_ENDERIUM) {
			createBlocksFull(Materials.enderium);
		}

		if (Options.ENABLE_LUMIUM) {
			createBlocksFull(Materials.enderium);
		}

		if (Options.ENABLE_PRISMARINIUM) {
			createBlocksFull(Materials.enderium);
		}

		if (Options.ENABLE_SIGNALUM) {
			createBlocksFull(Materials.enderium);
		}

		initDone = true;
	}
}
