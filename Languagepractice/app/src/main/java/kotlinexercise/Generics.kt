package kotlinexercise

class Generics {
}

// 1
fun <T: Comparable<T>> findMax(list: List<T>): T {
    var max = list[0]
    for (element in list) {
        if (element > max) {
            max = element
        }
    }
    return max
}

// 2
class Box<T> (var value: T) {
    fun get(): T {
        return value
    }

    fun set(newValue: T) {
        value = newValue
    }
}

// 3
inline fun <reified T> checkType(valueToCheck: Any) {
    if (valueToCheck is T) {
        println("Yes")
    } else {
        println("No")
    }
}

// 4
open class ParentClass {
    fun parentDisplay() = println("Display of ParentClass")
}
open class ChildClass: ParentClass() {
    fun childDisplay() = println("Display of ChildClass")
}
class GrandChildClass: ChildClass() {
    fun grandChildDisplay() = println("Display of ChildClass")
}
class Generic<in T, out R> {
    fun genericClassDisplay() = println("Generic Class's Display")
}

// 5
fun <T> mergeLists(listOne: List<T>, listTwo: List<T>): List<T> {
    val mergedList = listOne + listTwo
    return mergedList
}

fun main() {
    val list = listOf(1,10,5,4,20,15,18)
    println(findMax(list))

    var listTwo = listOf('a', 'z', 'm', 'n')
    println(findMax(listTwo))

    var intBox = Box<Int>(value = 5)
    println(intBox.get())
    intBox.set(newValue = 15)
    println(intBox.get())

    checkType<Int>(valueToCheck = 0.5f)

    val instanceOfGenericOne = Generic<ChildClass, ChildClass>()
    instanceOfGenericOne.genericClassDisplay()

    val instanceOfGenericTwo: Generic<GrandChildClass, ChildClass> = instanceOfGenericOne
    val instanceOfGenericThree: Generic<ChildClass, ParentClass> = instanceOfGenericOne
    val instanceOfGenericFour: Generic<GrandChildClass, ParentClass> = instanceOfGenericOne

    val mergedList = mergeLists(listOne = listOf(1,2,3), listTwo = listOf(4, 5, 6))
    mergedList.forEach { num -> println(num) }
}