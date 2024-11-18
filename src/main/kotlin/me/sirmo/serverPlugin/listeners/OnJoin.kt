package me.sirmo.serverPlugin.listeners

import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.NamedTextColor
import net.kyori.adventure.text.format.TextDecoration
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

class OnJoin: Listener {
    @EventHandler
    fun onJoin(event: PlayerJoinEvent) {
        event.player.sendMessage("Player ${event.player.name} joined")
        when(event.player.name) {
            "hbjju" -> {
                event.player.sendMessage("Hibutschu der Stinker ist dem Spiel beigetreten!")
            }
            "EnderMo23" -> {
                event.player.server.broadcast(Component.
                    text("Bester Spieler der Welt ist dem Spiel beigetreten!")
                    .color(NamedTextColor.GREEN)
                    .decorate(TextDecoration.OBFUSCATED)
                )
            }
            "SirSam_" -> {
                event.player.server.broadcast(Component
                    .text("Nogger")
                    .color(NamedTextColor.RED))
            }
            "Blueberry1873" -> {
                event.player.server.broadcast(Component.text("Blowberry187 ist beigetreten!"))
            }
            "RedstoneKaiser" -> {
                event.player.server.broadcast(Component.text("Blowberry187 ist beigetreten!"))

            }
            "BadAtGames71" -> {
                event.player.server.broadcast(Component.text("Blowberry187 ist beigetreten!"))
            }
        }

        event.joinMessage(Component.text(""))
    }
}

