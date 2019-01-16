package leetcode


private val nums1 = intArrayOf(2, 7, 11, 15)
private val t1 = 9 // [0,1]

private val nums2 = intArrayOf(3, 2, 4)
private val t2 = 6 // [1,2]

fun main(args: Array<String>) {
    val result = twoSum(nums2, t2)
    result.forEach { print("$it ") }
}

private fun twoSum(nums: IntArray, target: Int): IntArray {

    // key is complement
    // value is nums index
    val hm = mutableMapOf<Int, Int>()

    for ((index, value) in nums.withIndex()) {

        val c = target - value // complement
        if (hm.containsKey(value)) {
            return intArrayOf(index, hm[value] ?: -1)
        }
        hm[c] = index
    }

    val lastIndex = nums.size - 1
    val lastValue = nums[lastIndex]

    if (hm.containsKey(lastValue)) {
        return intArrayOf(lastIndex, hm[lastValue] ?: -1)
    }

    return intArrayOf(-1, -1)
}