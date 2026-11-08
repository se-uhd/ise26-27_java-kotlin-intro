package de.seuhd.teaching.intro.kotlin

data class Coffee(val name: String, val shots: Int)

fun main() {
    val espresso = Coffee("Espresso", 1)
    println(espresso) // Coffee(name=Espresso, shots=1)
    println(espresso == Coffee("Espresso", 1)) // true
    val doppio = espresso.copy(shots = 2)
    val (name, shots) = doppio
    println("$name with $shots shots") // Espresso with 2 shots
}
