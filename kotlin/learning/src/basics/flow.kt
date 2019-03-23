package basics

import java.util.*

fun whatHappened(year: Int): String {
    if (year === 2019) {
        val number = year + 50
        return "O ano que aprendi Kotlin"
    } else if (year >= 2020 && year <= 2025)
        return "Não sei do futuro"
    else
        return "Não sei"
}

fun whatHappened2(year: Int): String =
    if (year === 2019)
        "O ano que aprendi Kotlin"
    else if (year >= 2020 && year <= 2025)
        "Não sei do futuro"
    else
        "Não sei"

fun whatHappened3(year: Int): String = when (year) {
    2019 -> "O ano que aprendi Kotlin"
    2020, 2021, 2023 -> "Não sei do futuro"
    in 2024..2030 -> "Também não sei do futuro"
    else -> "Não sei"
}

fun main() {
    val calendar: Calendar = Calendar.getInstance()
    val year = calendar.get(Calendar.YEAR)
    println(whatHappened(year))
    println(whatHappened2(year))
    println(whatHappened3(year))
}