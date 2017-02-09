package com.mcmoddev.fantasymetals.integration.plugins;

import com.mcmoddev.fantasymetals.integration.FantasyMetalsPlugin;
import com.mcmoddev.lib.integration.IIntegration;

@FantasyMetalsPlugin(Mekanism.PLUGIN_MODID)
public class Mekanism extends com.mcmoddev.lib.integration.plugins.Mekanism implements IIntegration {

	private static boolean initDone = false;

	@Override
	public void init() {
		if (initDone || !com.mcmoddev.basemetals.util.Config.Options.ENABLE_MEKANISM) {
			return;
		}

		initDone = true;
	}
}
