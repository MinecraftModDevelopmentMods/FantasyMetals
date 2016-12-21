package mmd.fantasymetals.init;

import mmd.fantasymetals.util.Config.Options;
import net.minecraft.block.*;

/**
 * This class initializes all blocks in Fantasy Metals.
 *
 * @author DrCyano
 *
 */
public class Blocks extends cyano.basemetals.init.Blocks {

	public static Block enderium_bars;
	public static Block enderium_block;
	public static Block enderium_plate;
	public static BlockDoor enderium_door;
	public static Block enderium_ore;
	public static Block enderium_trapdoor;

	public static Block enderium_button;
	public static BlockSlab enderium_slab;
	public static BlockSlab double_enderium_slab;
	public static Block enderium_lever;
	public static Block enderium_pressure_plate;
	public static Block enderium_stairs;
	public static Block enderium_wall;

	public static Block lumium_bars;
	public static Block lumium_block;
	public static Block lumium_plate;
	public static BlockDoor lumium_door;
	public static Block lumium_ore;
	public static Block lumium_trapdoor;

	public static Block lumium_button;
	public static BlockSlab lumium_slab;
	public static BlockSlab double_lumium_slab;
	public static Block lumium_lever;
	public static Block lumium_pressure_plate;
	public static Block lumium_stairs;
	public static Block lumium_wall;

	public static Block prismarinium_bars;
	public static Block prismarinium_block;
	public static Block prismarinium_plate;
	public static BlockDoor prismarinium_door;
	public static Block prismarinium_ore;
	public static Block prismarinium_trapdoor;

	public static Block prismarinium_button;
	public static BlockSlab prismarinium_slab;
	public static BlockSlab double_prismarinium_slab;
	public static Block prismarinium_lever;
	public static Block prismarinium_pressure_plate;
	public static Block prismarinium_stairs;
	public static Block prismarinium_wall;

	public static Block signalum_bars;
	public static Block signalum_block;
	public static Block signalum_plate;
	public static BlockDoor signalum_door;
	public static Block signalum_ore;
	public static Block signalum_trapdoor;

	public static Block signalum_button;
	public static BlockSlab signalum_slab;
	public static BlockSlab double_signalum_slab;
	public static Block signalum_lever;
	public static Block signalum_pressure_plate;
	public static Block signalum_stairs;
	public static Block signalum_wall;

	private static boolean initDone = false;

	/**
	 *
	 */
	public static void init() {
		if (initDone) {
			return;
		}

		Materials.init();
		ItemGroups.init();

		String materialName;

		if (Options.ENABLE_ENDERIUM) {
			materialName = "enderium";

			enderium_block = createBlock(materialName);
			enderium_plate = createPlate(materialName);
			enderium_ore = createOre(materialName);
			enderium_bars = createBars(materialName);
			enderium_door = createDoor(materialName);
			enderium_trapdoor = createTrapDoor(materialName);

			enderium_button = createButton(materialName);
			enderium_slab = createSlab(materialName);
			double_enderium_slab = createDoubleSlab(materialName);
			enderium_lever = createLever(materialName);
			enderium_pressure_plate = createPressurePlate(materialName);
			enderium_stairs = createStairs(materialName);
			enderium_wall = createWall(materialName);
		}

		if (Options.ENABLE_LUMIUM) {
			materialName = "lumium";

			lumium_block = createBlock(materialName);
			lumium_plate = createPlate(materialName);
			lumium_ore = createOre(materialName);
			lumium_bars = createBars(materialName);
			lumium_door = createDoor(materialName);
			lumium_trapdoor = createTrapDoor(materialName);

			lumium_button = createButton(materialName);
			lumium_slab = createSlab(materialName);
			double_lumium_slab = createDoubleSlab(materialName);
			lumium_lever = createLever(materialName);
			lumium_pressure_plate = createPressurePlate(materialName);
			lumium_stairs = createStairs(materialName);
			lumium_wall = createWall(materialName);
		}

		if (Options.ENABLE_PRISMARINIUM) {
			materialName = "prismarinium";

			prismarinium_block = createBlock(materialName);
			prismarinium_plate = createPlate(materialName);
			prismarinium_ore = createOre(materialName);
			prismarinium_bars = createBars(materialName);
			prismarinium_door = createDoor(materialName);
			prismarinium_trapdoor = createTrapDoor(materialName);

			prismarinium_button = createButton(materialName);
			prismarinium_slab = createSlab(materialName);
			double_prismarinium_slab = createDoubleSlab(materialName);
			prismarinium_lever = createLever(materialName);
			prismarinium_pressure_plate = createPressurePlate(materialName);
			prismarinium_stairs = createStairs(materialName);
			prismarinium_wall = createWall(materialName);
		}

		if (Options.ENABLE_SIGNALUM) {
			materialName = "signalum";

			signalum_block = createBlock(materialName);
			signalum_plate = createPlate(materialName);
			signalum_ore = createOre(materialName);
			signalum_bars = createBars(materialName);
			signalum_door = createDoor(materialName);
			signalum_trapdoor = createTrapDoor(materialName);

			signalum_button = createButton(materialName);
			signalum_slab = createSlab(materialName);
			double_signalum_slab = createDoubleSlab(materialName);
			signalum_lever = createLever(materialName);
			signalum_pressure_plate = createPressurePlate(materialName);
			signalum_stairs = createStairs(materialName);
			signalum_wall = createWall(materialName);
		}

		initDone = true;
	}
}
