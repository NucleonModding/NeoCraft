package nucleon.neocraft;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = NeoCraft.modid, name = "NeoCraft", version = "1.0.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class NeoCraft
{
	public static final String modid = "nucleon_neocraft";
	
	 
    @Init
    public void load(FMLInitializationEvent event)
    {
     
    }
}
