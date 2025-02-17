package kotlinexercise

class Extensions {
}

// 1
fun Int.checkEven(): Boolean {
    return this % 2 == 0
}

// 2
fun MutableList<String>.convertToUpperCase() {
    this.forEachIndexed{ index, value ->
        this[index] = value.uppercase()
    }
}

// 3
fun String.countVowels(): Int {
    return this.toCharArray().filter { it in listOf('a', 'e', 'i', 'o', 'u') }.count()
}

// 4
fun MutableList<String>.reverseInPlace() {
    this.forEachIndexed{ index, value ->
        this[index] = value.reversed()
    }
}

// 5
fun Map<String, String>.getSortedKeys(): List<String> {
    val keys = this.keys
    return keys.sorted()
}

fun main() {
    println(2.checkEven())

    val list = mutableListOf("hello", "world")
    list.convertToUpperCase()
    list.forEach{
        println(it)
    }

    println("abcdefghi".countVowels())

    val listElementsToBeReversed = mutableListOf("abcde", "mnopq")
    listElementsToBeReversed.reverseInPlace()
    listElementsToBeReversed.forEach{
        println(it)
    }

    val getMapKeysSorted = mapOf(
        "apples" to "fruits",
        "cabbage" to "vegetables",
        "orange" to "fruit",
        "mango" to "fruit"
    )
    println(getMapKeysSorted.getSortedKeys())
}