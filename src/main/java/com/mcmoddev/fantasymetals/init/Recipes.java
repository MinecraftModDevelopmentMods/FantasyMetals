package com.mcmoddev.fantasymetals.init;

import com.mcmoddev.fantasymetals.util.Config.Options;
import com.mcmoddev.lib.data.Names;
import com.mcmoddev.lib.util.Oredicts;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapelessOreRecipe;

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
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Materials.getMaterialByName("enderium").getItem(Names.BLEND), 2), Oredicts.DUST + "Enderium", Oredicts.DUST + "Enderium"));
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Materials.getMaterialByName("enderium").getItem(Names.SMALLBLEND), 2), Oredicts.DUST_TINY + "Enderium", Oredicts.DUST_TINY + "Enderium"));
		}

		if (Options.enableLumium) {
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Materials.getMaterialByName("lumium").getItem(Names.BLEND), 2), Oredicts.DUST + "Lumium", Oredicts.DUST + "Lumium"));
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Materials.getMaterialByName("lumium").getItem(Names.SMALLBLEND), 2), Oredicts.DUST_TINY + "Lumium", Oredicts.DUST_TINY + "Lumium"));
		}

		if (Options.enablePrismarinium) {
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Materials.getMaterialByName("prismarinium").getItem(Names.BLEND), 2), Oredicts.DUST + "Enderium", Oredicts.DUST + "Signalum"));
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Materials.getMaterialByName("prismarinium").getItem(Names.SMALLBLEND), 2), Oredicts.DUST_TINY + "Prismarinium", Oredicts.DUST_TINY + "Prismarinium"));
		}

		if (Options.enableSignalum) {
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Materials.getMaterialByName("signalum").getItem(Names.BLEND), 2), Oredicts.DUST + "Signalum", Oredicts.DUST + "Signalum"));
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Materials.getMaterialByName("signalum").getItem(Names.SMALLBLEND), 2), Oredicts.DUST_TINY + "Signalum", Oredicts.DUST_TINY + "Signalum"));
		}
	}
}
