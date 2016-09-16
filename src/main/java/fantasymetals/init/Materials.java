package fantasymetals.init;

import cyano.basemetals.material.MetalMaterial;

/**
 * This class initializes all of the metal materials in Fantasy Metals. It also
 * contains utility methods for looking up materials by name and finding the
 * tool and armor material equivalents for a given metal.
 *
 * @author DrCyano
 *
 */
public abstract class Materials extends cyano.basemetals.init.Materials {

	public static MetalMaterial template;
	public static MetalMaterial enderium;
	public static MetalMaterial lumium;
	public static MetalMaterial prismarinium;
	public static MetalMaterial signalum;

	private static boolean initDone = false;

	/**
	 *
	 */
	public static void init() {
		if(initDone)
			return;

		// Mod Metals
		template = addMaterial("template", 8, 8, 4.5);
		enderium = addMaterial("enderium", 8, 8, 4.5);
		lumium = addMaterial("lumium", 8, 8, 4.5);
		prismarinium = addMaterial("prismarinium", 8, 8, 4.5);
		signalum = addMaterial("signalum", 8, 8, 4.5);

		initDone = true;
	}

	private static MetalMaterial addMaterial(String name, double hardness, double strength, double magic) {
		final MetalMaterial m = new MetalMaterial(name, (float)hardness, (float)strength, (float)magic);
		registerMaterial(name, m);
		return m;
	}

	@SuppressWarnings("unused")
	private static MetalMaterial addRareMaterial(String name, double hardness, double strength, double magic) {
		final MetalMaterial m = new MetalMaterial(name, (float)hardness, (float)strength, (float)magic, true);
		registerMaterial(name, m);
		return m;
	}
}
