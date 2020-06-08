package com.archaicquest.init;

import com.archaicquest.ArchaicQuest;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings("unused")
public class ModItems
{
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, ArchaicQuest.MODID);

    public static final RegistryObject<Item> JADE_STONE = ITEMS.register("jade_stone", () -> new Item(new Item.Properties().group(ArchaicQuest.ARCHAIC_ITEMS)));
    public static final RegistryObject<Item> GARNET = ITEMS.register("garnet", () -> new Item(new Item.Properties().group(ArchaicQuest.ARCHAIC_ITEMS)));
    public static final RegistryObject<Item> HEART = ITEMS.register("heart", () -> new Item(new Item.Properties().group(ArchaicQuest.ARCHAIC_ITEMS).maxStackSize(16)));
    public static final RegistryObject<Item> SKULL = ITEMS.register("skull", () -> new Item(new Item.Properties().group(ArchaicQuest.ARCHAIC_ITEMS).maxStackSize(1)));
    public static final RegistryObject<Item> SACRIFICIAL_KNIFE = ITEMS.register("sacrificial_knife", () -> new Item(new Item.Properties().group(ArchaicQuest.ARCHAIC_ITEMS).maxStackSize(1)));
    public static final RegistryObject<Item> RED_CLAY_JAR = ITEMS.register("red_clay_jar", () -> new Item(new Item.Properties().group(ArchaicQuest.ARCHAIC_ITEMS).maxStackSize(1)));
    public static final RegistryObject<Item> AZTEC_CALENDAR = ITEMS.register("aztec_calendar", () -> new Item(new Item.Properties().group(ArchaicQuest.ARCHAIC_ITEMS)));
    public static final RegistryObject<Item> GOLD_SUN_DISK = ITEMS.register("gold_sun_disk", () -> new Item(new Item.Properties().group(ArchaicQuest.ARCHAIC_ITEMS)));
}
