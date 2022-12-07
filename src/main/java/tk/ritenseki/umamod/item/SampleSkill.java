package tk.ritenseki.umamod.item;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import tk.ritenseki.umamod.Group.GroupInitialize;

import javax.annotation.Nullable;
import java.time.Duration;

public  class SampleSkill extends Item {

    protected static Effect setting;
    protected static int duration, amplifier;
    public void setEffect(Effect setting, int duration, int amplifier){
        SampleSkill.setting = setting;
        SampleSkill.duration = duration;
        SampleSkill.amplifier = amplifier;
    }
    private static final EffectInstance effect = new EffectInstance(
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
