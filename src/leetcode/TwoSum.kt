package leetcode

import java.util.*


/*
[230,863,916,585,981,404,316,785,88,12,70,435,384,778,887,755,740,337,86,92,325,422,815,650,920,125,277,336,221,847,168,23,677,61,400,136,874,363,394,199,863,997,794,587,124,321,212,957,764,173,314,422,927,783,930,282,306,506,44,926,691,568,68,730,933,737,531,180,414,751,28,546,60,371,493,370,527,387,43,541,13,457,328,227,652,365,430,803,59,858,538,427,583,368,375,173,809,896,370,789]
542
*/

private val nums0 = intArrayOf(2, 7, 11, 15)
private val t0 = 9 // [0, 1]

private val nums1 = intArrayOf(
    230,
    863,
    916,
    585,
    981,
    404,
    316,
    785,
    88,
    12,
    70,
    435,
    384,
    778,
    887,
    755,
    740,
    337,
    86,
    92,
    325,
    422,
    815,
    650,
    920,
    125,
    277,
    336,
    221,
    847,
    168,
    23,
    677,
    61,
    400,
    136,
    874,
    363,
    394,
    199,
    863,
    997,
    794,
    587,
    124,
    321,
    212,
    957,
    764,
    173,
    314,
    422,
    927,
    783,
    930,
    282,
    306,
    506,
    44,
    926,
    691,
    568,
    68,
    730,
    933,
    737,
    531,
    180,
    414,
    751,
    28,
    546,
    60,
    371,
    493,
    370,
    527,
    387,
    43,
    541,
    13,
    457,
    328,
    227,
    652,
    365,
    430,
    803,
    59,
    858,
    538,
    427,
    583,
    368,
    375,
    173,
    809,
    896,
    370,
    789
)
private val t1 = 542

private val nums2 = intArrayOf(0, 4, 3, 0)
private val t2 = 0 // [0, 3]

fun main(args: Array<String>) {
    val result = twoSum(nums2, t2)
    for (i: Int in result) {
        print("$i ")
    }
    Arrays.toString(result)
}

private fun twoSum(nums: IntArray, target: Int): IntArray {

    for ((index, value) in nums.withIndex()) {
        val j = bSearch(index, nums.size - 1, target - value, nums)
        if (j != -1) return@twoSum intArrayOf(index, j)
    }

    return intArrayOf(-1, -1)
}

private fun bSearch(left: Int, right: Int, c: Int, nums: IntArray): Int {
    var l = left
    var r = right

    while (l < r) {
        val m = (l + r) / 2

        val current = nums[m]
        if (current == c) {
            return m
        } else if (current < c) {
            l = m + 1
        } else {
            r = m - 1
        }
    }

    return -1
}

