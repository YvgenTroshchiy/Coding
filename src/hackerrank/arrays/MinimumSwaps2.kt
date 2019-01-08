package hackerrank.arrays

import java.util.*


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    val res = minimumSwaps(arr)

    println(res)
}

// Complete the minimumSwaps function below.
fun minimumSwaps(arr: Array<Int>): Int {
    return 0
}
