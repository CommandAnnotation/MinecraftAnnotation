package skywolf46.commandannotation.v4.minecraft.listener

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerCommandPreprocessEvent
import skywolf46.commandannotation.v4.api.util.CommandUtil
import skywolf46.commandannotation.v4.minecraft.annotations.MinecraftCommand
import skywolf46.extrautility.core.data.ArgumentStorage

class BukkitEventListener : Listener {
    @EventHandler
    fun PlayerCommandPreprocessEvent.onCommand() {
        val storage = ArgumentStorage()
        storage.add(player)
        if (CommandUtil.triggerCommand(MinecraftCommand::class, this.message, storage)) {
            isCancelled = true
        }
    }
}