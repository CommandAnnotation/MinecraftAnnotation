package skywolf46.commandannotation.v4.minecraft.impl

import skywolf46.commandannotation.v4.api.abstraction.ICommand
import skywolf46.commandannotation.v4.api.data.Arguments
import skywolf46.extrautility.core.data.ArgumentStorage
import skywolf46.extrautility.core.util.ReflectionUtil

class MinecraftCommandInstance(worker: ReflectionUtil.CallableFunction) : ICommand {
    private val executor = worker.asAutoMatchingFunction()
    override fun getPriority(): Int {
        return 0
    }

    override fun invokeCommand(arguments: Arguments) {
        executor.execute(
            ArgumentStorage()
                .add(arguments)
                .addProxy(arguments.parameters)
        )
    }
}