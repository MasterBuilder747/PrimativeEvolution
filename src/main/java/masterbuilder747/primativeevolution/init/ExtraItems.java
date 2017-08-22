package masterbuilder747.primativeevolution.init;

//import masterbuilder747.primativeevolution.items.Test_item2;
//import masterbuilder747.primativeevolution.util.Utils;
import masterbuilder747.primativeevolution.Reference;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class ExtraItems {
	
	//public static Item test_item;
	public static Item Test_item2;
	
	public static void init() {
		//test_item = new Item().setUnlocalizedName("test_item");
		Test_item2 = new Item().setUnlocalizedName("Test_item2");
		//Test_item2 = new Item()
	}
	
	public static void register()
	{
		//@GameRegistry.ObjectHolder("primativeevolution:test_item")
		//GameRegistry.registerItem(test_item, test_item.getUnlocalizedName().substring(5));
		registerRender(Test_item2);
	}
	
	public static void registerRenders()
	{
		//registerRender(test_item);
		registerRender(Test_item2);
	}
	
	public static void registerRender(Item item)
	{
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.MOD_ID, item.getUnlocalizedName().substring(5)), "inventory"));
		//Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	/*
	public static void registerItem(Item item) {
		
		//GameRegistry.register(item);
		//Utils.getLogger().info("Registered Item: " + item.getUnlocalizedName().substring(5));
	}
	*/


}
