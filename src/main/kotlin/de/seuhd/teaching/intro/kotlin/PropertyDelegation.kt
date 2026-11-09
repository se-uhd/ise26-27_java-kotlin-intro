package de.seuhd.teaching.intro.kotlin

val menu: List<String> by lazy {
    println("loading menu")
    listOf("Espresso", "Latte")
}

private var cachedMenu: List<String>? = null

val menuByHand: List<String>
    get() {
        if (cachedMenu == null) {
            println("loading menu by hand")
            cachedMenu = listOf("Espresso", "Latte")
        }
        return cachedMenu!!
    }

fun main() {
    println(menu) // loading menu
                  // [Espresso, Latte]
    println(menu) // [Espresso, Latte]

    println(menuByHand) // loading menu by hand
                        // [Espresso, Latte]
    println(menuByHand) // [Espresso, Latte]
}
