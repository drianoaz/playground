package basics

fun sayHello() {
    println("Hello")
}

fun toUpper(str: String): String {
    return str.toUpperCase()
}

fun getLetter(str: String, index: Int = 0): Char {
    return str[index]
}

fun main(args: Array<String>) {
    sayHello()

    println(toUpper("ASdfasdFASDfasdFASDfaSDF"))
    println(getLetter("Adriano"))
    println(getLetter("Adriano", 5))
}