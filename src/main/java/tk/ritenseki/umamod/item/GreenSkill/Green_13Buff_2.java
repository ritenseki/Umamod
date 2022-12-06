package tk.ritenseki.umamod.item.GreenSkill;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import tk.ritenseki.umamod.Group.GroupInitialize;

public class Green_13Buff_2 extends Item{
    private static final EffectInstance effect = new EffectInstance(
            Effects.SPEED, 32767, 2);
    private static Food food = (new Food.Builder())
            .effect(effect, 1)
            .build();
    public Green_13Buff_2() {
        super(new Properties()
                .group(GroupInitialize.itemGroup)
                .food(food)
        );
    }
}
