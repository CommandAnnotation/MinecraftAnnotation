package skywolf46.commandannotation.v4.minecraft.data

import skywolf46.commandannotation.v4.api.abstraction.ICommandInfo

class MinecraftCommandInfo(private val commands: List<String>) : ICommandInfo {
    override fun getCommand(): List<String> {
        return commands
    }
}