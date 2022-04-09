package skywolf46.commandannotation.v4.minecraft.annotations

@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class MinecraftCommand(val command: String)