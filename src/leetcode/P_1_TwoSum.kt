package leetcode

private val nums1 = intArrayOf(2, 7, 11, 15)
private const val target1 = 9
// Output: [0,1]

private val nums2 = intArrayOf(3, 2, 4)
private const val target2 = 6
// Output: [1,2]

private val nums3 = intArrayOf(2, 3, 4)
private const val target3 = 6
// Output: [0,2]

// 1. Two Sum
fun main() {
    println(twoSum(nums1, target1).contentToString())
    println(twoSum(nums2, target2).contentToString())
    println(twoSum(nums3, target3).contentToString())
}

//The complement is the amount you must add to something to make it "whole".
private fun twoSum(nums: IntArray, target: Int): IntArray {
    // key is complement
    // value is nums index
    val map = mutableMapOf<Int, Int>()

    for ((index, value) in nums.withIndex()) {
        val complement = target - value

        if (map.containsKey(value)) {
            return intArrayOf(map[value] ?: -1, index)
        } else {
            map[complement] = index
        }
    }

    return intArrayOf(-1, -1)
}