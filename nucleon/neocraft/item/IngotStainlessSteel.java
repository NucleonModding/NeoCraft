package nucleon.neocraft.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import nucleon.neocraft.NeoCraft;

public class IngotStainlessSteel extends Item{
	 public IngotStainlessSteel(int id)
	 {
         super(id);
         setMaxStackSize(64);
         setCreativeTab(NeoCraft.ctab);
         setUnlocalizedName("ingotStainlessSteel");
	 }
	 
	 public void registerIcons(IconRegister iconRegister)
	 {
	          itemIcon = iconRegister.registerIcon("NeoCraft:ingotStainlessSteel");
	 }
}
