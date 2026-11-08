package de.seuhd.teaching.intro.kotlin

fun sum(
    x: Int,
    y: Int = 1,
): Int = x + y

fun product(
    x: Int,
    y: Int,
) = x * y

fun printMessageWithPrefix(
    message: String,
    prefix: String,
) {
    println("[$prefix] $message")
}

fun main() {
    println(sum(2))
    println(sum(2, 5))
    println(product(3, 4))
    printMessageWithPrefix(prefix = "Log", message = "Hello")

    val upperCaseString: (String) -> String = { text -> text.uppercase() }
    println(upperCaseString("hello"))

    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val positives = numbers.filter { x -> x > 0 }
    val isNegative = { x: Int -> x < 0 }
    val negatives = numbers.filter(isNegative)
    println(positives)
    println(negatives)
}
