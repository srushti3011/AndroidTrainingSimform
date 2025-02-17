package kotlinpractice

class TypeAlias {
}

typealias Predicate<T> = (T) -> Boolean
typealias Num = Int
typealias list<T> = List<T>
typealias changeableList<T> = MutableList<T>

fun main() {
    val p: Predicate<Int> = { it % 2 == 0 && it > 0 }
    println(listOf(1, -2, 5, 6, -100, 100).filter(p))

    val m: Num = 5
    println(m)

    val listOne: list<Int> = listOf(5,7)
    println(listOne)

    val listTwo: changeableList<Float> = mutableListOf(0.5f, 10.8f, 3.5f)
    print(listTwo)
}