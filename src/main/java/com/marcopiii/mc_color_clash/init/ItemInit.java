package com.marcopiii.mc_color_clash.init;

import com.marcopiii.mc_color_clash.ColorClashMod;
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

}
