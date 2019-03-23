package basics

import java.util.*

fun myPackage() {
    println("Hello")
}

fun myPackage2() {
    println("Hello 2")
}

fun main() {
    val calendar: Calendar = Calendar.getInstance()
    println(calendar.get(Calendar.YEAR))
}