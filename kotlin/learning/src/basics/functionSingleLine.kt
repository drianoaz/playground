package basics

fun sayHelloInline() = println("Hello")

fun toUpperInline(str: String): String = str.toUpperCase()

fun getLetterInline(str: String, index: Int = 0): Char = str[index]

fun whichNumberIsBigger(n1: Int, n2: Int) = if (n1 > n2) n1 else n2

fun main(args: Array<String>) {
    sayHelloInline()

    println(toUpperInline("ASdfasdFASDfasdFASDfaSDF"))
    println(getLetterInline("Adriano"))
    println(getLetterInline("Adriano", 5))
    println(whichNumberIsBigger(50, 60))
    println(whichNumberIsBigger(50, 40))
}