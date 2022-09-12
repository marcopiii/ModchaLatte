package com.marcopiii.mc_color_clash.init;

import com.marcopiii.mc_color_clash.ColorClashMod;
import com.marcopiii.mc_color_clash.enchantments.ColorBlessing;
import com.marcopiii.mc_color_clash.enchantments.ColorBlessingEnchantment;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EnchantmentInit {
    public static final DeferredRegister<Enchantment> ENCHANTMENTS = DeferredRegister.create(
            ForgeRegistries.ENCHANTMENTS,
            ColorClashMod.MOD_ID
    );

    public static final RegistryObject<Enchantment> WHITE_BLESSING_ENCHANTMENT = ENCHANTMENTS.register(
            "white_blessing_enchantment",
            () -> new ColorBlessingEnchantment(ColorBlessing.WHITE)
    );
    public static final RegistryObject<Enchantment> BLACK_BLESSING_ENCHANTMENT = ENCHANTMENTS.register(
            "black_blessing_enchantment",
            () -> new ColorBlessingEnchantment(ColorBlessing.BLACK)
    );
    public static final RegistryObject<Enchantment> RED_BLESSING_ENCHANTMENT = ENCHANTMENTS.register(
            "red_blessing_enchantment",
            () -> new ColorBlessingEnchantment(ColorBlessing.RED)
    );
    public static final RegistryObject<Enchantment> GREEN_BLESSING_ENCHANTMENT = ENCHANTMENTS.register(
            "green_blessing_enchantment",
            () -> new ColorBlessingEnchantment(ColorBlessing.GREEN)
    );
    public static final RegistryObject<Enchantment> BLUE_BLESSING_ENCHANTMENT = ENCHANTMENTS.register(
            "blue_blessing_enchantment",
            () -> new ColorBlessingEnchantment(ColorBlessing.BLUE)
    );
}