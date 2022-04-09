package skywolf46.commandannotation.v4.minecraft.defines

import skywolf46.commandannotation.v4.api.annotations.define.ArgumentGenerator
import skywolf46.commandannotation.v4.api.data.Arguments
import skywolf46.commandannotation.v4.minecraft.impl.MinecraftCommandInstance
import skywolf46.extrautility.data.ArgumentStorage

object MinecraftArgumentGenerator {
    @ArgumentGenerator(bindAt = [MinecraftCommandInstance::class])
    fun generateArguments(args: ArgumentStorage, command: String): Arguments {
        val split = command.split(" ")
        return Arguments(split.toTypedArray(), args)
    }

}