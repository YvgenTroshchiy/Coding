package kontainer

fun main() {
    val kontainer = kontainer {
        provide<Heater> { ElectricHeater() }
        provide<Pump> { Thermosiphon(resolve()) }
        provide { CoffeeMaker(resolve(), resolve()) }
    }

    val coffeMaker: CoffeeMaker = kontainer.get()
    coffeMaker.brew()
}

inline fun kontainer(build: Builder.() -> Unit) =
        Kontainer(Builder().apply(build).deps)

class Kontainer(val deps: Map<Class<*>, Any>) {
    inline fun <reified T : Any> get(): T = deps[T::class.java] as T
}

class Builder {
    val deps = HashMap<Class<*>, Any>()

    inline fun <reified T : Any> provide(producer: () -> T) {
        deps[T::class.java] = producer()
    }

    inline fun <reified T : Any> resolve(): T = deps[T::class.java] as T
}