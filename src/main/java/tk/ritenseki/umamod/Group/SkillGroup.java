package tk.ritenseki.umamod.Group;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import tk.ritenseki.umamod.item.ItemRegistry;

public class SkillGroup extends ItemGroup {
    public SkillGroup(){
        super("UmaSkill");
    }
    @Override
    public ItemStack createIcon(){
        return new ItemStack(ItemRegistry.gold_speed2.get());
    }
}