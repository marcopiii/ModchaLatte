package com.marcopiii.mc_color_clash.base;

import com.marcopiii.mc_color_clash.ColorClashMod;
import com.marcopiii.mc_color_clash.init.ItemInit;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

public record RabbitIronArmorMaterial() implements ArmorMaterial {

    @Override
    public int getDurabilityForSlot(EquipmentSlot slot) {
        int ironDurability = ArmorMaterials.IRON.getDurabilityForSlot(slot);
        int diamondDurability = ArmorMaterials.DIAMOND.getDurabilityForSlot(slot);
        return (ironDurability + diamondDurability) / 2;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot slot) {
        return ArmorMaterials.DIAMOND.getDefenseForSlot(slot) + 2;
    }

    @Override
    public int getEnchantmentValue() {
        return ArmorMaterials.DIAMOND.getEnchantmentValue();
    }

    @Override
    public @NotNull SoundEvent getEquipSound() {
        return SoundEvents.RABBIT_AMBIENT;
    }

    @Override
    public @NotNull Ingredient getRepairIngredient() {
        return Ingredient.of(ItemInit.RABBIT_IRON_INGOT.get());
    }

    @Override
    public @NotNull String getName() {
        return ColorClashMod.MOD_ID + ":rabbit_iron_armor_material";
    }

    @Override
    public float getToughness() {
        return ArmorMaterials.NETHERITE.getToughness() + 1;
    }

    @Override
    public float getKnockbackResistance() {
        return ArmorMaterials.IRON.getKnockbackResistance();
    }
}
