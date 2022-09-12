package com.marcopiii.mc_color_clash.enchantments;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import org.jetbrains.annotations.NotNull;
import java.util.Arrays;

public class ColorBlessingEnchantment extends Enchantment {
    private final ColorBlessing color;

    static EnchantmentCategory COLOR_BLESSING_ENCHANTMENT_CATEGORY = EnchantmentCategory.create(
            "color_blessing",
            item -> {
                if (item instanceof ArmorItem) {
                    EquipmentSlot slot = ((ArmorItem) item).getSlot();
                    return Arrays.asList(
                            EquipmentSlot.HEAD,
                            EquipmentSlot.CHEST,
                            EquipmentSlot.LEGS,
                            EquipmentSlot.FEET
                    ).contains(slot);
                } else {
                    return item instanceof SwordItem
                        || item instanceof AxeItem
                        || item instanceof CrossbowItem
                        || item instanceof BowItem;
                }
            }
    );

    public ColorBlessingEnchantment(ColorBlessing color) {
        super(
                Rarity.VERY_RARE,
                COLOR_BLESSING_ENCHANTMENT_CATEGORY,
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