package coding_interview

private var array = intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)

fun main(args: Array<String>) {
    print(findMuxSubArray())
}

fun findMuxSubArray(): Int {
    var result = Int.MIN_VALUE

    for (i in array.indices) {

        var sum = 0

        for (j in i until array.size) {
            println("i: $i, j: $j")
            sum += array[j]

            if (sum > result) result = sum
        }
        println()
    }

    return result
}