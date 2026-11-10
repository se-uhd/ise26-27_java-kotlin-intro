package de.seuhd.teaching.intro.kotlin

fun log(x: Any) {
    println("log: $x")
}

fun greet() {
    println("hi")
}

fun main() {
    println("Hello, world!")

    // a val cannot be reassigned, but a var can
    val customers = 10
    var orders = 3
    orders += 1
    println("There are $orders orders")

    val i: Int
    // println(i)
    // error: Variable 'i' must be initialized.
    i = 3
    println(i)

    println("There are $customers customers")
    // There are 10 customers
    println("There are ${customers + 1} customers")
    // There are 11 customers

    println(customers::class.simpleName)
    println(customers::class.qualifiedName)
    println(customers::class.java.typeName)

    log(42)
    log("text")
    val result: Unit = greet()
    println(result)
}
