package hackerrank.warmup

fun main(args: Array<String>) {
    staircase(6)
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