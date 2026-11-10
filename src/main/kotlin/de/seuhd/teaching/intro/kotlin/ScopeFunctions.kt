package de.seuhd.teaching.intro.kotlin

fun letExample(name: String?) {
    name?.let { println("Hello, $it!") } // runs only if name is not null
    listOf("one", "two", "three")
        .map { it.length }
        .filter { it > 3 }
        .let { println(it) } // [5]
}

fun withExample() {
    val numbers = mutableListOf("one", "two", "three")
    with(numbers) {
        println("$size elements") // 3 elements
        println("first: ${first()}, last: ${last()}") // first: one, last: three
    }
}

fun runExample() {
    val greeting = StringBuilder().run {
        append("Hello, ")
        append("Kotlin")
        toString()
    }
    println(greeting) // Hello, Kotlin

    val price = run {
        val base = 2.0
        val extraShot = 0.5
        base + extraShot
    }
    println(price) // 2.5
}

class CoffeeOrder {
    var size = "medium"
    var shots = 1
}

fun applyExample() {
    val order = CoffeeOrder().apply {
        size = "large"
        shots = 2
    }
    println("${order.size}, ${order.shots} shots") // large, 2 shots
}

fun alsoExample() {
    val numbers = mutableListOf(1, 2, 3)
    numbers
        .also { println("before: $it") } // before: [1, 2, 3]
        .add(4)
    println("after: $numbers") // after: [1, 2, 3, 4]
}

fun main() {
    letExample("Ada")
    letExample(null)
    withExample()
    runExample()
    applyExample()
    alsoExample()
}
