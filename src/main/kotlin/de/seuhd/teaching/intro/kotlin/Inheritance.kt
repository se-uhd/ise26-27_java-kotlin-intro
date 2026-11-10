package de.seuhd.teaching.intro.kotlin

open class Animal(val name: String) {
    open fun sound() = "..."

    fun describe() = "$name says ${sound()}"
}

class Dog(name: String) : Animal(name) {
    override fun sound() = "Woof"
}

// class Puppy : Dog("Rex")
// error: This type is final, so it cannot be extended.

sealed class Shape

class Circle(val radius: Double) : Shape()

class Square(val side: Double) : Shape()

fun area(shape: Shape): Double = when (shape) {
    is Circle -> Math.PI * shape.radius * shape.radius
    is Square -> shape.side * shape.side
    // no else branch is needed because Circle and Square are the only subclasses of the sealed class Shape
}

fun main() {
    println(Dog("Rex").describe()) // Rex says Woof
    println(area(Square(2.0))) // 4.0
}
