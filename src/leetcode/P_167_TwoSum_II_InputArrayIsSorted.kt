package leetcode

import java.util.*

private val nums = intArrayOf(2, 7, 11, 15)
private const val t = 9
// Output: [0,1]

fun main() {
    println(Arrays.toString(twoSum(nums, t)))
}

private fun twoSum(numbers: IntArray, target: Int): IntArray {
    var l = 0
    var r = numbers.size - 1

    while (l < r) {
        val sum = numbers[l] + numbers[r]
        when {
            (sum == target) -> return intArrayOf(l + 1, r + 1)
            (sum > target) -> r--
            else -> l++
        }
    }

    return intArrayOf(-1, -1)
}