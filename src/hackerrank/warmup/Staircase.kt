package hackerrank.warmup

fun main(args: Array<String>) {

    for (i in 0..0) {
        println("dots")
    }

    for (i in 0 until 0) {
        println("until")
    }

    staircase(6)
    println()
    staircase2(6)
}

fun staircase(n: Int): Unit {
    for (i in 1..n) {
        for (s in 0 until n - i) {
            print(" ")
        }
        for (l in 0 until i) {
            print("#")
        }

        if (i < n) println()
    }
}

fun staircase2(n: Int): Unit {
    for (i in 0 until n) {
        for (s in 0 until (n - 1) - i) {
            print(" ")
        }
        for (l in 0..i) {
            print("#")
        }

        if (i < n - 1) println()
    }
}