package coding_interview.recursion

fun main(args: Array<String>) {
    val number = fib(5)
    println(number)
}

private fun fib(n: Int): Int {
    return when {
        (n <= 0) -> 0
        (n == 1) -> 1
        else -> fib(n - 1) + fib(n - 2)
    }
}