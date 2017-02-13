package com.mcmoddev.fantasymetals.init;

import com.mcmoddev.fantasymetals.util.Config.Options;

import com.mcmoddev.lib.material.MetalMaterial;
import com.mcmoddev.lib.material.MetalMaterial.MaterialType;

/**
 * This class initializes all of the materials in Fantasy Metals.
 *
 * @author Jasmine Iwanek
 *
 */
public class Materials extends com.mcmoddev.lib.init.Materials {

	/** Adamantine */
	public static MetalMaterial adamantine;
	/** Aquarium */
	public static MetalMaterial aquarium;
	/** Cold-Iron */
	public static MetalMaterial coldiron;
	/**	Enderium */
	public static MetalMaterial enderium;
	/**	Lumium */
	public static MetalMaterial lumium;
	/** Mithril */
	public static MetalMaterial mithril;
	/**	Prismarinium */
	public static MetalMaterial prismarinium;
	/**	Signalum */
	public static MetalMaterial signalum;
	/** Star-Steel */
	public static MetalMaterial starsteel;
	/**	Teslarium */
	public static MetalMaterial teslarium;

	/** Redstone **/
	public static MetalMaterial vanilla_redstone;

	private static boolean initDone = false;

	/**
	 *
	 */
	public static void init() {
		if (initDone) {
			return;
		}

		// Mod Materials
		if (Options.enableAdamantine) {
			adamantine = createMaterial("adamantine", MaterialType.METAL, 12, 100, 0, 0xFF53393F).setBlastResistance(2000f);
		}

		if (Options.enableAquarium) {
			aquarium = createAlloyMaterial("aquarium", MaterialType.METAL, 4, 10, 15, 0xFF000000);
		}
		if (Options.enableColdIron) {
			coldiron = createMaterial("coldiron", MaterialType.METAL, 7, 7, 7, 0xFFC7CEF0);
		}

		if (Options.enableEnderium) {
			enderium = createAlloyMaterial("enderium", MaterialType.METAL, 8, 8, 4.5, 0xFF000000);
		}

		if (Options.enableLumium) {
			lumium = createAlloyMaterial("lumium", MaterialType.METAL, 8, 8, 4.5, 0xFF000000);
		}

		if (Options.enableMithril) {
			mithril = createAlloyMaterial("mithril", MaterialType.METAL, 9, 9, 9, 0xFFF4FFFF);
		}

		if (Options.enablePrismarinium) {
			prismarinium = createAlloyMaterial("prismarinium", MaterialType.METAL, 8, 8, 4.5, 0xFF000000);
		}

		if (Options.enableSignalum) {
			signalum = createAlloyMaterial("signalum", MaterialType.METAL, 8, 8, 4.5, 0xFF000000);
		}

		if (Options.enableStarSteel) {
			starsteel = createMaterial("starsteel", MaterialType.METAL, 10, 25, 12, 0xFF53393F).setBlastResistance(2000f);
			starsteel.regenerates = true;
		}

		if (Options.enableTeslarium) {
			teslarium = createAlloyMaterial("teslarium", MaterialType.METAL, 8, 8, 4.5, 0xFF000000);
		}

		if (Options.enableRedstone) {
			vanilla_redstone = createMaterial("redstone", MaterialType.MINERAL, 8, 8, 4.5, 0xFF000000);
		}

		initDone = true;
	}
}
