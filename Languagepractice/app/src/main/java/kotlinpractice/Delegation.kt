package kotlinpractice

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

class Delegation {
}

interface Printable {
    fun doPrinting()
}

class PrintOperations(): Printable {
    override fun doPrinting() {
        println("Printing the content")
    }
}

class PrintPress(private val printOperation: Printable): Printable by printOperation {
    fun managePrinting() {
        println("Managing to print")
    }
}

class PersonDelegate() {
    val name: String by lazy {
        println("assigning to name")
        "Mally"
    }
    val age: Int
    init {
        age = 20
    }
    var address: String by Delegates.observable("Surat") {
            property, oldValue, newValue -> println("setting the value of ${property.name} from $oldValue to $newValue")
    }
    var country: String by Delegates.vetoable("India") {
            property, oldValue, newValue -> newValue in listOf("India", "USA", "Germany")
    }
}

fun functionContainingLazyProperty (callToInitialize: () -> String) {
    val accessToInitialize by lazy { callToInitialize() }

    println("Done initialization")
    println(accessToInitialize)
}

class KeysValues(map: Map<String, Any>) {
    val name: String by map
    val age: Int by map
}

class DelegateToSomeone {
    init {
        println("Init of DelegateToSomeone")
    }
    val propertyOne: String by DelegatedHere()
}

class DelegatedHere {
    operator fun getValue(thisRef: DelegateToSomeone, property: KProperty<*>): String {
        return "this is returned"
    }
}

class TestClass {
    var testPropertyOne: Int by AnotherTestClass()::anotherTestClassPropertyOne
}
class AnotherTestClass {
    var anotherTestClassPropertyOne: Int = 1

    operator fun getValue(thisRef: TestClass, property: KProperty<*>, value: Int): Int {
        return anotherTestClassPropertyOne
    }

    operator fun setValue(thisRef: TestClass, property: KProperty<*>, value: Int): Unit {
        println("setValue called")
        anotherTestClassPropertyOne = value
    }
}

fun main() {
    val printOperationOne = PrintOperations()
    val printPressOne = PrintPress(printOperationOne)
    printPressOne.doPrinting()
    printPressOne.managePrinting()
    printOperationOne.doPrinting()

    val personOne = PersonDelegate()
    print(personOne.age)
    println(personOne.name)
    println(personOne.name)
    println(personOne.address)
    personOne.address = "Ahmedabad"
    println(personOne.country)
    personOne.country = "France"
    println(personOne.country)
    personOne.country = "USA"
    println(personOne.country)

    functionContainingLazyProperty {
        println("ok")
        "Hello"
    }

    val keyValueOne = KeysValues(mapOf("name" to "Mally", "age" to 20))
    println(keyValueOne.name)

    val instanceOne = DelegateToSomeone()
    println(instanceOne.propertyOne)

    val testClassInstanceOne = TestClass()
    println(testClassInstanceOne.testPropertyOne)
    testClassInstanceOne.testPropertyOne = 10
    println(testClassInstanceOne.testPropertyOne)
}