package mmd.fantasymetals.init;

import mmd.fantasymetals.util.Config.Options;
import net.minecraft.item.*;

/**
 * This class initializes all items in Fantasy Metals.
 *
 * @author DrCyano
 *
 */
public class Items extends cyano.basemetals.init.Items {

	public static Item enderium_arrow;
	public static Item enderium_axe;
	public static Item enderium_blend;
	public static Item enderium_boots;
	public static Item enderium_bolt;
	public static Item enderium_bow;
	public static Item enderium_chestplate;
	public static Item enderium_crackhammer;
	public static Item enderium_crossbow;
	public static Item enderium_door;
	public static Item enderium_fishingrod;
	public static Item enderium_helmet;
	public static Item enderium_hoe;
	public static Item enderium_horsearmor;
	public static Item enderium_ingot;
	public static Item enderium_leggings;
	public static Item enderium_nugget;
	public static Item enderium_pickaxe;
	public static Item enderium_powder;
	public static Item enderium_shears;
	public static Item enderium_shovel;
	public static Item enderium_smallblend;
	public static Item enderium_smallpowder;
	public static Item enderium_sword;
	public static Item enderium_rod;
	public static Item enderium_gear;

	public static Item enderium_slab;
	public static Item enderium_shield;

	public static Item enderium_crystal;
	public static Item enderium_shard;
	public static Item enderium_clump;
	public static Item enderium_powder_dirty;

	public static Item enderium_dense_plate;
	public static Item enderium_crushed;
	public static Item enderium_crushed_purified;

	public static Item lumium_arrow;
	public static Item lumium_axe;
	public static Item lumium_blend;
	public static Item lumium_boots;
	public static Item lumium_bolt;
	public static Item lumium_bow;
	public static Item lumium_chestplate;
	public static Item lumium_crackhammer;
	public static Item lumium_crossbow;
	public static Item lumium_door;
	public static Item lumium_fishingrod;
	public static Item lumium_helmet;
	public static Item lumium_hoe;
	public static Item lumium_horsearmor;
	public static Item lumium_ingot;
	public static Item lumium_leggings;
	public static Item lumium_nugget;
	public static Item lumium_pickaxe;
	public static Item lumium_powder;
	public static Item lumium_shears;
	public static Item lumium_shovel;
	public static Item lumium_smallblend;
	public static Item lumium_smallpowder;
	public static Item lumium_sword;
	public static Item lumium_rod;
	public static Item lumium_gear;

	public static Item lumium_slab;
	public static Item lumium_shield;

	public static Item lumium_crystal;
	public static Item lumium_shard;
	public static Item lumium_clump;
	public static Item lumium_powder_dirty;

	public static Item lumium_dense_plate;
	public static Item lumium_crushed;
	public static Item lumium_crushed_purified;

	public static Item prismarinium_arrow;
	public static Item prismarinium_axe;
	public static Item prismarinium_blend;
	public static Item prismarinium_boots;
	public static Item prismarinium_bolt;
	public static Item prismarinium_bow;
	public static Item prismarinium_chestplate;
	public static Item prismarinium_crackhammer;
	public static Item prismarinium_crossbow;
	public static Item prismarinium_door;
	public static Item prismarinium_fishingrod;
	public static Item prismarinium_helmet;
	public static Item prismarinium_hoe;
	public static Item prismarinium_horsearmor;
	public static Item prismarinium_ingot;
	public static Item prismarinium_leggings;
	public static Item prismarinium_nugget;
	public static Item prismarinium_pickaxe;
	public static Item prismarinium_powder;
	public static Item prismarinium_shears;
	public static Item prismarinium_shovel;
	public static Item prismarinium_smallblend;
	public static Item prismarinium_smallpowder;
	public static Item prismarinium_sword;
	public static Item prismarinium_rod;
	public static Item prismarinium_gear;

	public static Item prismarinium_slab;
	public static Item prismarinium_shield;

	public static Item prismarinium_crystal;
	public static Item prismarinium_shard;
	public static Item prismarinium_clump;
	public static Item prismarinium_powder_dirty;

	public static Item prismarinium_dense_plate;
	public static Item prismarinium_crushed;
	public static Item prismarinium_crushed_purified;

