package kotlinp

val i = 3

fun testReturnWith(): Boolean = with(i) { i % 2 == 0 }

print(testReturnWith())
