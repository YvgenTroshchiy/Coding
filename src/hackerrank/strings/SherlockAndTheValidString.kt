package hackerrank.strings

const val validString = "abcdefghhgfedecba"
const val invalidString = "aabbccddeefghi"

fun main(args: Array<String>) {
//    val scan = Scanner(System.`in`)
//    val s = scan.nextLine()
//
    val result = isValid(validString)

    println(result)
}

// Complete the isValid function below.
fun isValid(s: String): String {
    val map = mutableMapOf<Char, Int>()

    s.forEach {
        map[it] = (map[it] ?: 0) + 1
    }


    val o = 0;
    return "s"
}
