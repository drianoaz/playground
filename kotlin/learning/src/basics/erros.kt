package basics

import java.lang.Exception
import java.lang.NumberFormatException

fun main() {
    try {
        val number = "asdfs".toInt()
    } catch (e: NumberFormatException) {
        println("Não é um número")
    } catch (e: Exception) {
        println("Não sei o que aconteceu")
    } finally {
        println("executa independente de ter dado erro ou nao")
    }
}