	public static Item signalum_arrow;
	public static Item signalum_axe;
	public static Item signalum_blend;
	public static Item signalum_boots;
	public static Item signalum_bolt;
	public static Item signalum_bow;
	public static Item signalum_chestplate;
	public static Item signalum_crackhammer;
	public static Item signalum_crossbow;
	public static Item signalum_door;
	public static Item signalum_fishingrod;
	public static Item signalum_helmet;
	public static Item signalum_hoe;
	public static Item signalum_horsearmor;
	public static Item signalum_ingot;
	public static Item signalum_leggings;
	public static Item signalum_nugget;
	public static Item signalum_pickaxe;
	public static Item signalum_powder;
	public static Item signalum_shears;
	public static Item signalum_shovel;
	public static Item signalum_smallblend;
	public static Item signalum_smallpowder;
	public static Item signalum_sword;
	public static Item signalum_rod;
	public static Item signalum_gear;

	public static Item signalum_slab;
	public static Item signalum_shield;

	public static Item signalum_crystal;
	public static Item signalum_shard;
	public static Item signalum_clump;
	public static Item signalum_powder_dirty;

	public static Item signalum_dense_plate;
	public static Item signalum_crushed;
	public static Item signalum_crushed_purified;

	private static boolean initDone = false;

	/**
	 *
	 */
	public static void init() {
		if (initDone) {
			return;
		}

		Blocks.init();

		String materialName;

		if (Options.ENABLE_ENDERIUM) {
			materialName = "enderium";

			enderium_arrow = createArrow(materialName);
			enderium_axe = createAxe(materialName);
			enderium_blend = createBlend(materialName);
			enderium_boots = createBoots(materialName);
			enderium_bolt = createBolt(materialName);
			enderium_bow = createBow(materialName);
			enderium_chestplate = createChestplate(materialName);
			enderium_crackhammer = createCrackhammer(materialName);
			enderium_crossbow = createCrossbow(materialName);
			enderium_door = createDoor(materialName);
			enderium_fishingrod = createFishingRod(materialName);
			enderium_helmet = createHelmet(materialName);
			enderium_hoe = createHoe(materialName);
			enderium_horsearmor = createHorseArmor(materialName);
			enderium_ingot = createIngot(materialName);
			enderium_leggings = createLeggings(materialName);
			enderium_nugget = createNugget(materialName);
			enderium_pickaxe = createPickaxe(materialName);
			enderium_powder = createPowder(materialName);
			enderium_shears = createShears(materialName);
			enderium_shovel = createShovel(materialName);
			enderium_smallblend = createSmallBlend(materialName);
			enderium_smallpowder = createSmallPowder(materialName);
			enderium_sword = createSword(materialName);
			enderium_rod = createRod(materialName);
			enderium_gear = createGear(materialName);

			enderium_slab = createSlab(materialName);
			enderium_shield = createShield(materialName);

			enderium_crystal = createCrystal(materialName);
			enderium_shard = createShard(materialName);
			enderium_clump = createClump(materialName);
			enderium_powder_dirty = createDirtyPowder(materialName);

			enderium_dense_plate = createDensePlate(materialName);
			enderium_crushed = createCrushed(materialName);
			enderium_crushed_purified = createCrushedPurified(materialName);
		}

		if (Options.ENABLE_LUMIUM) {
			materialName = "lumium";

			lumium_arrow = createArrow(materialName);
			lumium_axe = createAxe(materialName);
			lumium_blend = createBlend(materialName);
			lumium_boots = createBoots(materialName);
			lumium_bolt = createBolt(materialName);
			lumium_bow = createBow(materialName);
			lumium_chestplate = createChestplate(materialName);
			lumium_crackhammer = createCrackhammer(materialName);
			lumium_crossbow = createCrossbow(materialName);
			lumium_door = createDoor(materialName);
			lumium_fishingrod = createFishingRod(materialName);
			lumium_helmet = createHelmet(materialName);
			lumium_hoe = createHoe(materialName);
			lumium_horsearmor = createHorseArmor(materialName);
			lumium_ingot = createIngot(materialName);
			lumium_leggings = createLeggings(materialName);
			lumium_nugget = createNugget(materialName);
			lumium_pickaxe = createPickaxe(materialName);
			lumium_powder = createPowder(materialName);
			lumium_shears = createShears(materialName);
			lumium_shovel = createShovel(materialName);
			lumium_smallblend = createSmallBlend(materialName);
			lumium_smallpowder = createSmallPowder(materialName);
			lumium_sword = createSword(materialName);
			lumium_rod = createRod(materialName);
			lumium_gear = createGear(materialName);

			lumium_slab = createSlab(materialName);
			lumium_shield = createShield(materialName);

			lumium_crystal = createCrystal(materialName);
			lumium_shard = createShard(materialName);
			lumium_clump = createClump(materialName);
			lumium_powder_dirty = createDirtyPowder(materialName);

			lumium_dense_plate = createDensePlate(materialName);
			lumium_crushed = createCrushed(materialName);
			lumium_crushed_purified = createCrushedPurified(materialName);
		}

		if (Options.ENABLE_PRISMARINIUM) {
			materialName = "prismarinium";

			prismarinium_arrow = createArrow(materialName);
			prismarinium_axe = createAxe(materialName);
			prismarinium_blend = createBlend(materialName);
			prismarinium_boots = createBoots(materialName);
			prismarinium_bolt = createBolt(materialName);
			prismarinium_bow = createBow(materialName);
			prismarinium_chestplate = createChestplate(materialName);
			prismarinium_crackhammer = createCrackhammer(materialName);
			prismarinium_crossbow = createCrossbow(materialName);
			prismarinium_door = createDoor(materialName);
			prismarinium_fishingrod = createFishingRod(materialName);
			prismarinium_helmet = createHelmet(materialName);
			prismarinium_hoe = createHoe(materialName);
			prismarinium_horsearmor = createHorseArmor(materialName);
			prismarinium_ingot = createIngot(materialName);
			prismarinium_leggings = createLeggings(materialName);
			prismarinium_nugget = createNugget(materialName);
			prismarinium_pickaxe = createPickaxe(materialName);
			prismarinium_powder = createPowder(materialName);
			prismarinium_shears = createShears(materialName);
			prismarinium_shovel = createShovel(materialName);
			prismarinium_smallblend = createSmallBlend(materialName);
			prismarinium_smallpowder = createSmallPowder(materialName);
			prismarinium_sword = createSword(materialName);
			prismarinium_rod = createRod(materialName);
			prismarinium_gear = createGear(materialName);

			prismarinium_slab = createSlab(materialName);
			prismarinium_shield = createShield(materialName);

			prismarinium_crystal = createCrystal(materialName);
			prismarinium_shard = createShard(materialName);
			prismarinium_clump = createClump(materialName);
			prismarinium_powder_dirty = createDirtyPowder(materialName);

			prismarinium_dense_plate = createDensePlate(materialName);
			prismarinium_crushed = createCrushed(materialName);
			prismarinium_crushed_purified = createCrushedPurified(materialName);
		}

		if (Options.ENABLE_SIGNALUM) {
			materialName = "signalum";
	
			signalum_arrow = createArrow(materialName);
			signalum_axe = createAxe(materialName);
			signalum_blend = createBlend(materialName);
			signalum_boots = createBoots(materialName);
			signalum_bolt = createBolt(materialName);
			signalum_bow = createBow(materialName);
			signalum_chestplate = createChestplate(materialName);
			signalum_crackhammer = createCrackhammer(materialName);
			signalum_crossbow = createCrossbow(materialName);
			signalum_door = createDoor(materialName);
			signalum_fishingrod = createFishingRod(materialName);
			signalum_helmet = createHelmet(materialName);
			signalum_hoe = createHoe(materialName);
			signalum_horsearmor = createHorseArmor(materialName);
			signalum_ingot = createIngot(materialName);
			signalum_leggings = createLeggings(materialName);
			signalum_nugget = createNugget(materialName);
			signalum_pickaxe = createPickaxe(materialName);
			signalum_powder = createPowder(materialName);
			signalum_shears = createShears(materialName);
			signalum_shovel = createShovel(materialName);
			signalum_smallblend = createSmallBlend(materialName);
			signalum_smallpowder = createSmallPowder(materialName);
			signalum_sword = createSword(materialName);
			signalum_rod = createRod(materialName);
			signalum_gear = createGear(materialName);

			signalum_slab = createSlab(materialName);
			signalum_shield = createShield(materialName);

			signalum_crystal = createCrystal(materialName);
			signalum_shard = createShard(materialName);
			signalum_clump = createClump(materialName);
			signalum_powder_dirty = createDirtyPowder(materialName);

			signalum_dense_plate = createDensePlate(materialName);
			signalum_crushed = createCrushed(materialName);
			signalum_crushed_purified = createCrushedPurified(materialName);
		}

		initDone = true;
	}
}
