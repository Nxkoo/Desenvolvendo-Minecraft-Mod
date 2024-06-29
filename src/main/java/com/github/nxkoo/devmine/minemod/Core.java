package com.github.nxkoo.devmine.minemod;

import com.github.nxkoo.devmine.minemod.lib.Env;
import com.github.nxkoo.devmine.minemod.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Env.MOD_ID, name = Env.MOD_NAME, version = Env.MOD_VERSION)
public class Core {

    @Mod.Instance
    public static Core instance = new Core();

    @SidedProxy(clientSide = "com.github.nxkoo.devmine.minemod.proxy.ClientProxy", serverSide = "com.github.nxkoo.devmine.minemod.proxy.ServerProxy")
    public static CommonProxy proxy;

    public void preInit(FMLPreInitializationEvent $e) {
        proxy.preInit($e);
    }

    public void init(FMLInitializationEvent $e) {
        proxy.init($e);
    }

    public void postInit(FMLPostInitializationEvent $e) {
        proxy.postInit($e);
    }
}
