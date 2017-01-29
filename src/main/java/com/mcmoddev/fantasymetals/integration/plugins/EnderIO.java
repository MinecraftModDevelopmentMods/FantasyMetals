package com.mcmoddev.fantasymetals.integration.plugins;

import com.mcmoddev.basemetals.integration.BaseMetalsPlugin;
import com.mcmoddev.basemetals.integration.IIntegration;

/**
 *
 * @author Jasmine Iwanek
 *
 */
@BaseMetalsPlugin(EnderIO.PLUGIN_MODID)
public class EnderIO extends com.mcmoddev.basemetals.integration.plugins.EnderIO implements IIntegration {

	private static boolean initDone = false;

	/**
	 *
	 */
	@Override
	public void init() {
		if (initDone || !com.mcmoddev.basemetals.util.Config.Options.ENABLE_ENDER_IO) {
			return;
		}

		// TODO: Verify blocks, Slabs, Ingots, Oreblocks
		addSagMillRecipe("enderium", null, 3600);
		addSagMillRecipe("lumium", null, 3600);
		addSagMillRecipe("prismarinium", null, 3600);
		addSagMillRecipe("signalum", null, 3600);

		initDone = true;
	}
}
