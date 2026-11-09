package de.seuhd.teaching.intro.kotlin

class User(val loginName: String) {
    companion object {
        const val MAX_LOGIN_NAME_LENGTH = 255

        fun guest(): User {
            return User("guest")
        }
    }
}

fun main() {
    val guest = User.guest()
    println(guest.loginName) // guest
    println(User.MAX_LOGIN_NAME_LENGTH) // 255
}
