package net.decentstudio;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = PostgreSqlLib.MODID, version = PostgreSqlLib.VERSION)
public class PostgreSqlLib {
    public static final String MODID = "postgresql_lib";
    public static final String VERSION = "1.0";
    
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
    }
}
