package codinginterview.string

import java.util.*


val string = "getting good at coding needs a lot of practice"

fun main(args: Array<String>) {
    reverseString()
    println()
    revertEachWordInString(string)
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

private fun revertEachWordInString(s: String) {
    val charArray = s.toCharArray()

    var start = 0 // Start word index
    var end = 0 // End work index

    for ((index, value) in charArray.withIndex()) {

        if (value == ' ') {
            end = index - 1

            revertWord(start, end, charArray)
            start = index + 1
        }
    }
    revertWord(start, charArray.size - 1, charArray)

    print(charArray)
}


private fun revertWord(s: Int, e: Int, a: CharArray) {
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