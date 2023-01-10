package com.mods.primer_mod;

import com.mods.primer_mod.init.InitBlocks;
import com.mods.primer_mod.init.InitItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Fristmod.MODID)
public class Fristmod {
    static public final String MODID = "primer_mod";

    public Fristmod()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        InitItems.ITEM.register(bus);
        InitBlocks.BLOCKS.register(bus);
    }
}
