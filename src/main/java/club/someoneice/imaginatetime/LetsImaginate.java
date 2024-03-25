package club.someoneice.imaginatetime;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.init.Items;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerEvent;

@Mod(modid = LetsImaginate.MODID)
public class LetsImaginate {
    public static final String MODID = "letsimaginate";

    public static final ItemArmor HAT = new Hat();

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        GameRegistry.registerItem(HAT, "paper_hat", MODID);

        GameRegistry.addRecipe(new ItemStack(HAT), "PPP", "P P", "P P", 'P', Items.paper);
    }
}
