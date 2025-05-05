package xyz.wh1teslash.cumrefiner.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import xyz.wh1teslash.cumrefiner.Cumrefiner;
import xyz.wh1teslash.cumrefiner.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup CUM_REFINER = Registry.register(Registries.ITEM_GROUP, Identifier.of(Cumrefiner.MOD_ID, "cum_refiner_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.CUM_REFINER_BENCH)).displayName(Text.translatable("itemgroup.cumrefiner.cum_refiner_items")).entries((displayContext, entries) -> {
                entries.add(ModBlocks.CUM_REFINER_BENCH);
                entries.add(ModItems.JIZZKO_FUEL);
                entries.add(ModItems.CUM_BOTTLE);
            }).build());

    public static void registerItemGroups() {

    }
}
