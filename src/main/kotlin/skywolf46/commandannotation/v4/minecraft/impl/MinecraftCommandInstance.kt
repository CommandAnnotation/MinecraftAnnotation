package skywolf46.commandannotation.v4.minecraft.impl

import skywolf46.commandannotation.v4.api.abstraction.ICommand
import skywolf46.commandannotation.v4.api.data.Arguments

class MinecraftCommandInstance : ICommand {
    override fun getPriority(): Int {
        return 0
    }

    override fun invokeCommand(arguments: Arguments) {
        TODO("Not yet implemented")
    }
}