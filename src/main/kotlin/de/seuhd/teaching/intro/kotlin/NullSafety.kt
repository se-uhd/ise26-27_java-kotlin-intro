package de.seuhd.teaching.intro.kotlin

fun lengthString(maybeString: String?): Int? = maybeString?.length

fun lengthOrZero(maybeString: String?): Int = maybeString?.length ?: 0

fun main() {
    val neverNull: String = "This can't be null"
    // neverNull = null does not compile

    var nullable: String? = "You can keep a null here"
    println(lengthString(nullable))
    nullable = null
    println(lengthString(nullable))

    println(lengthOrZero("Kotlin"))
    println(lengthOrZero(nullable))
    println(neverNull.length)
}
