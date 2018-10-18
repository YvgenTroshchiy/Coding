package hackerrank.data_structures

import java.lang.IllegalArgumentException
import java.util.*


private fun debugChars() {
    val a = arrayOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z')
    for (i: Char in a) {
        print(i - 'a')
//        println(i.hashCode())
    }
}

private var first = "cde"
private var second = "abc"

fun main(args: Array<String>) {
    initFromScanner()
    validateDate()

    print(numberNeeded(first, second))
}

private fun initFromScanner() =
        with(Scanner(System.`in`)) {
            first = next()
            second = next()
        }

private fun validateDate() {
    if (first.length !in 1..Math.pow(10.toDouble(), 4.toDouble()).toInt() ||
            second.length !in 1..Math.pow(10.toDouble(), 4.toDouble()).toInt())
        throw IllegalArgumentException()

    first.forEach { if (!it.isLowerCase()) throw IllegalArgumentException() }
    second.forEach { if (!it.isLowerCase()) throw IllegalArgumentException() }
}

fun numberNeeded(first: String, second: String): Int {
    val letters = IntArray(26)
    first.chars().forEach { letters[it.toChar() - 'a']++ }
    second.chars().forEach { letters[it.toChar() - 'a']-- }

//    letters.printWithSpace()

    return letters.map { Math.abs(it) }.sum()
}

private fun IntArray.printWithSpace() = println(Arrays.toString(this))