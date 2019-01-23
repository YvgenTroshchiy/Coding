package leetcode

import java.util.*


private val nums1 = intArrayOf(2, 7, 11, 15)
private const val target1 = 9
// Output: [0,1]

private val nums2 = intArrayOf(3, 2, 4)
private const val target2 = 6
// Output: [1,2]

fun main(args: Array<String>) {
    println(Arrays.toString(twoSum(nums1, target1)))
    println(Arrays.toString(twoSum(nums2, target2)))
}

private fun twoSum(nums: IntArray, target: Int): IntArray {

    // key is complement
    // value is nums index
    val map = mutableMapOf<Int, Int>()

    for ((index, value) in nums.withIndex()) {

        val complement = target - value
        if (map.containsKey(value)) {
            return intArrayOf(index, map[value] ?: -1)
        }
        map[complement] = index
    }

    val lastIndex = nums.size - 1
    val lastValue = nums[lastIndex]

    if (map.containsKey(lastValue)) {
        return intArrayOf(lastIndex, map[lastValue] ?: -1)
    }

    return intArrayOf(-1, -1)
}