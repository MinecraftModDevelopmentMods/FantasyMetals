package com.mcmoddev.fantasymetals.integration.plugins;

import com.mcmoddev.fantasymetals.integration.FantasyMetalsPlugin;
import com.mcmoddev.fantasymetals.util.Config.Options;
import com.mcmoddev.lib.integration.IIntegration;

/**
 *
 * @author Jasmine Iwanek
 *
 */
@FantasyMetalsPlugin(EnderIO.PLUGIN_MODID)
public class EnderIO extends com.mcmoddev.lib.integration.plugins.EnderIO implements IIntegration {

	private static boolean initDone = false;

	/**
	 *
	 */
	@Override
	public void init() {
		if (initDone || !com.mcmoddev.basemetals.util.Config.Options.ENABLE_ENDER_IO) {
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

		initDone = true;
	}
}
