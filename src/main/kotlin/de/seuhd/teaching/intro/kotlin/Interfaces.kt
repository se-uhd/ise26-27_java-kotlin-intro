package de.seuhd.teaching.intro.kotlin

interface Named {
    val name: String // abstract property

    fun greet() = "Hello, $name!" // default implementation
}

interface Logger {
    fun log(message: String) = println("[log] $message")
}

class Person(override val name: String) : Named, Logger

fun main() {
    val ada = Person("Ada")
    println(ada.greet()) // Hello, Ada!
    ada.log("created") // [log] created
}
