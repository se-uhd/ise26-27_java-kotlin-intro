package de.seuhd.teaching.intro.kotlin

fun String.isPalindrome(): Boolean = this == reversed()

val String.initial: Char
    get() = first().uppercaseChar()

fun main() {
    println("level".isPalindrome()) // true
    println("kotlin".isPalindrome()) // false
    println("kotlin".initial) // K
}
