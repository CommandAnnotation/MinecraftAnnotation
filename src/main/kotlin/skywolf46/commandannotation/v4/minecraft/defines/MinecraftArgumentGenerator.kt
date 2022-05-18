package skywolf46.commandannotation.v4.minecraft.defines

import skywolf46.commandannotation.v4.api.annotations.define.AnnotationConverter
import skywolf46.commandannotation.v4.api.annotations.define.ArgumentGenerator
import skywolf46.commandannotation.v4.api.annotations.define.CommandGenerator
import skywolf46.commandannotation.v4.api.data.Arguments
import skywolf46.commandannotation.v4.minecraft.annotations.MinecraftCommand
import skywolf46.commandannotation.v4.minecraft.data.MinecraftCommandInfo
import skywolf46.commandannotation.v4.minecraft.impl.MinecraftCommandInstance
import skywolf46.extrautility.data.ArgumentStorage

object MinecraftArgumentGenerator {
    @ArgumentGenerator(bindAt = [MinecraftCommand::class])
    fun generateArguments(args: ArgumentStorage, command: String): Arguments {
        val split = command.split(" ")
        return Arguments(split.toTypedArray(), args)
    }

    @CommandGenerator(commandAnnotation = MinecraftCommand::class)
    fun generateCommand(args: Arguments): MinecraftCommandInstance {
        return MinecraftCommandInstance()
    }

    @AnnotationConverter
    fun convertAnnotation(annotation: MinecraftCommand) : MinecraftCommandInfo {
        return MinecraftCommandInfo(annotation.value.toList())
    }

}