package codinginterview.hackerrank.dataStructures

import java.util.Stack


val s0 = "{[()]}}"
val s1 = "{[()]}"
val s2 = "{[(])}"
val s3 = "{{[[(())]]}}"

fun main(args: Array<String>) {
//    println(validate(s0))
//    println(validate(s0))
//    println(isBalanced(s0))
    println(isBalanced(s1))
}

private fun validate(string: String): Boolean {
    if (string.length % 2 != 0) return false

    val stack = Stack<Char>()

    for (c: Char in string) {
        print(c)
    }

    return true
}

fun isBalanced(string: String): Boolean {
    if (string.length and 1 == 1) return false
    else {
        val stack = Stack<Char>()

        for (char in string) {
            when (char) {
                '{' -> stack.push('}')
                '(' -> stack.push(')')
                '[' -> stack.push(']')
                else -> {
                    if (stack.empty() || char != stack.peek()) return false
                    else stack.pop()
                }
            }
            println(stack)
        }
        return stack.empty()
    }
}