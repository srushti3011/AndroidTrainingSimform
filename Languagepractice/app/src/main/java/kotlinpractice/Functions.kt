package kotlinpractice

class Functions {
}

fun main() {
    fun add(numOne: Int, numTwo: Int): Int {
        return numOne + numTwo
    }
    val result = add(5,8)
    println(result)

    val resultTwo = add(numTwo = 1, numOne = 2)
    println(resultTwo)

    fun multiply(numOne: Int = 1, numTwo: Int = 1): Int {
        return numOne * numTwo
    }
    val answer = multiply(5, 10)
    println(answer)

    fun divide(numOne: Int, numTwo: Int): Double = numOne.toDouble()/numTwo
    println(divide(5, 2))

    fun customGreet(name: String): String {
        return "Hello $name"
    }
    println(customGreet("Mally"))

    fun printVals(vararg str: String) {
        for (element in str) {
            print("$element ")
        }
    }
    printVals(str = arrayOf("Hello", "everyone"))

    fun<T> genericPrint(value: T) {
        println("The value passed is $value")
    }
    genericPrint(5.4)

    fun parentFunc() {
        var value = 5

        fun inc(): Int {
            value = value+1
            return value
        }
        for (i in 1..4) {
            println(inc())
        }
    }
    parentFunc()

    val addVals: (Int, Int) -> Int = {a, b -> a + b}
    println(addVals(10,15))

    fun mathOperation(operation: (Int, Int) -> Int) {
        println("Inside Math Operation")
        print(operation(5,10))
    }
    mathOperation(addVals)
    mathOperation() {num1, num2 -> num1 * num2}

    fun multiplyNumbers() {
        val num1 = 5
        val num2 = 6
        val multiplyLogic: () -> Int = { num1 * num2}
        println(multiplyLogic())
    }
    multiplyNumbers()

    val numbers = listOf(1,3,4,6,7,8,9,10,11,12)
    numbers.map { element -> element * element }
    numbers.mapIndexed() { index, num -> index + num }
}