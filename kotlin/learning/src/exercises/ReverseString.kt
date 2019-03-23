package exercises

fun reverseStringSB(str: String): String {
    return str.reversed()
}

fun reverseStringLoop(str: String): String {
    var value = ""
    for(index in (str.length - 1) downTo 0) {
        value += str[index]
    }
    return value
}