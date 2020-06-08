package com.archaicquest;

import com.archaicquest.init.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ArchaicQuest.MODID)
public class ArchaicQuest
{
    public static final String MODID = "archaicquest";

    public ArchaicQuest()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Registries
        ModItems.ITEMS.register(modEventBus);
        // ModBlocks.BLOCKS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
