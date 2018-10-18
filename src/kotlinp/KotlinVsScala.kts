package kotlinp

fun main1() = println("Hello1")

fun main2() = {
    println("Hello2")
}

fun main3() {
    println("Hello3")
}

main1()
println()

main2() // Doesn't print
main2()()
main2().invoke()
println()

main3()