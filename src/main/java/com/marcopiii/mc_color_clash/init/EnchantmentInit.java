package com.marcopiii.mc_color_clash.init;

import com.marcopiii.mc_color_clash.ColorClashMod;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EnchantmentInit {
    public static final DeferredRegister<Enchantment> ENCHANTMENTS = DeferredRegister.create(
            ForgeRegistries.ENCHANTMENTS,
            ColorClashMod.MOD_ID
    );
}