package de.seuhd.teaching.intro.kotlin

class Box<T>(val value: T)

fun <T : Comparable<T>> larger(a: T, b: T): T =
    if (a >= b) a else b

fun main() {
    val box = Box(42) // Box<Int>
    println(box.value) // 42
    println(larger(3, 7)) // 7
    println(larger("apple", "banana")) // banana
    variance()
}

fun variance() {
    val strings: List<String> = listOf("a", "b")
    // OK: List<out E> is covariant
    val objects: List<Any> = strings
    println(objects) // [a, b]
    // val items: MutableList<Any> = mutableListOf<String>()
    // error: Initializer type mismatch
}
