package me.lished.lavarun

import me.lished.lavarun.game.player.LavarunPlayerListener
import me.lished.lavarun.system.LavarunSystem
import net.minecord.gamesys.Gamesys
import net.minecord.gamesys.game.Game
import net.minecord.gamesys.system.System
import org.bukkit.Bukkit
import org.bukkit.Location
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

        gamePortalManager.portal = system.createGamePortal(this, Location(Bukkit.getWorld("world"), 340.0,90.0,84.0))
        system.createGame(this, system.createArena("arena1", File(dataFolder,"/arenas/arena11"), spawn))
//        system.createGamePortal(this, Location(Bukkit.getWorld("world"), 0.0,90.0,0.0))
    }

//    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>?): Boolean {
//        val gamePlayer = system.createGamePlayer(this, sender as Player)
//        gamePlayer.game = game
//        game.onGameStart()
//        return super.onCommand(sender, command, label, args)
//    }
}
