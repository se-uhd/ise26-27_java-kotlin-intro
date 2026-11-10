package de.seuhd.teaching.intro.interop

import de.seuhd.teaching.intro.util.Helper
import de.seuhd.teaching.intro.util.MyObject

fun main() {
    // static members of a Java class
    println(Helper.GROUP_NAME)
    Helper.doSomethingElse()

    // Kotlin calls Java constructors without new
    val helper = Helper()
    helper.doSomething()

    // a public Java field
    val obj = MyObject()
    helper.changeObject(obj, 42)
    println(obj.value)

    // getName() and setName() appear as the property name
    val dog = Dog("Max")
    dog.name = "Fifi"
    println(dog.name)

    // Java does not declare whether getenv can return null.
    // Kotlin therefore types the result as the platform type String!
    val home: String? = System.getenv("HOME")
    println(home ?: "HOME is not set")
}
