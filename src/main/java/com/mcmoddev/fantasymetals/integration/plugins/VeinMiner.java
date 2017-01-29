package com.mcmoddev.fantasymetals.integration.plugins;

import com.mcmoddev.basemetals.integration.BaseMetalsPlugin;
import com.mcmoddev.basemetals.integration.IIntegration;

/**
 * VeinMiner Integration Plugin
 *
 * @author Jasmine Iwanek
 *
 */
@BaseMetalsPlugin(VeinMiner.PLUGIN_MODID)
public class VeinMiner extends com.mcmoddev.basemetals.integration.plugins.VeinMiner implements IIntegration {

	private static boolean initDone = false;

	@Override
	public void init() {
		if (initDone || !com.mcmoddev.basemetals.util.Config.Options.ENABLE_VEINMINER) {
			return;
		}

		addToolsForMaterial("enderium");
		addToolsForMaterial("lumium");
		addToolsForMaterial("prismarinium");
		addToolsForMaterial("signalum");

		initDone = true;
	}
}
