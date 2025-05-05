package xyz.wh1teslash.cumrefiner.item;

import net.fabricmc.fabric.api.registry.FuelRegistryEvents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import xyz.wh1teslash.cumrefiner.Cumrefiner;
import xyz.wh1teslash.cumrefiner.item.custom.CumBottleItem;

public class ModItems {

    public static final Item JIZZKO_FUEL = registerItem("jizzko_fuel", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Cumrefiner.MOD_ID,"jizzko_fuel")))));
    public static final Item CUM_BOTTLE = registerItem("cum_bottle", new CumBottleItem(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Cumrefiner.MOD_ID,"cum_bottle"))).maxCount(1).food(ModFoodComponents.CUM_BOTTLE, ConsumableComponents.POISON_FOOD_CONSUMABLE).rarity(Rarity.EPIC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Cumrefiner.MOD_ID, name), item);
    }

    private static void registerFuelItems() {
        FuelRegistryEvents.BUILD.register((builder, context) -> {
            builder.add(ModItems.JIZZKO_FUEL, 32500);
        });
    }

    public static void registerModItems() {
        Cumrefiner.LOGGER.info("Registering Mod Items for " + Cumrefiner.MOD_ID);
        registerFuelItems();
    }
}
