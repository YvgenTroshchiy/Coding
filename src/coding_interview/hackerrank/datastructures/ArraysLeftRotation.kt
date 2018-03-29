package codinginterview.hackerrank.dataStructures

import java.util.*


/*
5 4

1 2 3 4 5  // Sample Input
5 1 2 3 4  // Sample Output
*/

private var array = intArrayOf(1, 2, 3, 4, 5)
private var offset = 4

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    offset = scanner.nextInt()

    // Check input ranges
    if (n !in 1..Math.pow(10.toDouble(), 5.toDouble()).toInt() || offset !in 1..n) return

    // Receive values
    val a = IntArray(n)
    for (i in 0 until n)
        a[i] = scanner.nextInt()

    array = a
    val result = arrayLeftRotation(array, offset)

//    printForDebug(result)
    printForHackerrank(result)
}

private fun arrayLeftRotation(array: IntArray, offset: Int): IntArray {
    val size = array.size

    val result = IntArray(size)

    for (i in size - 1 downTo 0) {
        var newIndex = i - offset
        if (newIndex < 0) newIndex = size - Math.abs(newIndex)

        result[newIndex] = array[i]

//        println("$i, $newIndex")
    }

    return result
}

private fun printForDebug(result: IntArray) {
    array.printWithSpace()
    result.printWithSpace()
}

private fun printForHackerrank(result: IntArray) = result.print()

private fun IntArray.printWithSpace() = println(Arrays.toString(this))

private fun IntArray.print() {
    for (i in 0 until size)
        print("${get(i)} ")
}