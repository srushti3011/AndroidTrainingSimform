package kotlinexercise

class Collections {
}

fun main() {
//    1
    val filterEven = listOf(1,10,100,25,175)
    println(filterEven.filter { it%2 == 0 })

//    2
    val squareThem = listOf(2,5,8,1,4,7)
    println(squareThem.map { it * it })

//    3
    val max = squareThem.maxOrNull()
    println(max)

//    4
    val strings = listOf("India", "Germany", "China", "Croatia")
    println(strings.groupBy { it -> it.length })

//    5
    val mapOne = mapOf(1 to "A", 2 to "B")
    val mapTwo = mapOf(1 to "ABCD", 2 to "EFGH", 3 to "hello")

    val mergedMapKeys = mapOne.keys + mapTwo.keys
    println(mergedMapKeys)

    val newMap = mutableMapOf<Int, MutableList<String>>()
    mapOne.forEach {
        newMap.put(it.key, mutableListOf(it.value))
    }
    mapTwo.forEach {
        if(!newMap.containsKey(it.key)) {
            newMap.put(it.key, mutableListOf(it.value))
        }
        else {
            newMap.get(it.key)?.add(it.value)
        }
    }
    newMap.forEach { println("${it.key} ${it.value}") }
}