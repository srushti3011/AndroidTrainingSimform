package kotlinpractice

class Generics {
}

class Container<T>(var data: T) {
    fun set(value: T) {
        data = value
    }
    fun get(): T {
        return data
    }
}

fun <T> printGeneric(value: T): Unit {
    println("Generic Print. The value passed is $value")
}

open class ExampleClass {
    fun display() {
        println("Display of Example Class")
    }
}

open class TypeA: ExampleClass() {
    fun displayTypeA() {
        println("Type A Display")
    }
}

class ChildA: TypeA() {
    fun displayOfChildA() {
        println("Display of child A")
    }
}

class Generic <in T> {
    fun useIn(value: T) {
        println("Generic class $value")
    }
}

class OutType<out R>(val gotValue: R) {
    fun numCalc(): R {
        return gotValue
    }
}

class InOutBoth <in T, out R>(val value: R) {
    fun printIn(value: T) {
        println(value)
    }
    fun returnR(): R {
        return value
    }
    fun simpleMethod() {
        println("Hello")
    }
}

fun <T> printArr(arr: Array<T>){
    arr.forEach { println(it) }
}

fun <T: Comparable<T>> findLargest(list: List<T>): T {
    var max = list.get(0)
    for (element in list) {
        if (element > max) {
            max = element
        }
    }
    return max
}

fun <T> usingWhere(value: T): Unit where T:Comparable<T>, T:CharSequence {
    println(value)
}

inline fun <reified T> T.hiddenType() {
    println(5 is T)
}

fun main() {
    val intContainer = Container<Int>(data = 4)
    println(intContainer.get())
    intContainer.set(10)
    println(intContainer.get())

    val floatContainer = Container<Float>(data = 0.4f)
    println(floatContainer.get())
    floatContainer.set(0.5f)
    println(floatContainer.get())

    printGeneric<String>("hello")

    val instanceOne: Generic<TypeA> = Generic()
    val instanceTwo: Generic<ChildA> = instanceOne
    instanceOne.useIn(ChildA())

    val outTypeOne: OutType<TypeA> = OutType(ChildA())
    val outTypeTwo: OutType<ExampleClass> = outTypeOne
    println(outTypeTwo.numCalc())

    val inOutInstanceOne = InOutBoth<TypeA, TypeA>(TypeA())
    val inOutInstanceTwo: InOutBoth<ChildA, ExampleClass> = inOutInstanceOne
    inOutInstanceTwo.printIn(ChildA())
    println(inOutInstanceTwo.returnR())
    inOutInstanceTwo.simpleMethod()

    val arrOfInt: Array<Int> = arrayOf(10, 20, 30)
    val arrOfNums: Array<out Number> = arrOfInt

    val arrOfNum: Array<Number> = arrayOf(5, 2.5, 7, 8.5f)
    val arrOfFloat: Array<in Float> = arrOfNum
    printArr(arrOfNums)

    val maxValue = findLargest(listOf("abcde", "b", "c"))
    println(maxValue)

    usingWhere("hello")

    println((5.5).hiddenType())
    println(2.hiddenType())
}