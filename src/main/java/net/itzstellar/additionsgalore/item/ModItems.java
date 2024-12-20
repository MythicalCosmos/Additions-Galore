package net.itzstellar.additionsgalore.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.itzstellar.additionsgalore.AdditionsGalore;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {

    public static final Item MORGANITE = registerItem("morganite", new Item(new Item.Settings()));
    public static final Item RAW_MORGANITE = registerItem("raw_morganite", new Item(new Item.Settings()));
    public static final Item SCYTHE = registerItem("scythe", new Item(new Item.Settings()));


        public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AdditionsGalore.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AdditionsGalore.LOGGER.info("Registering Mod Items for " + AdditionsGalore.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(SCYTHE);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(MORGANITE);
            entries.add(RAW_MORGANITE);
        });
    }
}
