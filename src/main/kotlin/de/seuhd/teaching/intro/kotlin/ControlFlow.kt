package de.seuhd.teaching.intro.kotlin

fun describe(obj: Any): String =
    when (obj) {
        "1" -> "One"
        "Hello" -> "Greeting"
        is Int -> "Number"
        else -> "Unknown"
    }

fun trafficAction(trafficLightState: String): String =
    when (trafficLightState) {
        "Green" -> "Go"
        "Yellow" -> "Slow down"
        "Red" -> "Stop"
        else -> "Malfunction"
    }

fun advice(
    temperature: Int,
    raining: Boolean,
): String =
    when {
        raining -> "Take an umbrella"
        temperature < 5 -> "Wear a coat"
        else -> "Enjoy the weather"
    }

fun main() {
    val check = true
    val d = if (check) 1 else 2
    println(d)

    println(describe("Hello"))
    println(describe(42))
    println(trafficAction("Red"))
    println(advice(3, raining = false))

    for (number in 1..4) print("$number ")
    println()
    for (number in 1..<4) print("$number ")
    println()
    for (number in 4 downTo 1) print("$number ")
    println()
    for (number in 1..5 step 2) print("$number ")
    println()
    for (letter in 'z' downTo 's' step 2) print("$letter ")
    println()

    var cakesEaten = 0
    var cakesBaked = 0
    while (cakesEaten < 3) {
        println("Eat a cake")
        cakesEaten++
    }
    do {
        println("Bake a cake")
        cakesBaked++
    } while (cakesBaked < cakesEaten)
}
