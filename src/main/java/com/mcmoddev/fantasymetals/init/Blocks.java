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

	protected Blocks() {
		throw new IllegalAccessError("Not a instantiable class");
	}

	/**
	 *
	 */
	public static void init() {
		if (initDone) {
			return;
		}

		Materials.init();
		ItemGroups.init();

		if (Options.enableEnderium) {
			createBlocksFull(Materials.enderium);
		}

		if (Options.enableLumium) {
			createBlocksFull(Materials.lumium);
		}

		if (Options.enablePrismarinium) {
			createBlocksFull(Materials.prismarinium);
		}

		if (Options.enableSignalum) {
			createBlocksFull(Materials.signalum);
		}

		if (Options.enableTeslarium) {
			createBlocksFull(Materials.teslarium);
		}

		initDone = true;
	}
}
