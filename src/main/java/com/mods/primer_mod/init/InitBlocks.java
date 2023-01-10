package com.mods.primer_mod.init;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.mods.primer_mod.Fristmod.MODID;

public class InitBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(
            ForgeRegistries.BLOCKS, MODID);
    public static final RegistryObject<Block> NUCLEAR = registrar("nuclear", () -> new Block(
            BlockBehaviour.Properties.of(Material.STONE)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    //METODO REGISTRAR
    private static <T extends Block>RegistryObject<T> registrar(
            String name,
            Supplier<T> supplier,
            Item.Properties propiedades
            ){
        RegistryObject<T> block = BLOCKS.register(name,supplier);
        InitItems.ITEM.register(name,() -> new BlockItem(block.get(),propiedades));
        return block;
    }
}