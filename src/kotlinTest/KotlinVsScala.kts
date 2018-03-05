package kotlinTest

fun main1() = println("Hello1")

fun main2() = {
    println("Hello2")
}

fun main3() {
    println("Hello3")
}

println()


main1()

main2()
main2()()
main2().invoke()

main3()