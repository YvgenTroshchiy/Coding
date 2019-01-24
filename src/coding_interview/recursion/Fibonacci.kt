package coding_interview.recursion

const val n = 12
var count = 0
var countMemo = 0
val cache = IntArray(n + 1)

fun main() {
    println(fib(n))
    println(fibMemo(n))
    println("count: $count, countMemo: $countMemo")
}

private fun fib(n: Int): Int {
    count++
    return when {
        (n < 2) -> n
        else -> fib(n - 1) + fib(n - 2)
    }
}

private fun fibMemo(n: Int): Int {
    countMemo++
    return when {
        (n < 2) -> n
        (cache[n] != 0) -> cache[n]
        else -> {
            cache[n] = fibMemo(n - 1) + fibMemo(n - 2)
            cache[n]
        }
    }
}