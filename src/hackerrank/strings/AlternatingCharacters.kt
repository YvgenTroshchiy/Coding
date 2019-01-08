package hackerrank.strings

fun main(args: Array<String>) {
//    val scan = Scanner(System.`in`)
//
//    val q = scan.nextLine().trim().toInt()
//
//    for (qItr in 1..q) {
//        val s = scan.nextLine()
//
//        val result = alternatingCharacters(s)
//
//        println(result)
//    }

    val s = "AAABBB"
    println(alternatingCharacters(s))
}

// Complete the alternatingCharacters function below.
fun alternatingCharacters(s: String): Int {
    var numberOfDeletions = 0

    var currentIndex = 0
    var checkIndex = currentIndex + 1

    while (checkIndex <= s.length - 1) {
        val c = s[currentIndex]
        val n = s[checkIndex]

        if (c == n) {
            // The same
            numberOfDeletions++
            checkIndex++
        } else {
            // Difference
            currentIndex = checkIndex
            checkIndex++
        }
    }

    return numberOfDeletions
}
