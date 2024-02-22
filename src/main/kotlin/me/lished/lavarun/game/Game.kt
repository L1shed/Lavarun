package me.lished.lavarun.game

import org.bukkit.Location
import org.bukkit.World
import org.bukkit.entity.Player

data class Game(
    val name: String,
    var players: List<Player>?,
    var status: GameStatus = GameStatus.WAITING,
//    val world: World,
    val spawn: Location
)

enum class GameStatus {
    OFF,
    WAITING,
    STARTING,
    PLAYING
}
