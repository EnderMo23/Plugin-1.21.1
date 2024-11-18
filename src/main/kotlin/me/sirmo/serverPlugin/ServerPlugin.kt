package me.sirmo.serverPlugin

import io.papermc.paper.command.brigadier.Commands
import io.papermc.paper.plugin.lifecycle.event.LifecycleEventManager
import io.papermc.paper.plugin.lifecycle.event.registrar.ReloadableRegistrarEvent
import io.papermc.paper.plugin.lifecycle.event.types.LifecycleEvents
import me.sirmo.serverPlugin.commands.Spawn
import me.sirmo.serverPlugin.listeners.OnJoin
import org.bukkit.plugin.Plugin
import org.bukkit.plugin.java.JavaPlugin


class ServerPlugin : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        logger.info("Plugin loaded!!!")
        server.pluginManager.registerEvents(OnJoin(), this);

        val manager: LifecycleEventManager<Plugin> = this.getLifecycleManager()
        manager.registerEventHandler(
            LifecycleEvents.COMMANDS
        ) { event: ReloadableRegistrarEvent<Commands> ->
            val commands = event.registrar()
            commands.register("spawn", "some help description string", Spawn())
        }
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }


}


