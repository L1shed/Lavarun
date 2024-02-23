package me.lished.lavarun.system

import me.lished.lavarun.game.LavarunGame
import me.lished.lavarun.game.player.LavarunPlayer
import me.lished.lavarun.game.sidebar.LavarunSidebar
import net.minecord.gamesys.Gamesys
import net.minecord.gamesys.arena.Arena
import net.minecord.gamesys.game.Game
import net.minecord.gamesys.game.player.GamePlayer
import net.minecord.gamesys.game.sidebar.GameSidebar
import net.minecord.gamesys.system.DefaultSystem
import org.bukkit.entity.Player

class LavarunSystem(plugin: Gamesys) : DefaultSystem(plugin) {
    override fun createGame(plugin: Gamesys, arena: Arena): Game {
        return LavarunGame(plugin, arena)
    }

    override fun createGamePlayer(plugin: Gamesys, player: Player): GamePlayer {
        return LavarunPlayer(plugin, player)
    }

    override fun createGameSidebar(plugin: Gamesys, game: Game): GameSidebar {
        return LavarunSidebar(plugin, game)
    }

    override fun getChatPrefix(): String {
        return "&b&lLavarun &f&l●&7"
    }
}