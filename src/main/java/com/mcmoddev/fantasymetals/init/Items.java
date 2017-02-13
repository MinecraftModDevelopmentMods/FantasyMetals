package com.mcmoddev.fantasymetals.init;

import com.mcmoddev.fantasymetals.util.Config.Options;

/**
 * This class initializes all items in Fantasy Metals.
 *
 * @author Jasmine Iwanek
 *
 */
public class Items extends com.mcmoddev.lib.init.Items {

	private static boolean initDone = false;

	protected Items() {
		throw new IllegalAccessError("Not a instantiable class");
	}

	/**
	 *
	 */
	public static void init() {
		if (initDone) {
			return;
		}

		Blocks.init();

		if (Options.enableEnderium) {
			createItemsFull(Materials.enderium);
		}

		if (Options.enableLumium) {
			createItemsFull(Materials.lumium);
		}

		if (Options.enablePrismarinium) {
			createItemsFull(Materials.prismarinium);
		}

		if (Options.enableSignalum) {
			createItemsFull(Materials.signalum);
		}

		if (Options.enableTeslarium) {
			createItemsFull(Materials.teslarium);
		}

//		addToMetList() // May not be needed, check

		initDone = true;
	}
}
