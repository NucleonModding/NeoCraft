package nucleon.neocraft.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import nucleon.neocraft.NeoCraft;

public class CircuitBoard extends Item {
	 public CircuitBoard(int id)
	 {
         super(id);
         setMaxStackSize(16);
         setCreativeTab(NeoCraft.ctab);
         setUnlocalizedName("circuitBoard");
	 }
	 
	 public void registerIcons(IconRegister iconRegister)
	 {
	          itemIcon = iconRegister.registerIcon("NeoCraft:circuitBoard");
	 }
}
