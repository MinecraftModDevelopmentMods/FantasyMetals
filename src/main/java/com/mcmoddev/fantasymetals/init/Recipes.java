package com.mcmoddev.fantasymetals.init;

import com.mcmoddev.fantasymetals.util.Config.Options;

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
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Materials.enderium.blend, 2), "dustEnderium", "dustEnderium"));
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Materials.enderium.smallblend, 2), "smalldustEnderium", "smalldustEnderium"));
		}
		if (Options.enableLumium) {
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Materials.lumium.blend, 2), "dustLumium", "dustLumium"));
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Materials.lumium.smallblend, 2), "smalldustLumium", "smalldustLumium"));
		}
		if (Options.enablePrismarinium) {
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Materials.prismarinium.blend, 2), "dustEnderium", "dustSignalum"));
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Materials.prismarinium.smallblend, 2), "smalldustPrismarinium", "smalldustPrismarinium"));
		}
		if (Options.enableSignalum) {
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Materials.signalum.blend, 2), "dustSignalum", "dustSignalum"));
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Materials.signalum.smallblend, 2), "smalldustSignalum", "smalldustSignalum"));
		}
	}
}
