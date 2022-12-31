package com.mods.primer_mod.init;

import com.mods.primer_mod.Fristmod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.projectile.ThrownEnderpearl;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.TntBlock;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.RegistryObject;

public class InitItems {
    public static DeferredRegister<Item> ITEM = DeferredRegister.create(ForgeRegistries.ITEMS, Fristmod.MODID);
    public static RegistryObject<Item> POKEBOLA =ITEM.register("pokebola",()->new EnderpearlItem(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static RegistryObject<Item> NUCLEAR = ITEM.register("nuclear",() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}
