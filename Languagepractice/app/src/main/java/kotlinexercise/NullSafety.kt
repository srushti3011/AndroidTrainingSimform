package kotlinexercise

class NullSafety {
}

fun checkIfNull(argumentToCheck: Int?) {
    println(argumentToCheck!!)
}

fun sumIfNotNull(list: List<Int?>): Int? {
    val m = list.filter { it != null }
        .reduce { acc, i -> (i?.let { acc?.plus(it) }) }
    return m
}

fun main() {
    val nullableInt: Int? = 4
    println(nullableInt)

//    1
    val nullableString: String? = null
    println(nullableString?.length)

//    2
    val nullableVariableOne: Int? = 5
    val needsNoNull = nullableVariableOne ?: "Fallback value to be assigned"
    println(needsNoNull)

//    3
    try {
        checkIfNull(argumentToCheck = null)
    } catch (e: Exception) {
        println("Exception raised")
    }

//    4
    nullableVariableOne?.let {
        println("the let block has started execution")
    }

//    5
    println(sumIfNotNull(listOf(10,20, null)))
}