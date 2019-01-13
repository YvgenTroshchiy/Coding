package hackerrank.then_days_of_statistics.MeanMedianAndMode

import java.util.*

/*
Sample Input

10
64630 11735 14216 99233 14470 4978 73429 38120 51135 67060

Sample Output

43900.6
44627.5
4978
*/
fun main2(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().trim().toInt()
    val a = scan.nextLine().split(" ").map { it.toInt() }.toTypedArray()

    println("n: $n")
    println("a: ${Arrays.toString(a)}")
}

fun main(args: Array<String>) {
    val a = arrayOf(64630, 11735, 14216, 99233, 14470, 4978, 73429, 38120, 51135, 67060)
    solution(a)
}

private fun solution(a: Array<Int>) {
    val n = a.size

    val mean: Float = a.sum().toFloat() / n
    println(mean)

    val aSorted = a.sorted()

    val median: Float = if (n % 2 == 0) {
        //even
        (aSorted[n / 2] + aSorted[n / 2 - 1]).toFloat() / 2

    } else {
        //odd
        aSorted[n / 2].toFloat()
    }

    println(median)

    a
}