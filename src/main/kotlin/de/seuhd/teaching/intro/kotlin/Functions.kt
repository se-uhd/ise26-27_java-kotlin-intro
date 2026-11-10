package de.seuhd.teaching.intro.kotlin

fun sum(x: Int, y: Int = 1): Int {
    return x + y
}

fun printMessage(msg: String) {
    println(msg)
}

// single-expression function (named sum on the slide, which would clash with sum above)
fun sumSingleExpression(x: Int, y: Int) = x + y

fun printMessageWithPrefix(message: String, prefix: String) {
    println("[$prefix] $message")
}

fun uppercaseString(text: String): String {
    return text.uppercase()
}

fun main() {
    println(sum(2)) // 3
    println(sum(2, 5)) // 7
    printMessage("Hello")
    println(sumSingleExpression(3, 4)) // 7

    // Uses named arguments with swapped parameter order
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    // [Log] Hello

    println(uppercaseString("hello"))
    // HELLO

    val upperCaseString = { text: String -> text.uppercase() }
    println(upperCaseString("hello"))
    // HELLO

    // the same lambda with an explicit function type
    val upperCaseStringTyped: (String) -> String = { text -> text.uppercase() }
    println(upperCaseStringTyped("hello"))
    // HELLO

    val numbers = listOf(1, -2, 3, -4, 5, -6)

    val positives = numbers.filter({ x -> x > 0 })
    // trailing lambda: a lambda passed as the last argument can follow the parentheses
    val positivesTrailing = numbers.filter { x -> x > 0 }

    val isNegative = { x: Int -> x < 0 }
    val negatives = numbers.filter(isNegative)
    println(positives) // [1, 3, 5]
    println(positivesTrailing) // [1, 3, 5]
    println(negatives) // [-2, -4, -6]
}
