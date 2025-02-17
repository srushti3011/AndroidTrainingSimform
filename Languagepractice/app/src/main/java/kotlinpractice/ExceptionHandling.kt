package kotlinpractice

class ExceptionHandling {
}

fun main() {
    fun printName(name: String?) {
        if (name == null) {
            throw IllegalArgumentException("Name is null")
        }
        println("Name passed is $name")
    }

    try {
        printName(null)
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    println("After the try catch block")

    class MyException(message: String): Exception(message)

    fun throwMyException() {
        if(5 > 0) {
            throw MyException("This is my custom exception")
        } else {
            print("No exception is thrown")
        }
    }

    try {
        throwMyException()
    } catch (e: MyException) {
        println(e.message)
    }

    fun checkAge(age: Int) {
        require(age > 18) { "You can't drive" }
        print("You can drive")
    }

    try {
        checkAge(16)
    } catch (e: Exception) {
        print(e.message)
    }

    fun checkTime(time: Int) {
        check(time > 10) { "You can't enter" }
        println("Entered")
    }

    try {
        checkTime(12)
    } catch (e: IllegalStateException) {
        print(e.message)
    }

    fun checkPass() {
        val pass = ""
        if (pass.isEmpty()) {
            error("Enter your password")
        }
    }

    try {
        checkPass()
    } catch (e: IllegalStateException) {
        println(e.message)
    } finally {
        print("This would be executed regardless of the fact that exception is raised or not")
    }
}