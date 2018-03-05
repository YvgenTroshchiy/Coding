package javaCore


class Counts {
    private val counts = HashMap<String, Int>()

    fun incrementOf(key: String) {
        print("before : ${counts[key]}\n")

        counts[key] = counts[key]?.plus(1) ?: 1

        print("after  : ${counts[key]}\n\n")
    }

    fun getValueAndReset(key: String): Int {
        print("before : ${counts[key]}\n")

        val result = counts[key]
        counts.remove(key)

        print("after  : ${counts[key]}\n\n")

        return result ?: 0
    }
}

fun main(args: Array<String>) {
    val a = "A"

    val counts = Counts()

    counts.incrementOf(a)
    counts.incrementOf(a)

    print(counts.getValueAndReset(a))


}