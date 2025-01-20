package com.founded.firstmod.item;

import com.founded.firstmod.FirstMod;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems{
    public static final Item ARCANIUM_STEEL = registerItem("arcanium_steel", new Item(new Item.Settings()));
    public static final Item ARCANIUM_CHUNK = registerItem("arcanium_chunk", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(FirstMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FirstMod.LOGGER.info("Registering Mod Items For " + FirstMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ARCANIUM_STEEL);
            fabricItemGroupEntries.add(ARCANIUM_CHUNK);
        });
    }
}
