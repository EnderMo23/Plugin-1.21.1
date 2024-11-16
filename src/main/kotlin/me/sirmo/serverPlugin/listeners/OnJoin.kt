package me.sirmo.serverPlugin.listeners

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerItemBreakEvent
import org.bukkit.event.player.PlayerJoinEvent

class OnJoin: Listener {
    @EventHandler
    fun onJoin(event: PlayerJoinEvent) {
        event.player.sendMessage("Player ${event.player.name} joined")
    }
}