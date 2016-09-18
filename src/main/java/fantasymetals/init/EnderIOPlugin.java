package fantasymetals.init;

import fantasymetals.FantasyMetals;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.event.FMLInterModComms;

/**
 *
 * @author Jasmine Iwanek
 *
 */
public class EnderIOPlugin {

	private static final String ENDER_IO_MODID = "EnderIO";

	private static boolean initDone = false;

	// @formatter:off
	private static final String ALLOY_SMELTER_MSG =
			"<recipeGroup name=\"" + FantasyMetals.MODID + "\" >" +
			 "<recipe name=\"%s\" energyCost=\"%d\" >" +
			  "<input>" +
			   "<itemStack modID=\"" + FantasyMetals.MODID + "\" itemName=\"%s\" />" +
			  "</input>" +
			  "<output>" +
			   "<itemStack modID=\"" + FantasyMetals.MODID + "\" itemName=\"%s\" />" +
			  "</output>" +
			 "</recipe>" +
			"</recipeGroup>";

	private static final String SAG_MILL_MSG =
			"<recipeGroup name=\"" + FantasyMetals.MODID + "\">" +
			 "<recipe name=\"%s\" energyCost=\"%d\">" +
			  "<input>" +
			   "<itemStack modID=\"" + FantasyMetals.MODID + "\" itemName=\"%s\" itemMeta=\"%d\" />" +
			  "</input>" +
			  "<output>" +
			   "<itemStack modID=\"" + FantasyMetals.MODID + "\" itemName=\"%s\" itemMeta=\"%d\" number=\"2\" />" +
			   "<itemStack modID=\"" + FantasyMetals.MODID + "\" itemName=\"%s\" itemMeta=\"%d\" number=\"1\" chance=\"0.1\" />" +
			   "<itemStack modID=\"minecraft\" itemName=\"%s\" chance=\"0.15\"/>" +
			  "</output>" +
			 "</recipe>" +
			"</recipeGroup>";
	// @formatter:on

	/**
	 *
	 */
	public static void init() {
		if(initDone)
			return;

		// TODO: Verify blocks, Slabs, Ingots, Oreblocks
		if(Loader.isModLoaded(ENDER_IO_MODID)) {
			addSagMillRecipe("enderium", null, 3600);
			addSagMillRecipe("lumium", null, 3600);
			addSagMillRecipe("prismarinium", null, 3600);
			addSagMillRecipe("signalum", null, 3600);
		}

		initDone = true;
	}

	// TODO: Use Oredicts for inputs
	/**
	 *
	 * @param metal
	 * @param outputSecondary
	 * @param energy
	 */
	public static void addAlloySmelterRecipe(String metal, String outputSecondary, int energy) {
		final String str = String.format(ALLOY_SMELTER_MSG, metal, energy, metal + "_ore", metal + "_ingot");
		FMLInterModComms.sendMessage(ENDER_IO_MODID, "recipe:alloysmelter", str);
	}

	// TODO: Use Oredicts for inputs
	/**
	 *
	 * @param metal
	 * @param outputSecondary
	 * @param energy
	 */
	public static void addSagMillRecipe(String metal, String outputSecondary, int energy) {

		final String str = String.format(SAG_MILL_MSG, metal, energy, metal + "_ore", 0, metal + "_powder", 0, outputSecondary, 0, "cobblestone");
		FMLInterModComms.sendMessage(ENDER_IO_MODID, "recipe:sagmill", str);
	}
}
