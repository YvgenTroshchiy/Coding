package kotlin_

fun main(args: Array<String>) {
    val setInt = setOf<Int>()
    val setInt2 = mutableSetOf<Int>()

    var intA0_1 = IntArray(3)
    var intA0_2 = arrayOfNulls<Int>(3)
    var intA0_3 = IntArray(3) { 1 }
    var intA = intArrayOf(0, 1, 2, 3)
    val intA2 = arrayOf<Int>(1, 2, 3)
    val intA3 = arrayOf<Int>()

    var charA = charArrayOf('a', 'b', 'c')
    val stringA = arrayOf<String>("a", "b", "c")
    var stringA2 = arrayOf<String>()

    val string = "abcd"
    val cA = string.toCharArray()
}
