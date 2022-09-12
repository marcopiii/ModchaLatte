package com.marcopiii.mc_color_clash.enchantments;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import org.jetbrains.annotations.NotNull;

public class ColorBlessingEnchantment extends Enchantment {
    private final ColorBlessing color;

    public ColorBlessingEnchantment(ColorBlessing color) {
        super(
                Rarity.VERY_RARE,
                EnchantmentCategory.ARMOR,
                new EquipmentSlot[] {
                        EquipmentSlot.HEAD,
                        EquipmentSlot.LEGS,
                        EquipmentSlot.CHEST,
                        EquipmentSlot.HEAD
                }
        );
        this.color = color;
    }

    @Override
    public boolean isTreasureOnly() {
        return true;
    }

    @Override
    public boolean isAllowedOnBooks() {
        return false;
    }

    @Override
    public boolean checkCompatibility(@NotNull Enchantment enchantment) {
        return !(enchantment instanceof ColorBlessingEnchantment);
    }
}