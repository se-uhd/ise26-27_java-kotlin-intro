package de.seuhd.teaching.intro.kotlin

interface Machine {
    fun brew(): String
    fun clean(): String
}

class BasicMachine : Machine {
    override fun brew() = "coffee"
    override fun clean() = "cleaned"
}

class EspressoMachine(delegate: Machine) : Machine by delegate {
    override fun brew() = "espresso"
}

fun main() {
    val machine = EspressoMachine(BasicMachine())
    println(machine.brew()) // espresso
    println(machine.clean()) // cleaned
}
