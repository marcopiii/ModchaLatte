package com.marcopiii.mc_color_clash;

import com.marcopiii.mc_color_clash.init.EnchantmentInit;
import com.marcopiii.mc_color_clash.init.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ColorClashMod.MOD_ID)
public class ColorClashMod {

    public static final String MOD_ID = "mc_color_clash";

    public ColorClashMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemInit.ITEMS.register(bus);
        EnchantmentInit.ENCHANTMENTS.register(bus);
    }

}
