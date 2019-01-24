package leetcode

/*
Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
*/

private val nums = intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)

fun main(args: Array<String>) {
    println(maxSubArray(nums))
    println(maxSubArray2(nums))
}

// Dynamic programming
private fun maxSubArray(a: IntArray): Int {
    var maxEndingHere = a[0]
    var maxSoFar = a[0]

    for (i in 1 until a.size) {
        maxEndingHere = Math.max(maxEndingHere + a[i], a[i])
        maxSoFar = Math.max(maxEndingHere, maxSoFar)
    }

    return maxSoFar
}

// Divide and Conquer
private fun maxSubArray2(a: IntArray): Int = maxSubArrayHelper(a, 0, a.size - 1)

private fun maxSubArrayHelper(a: IntArray, l: Int, r: Int): Int {
    if (l > r) return Integer.MIN_VALUE
    val m = (l + r) / 2 // middle

    val leftAns = maxSubArrayHelper(a, l, m - 1)
    val rightAns = maxSubArrayHelper(a, m + 1, r)

    var lMaxSum = 0
    var sum = 0

    for (i in m - 1 downTo l) {
        sum += a[i]
        lMaxSum = Math.max(sum, lMaxSum)
    }

    var rMaxSum = 0
    sum = 0

    for (i in m + 1..r) {
        sum += a[i]
        rMaxSum = Math.max(sum, rMaxSum)
    }

    return Math.max(lMaxSum + a[m] + rMaxSum, Math.max(leftAns, rightAns))
}