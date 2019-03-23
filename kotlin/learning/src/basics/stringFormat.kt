package basics

fun main(args: Array<String>) {
    val name = "Adriano"
    val name2 = "   adriano    "
    val template = """
        This
        |Will
        *be
        print
        with
        indent
    """

    print("\n\n")
    println("Concat")
    println("Hello " + name)
    println("Hello $name")
    println("First letter ${name[0]} or ${name.first()}")
    println("Last letter ${name.last()}")

    println("Your name have ${name.length} letters")
    println("Sum of 2+2 = ${2 + 2}")

    print("\n\n")
    println("Cases")

    println(name.toUpperCase())
    println(name.toLowerCase())

    print("\n\n")
    println("Trim")

    println(name2)
    println(name2.trimStart())
    println(name2.trimEnd())
    println(name2.trim())

    print("\n\n")
    println("Loop between letters")

    println(template)
    println(template.trimIndent())
    println(template.trimMargin())
    println(template.trimMargin("*"))

    print("\n\n")
    println("Loop between letters")

    for(letter in name) {
        println(letter)
    }

}