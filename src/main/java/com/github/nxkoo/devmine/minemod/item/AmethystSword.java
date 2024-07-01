package com.github.nxkoo.devmine.minemod.item;

import com.github.nxkoo.devmine.minemod.lib.Env;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class AmethystSword extends ItemSword {
    public AmethystSword(ToolMaterial material, String unlocalizedName) {
        super(material);
        this.setCreativeTab(CreativeTabs.tabCombat);
        this.setTextureName(Env.MOD_ID + ":" + unlocalizedName);
        this.setUnlocalizedName(unlocalizedName);
    }
}
