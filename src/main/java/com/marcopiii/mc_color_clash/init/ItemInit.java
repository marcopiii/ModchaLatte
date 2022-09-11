package com.marcopiii.mc_color_clash.init;

import com.marcopiii.mc_color_clash.ColorClashMod;
import com.marcopiii.mc_color_clash.base.RabbitIronArmorMaterial;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ColorClashMod.MOD_ID);

    public static final RegistryObject<Item> RABBIT_IRON_NUGGET = ITEMS.register(
            "rabbit_iron_nugget",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC))
    );
    public static final RegistryObject<Item> RABBIT_IRON_INGOT = ITEMS.register(
            "rabbit_iron_ingot",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC))
    );

    private static final Item.Properties rabbitArmorProps = new Item.Properties()
            .setNoRepair()
            .tab(CreativeModeTab.TAB_COMBAT);

    public static final RegistryObject<ArmorItem> RABBIT_IRON_HELMET = ITEMS.register(
            "rabbit_iron_helmet",
            () -> new ArmorItem(ArmorTiers.RABBIT_IRON_ARMOR_MATERIAL, EquipmentSlot.HEAD, rabbitArmorProps)
    );
    public static final RegistryObject<ArmorItem> RABBIT_IRON_CHESTPLATE = ITEMS.register(
            "rabbit_iron_chestplate",
            () -> new ArmorItem(ArmorTiers.RABBIT_IRON_ARMOR_MATERIAL, EquipmentSlot.CHEST, rabbitArmorProps)
    );
    public static final RegistryObject<ArmorItem> RABBIT_IRON_LEGGINGS = ITEMS.register(
            "rabbit_iron_leggings",
            () -> new ArmorItem(ArmorTiers.RABBIT_IRON_ARMOR_MATERIAL, EquipmentSlot.LEGS, rabbitArmorProps)
    );
    public static final RegistryObject<ArmorItem> RABBIT_IRON_BOOTS = ITEMS.register(
            "rabbit_iron_boots",
            () -> new ArmorItem(ArmorTiers.RABBIT_IRON_ARMOR_MATERIAL, EquipmentSlot.FEET, rabbitArmorProps)
    );

    public static class ArmorTiers {
        public static final ArmorMaterial RABBIT_IRON_ARMOR_MATERIAL = new RabbitIronArmorMaterial();
    }
}
