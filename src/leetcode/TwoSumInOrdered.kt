package leetcode

private val nums = intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
private val t = 16

fun main(args: Array<String>) {
    twoSum(nums, t)
}

private fun twoSum(nums: IntArray, target: Int) {

    for ((index, value) in nums.withIndex()) {
        val j = bSearch(index, nums.size - 1, target - value, nums)
        if (j != -1) {
            val result = intArrayOf(index, j)
            result.forEach { print("$it(${nums[it]}) ") }
            println()
        }
    }
}

private fun bSearch(left: Int, right: Int, c: Int, nums: IntArray): Int {
    var l = left
    var r = right

    while (l < r) {
        val m = (l + r) / 2

        val current = nums[m]
        when {
            (current == c) -> return m
            (current < c) -> l = m + 1
            else -> r = m - 1
        }
    }

    return -1
}

