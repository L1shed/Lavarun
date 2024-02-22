package me.lished.lavarun.commands

import me.lished.lavarun.Lavarun
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class LavarunCommand : CommandExecutor, Lavarun() {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>?): Boolean {
        val player = sender as Player

        games.get()

        return false
    }
}