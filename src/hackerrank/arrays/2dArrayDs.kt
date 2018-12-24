package hackerrank.arrays

import java.util.*


/*

Sample Input:

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0

Sample Output:

19

*/

typealias array2d = Array<Array<Int>>

private const val hourglassSize = 3
private const val array2dSize = 6

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

//    val arr = getArrayFromScan(scan)
    val arr = getDebugArray()

    val result = hourglassSum(arr)

    println(result)
}

private fun getArrayFromScan(scan: Scanner): array2d {
    val arr = array2d(6, { Array<Int>(6, { 0 }) })

    for (i in 0 until 6) {
        arr[i] = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    }
    return arr
}

private fun getDebugArray(): array2d {
    val array: array2d = Array(array2dSize) { Array(array2dSize) { 0 } }

    array[0] = intArrayOf(1, 1, 1, 0, 0, 0).toTypedArray()
    array[1] = intArrayOf(0, 1, 0, 0, 0, 0).toTypedArray()
    array[2] = intArrayOf(1, 1, 1, 0, 0, 0).toTypedArray()
    array[3] = intArrayOf(0, 0, 2, 4, 4, 0).toTypedArray()
    array[4] = intArrayOf(0, 0, 0, 2, 0, 0).toTypedArray()
    array[5] = intArrayOf(0, 0, 1, 2, 4, 0).toTypedArray()

    return array
}

private fun hourglassSum(arr: array2d): Int {
    var result: Int = Int.MIN_VALUE

    var horizontalIndex = 0
    var verticalIndex = 0

    while (arr.size - verticalIndex >= hourglassSize) {

        while (arr[0].size - horizontalIndex >= 3) {
            println("v: $verticalIndex, h: $horizontalIndex")

            var sum = 0

            for (i in horizontalIndex until horizontalIndex + hourglassSize) {
                sum += arr[verticalIndex][i]
            }

            sum += arr[verticalIndex + 1][horizontalIndex + 1]

            for (i in horizontalIndex until horizontalIndex + hourglassSize) {
                sum += arr[verticalIndex + 2][i]
            }

            if (sum > result) result = sum

            horizontalIndex++
        }

        horizontalIndex = 0
        verticalIndex++

        println()
    }

    return result
}