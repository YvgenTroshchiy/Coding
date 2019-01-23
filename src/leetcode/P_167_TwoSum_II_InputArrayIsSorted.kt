package leetcode

import java.util.*

private val nums1 = intArrayOf(2, 7, 11, 15)
private val t1 = 9 // [1,2]

private val nums2 = intArrayOf(3, 2, 4)
private val t2 = 6 // [1,3]


fun main(args: Array<String>) {
    println(Arrays.toString(twoSum(nums1, t1)))
    println(Arrays.toString(twoSum(nums2, t2)))
}

private fun twoSum(numbers: IntArray, target: Int): IntArray {
    for ((index, value) in numbers.withIndex()) {
        val j = bSearch(index, numbers.size - 1, target - value, numbers)
        if (j != -1) {
            val result = intArrayOf(index + 1, j + 1)
//            result.forEach { print("$it(${numbers[it]}) ") }
//            println()
            return result
        }
    }

    return intArrayOf(-1, -1)
}

private fun bSearch(left: Int, right: Int, complement: Int, numbers: IntArray): Int {
    var l = left
    var r = right

    while (l < r) {
        val m = (l + r) / 2

        val current = numbers[m]
        when {
            (current == complement) -> return m
            (current < complement) -> l = m + 1
            else -> r = m - 1
        }
    }

    return -1
}

