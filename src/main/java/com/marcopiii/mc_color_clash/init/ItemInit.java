package com.marcopiii.mc_color_clash.init;

import com.marcopiii.mc_color_clash.ColorClashMod;
import com.marcopiii.mc_color_clash.base.RabbitIronArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
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

    public static final RegistryObject<ArmorItem> RABBIT_IRON_HELMET = ITEMS.register(
            "rabbit_iron_helmet",
            () -> new RabbitIronArmorItem(EquipmentSlot.HEAD)
    );
    public static final RegistryObject<ArmorItem> RABBIT_IRON_CHESTPLATE = ITEMS.register(
            "rabbit_iron_chestplate",
            () -> new RabbitIronArmorItem(EquipmentSlot.CHEST)
    );
    public static final RegistryObject<ArmorItem> RABBIT_IRON_LEGGINGS = ITEMS.register(
            "rabbit_iron_leggings",
            () -> new RabbitIronArmorItem(EquipmentSlot.LEGS)
    );
    public static final RegistryObject<ArmorItem> RABBIT_IRON_BOOTS = ITEMS.register(
            "rabbit_iron_boots",
            () -> new RabbitIronArmorItem(EquipmentSlot.FEET)
    );

}
