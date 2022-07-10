package skywolf46.commandannotation.v4.minecraft

import org.bukkit.plugin.java.JavaPlugin
import skywolf46.commandannotation.v4.CommandAnnotationCore
import skywolf46.extrautil.bukkit.annotations.AllowScanning
import skywolf46.extrautility.core.util.bindPrefix
import skywolf46.extrautility.core.util.log

@AllowScanning
class CommandAnnotationPlugin : JavaPlugin() {
    override fun onEnable() {
        bindPrefix("skywolf46.commandannotation.v4.minecraft", "§eCommandAnnotation ${description.version} §7| §f")
        log("Starting...")
        val time = System.currentTimeMillis()
        CommandAnnotationCore.init()
        log("Initialization complete")
    }
}