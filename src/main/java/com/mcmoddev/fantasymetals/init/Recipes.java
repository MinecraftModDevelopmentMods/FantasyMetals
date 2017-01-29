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
		// alloy blends
		if (Options.ENABLE_ENDERIUM) {
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Materials.enderium.blend, 2), "dustEnderium", "dustEnderium"));
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Materials.enderium.smallblend, 2), "smalldustEnderium", "smalldustEnderium"));
		}
		if (Options.ENABLE_LUMIUM) {
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Materials.lumium.blend, 2), "dustLumium", "dustLumium"));
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Materials.lumium.smallblend, 2), "smalldustLumium", "smalldustLumium"));
		}
		if (Options.ENABLE_PRISMARINIUM) {
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Materials.prismarinium.blend, 2), "dustEnderium", "dustSignalum"));
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Materials.prismarinium.smallblend, 2), "smalldustPrismarinium", "smalldustPrismarinium"));
		}
		if (Options.ENABLE_SIGNALUM) {
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Materials.signalum.blend, 2), "dustSignalum", "dustSignalum"));
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Materials.signalum.smallblend, 2), "smalldustSignalum", "smalldustSignalum"));
		}
	}
}
