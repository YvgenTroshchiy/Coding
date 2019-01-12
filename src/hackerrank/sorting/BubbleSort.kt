package hackerrank.sorting

//fun main(args: Array<String>) {
//    val scan = Scanner(System.`in`)
//    val n = scan.nextLine().trim().toInt()
//    val a = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
//    countSwaps(a)
//}

fun main(args: Array<String>) {
    val a = arrayOf(6, 4, 1)
    countSwaps(a)
}

// Complete the countSwaps function below.
fun countSwaps(a: Array<Int>): Unit {
    var wasSwaps = false
    var swaps = 0

    val n = a.size
    for (i in 0 until n) {
        for (j in 0 until n - 1) {
            // Swap adjacent elements if they are in decreasing order
            if (a[j] > a[j + 1]) {
                swap(a, j)
                swaps++
                wasSwaps = true
            }
        }

        if (!wasSwaps) break
    }

    println(
        "Array is sorted in $swaps swaps.\n" +
                "First Element: ${a[0]}\n" +
                "Last Element: ${a[n - 1]}"
    )
}

private fun swap(a: Array<Int>, j: Int) {
    val t = a[j]
    a[j] = a[j + 1]
    a[j + 1] = t
}
