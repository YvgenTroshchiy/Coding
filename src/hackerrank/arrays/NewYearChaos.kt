package hackerrank.arrays

import java.util.*

const val tooChaotic = "Too chaotic"

fun main(args: Array<String>) {
//    fromScan()

    val q = arrayOf(2, 1, 5, 3, 4)
    minimumBribes(q)
    val q2 = arrayOf(2, 5, 1, 3, 4)
    minimumBribes(q2)
}

private fun fromScan() {
    val scan = Scanner(System.`in`)
    val t = scan.nextLine().trim().toInt()
    for (tItr in 1..t) {
        val q = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
        minimumBribes(q)
    }
}

// Complete the minimumBribes function below.
fun minimumBribes(q: Array<Int>) {
    val bribers = mutableMapOf<Int, Int>()
    var bribesCount = 0

    fun isUnsorted(): Boolean {
        for (i in 0 until q.size - 1) {
            if (q[i] > q[i + 1]) return true
        }
        return false
    }

    var qIsUnsorted = isUnsorted()

    while (qIsUnsorted) {
        for (i in 0 until q.size - 1) {
            val first = q[i]
            val second = q[i + 1]

            val wasBribe = first > second
            if (wasBribe) {
                bribers[first] = (bribers[first] ?: 0) + 1

                if (bribers[first] ?: 0 > 2) {
                    println(tooChaotic)
                    return
                }

                bribesCount++

                // Unbribe
                q[i] = second
                q[i + 1] = first
            }
        }
        qIsUnsorted = isUnsorted()
    }
    println(bribesCount)
}