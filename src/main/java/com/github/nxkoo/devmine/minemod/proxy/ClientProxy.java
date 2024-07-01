package com.github.nxkoo.devmine.minemod.proxy;

import com.github.nxkoo.devmine.minemod.handlers.ItemHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent $e) {
        super.preInit($e);
        ItemHandler.init();
    }

    @Override
    public void init(FMLInitializationEvent $e) {
        super.init($e);
    }

    @Override
    public void postInit(FMLPostInitializationEvent $e) {
        super.postInit($e);
    }
}
