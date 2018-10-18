package kotlinp

class LazyProperty(private val initializer: () -> Int) {
    private var value: Int? = null
    val lazy: Int
        get() {
            if (value == null) value = initializer()
            return value!!
        }
}

println(LazyProperty { 45 }.lazy)