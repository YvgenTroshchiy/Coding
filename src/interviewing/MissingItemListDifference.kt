package interviewing

/*
Given an unsorted array of unique integers (size n + 1)
and a second array that is identical to the first array but missing one integer (size n),
find and output the missing integer
*/
val a1 = arrayOf(-2, 4, 8, 12, 0, 9, 3)
val a2 = arrayOf(4, 8, 9, 3)

fun main(vararg args: String) {
    solution1()

    solution2()
    solution2b()

    solution3()
}

private fun solution1() {
    var s1 = 0.toBigInteger()
    var s2 = 0.toBigInteger()

    a1.forEach {
        s1 = s1.plus(it.toBigInteger())
    }

    a2.forEach {
        s2 = s2.plus(it.toBigInteger())
    }

    val result = s1 - s2
    println("result: $result")
}

private fun solution2() {
    val set1 = a1.toHashSet()
    val set2 = a2.toHashSet()

    set1.removeAll(set2)

    println(set1)
}

private fun solution2b() {
    val set1 = a1.toHashSet()

    set1.removeAll(a2)

    println(set1)
}


fun solution3() {
    val result = a1.filter { !a2.contains(it) }
    println(result)
}