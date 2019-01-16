package codinginterview.hackerrank.dataStructures

import java.util.*


// True
val s0 = "{[()]}}"
val s1 = "{[()]}"
val s2 = "{[(])}"
val s3 = "{{[[(())]]}}"
val s4 = "((()(())))"
val s5 = "((){}[])"


// False
val sf1 = "(((((((()"

fun main(args: Array<String>) {
    println(isBalanced(s5))
}

fun isBalanced(string: String): Boolean {
    if (string.length % 2 != 0) return false

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
    }

    return stack.empty()
}