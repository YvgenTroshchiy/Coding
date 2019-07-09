package kotlin_

import kotlin.reflect.KProperty

class Example {
    var p: String by Delegate()
}

fun main(args: Array<String>) {
    val e = Example()
    println(e.p)
}


class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "thisRef: ${thisRef!!::class.java.simpleName}, property: '${property.javaClass}' property.name: '${property.name}'"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name}' in $thisRef.")
    }
}