package kontainer

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class CoffeeShop : Injektor {
    override val kontainer = kontainer {
        provide<Heater> { ElectricHeater() }
        provide<Pump> { Thermosiphon(resolve()) }
        provide { CoffeeMaker(resolve(), resolve()) }
    }

    private val coffeeMaker: CoffeeMaker  by inject()

    fun makeCoffee() {
        coffeeMaker.brew()
    }
}

fun main() {
    CoffeeShop().makeCoffee()
}

inline fun <reified T : Any> inject() = object : ReadOnlyProperty<Injektor, T> {
    override fun getValue(thisRef: Injektor, property: KProperty<*>): T = thisRef.kontainer.get()
}

inline fun kontainer(build: Builder.() -> Unit) = Kontainer(Builder().apply(build).deps)

class Kontainer(val deps: Map<Class<*>, Any>) {
    inline fun <reified T : Any> get(): T = deps[T::class.java] as T
}

interface Injektor {
    val kontainer: Kontainer
}

class Builder {
    val deps = HashMap<Class<*>, Any>()

    inline fun <reified T : Any> provide(producer: () -> T) {
        deps[T::class.java] = producer()
    }

    inline fun <reified T : Any> resolve(): T = deps[T::class.java] as T
}