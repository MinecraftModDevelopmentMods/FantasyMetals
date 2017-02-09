package com.mcmoddev.fantasymetals.integration.plugins;

import com.mcmoddev.fantasymetals.integration.FantasyMetalsPlugin;
import com.mcmoddev.lib.integration.IIntegration;

@FantasyMetalsPlugin(Thaumcraft.PLUGIN_MODID)
public class Thaumcraft extends com.mcmoddev.lib.integration.plugins.Thaumcraft implements IIntegration {

	private static boolean initDone = false;

	@Override
	public void init() {
		if (initDone || !com.mcmoddev.basemetals.util.Config.Options.ENABLE_THAUMCRAFT) {
			return;
		}

		initDone = true;
	}
}
