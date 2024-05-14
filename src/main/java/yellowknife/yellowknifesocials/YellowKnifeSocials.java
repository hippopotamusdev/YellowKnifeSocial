package yellowknife.yellowknifesocials;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class YellowKnifeSocials extends JavaPlugin {
    Logger log = Logger.getLogger("Minecraft");

    @Override
    public void onEnable() {
        this.log.info("YellowKnifeSocials enabled, version: 1.0");
        getCommand("discord").setExecutor(new Discord());
        getCommand("vk").setExecutor(new Vk());
        getCommand("telegram").setExecutor(new Telegram());
        getCommand("socials").setExecutor(new Socials());
        getCommand("rules").setExecutor(new Rules());
        this.getConfig().options().copyDefaults(true);
        this.saveConfig();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

