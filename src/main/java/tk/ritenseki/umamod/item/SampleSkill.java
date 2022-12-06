package tk.ritenseki.umamod.item;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import tk.ritenseki.umamod.Group.GroupInitialize;

import javax.annotation.Nullable;
import java.time.Duration;

public abstract class SampleSkill extends Item {

    static Effect setting;
    static int duration, amplifier;
    private static EffectInstance effect = new EffectInstance(
            setting, duration, amplifier);
    private static Food food = (new Food.Builder())
            .effect(effect, 1)
            .build();

    public SampleSkill() {
        super(new Properties()
                .group(GroupInitialize.itemGroup)
                .food(food)
        );
    }


}
