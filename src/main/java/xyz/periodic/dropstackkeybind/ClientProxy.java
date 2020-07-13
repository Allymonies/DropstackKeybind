package xyz.periodic.dropstackkeybind;

import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import xyz.periodic.dropstackkeybind.KeyHandler;
import xyz.periodic.dropstackkeybind.DropstackKeybind;

/**
 * Created by lukem on 9/28/2016.
 */
@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy {
    @Mod.Instance
    public static DropstackKeybind instance;
    @Override
    public void load() {
        super.load();
        FMLCommonHandler.instance().bus().register(KeyHandler.instance);
    }
}
