package com.mcmoddev.fantasymetals.init;

import com.mcmoddev.fantasymetals.util.Config.Options;
import com.mcmoddev.lib.util.Oredicts;

import net.minecraft.item.*;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.*;

/**
 *
 * @author Jasmine Iwanek
 *
 */
public class Recipes extends com.mcmoddev.lib.init.Recipes {

	private static boolean initDone = false;

	private Recipes() {
		throw new IllegalAccessError("Not a instantiable class");
	}

	/**
	 *
	 */
	public static void init() {
		if (initDone) {
			return;
		}

		Materials.init();
		Blocks.init();
		Items.init();

		initModSpecificRecipes();

		initDone = true;
	}

	private static void initModSpecificRecipes() {
		if (Options.enableEnderium) {
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Materials.enderium.blend, 2), Oredicts.DUST + "Enderium", Oredicts.DUST + "Enderium"));
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Materials.enderium.smallblend, 2), Oredicts.DUSTTINY + "Enderium", Oredicts.DUSTTINY + "Enderium"));
		}
		if (Options.enableLumium) {
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Materials.lumium.blend, 2), Oredicts.DUST + "Lumium", Oredicts.DUST + "Lumium"));
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Materials.lumium.smallblend, 2), Oredicts.DUSTTINY + "Lumium", Oredicts.DUSTTINY + "Lumium"));
		}
		if (Options.enablePrismarinium) {
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Materials.prismarinium.blend, 2), Oredicts.DUST + "Enderium", Oredicts.DUST + "Signalum"));
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Materials.prismarinium.smallblend, 2), Oredicts.DUSTTINY + "Prismarinium", Oredicts.DUSTTINY + "Prismarinium"));
		}
		if (Options.enableSignalum) {
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Materials.signalum.blend, 2), Oredicts.DUST + "Signalum", Oredicts.DUST + "Signalum"));
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Materials.signalum.smallblend, 2), Oredicts.DUSTTINY + "Signalum", Oredicts.DUSTTINY + "Signalum"));
		}
	}
}
