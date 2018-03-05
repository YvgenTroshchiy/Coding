package kotlinTest

private var array = intArrayOf(1, 2, 3, 4, 5, 10)

fun main(args: Array<String>) {

//    forRange()
//    forDownTo()
//    forUntil()

//    forUntilArray()

//    iterateOverArrayIndices()
//    iterateOverArray()
//    iterateWithIndex()

    iterateMapGeneral()
}

private fun forRange() {
    for (i in 0..10)
        print("$i ")

    println()
}

private fun forDownTo() {
    for (i in 4 downTo 1)
        print("$i ")

    println()
}

private fun forUntil() {
    for (i in 0 until 10) // i in [1, 10), 10 is excluded
        print("$i")

    println()
}

private fun forUntilArray() {
    for (i in 0 until array.size)
        println("$i: ${array[i]}")

    println()
}

private fun iterateOverArrayIndices() {
    for (i in array.indices)
        print("$i ")

    println()
}

private fun iterateOverArray() {
    for (item: Int in array)
        print("$item ")

    println()
}

// Destructuring (разбеение на элементы) Declarations
private fun iterateWithIndex() {
    for ((index, value) in array.withIndex())
        println("the element at: $index, is: $value")
}

private fun iterateMapGeneral() {
    val users = HashMap<String?, Int?>()
    users.put(null, null)
    users.put(null, 9)
    users.put("James", 35)
    users.put("John", 22)
    users.put("Robert", 29)
    users.put("Michael", 14)
    users.put("William", 28)

    for (entry in users) {
        val user = entry.key
        val age = entry.value
    }

    for ((user, age) in users) {
        println("user: $user, age: $age")
    }

    println(users.get("Robert"))
    println(users["Robert"])
    println(users[null])
}