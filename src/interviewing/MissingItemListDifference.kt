package interviewing


val a1 = arrayOf(4, 8, 12, 9, 3)
val a2 = arrayOf(4, 8, 9, 3)

fun main(vararg args: String) {
    var s1 = 0.toBigInteger()
    var s2 = 0.toBigInteger()

    a1.forEach {
        s1 = s1.plus(it.toBigInteger())
    }

    a2.forEach {
        s2 = s2.plus(it.toBigInteger())
    }

    val result = s1 - s2
    println("result: $result")
}
