package com.mcmoddev.fantasymetals.integration.plugins;

import com.mcmoddev.fantasymetals.integration.FantasyMetalsPlugin;
import com.mcmoddev.lib.integration.IIntegration;

@FantasyMetalsPlugin(IC2.PLUGIN_MODID)
public class IC2 extends com.mcmoddev.lib.integration.plugins.IC2 implements IIntegration {

	private static boolean initDone = false;

	@Override
	public void init() {
		if (initDone || !com.mcmoddev.basemetals.util.Config.Options.ENABLE_IC2) {
			return;
		}

		initDone = true;
	}
}
