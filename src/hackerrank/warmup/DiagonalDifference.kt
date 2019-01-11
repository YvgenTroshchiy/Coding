package hackerrank.warmup

fun main(args: Array<String>) {
    val a = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(4, 5, 6),
        arrayOf(9, 8, 9)
    )
    println(diagonalDifference(a))
}

// Complete the diagonalDifference function below.
fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var sum1 = 0
    var sum2 = 0

    val n = arr.size
    for (i in 0 until n) {
        sum1 += arr[i][i]
        sum2 += arr[(n - 1) - i][i]
    }

    return Math.abs(sum1 - sum2)
}