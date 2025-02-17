package kotlinpractice

class DataTypes {
}

fun main() {

    val valueOne = 15
    val valueTwo = 15L
    val valueThree = 0.5
    val valueFour = 0.5F

    val doubleMultiplyFloat = valueFour * valueThree
    println(doubleMultiplyFloat)

    var binaryTwoOne = 0b10
    var binaryTwoTwo = 0b10
    print(binaryTwoOne == binaryTwoTwo)

    print((5F/2).toInt())

    print(1 or 5)
    print(5.1 in 1.0..5.0)
    val unsignedOne = 1U
    val byteArray = byteArrayOf(0b10, 0b11)
    print(Double.NaN == Double.NaN)
    print(-0.0 == 0.0)

    var str = "Hello"
    for (char in str) {
        println(char)
    }
    println(str.endsWith("o"))
    println(str.replace("lo", "okk"))

    val indexRange = str.indices // type IntRange
    str += 1
    println(str)

    val multiLineString = """
    Hello Everyone
    How are you
    """.trimIndent()
    println(multiLineString)

    var fruitOne = "Apple"
    print("$fruitOne spelling's length is ${fruitOne.length}")

    var multiLineStringTwo = """
    $fruitOne
    is
    red 
    in color.
    Its spelling
    length = ${fruitOne.length}
""".trimIndent()

    println(multiLineStringTwo)

    val price = """
${'$'}_9.99 
"""

    println(price)
    val numberOne = String.format("%7d", 126575687876583)
    println(numberOne)
    val numberTwo = String.format("%.3f", 1.54876542)
    println(numberTwo)
    val helloWorldString = String.format("%S %S", "hello", "world")
    println(helloWorldString)
    val arrOne = arrayOf(1,2,3)
    val join = arrOne.joinToString()
    println(join)
    var nullArray = arrayOfNulls<String>(5)
    println(nullArray.joinToString())
    var emptyArray = emptyArray<Int>()
    println(emptyArray.count())
    val arrayOfZeroes = Array(5) {10}
    println(arrayOfZeroes.joinToString())
    val twoDimensionalArray = Array(2) { j -> Array(3) { i -> i+j } }
    println(twoDimensionalArray[0][1])
    twoDimensionalArray.forEach { it.forEach { println(it) } }
    val twoDimensionalArrayOtherWay = arrayOf(arrayOf(1,2,3), arrayOf("one", "two", 5.3))
    var assignToOtherArray = arrayOf(10,20,30)
    val assignToIt = assignToOtherArray
    assignToIt[1] = 100
    for (num in assignToOtherArray) {
        println(num)
    }
    for (num in assignToIt) {
        println(num)
    }
    val checkArrOne = arrayOf(1,2,3)
    val checkArrTwo = arrayOf(1,2,3)
    println(checkArrOne == checkArrTwo)
    checkArrTwo[1] = 100
    println(checkArrOne == checkArrTwo)


}