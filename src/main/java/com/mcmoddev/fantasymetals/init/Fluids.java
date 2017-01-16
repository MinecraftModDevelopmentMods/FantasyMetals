package com.mcmoddev.fantasymetals.init;

import com.mcmoddev.fantasymetals.util.Config.Options;

import net.minecraftforge.fluids.*;

/**
 * This class initializes all fluids in Fantasy Metals.
 *
 * @author DrCyano
 *
 */
public class Fluids extends cyano.basemetals.init.Fluids {

	public static Fluid fluidEnderium = null;
	public static BlockFluidBase fluidBlockEnderium = null;

	public static Fluid fluidLumium = null;
	public static BlockFluidBase fluidBlockLumium = null;

	public static Fluid fluidPrismarinium = null;
	public static BlockFluidBase fluidBlockPrismarinium = null;

	public static Fluid fluidSignalum = null;
	public static BlockFluidBase fluidBlockSignalum = null;

	private static boolean initDone = false;

	/**
	 *
	 */
	public static void init() {
		if (initDone) {
			return;
		}

		String materialName;

		if (Options.ENABLE_ENDERIUM) {
			materialName = "enderium";

			fluidEnderium = addFluid(materialName, 2000, 10000, 330, 10);
			fluidBlockEnderium = addFluidBlock(materialName);
		}
		if (Options.ENABLE_LUMIUM) {
			materialName = "lumium";

			fluidLumium = addFluid(materialName, 2000, 10000, 330, 10);
			fluidBlockLumium = addFluidBlock(materialName);
		}
		if (Options.ENABLE_PRISMARINIUM) {
			materialName = "prismarinium";

			fluidPrismarinium = addFluid(materialName, 2000, 10000, 330, 10);
			fluidBlockPrismarinium = addFluidBlock(materialName);
		}
		if (Options.ENABLE_SIGNALUM) {
			materialName = "signalum";

			fluidSignalum = addFluid(materialName, 2000, 10000, 330, 10);
			fluidBlockSignalum = addFluidBlock(materialName);
		}

		initDone = true;
	}
}
