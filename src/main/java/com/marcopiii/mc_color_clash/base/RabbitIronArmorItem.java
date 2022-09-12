package com.marcopiii.mc_color_clash.base;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import org.jetbrains.annotations.NotNull;

public class RabbitIronArmorItem extends ArmorItem {

    public static final ArmorMaterial rabbitIronArmorMaterial = new RabbitIronArmorMaterial();

    private static final Item.Properties rabbitArmorProps = new Item.Properties()
            .setNoRepair()
            .tab(CreativeModeTab.TAB_COMBAT);

    public RabbitIronArmorItem(EquipmentSlot p_40387_) {
        super(rabbitIronArmorMaterial, p_40387_, rabbitArmorProps);
    }

    @Override
    public boolean isValidRepairItem(@NotNull ItemStack p_40392_, @NotNull ItemStack p_40393_) {
        return false;
    }

}
