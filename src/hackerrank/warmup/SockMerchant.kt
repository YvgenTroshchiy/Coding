package hackerrank.warmup

private val n = 9
private val ar1 = arrayOf(10, 20, 20, 10, 10, 30, 50, 10, 20) // 3
private val ar2 = arrayOf(1, 2, 1, 2, 1, 3, 2) // 2
private val TC10 = arrayOf(1, 1, 3, 1, 2, 1, 3, 3, 3, 3) // 4

//fun main(args: Array<String>) {
//    val scan = Scanner(System.`in`)
//    val n = scan.nextLine().trim().toInt()
//    val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
//    val result = sockMerchant(n, ar)
//    println(result)
//}

fun main(args: Array<String>) {
    println(sockMerchant(n, ar1))
    println(sockMerchant(n, ar2))
    println(sockMerchant(n, TC10))
}

// Complete the sockMerchant function below.
fun sockMerchant(n: Int, ar: Array<Int>): Int {
    var result = 0

    val map = mutableMapOf<Int, Int>()

    for (item: Int in ar) {
        map[item] = (map[item] ?: 0) + 1
    }

    for ((key, value) in map) {
        val i = value / 2
        result += i
    }

    return result
}