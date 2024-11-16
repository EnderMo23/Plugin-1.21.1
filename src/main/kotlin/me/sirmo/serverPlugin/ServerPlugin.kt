package me.sirmo.serverPlugin

import me.sirmo.serverPlugin.listeners.OnJoin
import org.bukkit.plugin.java.JavaPlugin

class ServerPlugin : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        logger.info("Plugin loaded!!!")
        server.pluginManager.registerEvents(OnJoin(), this);
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }


}


