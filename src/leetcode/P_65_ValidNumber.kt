package leetcode


private val s0 = "0"
private val s1 = "53.5e93"
private val s2 = "6e-1"
private val s3 = ".1"
private val s4 = "1 "

private val f1 = "95a54e53"
private val f2 = " 99e2.5 "

fun main(args: Array<String>) {
    println(isNumber(s0))
    println(isNumber(s1))
    println(isNumber(s2))
    println(isNumber(s3))
    println(isNumber(s4))
    println("")
    println(isNumber(f1))
    println(isNumber(f2))
}


fun isNumber(s: String): Boolean {
    var i = 0
    val string = s.trim()
    val n = string.length

    if (i < n && (string[i] == '+' || string[i] == '-')) i++

    var isNumeric = false

    while (i < n && string[i].isDigit()) {
        i++
        isNumeric = true
    }

    if (i < n && string[i] == '.') {
        i++
        while (i < n && string[i].isDigit()) {
            i++
            isNumeric = true
        }
    }

    if (isNumeric && i < n && string[i] == 'e') {
        i++
        isNumeric = false
        if (i < n && (string[i] == '+' || string[i] == '-')) i++
        while (i < n && string[i].isDigit()) {
            i++
            isNumeric = true
        }
    }

    return isNumeric && i == n
}