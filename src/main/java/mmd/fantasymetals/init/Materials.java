package mmd.fantasymetals.init;

import cyano.basemetals.material.MetalMaterial;
import mmd.fantasymetals.util.Config.Options;

/**
 * This class initializes all of the metal materials in Fantasy Metals.
 *
 * @author DrCyano
 *
 */
public abstract class Materials extends cyano.basemetals.init.Materials {

	public static MetalMaterial enderium;
	public static MetalMaterial lumium;
	public static MetalMaterial prismarinium;
	public static MetalMaterial signalum;

	private static boolean initDone = false;

	/**
	 *
	 */
	public static void init() {
		if (initDone) {
			return;
		}

		// Mod Materials
		if (Options.ENABLE_ENDERIUM) {
			enderium = createMaterial("enderium", 8, 8, 4.5, 0xFF000000);
		}
		if (Options.ENABLE_LUMIUM) {
			lumium = createMaterial("lumium", 8, 8, 4.5, 0xFF000000);
		}
		if (Options.ENABLE_PRISMARINIUM) {
			prismarinium = createMaterial("prismarinium", 8, 8, 4.5, 0xFF000000);
		}
		if (Options.ENABLE_SIGNALUM) {
			signalum = createMaterial("signalum", 8, 8, 4.5, 0xFF000000);
		}

		initDone = true;
	}
}
