package nucleon.neocraft.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import nucleon.neocraft.NeoCraft;

public class ItemBase extends Item{
	String itemName;
	 public ItemBase(int id , String name)
	 {
         super(id);
         setCreativeTab(NeoCraft.ctab);
         setUnlocalizedName(name);
         itemName = name;
	 }
	 

	public void registerIcons(IconRegister iconRegister)
	 {
		itemIcon = iconRegister.registerIcon("NeoCraft:" + itemName);
	 }
}
