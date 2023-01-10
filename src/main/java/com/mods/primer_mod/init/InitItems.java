package com.mods.primer_mod.init;

import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.mods.primer_mod.Fristmod.MODID;

public class InitItems {
    public static DeferredRegister<Item> ITEM = DeferredRegister.create(
            ForgeRegistries.ITEMS, MODID);
    public static RegistryObject<Item> POKEBOLA =ITEM.register(
            "pokebola",()->new EnderpearlItem(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}
