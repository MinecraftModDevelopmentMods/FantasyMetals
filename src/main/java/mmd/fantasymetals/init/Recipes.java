package mmd.fantasymetals.init;

import net.minecraft.item.*;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.*;

/**
 *
 * @author Jasmine Iwanek
 *
 */
public class Recipes extends cyano.basemetals.init.Recipes {

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
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.enderium_blend, 2), "dustEnderium", "dustEnderium"));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.lumium_blend, 2), "dustLumium", "dustLumium"));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.prismarinium_blend, 2), "dustEnderium", "dustSignalum"));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.signalum_blend, 2), "dustSignalum", "dustSignalum"));

		// small alloy blends
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.enderium_smallblend, 2), "smalldustEnderium", "smalldustEnderium"));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.lumium_smallblend, 2), "smalldustLumium", "smalldustLumium"));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.prismarinium_smallblend, 2), "smalldustPrismarinium", "smalldustPrismarinium"));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.signalum_smallblend, 2), "smalldustSignalum", "smalldustSignalum"));
	}
}
