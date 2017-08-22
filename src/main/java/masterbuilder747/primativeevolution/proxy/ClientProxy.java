package masterbuilder747.primativeevolution.proxy;

import masterbuilder747.primativeevolution.init.ExtraItems;

public class ClientProxy extends CommonProxy{
	@Override
	public void registerRenders() {
		ExtraItems.registerRenders();
	}
}
