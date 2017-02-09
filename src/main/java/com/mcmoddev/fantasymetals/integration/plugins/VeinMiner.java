package com.mcmoddev.fantasymetals.integration.plugins;

import com.mcmoddev.fantasymetals.integration.FantasyMetalsPlugin;
import com.mcmoddev.fantasymetals.util.Config.Options;
import com.mcmoddev.lib.integration.IIntegration;

/**
 * VeinMiner Integration Plugin
 *
 * @author Jasmine Iwanek
 *
 */
@FantasyMetalsPlugin(VeinMiner.PLUGIN_MODID)
public class VeinMiner extends com.mcmoddev.lib.integration.plugins.VeinMiner implements IIntegration {

	private static boolean initDone = false;

	@Override
	public void init() {
		if (initDone || !com.mcmoddev.basemetals.util.Config.Options.enableVeinminer) {
			return;
		}

		if (Options.enableEnderium) {
			addToolsForMaterial("enderium");
		}

		if (Options.enableLumium) {
			addToolsForMaterial("lumium");
		}

		if (Options.enablePrismarinium) {
			addToolsForMaterial("prismarinium");
		}

		if (Options.enableSignalum) {
			addToolsForMaterial("signalum");
		}

		initDone = true;
	}
}
