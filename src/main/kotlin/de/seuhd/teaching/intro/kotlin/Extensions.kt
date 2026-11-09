package de.seuhd.teaching.intro.kotlin

fun String.isPalindrome(): Boolean {
    return this == this.reversed()
}

fun main() {
    println("level".isPalindrome()) // true
    println("kotlin".isPalindrome()) // false
}
