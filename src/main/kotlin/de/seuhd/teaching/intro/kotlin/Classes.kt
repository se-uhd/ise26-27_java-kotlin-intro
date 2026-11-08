package de.seuhd.teaching.intro.kotlin

class Contact(
    val id: Int,
    var email: String,
) {
    var category: String = "private"

    fun printId() {
        println(id)
    }
}

data class Point(
    val x: Int,
    val y: Int,
)

operator fun Point.unaryMinus() = Point(-x, -y)

fun main() {
    val contact = Contact(1, "mary@gmail.com")
    println(contact.email)
    contact.email = "jane@gmail.com"
    println(contact.email)
    println(contact.category)
    contact.category = "work"
    println(contact.category)
    contact.printId()

    val point = Point(10, 20)
    println(-point)
    println(point == Point(10, 20))
}
