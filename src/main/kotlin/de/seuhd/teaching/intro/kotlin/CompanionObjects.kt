package de.seuhd.teaching.intro.kotlin

class User private constructor(val loginName: String) {
    companion object {
        const val MAX_LOGIN_NAME_LENGTH = 255

        fun create(loginName: String): User {
            require(loginName.length <= MAX_LOGIN_NAME_LENGTH)
            return User(loginName)
        }
    }
}

fun main() {
    val user = User.create("jane_doe")
    println(user.loginName) // jane_doe
    println(User.MAX_LOGIN_NAME_LENGTH) // 255
    // User("jane_doe") // error: the constructor is private
}
