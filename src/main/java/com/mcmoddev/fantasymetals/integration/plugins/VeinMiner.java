package com.mcmoddev.fantasymetals.integration.plugins;

import com.mcmoddev.fantasymetals.FantasyMetals;
import com.mcmoddev.fantasymetals.util.Config.Options;
import com.mcmoddev.lib.integration.MMDPlugin;
import com.mcmoddev.lib.integration.IIntegration;

/**
 * VeinMiner Integration Plugin
 *
 * @author Jasmine Iwanek
 *
 */
@MMDPlugin(addonId = FantasyMetals.MODID, pluginId = VeinMiner.PLUGIN_MODID)
public class VeinMiner extends com.mcmoddev.lib.integration.plugins.VeinMinerBase implements IIntegration {

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

		if (Options.enableTeslarium) {
			addToolsForMaterial("teslarium");
		}

		initDone = true;
	}
}
