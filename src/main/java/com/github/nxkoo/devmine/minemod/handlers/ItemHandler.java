package com.github.nxkoo.devmine.minemod.handlers;

import com.github.nxkoo.devmine.minemod.item.AmethystSword;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class ItemHandler {
    public static AmethystSword amethystSword;
    private static final Item.ToolMaterial AMETHYST_MATERIAL = EnumHelper.addToolMaterial("AMETHYST_MATERIAL", 3, 1561, 8.0F, 77.7F, 10);
    public static void init() {
        amethystSword = new AmethystSword(AMETHYST_MATERIAL, "amethyst_sword");
        GameRegistry.registerItem(amethystSword, amethystSword.getUnlocalizedName().substring(5));
    }
}
