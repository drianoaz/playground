package basics

fun main() {
    val names = arrayListOf("Adriano", "Sheila", "Marcia")

    for (x in 1..10) {
        println(x)
    }

    for (x in 10 downTo 0) {
        println(x)
    }

    for (x in 0..10 step 2) {
        println(x)
    }

    for (name in names) {
        println(name)
    }

    for ((index, value) in names.withIndex()) {
        println("the element at $index is $value")
    }

    var index = 0
    while (index < 10) {
        println(index)
        index++
    }

    do {
        println("Execute")
    } while (index < 0)

}