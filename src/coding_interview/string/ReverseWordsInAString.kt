package coding_interview.string

import java.util.*

private const val string = "getting good at coding needs a lot of practice"
private const val string1 = "perfect makes practice"
private val array = arrayOf('p', 'e', 'r', 'f', 'e', 'c', 't', ' ', 'm', 'a', 'k', 'e', 's', ' ', 'p', 'r', 'a', 'c', 't', 'i', 'c', 'e')

fun main(args: Array<String>) {
    print(string)
    println()
    println()

    reverseEachWordInString(string)
    println()
    reverseString()
}

private fun reverseEachWordInString(s: String) {
    val charArray = s.toCharArray()

    var start = 0 // Start word index
    var end: Int // End word index

    for ((index, value) in charArray.withIndex()) {

        if (value == ' ') {
            end = index - 1

            reverseWord(start, end, charArray)
            start = index + 1
        }
    }
    reverseWord(start, charArray.size - 1, charArray)

    print(charArray)
}

private fun reverseString() {
    val stack = Stack<String>()

    var stringSoFar = ""
    for (c: Char in string) {
        if (c != ' ')
            stringSoFar += c
        else {
            stack.push(stringSoFar)
            stringSoFar = ""
        }
    }
    stack.push(stringSoFar)

    while (!stack.empty()) print("${stack.pop()} ")
}

private fun reverseWord(s: Int, e: Int, a: CharArray) {
    var start = s
    var end = e

    while (end > start) {
        val t = a[start]
        a[start] = a[end]
        a[end] = t

        start++
        end--
    }
}