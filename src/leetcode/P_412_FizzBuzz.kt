package leetcode

const val n = 15

fun main() {

    fun fizzBuzz(n: Int): List<String> {
        val l = ArrayList<String>(n)

        for (i in 1..n) {
            var m = ""

            if (i % 3 == 0) m += "Fizz"
            if (i % 5 == 0) m += "Buzz"
            if (m.isEmpty()) m += i

            l.add(m)
        }

        return l
    }

    print(fizzBuzz(n))
}