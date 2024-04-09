package dev.neurs.healthdisplay;

import org.bukkit.plugin.java.JavaPlugin;

public final class HealthDisplay extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new HealthDisplayPlayerEvents(), this);
    }

    @Override
    public void onDisable() {
    }
}
