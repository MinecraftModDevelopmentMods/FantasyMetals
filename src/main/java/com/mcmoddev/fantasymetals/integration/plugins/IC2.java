package com.mcmoddev.fantasymetals.integration.plugins;

import com.mcmoddev.fantasymetals.FantasyMetals;
import com.mcmoddev.lib.integration.MMDPlugin;
import com.mcmoddev.lib.integration.IIntegration;

@MMDPlugin(addonId = FantasyMetals.MODID, pluginId = IC2.PLUGIN_MODID)
public class IC2 extends com.mcmoddev.lib.integration.plugins.IC2Base implements IIntegration {

	private static boolean initDone = false;

	@Override
	public void init() {
		if (initDone || !com.mcmoddev.basemetals.util.Config.Options.modEnabled("ic2")) {
			return;
		}

		initDone = true;
	}
}
