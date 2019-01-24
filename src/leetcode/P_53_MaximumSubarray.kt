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
fun maxSubArray(A: IntArray): Int {
    var maxEndingHere = A[0]
    var maxSoFar = A[0]

    for (i in 1 until A.size) {
        maxEndingHere = Math.max(maxEndingHere + A[i], A[i])
        maxSoFar = Math.max(maxEndingHere, maxSoFar)
    }

    return maxSoFar
}

// Divide and Conquer
fun maxSubArray2(A: IntArray): Int {
    return maxSubArrayHelper(A, 0, A.size - 1)
}

private fun maxSubArrayHelper(A: IntArray, L: Int, R: Int): Int {
    if (L > R) return Integer.MIN_VALUE
    val M = (L + R) / 2

    val leftAns = maxSubArrayHelper(A, L, M - 1)
    val rightAns = maxSubArrayHelper(A, M + 1, R)

    var lMaxSum = 0
    var sum = 0

    for (i in M - 1 downTo L) {
        sum += A[i]
        lMaxSum = Math.max(sum, lMaxSum)
    }

    var rMaxSum = 0
    sum = 0

    for (i in M + 1..R) {
        sum += A[i]
        rMaxSum = Math.max(sum, rMaxSum)
    }

    return Math.max(lMaxSum + A[M] + rMaxSum, Math.max(leftAns, rightAns))
}