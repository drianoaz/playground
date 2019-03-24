package basics

fun main() {
    val number: Int = 10
    val longNumber: Long = 100

    var n1: Int
    n1 = longNumber.toInt()

    println(n1)

    val numberStr = "10"
    n1 = numberStr.toInt()

    println(n1)
}