package gadgettvman.github.io.MnPII;

import org.bukkit.plugin.java.JavaPlugin;

public class MnPII extends JavaPlugin {
    
    @Override
    public void onEnable(){
        getServer().getPluginManager().registerEvents(new MnPIIBlockBreakListener(this), this);
        this.getLogger().info("is now enabled");
    }
 
    @Override
    public void onDisable(){
        this.getLogger().info("has been disabled");
    }
}
