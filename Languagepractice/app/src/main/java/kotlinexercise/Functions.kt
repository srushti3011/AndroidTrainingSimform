package kotlinexercise

class Functions {
}

fun printList(applyThis: (Int) -> Unit, list: List<Int> ) {
    for(element in list) {
        applyThis(element)
    }
}

fun String.reverseString(): String {
    return this.reversed()
}

fun greet(name: String = "User") {
    println("Hello $name")
}

inline fun printMessage() {
    println("Hello user")
}

fun main() {
//    1
    printList(applyThis = {
            it -> println(it)
    }, list = listOf(5,10,15,20,25))

//    2
    println("abcde".reverseString())

//    3
    greet(name = "Joe")
    greet()

//    4
    val findSquare: (Int) -> Int = {
        it -> it * it
    }
    println(findSquare(5))

//    5
    printMessage()
}
