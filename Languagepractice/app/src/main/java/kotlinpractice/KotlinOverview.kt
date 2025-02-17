package kotlinpractice

class KotlinOverview {
}

fun main() {
    var canBeChanged = 20
    println(canBeChanged)
    canBeChanged++
    println(canBeChanged)

    val cannotBeChanged = 30
    println(cannotBeChanged)

    val number = 10.4
    println( number)

    val numberFloat = 10.4f
    println(numberFloat)

    val arrOfHelper = arrayOf(1, 5, 10, 15.0)
    for (num in arrOfHelper) {
        println(num)
    }

    val arrUsingConstructor = Array(8, { i -> i*i })
    for (num in arrUsingConstructor) {
        println(num)
    }

    val stringOne = "Hello"
    val stringTwo = "World"
    println("$stringOne $stringTwo")

    val numberToBeChecked = 11
    val numberType = if (numberToBeChecked % 2 == 0) {
        "even"
    } else {
        "odd"
    }
    println(numberType)

    var charToCheck = 'n'
    when (charToCheck) {
        'a', 'e', 'i', 'o', 'u' -> println("Vowel")
        else -> println("consonant")
    }

    for (num in 1..10 step 2) {
        print("$num ")
    }
    for (index in 12 downTo 5 step 1) {
        print("$index ")
    }

    val arr = arrayOf(1,2,3,5)
    for (element in arr) {
        println("$element ")
    }

    for (index in arr.indices) {
        println("Index: $index = ${arr.get(index)}")
    }

    var iterationNumber = 5
    do {
        println("hello $iterationNumber")
        iterationNumber--
    } while(iterationNumber > 0)

    while(iterationNumber < 3) {
        println("World $iterationNumber")
        iterationNumber++
    }

    var userInput = readln()
    println(userInput)

    fun sum(a: Int, b: Int): Int {
        return a+b
    }
    println(sum(10,15))

    fun directSum(num1: Int, num2: Int) = num1 + num2
    println(directSum(25, 55))

    val marks = 50
    val passOrFail = if (marks > 35) "pass" else "fail"
    println(passOrFail)

    println(5 in 5..10)

    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.uppercase() }
        .forEach { println(it) }
}