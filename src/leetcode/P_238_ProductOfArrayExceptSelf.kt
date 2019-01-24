package leetcode

import java.util.*

/*
Input:  [1, 2, 3, 4]
Output: [24, 12, 8, 6]
*/

/*
Input:  [2, 2, 3, 4, 5]
Output: [120, 120, 80, 60, 48]
*/
fun main() {
    val a1 = intArrayOf(1, 2, 3, 4)
    val a2 = intArrayOf(2, 2, 3, 4, 5)

    productExceptSelf1(a1)
    productExceptSelf1(a2)
}

fun productExceptSelf1(nums: IntArray): IntArray {
    val a = nums
    val n = a.size

    val l = IntArray(n) { 1 }
    val r = IntArray(n) { 1 }

    l[0] = a[0]
    for (i in 1 until n) {
        l[i] = l[i - 1] * a[i]
    }

    r[n - 1] = a[n - 1]
    for (i in n - 2 downTo 1) {
        r[i] = r[i + 1] * a[i]
    }

    a[0] = r[1]
    a[n - 1] = l[n - 2]
    for (i in 1 until n - 1) {
        a[i] = l[i - 1] * r[i + 1]
    }

    println(Arrays.toString(l))
    println(Arrays.toString(r))
    println()
    println(Arrays.toString(a))

    return a
}

fun productExceptSelf2(nums: IntArray): IntArray {
    var productLeft = 1

    for (i in nums.indices) {

        var r = productLeft

        for (j in i + 1 until nums.size) {
            r *= nums[j]
        }

        productLeft *= nums[i]

        nums[i] = r
    }

    return nums
}