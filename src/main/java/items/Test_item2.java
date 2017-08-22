package items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Test_item2 extends Item {
	
	public Test_item2(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.REDSTONE);
	}
}
