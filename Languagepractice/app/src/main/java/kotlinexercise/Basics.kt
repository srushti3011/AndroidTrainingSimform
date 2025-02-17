package kotlinexercise

class Basics {
}

fun findLargestNumber(numOne: Int, numTwo: Int, numThree: Int): Int {
    if(numOne >= numTwo && numOne >= numThree) {
        return numOne
    } else if(numTwo >= numThree && numTwo >= numOne) {
        return numTwo
    } else {
        return numThree
    }
}

fun greaterThanZero(num: Int): Int {
    if(num > 0) {
        return num
    }
    return 0
}

fun lessThanZero(num: Int): Int {
    if(num < 0) {
        return num
    }
    return 0
}

fun sum(numOne: Int, numTwo: Int): Int {
    return numOne + numTwo
}

fun main() {
//    1
    println("Hello world")

//    2
    val str: String = "Hello"
    var integer: Int = 5
    integer = 15
    val nullableFloat: Float? = 0.5f
    val boolean: Boolean = true

//    3
    val firstNumber = 5
    val secondNumber = 6
    val thirdNumber = 2
    println(findLargestNumber(numOne = firstNumber, numTwo = secondNumber, numThree = thirdNumber))

//    4
    println(sum(numOne = firstNumber, numTwo = secondNumber))

//    5
    val number = -5
    when(number) {
        greaterThanZero(number) -> {
            println("Greater than 0")
        }
        lessThanZero(number) -> {
            println("Less than 0")
        }
        else -> {
            println("Equals to 0")
        }
    }

//    6
    var a = 5
    var b = 10
    println("Initial value of a and b respectively; $a $b")
    a = a + b
    b = a - b
    a = a - b
    println("After swapping, value of a and b respectively $a $b")
}