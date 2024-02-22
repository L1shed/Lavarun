package me.lished.lavarun

import me.lished.lavarun.commands.LavarunCommand
import me.lished.lavarun.game.Game
import me.lished.lavarun.game.GameStatus
import org.bukkit.Bukkit
import org.bukkit.Location
import org.bukkit.plugin.java.JavaPlugin

open class Lavarun : JavaPlugin() {
    var games: ArrayList<Game> = ArrayList()

    override fun onEnable() {
        games.add(Game("Test", null, GameStatus.WAITING, Location(Bukkit.getWorld("e"), 0.0, 90.0, 0.0)))

        getCommand("lavarun")!!.setExecutor(LavarunCommand())
    }
}
