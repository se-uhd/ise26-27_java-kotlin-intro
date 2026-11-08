package de.seuhd.teaching.intro.kotlin

fun log(x: Any) {
    println("log: $x")
}

fun greet() {
    println("hi")
}

fun main() {
    println("Hello, world!")

    val customers = 10
    var orders = 3
    orders += 1

    val i: Int
    i = 3

    println("There are $customers customers and $orders orders")
    println("There are ${customers + i} customers")

    println(customers::class.simpleName)
    println(customers::class.qualifiedName)
    println(customers::class.java.typeName)

    log(42)
    log("text")
    val result: Unit = greet()
    println(result)
}
