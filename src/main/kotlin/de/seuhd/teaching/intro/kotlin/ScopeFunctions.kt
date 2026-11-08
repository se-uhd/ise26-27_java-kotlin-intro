package de.seuhd.teaching.intro.kotlin

fun printGreeting(name: String?) {
    name?.let { println("Hello, $it!") }
}

fun main() {
    printGreeting("Ada") // Hello, Ada!
    printGreeting(null) // prints nothing
    listExamples()
}

fun listExamples() {
    val numbers = mutableListOf<Int>().apply {
        add(1)
        add(2)
    }.also { println("created $it") } // created [1, 2]

    val sum = with(numbers) { first() + last() }
    println(sum) // 3
    println(numbers.run { "$size numbers" }) // 2 numbers
}
