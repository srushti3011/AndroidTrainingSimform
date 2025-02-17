package kotlinpractice

class Inline {

}
inline fun makeNonInLine( printVal: (value: Int) -> Unit, noinline getVal: () -> Int) {
    println("printVal would be inlined")
    printVal(5)
    getVal()
    println("getVal is not inlined")
}

inline fun takesLambda(printVal:(value: Int) -> Unit, value: Int) {
    println("Before lambda")
//    Thread {
//        printVal(value)
//    }
    printVal(value)
    println("Lambda completed")
}

inline fun <reified T> checkTypeOfElement(list: List<*>): Boolean {
    val secondElement = list.get(0)
//    val result = secondElement is T
    return true
}

fun main() {
    makeNonInLine(printVal = {
            value -> println(value)
        return
    }, getVal = {
        return@makeNonInLine 5
    })
    takesLambda(printVal = {value -> println("executing lambda $value") }, value = 5)

    println(checkTypeOfElement<Int>(listOf(2, 5, 5)))

}

