package hackerrank.warmup

fun main(args: Array<String>) {
    val tc0 = arrayOf(1, 2, 3, 4, 5)

    // 1640793344 2199437821
    val tc4 = arrayOf(769082435, 210437958, 673982045, 375809214, 380564127)
    miniMaxSum(tc4)
}

fun miniMaxSum(arr: Array<Int>): Unit {
    arr.sort()

    val min = arr.take(4).map { it.toLong() }.sum()
    val max = arr.takeLast(4).map { it.toLong() }.sum()

    println("$min $max")
}