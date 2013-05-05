package nucleon.neocraft;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import net.minecraftforge.common.Configuration;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

import nucleon.neocraft.item.*;


@Mod(modid = NeoCraft.modid, name = "NeoCraft", version = "1.0.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class NeoCraft
{
	
	@Instance(NeoCraft.modid)
    public static NeoCraft instance;
	
	 @SidedProxy(clientSide="nucleon.neocraft.client.ClientProxy", serverSide="nucleon.neocraft.CommonProxy")
	 public static CommonProxy proxy;
	
	public static final String modid = "nucleon_neocraft";
	
	public static final CreativeTabNeoCraft ctab = new CreativeTabNeoCraft(net.minecraft.creativetab.CreativeTabs.getNextID(), "NeoCraft");
	
	Configuration config;
	
	
	// Items ============================//
	public static Item ingotChromium;
	public static Item ingotSteel;
	public static Item ingotStainlessSteel;
	public static Item circuitBoard;
	
	
	 @PreInit
     public void preInit(FMLPreInitializationEvent event) {
		 config = new Configuration(event.getSuggestedConfigurationFile());
		 config.load();
         config.save();
     }
	 
    @Init
    public void load(FMLInitializationEvent event)
    {
    	ingotChromium = new IngotChromium(config.get(Configuration.CATEGORY_ITEM, "ingotChromium", 5501).getInt());
    	ingotSteel = new IngotSteel(config.get(Configuration.CATEGORY_ITEM, "ingotSteel", 5502).getInt());
    	ingotStainlessSteel = new IngotStainlessSteel(config.get(Configuration.CATEGORY_ITEM, "ingotStainlessSteel", 5503).getInt());
    	circuitBoard = new CircuitBoard(config.get(Configuration.CATEGORY_ITEM, "circuitBoard", 5504).getInt());
    	
    	LanguageRegistry.addName(ingotChromium, "Chromium Ingot");
    	LanguageRegistry.addName(ingotSteel, "Steel Ingot");
    	LanguageRegistry.addName(ingotStainlessSteel, "Stainless Steel Ingot");
    	LanguageRegistry.addName(circuitBoard, "Circuit Board");
    	
    	GameRegistry.addRecipe(new ItemStack(ingotSteel), "0y0", "yxy", "0y0",
    	        'x', Item.ingotIron, 'y', Item.coal);
    	GameRegistry.addRecipe(new ItemStack(ingotStainlessSteel, 9), "yyy", "yxy", "yyy",
    	        'x', ingotChromium, 'y', ingotSteel);
    	
    	config.save();
    }
}
