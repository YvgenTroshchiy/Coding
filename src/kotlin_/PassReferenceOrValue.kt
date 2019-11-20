package kotlin_


class Data(val value: String)

class Callback(
        var a: Data?,
        var b: Data?


        
)

fun main(args: Array<String>) {

    val a = Data("Aaaa")
    val b = Data("Bbbb")

    val callback = Callback(a, b)


}