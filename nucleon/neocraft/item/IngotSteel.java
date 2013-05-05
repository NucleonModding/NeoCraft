package nucleon.neocraft.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import nucleon.neocraft.NeoCraft;

public class IngotSteel extends Item{
	 public IngotSteel(int id)
	 {
         super(id);
         setMaxStackSize(64);
         setCreativeTab(NeoCraft.ctab);
         setUnlocalizedName("ingotSteel");
	 }
	 
	 public void registerIcons(IconRegister iconRegister)
	 {
	          itemIcon = iconRegister.registerIcon("NeoCraft:ingotSteel");
	 }
}
