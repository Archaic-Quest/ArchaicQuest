package com.archaicquest.init;

import com.archaicquest.ArchaicQuest;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings("unused")
public class ModItems
{
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, ArchaicQuest.MODID);

    // Example Item - Delete comment later
    public static final RegistryObject<Item> JADE_STONE = ITEMS.register("jade_stone", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
}
