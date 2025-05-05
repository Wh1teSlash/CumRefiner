package xyz.wh1teslash.cumrefiner.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.consume.UseAction;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.world.World;

public class CumBottleItem extends Item {
    public CumBottleItem(Settings settings) {
        super(settings);
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        ItemStack result = super.finishUsing(stack, world, user);

        if (!world.isClient && user instanceof ServerPlayerEntity player) {
            if (!player.getAbilities().creativeMode) {
                ItemStack glassBottle = new ItemStack(Items.GLASS_BOTTLE);

                stack.decrement(1);

                if (stack.isEmpty()) {
                    player.getInventory().setStack(player.getInventory().selectedSlot, glassBottle);
                } else {
                    if (!player.getInventory().insertStack(glassBottle)) {
                        player.dropItem(glassBottle, false, false);
                    }
                }
            }
        }

        return result;
    }
}
