package coding_interview

fun main(args: Array<String>) {

}

private fun bSearch(left: Int, right: Int, searchValue: Int, array: IntArray): Int {
    var l = left
    var r = right

    while (l < r) {
        val m = (l + r) / 2

        val current = array[m]
        when {
            (current == searchValue) -> return m
            (current < searchValue) -> l = m + 1
            else -> r = m - 1
        }
    }

    return -1
}
