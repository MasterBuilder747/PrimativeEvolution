package masterbuilder747.primativeevolution;

import masterbuilder747.primativeevolution.init.ExtraItems;
import masterbuilder747.primativeevolution.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class Modclass {
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	//@Mod.Instance(Reference.MOD_ID)
	public static Modclass instance;
	
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ExtraItems.init();
		ExtraItems.register();
		
		//proxy.registerRenders();
	}
	
	@EventHandler
	public void preInit(FMLInitializationEvent event)
	{
		proxy.registerRenders();
	}
	
	@EventHandler
	public void preInit(FMLPostInitializationEvent event)
	{
		
	}
}
