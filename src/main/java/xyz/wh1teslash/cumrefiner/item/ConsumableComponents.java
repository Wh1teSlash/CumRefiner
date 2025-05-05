package xyz.wh1teslash.cumrefiner.item;

import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;
import net.minecraft.item.consume.UseAction;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;

import java.util.List;

public class ConsumableComponents {
    public static final ConsumableComponent POISON_FOOD_CONSUMABLE = ConsumableComponent.builder().consumeEffect(new ApplyEffectsConsumeEffect(List.of(new StatusEffectInstance[]{
            new StatusEffectInstance(StatusEffects.BLINDNESS, 10 * 20, 5),
            new StatusEffectInstance(StatusEffects.NAUSEA, 10 * 20, 5),
    }), 1.0f)).useAction(UseAction.DRINK).consumeParticles(false).sound(SoundEvents.ENTITY_GENERIC_DRINK).finishSound(RegistryEntry.of(SoundEvents.ENTITY_PLAYER_BURP)).build();
}
