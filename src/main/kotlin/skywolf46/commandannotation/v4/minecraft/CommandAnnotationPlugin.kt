package skywolf46.commandannotation.v4.minecraft

import org.bukkit.plugin.java.JavaPlugin
import skywolf46.commandannotation.v4.CommandAnnotationCore
import skywolf46.commandannotation.v4.initializer.CommandCore
import skywolf46.extrautility.annotations.AllowScanning
import skywolf46.extrautility.util.log

@AllowScanning
class CommandAnnotationPlugin : JavaPlugin() {

    override fun onEnable() {
        log("§eCommandAnnotation ${description.version} §7| §fStarting...")
        val time = System.currentTimeMillis()
        CommandAnnotationCore.init()
        log("§eCommandAnnotation ${description.version} §7| Initialization complete")
    }
}