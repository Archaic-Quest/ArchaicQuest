package com.archaicquest;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(ArchaicQuest.MODID)
public class ArchaicQuest
{
    public static final String MODID = "archaicquest";

    public ArchaicQuest()
    {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
