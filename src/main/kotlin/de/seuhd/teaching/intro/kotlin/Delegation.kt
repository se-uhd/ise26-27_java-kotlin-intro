package de.seuhd.teaching.intro.kotlin

class CountingSet<T>(
    private val inner: MutableSet<T> = mutableSetOf(),
) : MutableSet<T> by inner {
    var addCalls = 0

    override fun add(element: T): Boolean {
        addCalls++
        return inner.add(element)
    }
}

val config: String by lazy {
    println("loading config")
    "dev"
}

fun main() {
    val set = CountingSet<String>()
    set.add("a")
    set.add("b")
    set.add("a")
    println(set.size) // 2
    println(set.addCalls) // 3

    println(config) // loading config, then dev
    println(config) // dev
}
