package com.mcmoddev.fantasymetals.init;

import com.mcmoddev.basemetals.material.MetalMaterial;
import com.mcmoddev.fantasymetals.util.Config.Options;
import com.mcmoddev.fantasymetals.util.Config.Options;

/**
 * This class initializes all fluids in Fantasy Metals.
 *
 * @author Jasmine Iwanek
 *
 */
public class Fluids extends com.mcmoddev.lib.init.Fluids {

	private static boolean initDone = false;

	/**
	 *
	 */
	public static void init() {
		if (initDone) {
			return;
		}

		MetalMaterial material;

		// fluids and fluid blocks
		if (Options.ENABLE_ENDERIUM) {
			material = Materials.enderium;

			addFluid(material, 2000, 10000, 330, 10);
			addFluidBlock(material);
		}
		if (Options.ENABLE_LUMIUM) {
			material = Materials.lumium;

			addFluid(material, 2000, 10000, 330, 10);
			addFluidBlock(material);
		}
		if (Options.ENABLE_PRISMARINIUM) {
			material = Materials.prismarinium;

			addFluid(material, 2000, 10000, 330, 10);
			addFluidBlock(material);
		}
		if (Options.ENABLE_SIGNALUM) {
			material = Materials.signalum;

			addFluid(material, 2000, 10000, 330, 10);
			addFluidBlock(material);
		}

		initDone = true;
	}
}
