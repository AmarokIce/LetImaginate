package club.someoneice.imaginatetime.asm;

import net.tclproject.mysteriumlib.PlaceholderCoremod;

public class AsmCore extends PlaceholderCoremod {
    @Override
    public void registerFixes() {
        registerClassWithFixes(PatchPlayerName.class.getName());
    }
}
