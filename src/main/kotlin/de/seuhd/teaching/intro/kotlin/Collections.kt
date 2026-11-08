package de.seuhd.teaching.intro.kotlin

fun main() {
    val readOnlyShapes = listOf("triangle", "square", "circle")
    val shapes = mutableListOf("triangle", "square", "circle")
    shapes.add("pentagon")
    println(readOnlyShapes)
    println(shapes)

    val readOnlyFruit = setOf("a", "b", "c", "c")
    println(readOnlyFruit)

    val readOnlyMap = mapOf("a" to 10, "b" to 15, "c" to 2)
    println(readOnlyMap["b"])
    println(readOnlyMap.keys)
}
