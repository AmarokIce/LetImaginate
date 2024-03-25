package club.someoneice.imaginatetime.asm;

import club.someoneice.imaginatetime.LetsImaginate;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.IChatComponent;
import net.minecraftforge.event.ServerChatEvent;
import net.tclproject.mysteriumlib.asm.annotations.EnumReturnSetting;
import net.tclproject.mysteriumlib.asm.annotations.Fix;
import net.tclproject.mysteriumlib.asm.annotations.FixOrder;

public class PatchPlayerName {
    @Fix(allThatExtend = true, order = FixOrder.USUAL, returnSetting = EnumReturnSetting.ON_NOT_NULL)
    public static String getDisplayName(EntityPlayer player) {
        return getName(player);
    }

    @Fix(allThatExtend = true, order = FixOrder.USUAL, returnSetting = EnumReturnSetting.ON_NOT_NULL)
    public static IChatComponent func_145748_c_(EntityPlayer player) {
        String name = getName(player);
        if (name == null) return null;

        // Don't use ChatComponentText, Thermos will cannot run with it...
        return new ChatComponentTranslation(name);
    }

    @Fix(allThatExtend = true, order = FixOrder.USUAL, returnSetting = EnumReturnSetting.ON_NOT_NULL)
    public static String getCommandSenderName(EntityPlayer player) {
        return getName(player);
    }

    private static String getName(EntityPlayer player) {
        ItemStack item = player.inventory.armorInventory[3];
        if (item == null) return null;
        if (item.getItem() != LetsImaginate.HAT) return null;
        return item.getDisplayName();
    }
}
