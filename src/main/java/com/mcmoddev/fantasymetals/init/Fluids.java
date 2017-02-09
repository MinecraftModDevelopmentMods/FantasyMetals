package com.mcmoddev.fantasymetals.init;

import com.mcmoddev.fantasymetals.util.Config.Options;

/**
 * This class initializes all fluids in Fantasy Metals.
 *
 * @author Jasmine Iwanek
 *
 */
public class Fluids extends com.mcmoddev.lib.init.Fluids {

	private static boolean initDone = false;

	private Fluids() {
		throw new IllegalAccessError("Not a instantiable class");
	}

	/**
	 *
	 */
	public static void init() {
		if (initDone) {
			return;
		}

		if (Options.enableEnderium) {
			addFluid(Materials.enderium, 2000, 10000, 330, 10);
			addFluidBlock(Materials.enderium);
		}

		if (Options.enableLumium) {
			addFluid(Materials.lumium, 2000, 10000, 330, 10);
			addFluidBlock(Materials.lumium);
		}

		if (Options.enablePrismarinium) {
			addFluid(Materials.prismarinium, 2000, 10000, 330, 10);
			addFluidBlock(Materials.prismarinium);
		}

		if (Options.enableSignalum) {
			addFluid(Materials.signalum, 2000, 10000, 330, 10);
			addFluidBlock(Materials.signalum);
		}

		initDone = true;
	}
}
