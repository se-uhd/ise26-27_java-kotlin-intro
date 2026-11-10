package de.seuhd.teaching.intro.kotlin

fun main() {
    val d: Int
    val check = true

    if (check) {
        d = 1
    } else {
        d = 2
    }
    println(d) // 1

    val obj = "Hello"

    when (obj) {
        // Checks whether obj equals "1"
        "1" -> println("One")
        // Checks whether obj equals "Hello"
        "Hello" -> println("Greeting")
        // Default statement
        else -> println("Unknown")
    }

    val result = when (obj) {
        // If obj equals "1", sets result to "One"
        "1" -> "One"
        // If obj equals "Hello", sets result to "Greeting"
        "Hello" -> "Greeting"
        // Sets result to "Unknown" if no previous condition is satisfied
        else -> "Unknown"
    }
    println(result) // Greeting

    // This can be "Green", "Yellow", or "Red"
    val trafficLightState = "Red"

    val trafficAction = when (trafficLightState) {
        "Green" -> "Go"
        "Yellow" -> "Slow down"
        "Red" -> "Stop"
        else -> "Malfunction"
    }
    println(trafficAction) // Stop

    // alternative: when without a subject
    val trafficActionWithoutSubject = when {
        trafficLightState == "Green" -> "Go"
        trafficLightState == "Yellow" -> "Slow down"
        trafficLightState == "Red" -> "Stop"
        else -> "Malfunction"
    }
    println(trafficActionWithoutSubject) // Stop

    for (number in 1..5) {
        // number is the iterator and 1..5 is the range
        print(number)
    }
    println()

    for (number in 1..4) print("$number ") // 1 2 3 4
    println()
    for (number in 1..<4) print("$number ") // 1 2 3
    println()
    for (number in 4 downTo 1) print("$number ") // 4 3 2 1
    println()
    for (number in 1..5 step 2) print("$number ") // 1 3 5
    println()
    for (letter in 'a'..'d') print("$letter ") // a b c d
    println()
    for (letter in 'z' downTo 's' step 2) print("$letter ") // z x v t
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
