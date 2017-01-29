package com.mcmoddev.fantasymetals.init;

import com.mcmoddev.fantasymetals.util.Config.Options;
import com.mcmoddev.basemetals.material.MetalMaterial;

/**
 * This class initializes all items in Fantasy Metals.
 *
 * @author Jasmine Iwanek
 *
 */
public class Items extends com.mcmoddev.lib.init.Items {

	private static boolean initDone = false;

	/**
	 *
	 */
	public static void init() {
		if (initDone) {
			return;
		}

		Blocks.init();

		MetalMaterial material;
		if (Options.ENABLE_ENDERIUM) {
			material = Materials.enderium;
			createItemsFull(material);
		}

		if (Options.ENABLE_LUMIUM) {
			material = Materials.lumium;
			createItemsFull(material);
		}

		if (Options.ENABLE_PRISMARINIUM) {
			material = Materials.prismarinium;
			createItemsFull(material);
		}

		if (Options.ENABLE_SIGNALUM) {
			material = Materials.signalum;
			createItemsFull(material);
		}

//		addToMetList() // May not be needed, check

		initDone = true;
	}
}
