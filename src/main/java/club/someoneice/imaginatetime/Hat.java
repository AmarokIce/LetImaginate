package club.someoneice.imaginatetime;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraftforge.common.util.EnumHelper;

public class Hat extends ItemArmor {
    public static ItemArmor.ArmorMaterial Paper = EnumHelper.addArmorMaterial("paper", 15, new int[] { 1, 1, 1, 1 }, 50);

    public Hat() {
        super(Paper, 0, 0);
        this.setUnlocalizedName("paper_hat");
        this.setTextureName(LetsImaginate.MODID + ":paper_hat");
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        return LetsImaginate.MODID + ":textures/armor/paper_hat.png";
    }

    @SideOnly(Side.CLIENT)
    @Override
    public IIcon getIconFromDamageForRenderPass(int p_77618_1_, int p_77618_2_) {
        return this.getIconFromDamage(p_77618_1_);
    }
}
