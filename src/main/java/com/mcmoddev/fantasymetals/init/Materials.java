package com.mcmoddev.fantasymetals.init;

import com.mcmoddev.fantasymetals.util.Config.Options;

import com.mcmoddev.lib.material.MMDMaterial;
import com.mcmoddev.lib.material.MMDMaterial.MaterialType;

/**
 * This class initializes all of the materials in Fantasy Metals.
 *
 * @author Jasmine Iwanek
 *
 */
public class Materials extends com.mcmoddev.lib.init.Materials {

	/** Adamantine */
	public static MMDMaterial adamantine;
	/** Aquarium */
	public static MMDMaterial aquarium;
	/** Cold-Iron */
	public static MMDMaterial coldiron;
	/** Enderium */
	public static MMDMaterial enderium;
	/** Lumium */
	public static MMDMaterial lumium;
	/** Mithril */
	public static MMDMaterial mithril;
	/** Prismarinium */
	public static MMDMaterial prismarinium;
	/** Signalum */
	public static MMDMaterial signalum;
	/** Star-Steel */
	public static MMDMaterial starsteel;
	/**	Teslarium */
	public static MMDMaterial teslarium;

	// vanilla imports
	/** Redstone */
	public static MMDMaterial vanilla_redstone;

	private static boolean initDone = false;

	protected Materials() {
		throw new IllegalAccessError("Not a instantiable class");
	}

	/**
	 *
	 */
	public static void init() {
		if (initDone) {
			return;
		}

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
