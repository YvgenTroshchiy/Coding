package leetcode

/*
Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
*/

private const val example1 = "A man, a plan, a canal: Panama"

fun main() {
    println(isPalindrome(example1))
}

fun isPalindrome(s: String): Boolean {
    val regex = Regex("[^A-Za-z0-9]")
    val m = regex.replace(s, "").toLowerCase()

    var start = 0
    var end = m.length - 1

    while (start < end) {
        if (m[start] != m[end]) return false

        start++
        end--
    }

    return true
}
