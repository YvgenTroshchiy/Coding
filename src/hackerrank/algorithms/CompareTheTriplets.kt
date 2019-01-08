package hackerrank.algorithms

fun main(args: Array<String>) {
//    val a = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
//    val b = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val a = arrayOf(5, 6, 7)
    val b = arrayOf(3, 6, 10)

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}

// Complete the compareTriplets function below.
fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    var alicePoints = 0
    var bobPoints = 0

    for (i in 0..2) {
        if (a[i] > b[i]) alicePoints++
        else if (b[i] > a[i]) bobPoints++
    }

    return arrayOf(alicePoints, bobPoints)
}
