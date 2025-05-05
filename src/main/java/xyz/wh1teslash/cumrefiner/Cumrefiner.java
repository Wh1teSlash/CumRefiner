package xyz.wh1teslash.cumrefiner;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FuelRegistryEvents;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xyz.wh1teslash.cumrefiner.block.ModBlocks;
import xyz.wh1teslash.cumrefiner.item.ModItemGroups;
import xyz.wh1teslash.cumrefiner.item.ModItems;

public class Cumrefiner implements ModInitializer {

    public static final String MOD_ID = "cumrefiner";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        ModItemGroups.registerItemGroups();
    }
}
