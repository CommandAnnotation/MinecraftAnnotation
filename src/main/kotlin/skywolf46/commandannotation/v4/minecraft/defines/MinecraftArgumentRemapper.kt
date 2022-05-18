package skywolf46.commandannotation.v4.minecraft.defines

import org.bukkit.OfflinePlayer
import org.bukkit.entity.Player
import skywolf46.commandannotation.v4.api.annotations.ArgumentRemapper
import skywolf46.extrautility.util.cachePlayerOf
import skywolf46.extrautility.util.playerOf

object MinecraftArgumentRemapper {
    @ArgumentRemapper("player")
    fun remapPlayer(name: String): Player? {
        return playerOf(name)
    }

    @ArgumentRemapper("player?")
    fun remapOfflinePlayer(name: String): OfflinePlayer? {
        val player = playerOf(name)
        if (player != null)
            return player
        val offPlayer = cachePlayerOf(name)
        if (offPlayer.hasPlayedBefore() || offPlayer.isOnline)
            return offPlayer
        return null
    }
}