package com.github.nxkoo.devmine.minemod;

import com.github.nxkoo.devmine.minemod.lib.Env;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Env.MOD_ID, name = Env.MOD_NAME, version = Env.MOD_VERSION)
public class Core {

    @Mod.Instance
    public static Core instance = new Core();

    public void preInit(FMLPreInitializationEvent $e) {

    }

    public void init(FMLInitializationEvent $e) {

    }

    public void postInit(FMLPostInitializationEvent $e) {

    }
}
