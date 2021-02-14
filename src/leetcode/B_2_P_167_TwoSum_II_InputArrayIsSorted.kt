package leetcode

private val nums = intArrayOf(2, 7, 11, 15)
private const val t = 9
// Output: [0,1]

// 2. Two Sum II – Input array is sorted
fun main() {
    println(twoSumTwoPointers(nums, t).contentToString())
}

private fun twoSumTwoPointers(numbers: IntArray, target: Int): IntArray {
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