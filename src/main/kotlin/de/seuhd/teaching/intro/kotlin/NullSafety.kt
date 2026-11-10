package de.seuhd.teaching.intro.kotlin

fun lengthString(maybeString: String?): Int? = maybeString?.length

fun lengthOrZero(maybeString: String?): Int = maybeString?.length ?: 0

fun lengthOrThrow(maybeString: String?): Int = maybeString!!.length

fun main() {
    // neverNull has String type
    var neverNull: String = "This can't be null"
    // neverNull = null
    // error: Null cannot be a value of a non-null type 'String'.

    // nullable has nullable String type
    var nullable: String? = "You can keep a null here"
    println(lengthString(nullable)) // 24
    // This is OK
    nullable = null
    println(lengthString(nullable)) // null

    println(lengthOrZero("Kotlin")) // 6
    println(lengthOrZero(nullable)) // 0
    println(neverNull.length) // 18

    println(lengthOrThrow("Kotlin")) // 6
    // lengthOrThrow(null) throws a NullPointerException
}
