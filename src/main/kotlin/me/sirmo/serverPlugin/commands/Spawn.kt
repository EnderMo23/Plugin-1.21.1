package me.sirmo.serverPlugin.commands

import io.papermc.paper.command.brigadier.BasicCommand
import io.papermc.paper.command.brigadier.CommandSourceStack


class Spawn: BasicCommand {
    override fun execute(stack: CommandSourceStack, args: Array<String>) {
        if (args.size == 1 && args[0].equals("spawn", ignoreCase = true)) {
            stack.sender.sendRichMessage("<rainbow>Fun activated!")
        }
    }
}