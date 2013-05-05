package nucleon.neocraft;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabNeoCraft extends net.minecraft.creativetab.CreativeTabs {

	public CreativeTabNeoCraft(int par1, String par2Str) {
		super(par1, par2Str);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex()
	{
		return (new ItemStack(NeoCraft.circuitBoard, 1, 1)).itemID;
	}

	@Override
	public String getTranslatedTabLabel()
	{
		return "NeoCraft";
	}
}
