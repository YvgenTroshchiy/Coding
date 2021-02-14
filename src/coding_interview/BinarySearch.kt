package coding_interview

private val nums = intArrayOf(2, 3, 7, 11, 12, 15, 20, 21, 33, 40)

fun main(args: Array<String>) {
    val result = binarySearch(2, nums, 0, nums.size - 1)
    println("result: $result")
}

private fun binarySearch(target: Int, array: IntArray, left: Int, right: Int): Int {
    var l = left
    var r = array.size - 1

    while (l < r) {
        val m = (l + r) / 2

        val current = array[m]
        when {
            (current == target) -> return m
            (current < target) -> l = m + 1
            else -> r = m - 1
        }
    }

    return -1
}
