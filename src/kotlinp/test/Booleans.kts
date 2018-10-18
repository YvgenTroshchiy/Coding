package kotlinp.test

fun main2() {
    var b1 = false || false && false
    println("b1: ${b1}")

    var b2 = false || false && true
    println("b2: ${b2}")


    var b3 = true || false && false
    println("b3: ${b3}")

    var b4 = true || false && true
    println("b4: ${b4}")

    var b5 = false || false && true
    println("b5: ${b5}")
}

main2()