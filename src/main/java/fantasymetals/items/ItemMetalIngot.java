package fantasymetals.items;

import cyano.basemetals.material.MetalMaterial;
import fantasymetals.init.Achievements;
import fantasymetals.init.Materials;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemMetalIngot extends cyano.basemetals.items.ItemMetalIngot{

	public ItemMetalIngot(MetalMaterial metal) {
		super(metal);
		// TODO Auto-generated constructor stub
	}

    public void onCreated(final ItemStack item, final World world, final EntityPlayer crafter) {
    	super.onCreated(item, world, crafter);
    	crafter.addStat(cyano.basemetals.init.Achievements.this_is_new, 1);

    	if(metal == Materials.template) crafter.addStat(Achievements.template_maker, 1);
	}

}
