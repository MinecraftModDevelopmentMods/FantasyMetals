package com.mcmoddev.fantasymetals.integration.plugins;

import com.mcmoddev.fantasymetals.FantasyMetals;
import com.mcmoddev.fantasymetals.util.Config.Options;
import com.mcmoddev.lib.integration.MMDPlugin;
import com.mcmoddev.lib.integration.IIntegration;

/**
 *
 * @author Jasmine Iwanek
 *
 */
@MMDPlugin(addonId = FantasyMetals.MODID, pluginId = EnderIO.PLUGIN_MODID)
public class EnderIO extends com.mcmoddev.lib.integration.plugins.EnderIOBase implements IIntegration {

	private static boolean initDone = false;

	/**
	 *
	 */
	@Override
	public void init() {
		if (initDone || !com.mcmoddev.basemetals.util.Config.Options.modEnabled("enderio")) {
			return;
		}

		if (Options.enableEnderium) {
			addSagMillRecipe("enderium", null, 3600);
		}

		if (Options.enableLumium) {
			addSagMillRecipe("lumium", null, 3600);
		}

		if (Options.enablePrismarinium) {
			addSagMillRecipe("prismarinium", null, 3600);
		}

		if (Options.enableSignalum) {
			addSagMillRecipe("signalum", null, 3600);
		}

		if (Options.enableTeslarium) {
			addSagMillRecipe("teslarium", null, 3600);
		}

		initDone = true;
	}
}
