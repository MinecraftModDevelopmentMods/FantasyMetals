package fantasymetals.init;

import org.apache.logging.log4j.Level;

import fantasymetals.FantasyMetals;
import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.Loader;

import portablejim.veinminer.api.IMCMessage;

/**
 *
 * @author Jasmine Iwanek
 *
 */
public class VeinMinerPlugin {

	private static boolean initDone = false;

	/**
	 *
	 */
	public static void init() {
		if(initDone)
			return;

		if(Loader.isModLoaded("VeinMiner") || Loader.isModLoaded("veinminer")) {
			FMLLog.log(Level.ERROR, "%s: Activating VeinMiner Support", FantasyMetals.MODID);

			addToolsForMetal("enderium");
			addToolsForMetal("lumium");
			addToolsForMetal("prismarinium");
			addToolsForMetal("signalum");
		}

		initDone = true;
	}

	/**
	 *
	 * @param metal
	 */
	public static void addToolsForMetal(String metal) {
		IMCMessage.addTool("axe", FantasyMetals.MODID + ":" + metal + "_axe");
		IMCMessage.addTool("hoe", FantasyMetals.MODID + ":" + metal + "_hoe");
		IMCMessage.addTool("pickaxe", FantasyMetals.MODID + ":" + metal + "_pickaxe");
		IMCMessage.addTool("shears", FantasyMetals.MODID + ":" + metal + "_shears");
		IMCMessage.addTool("shovel", FantasyMetals.MODID + ":" + metal + "_shovel");
//		IMCMessage.addTool("crook", FantasyMetals.MODID + ":" + metal + "_crook");
		IMCMessage.addTool("hammer", FantasyMetals.MODID + ":" + metal + "_hammer");
	}
}
