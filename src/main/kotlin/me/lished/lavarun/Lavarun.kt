package me.lished.lavarun

import me.lished.lavarun.game.player.LavarunPlayerListener
import me.lished.lavarun.system.LavarunSystem
import net.minecord.gamesys.Gamesys
import net.minecord.gamesys.game.Game
import net.minecord.gamesys.system.System
import org.bukkit.Bukkit
import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.bukkit.util.Vector
import java.io.File

class Lavarun : Gamesys() {
    override val system: System by lazy { LavarunSystem(this) }

    override fun onEnable() {
        super.onEnable()

        logger.logInfo("Plugin created by §eLished §rusing §aGamesys")
        Bukkit.getPluginManager().registerEvents(LavarunPlayerListener(this), this)

        val spawn = hashMapOf(
            "test" to arrayListOf(Vector(0, 90, 0))
        )

        system.createGame(this, system.createArena("test", File("world"), spawn))
    }

//    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>?): Boolean {
//        val gamePlayer = system.createGamePlayer(this, sender as Player)
//        gamePlayer.game = game
//        game.onGameStart()
//        return super.onCommand(sender, command, label, args)
//    }
}
