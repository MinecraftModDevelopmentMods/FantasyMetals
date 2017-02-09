package com.mcmoddev.fantasymetals.init;

import com.mcmoddev.fantasymetals.util.Config.Options;

import com.mcmoddev.lib.material.MetalMaterial;

/**
 * This class initializes all of the materials in Fantasy Metals.
 *
 * @author Jasmine Iwanek
 *
 */
public class Materials extends com.mcmoddev.lib.init.Materials {

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
		if (Options.enableEnderium) {
			enderium = createAlloyMaterial("enderium", 8, 8, 4.5, 0xFF000000);
			enderium.materialType = MetalMaterial.MaterialType.METAL;
		}
		if (Options.enableLumium) {
			lumium = createAlloyMaterial("lumium", 8, 8, 4.5, 0xFF000000);
			lumium.materialType = MetalMaterial.MaterialType.METAL;
		}
		if (Options.enablePrismarinium) {
			prismarinium = createAlloyMaterial("prismarinium", 8, 8, 4.5, 0xFF000000);
			prismarinium.materialType = MetalMaterial.MaterialType.METAL;
		}
		if (Options.enableSignalum) {
			signalum = createAlloyMaterial("signalum", 8, 8, 4.5, 0xFF000000);
			signalum.materialType = MetalMaterial.MaterialType.METAL;
		}

		initDone = true;
	}
}
