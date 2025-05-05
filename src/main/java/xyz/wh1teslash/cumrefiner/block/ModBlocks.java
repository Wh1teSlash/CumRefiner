package xyz.wh1teslash.cumrefiner.block;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import xyz.wh1teslash.cumrefiner.Cumrefiner;

public class ModBlocks {
    public static final Block CUM_REFINER_BENCH = registerBlock("cum_refiner_bench", AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.NETHERITE));

    private static Block registerBlock(String name, AbstractBlock.Settings blockSettings) {
        RegistryKey<Block> key = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Cumrefiner.MOD_ID, name));
        Block block = new Block(blockSettings.registryKey(key));
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, key, block);
    }

    private static void registerBlockItem(String name, Block block) {
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Cumrefiner.MOD_ID, name));
        BlockItem item = new BlockItem(block, new Item.Settings().registryKey(key));
        Registry.register(Registries.ITEM, key, item);
    }

    public static void customFunctional(FabricItemGroupEntries entries) {
        entries.add(CUM_REFINER_BENCH);
    }

    public static void registerModBlocks() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(ModBlocks::customFunctional);
    }
}
