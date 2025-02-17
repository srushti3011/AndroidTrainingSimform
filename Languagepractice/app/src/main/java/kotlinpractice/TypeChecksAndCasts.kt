package kotlinpractice

class TypeChecksAndCasts {
}

fun main() {
    fun checkAndPrint (name: Any?) {
        if (name is String) {
            print("The $name is string")
        } else {
            println("String not passed")
        }
    }

    fun printIncrementNum (num: Any) {
        if (num !is Int) {
            println("Integer not passed")
            return
        }
        var incrementedNum = num+1
        println("Incremented num: $incrementedNum")
    }

    checkAndPrint("hello")
    printIncrementNum(5)

    val stringOne = "stringValue"
    when (stringOne) {
        is String -> print("String value is $stringOne")
        else -> print("not string")
    }

    val value: Any = 5
    val tryCastingToString = value as String?
    print(tryCastingToString)
}