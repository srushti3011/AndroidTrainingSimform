package kotlinexercise

import android.graphics.Path.Op

class InheritanceAndPolymorphism {
}

// 1
abstract class Animal {
    abstract fun sound()
}

class Dog: Animal() {
    override fun sound() {
        println("bark")
    }
}

class Cat: Animal() {
    override fun sound() {
        println("cat noise")
    }
}

// 2
open class Parent {
    open fun printMethod() {
        println("Print method of Parent")
    }
}

class Child: Parent() {
    override fun printMethod() {
        println("Print method of Child")
    }
}

// 3
interface Vehicle {
    fun drive()
}

class CarVehicle: Vehicle {
    override fun drive() {
        println("drive car")
    }
}

class BikeVehicle: Vehicle {
    override fun drive() {
        println("drive bike")
    }
}

// 4
sealed class Operation {
    class Addition: Operation() {
        fun add(): Int {
            println("11")
            return (5 + 6)
        }
    }
    class Subtraction: Operation() {
        fun sub(): Int {
            return (10 - 5)
        }
    }
    class Multiplication: Operation() {
        fun mul(): Int {
            return (10 * 5)
        }
    }
    class Divide: Operation() {
        fun divide(): Int {
            return (15/5)
        }
    }
}
fun performOperation(operationToDo: Operation) {
    when(operationToDo) {
        is Operation.Addition -> operationToDo.add()
        is Operation.Divide -> operationToDo.divide()
        is Operation.Multiplication -> operationToDo.mul()
        is Operation.Subtraction -> operationToDo.sub()
    }
}

// 5
interface A {
    fun methodOfA()
}
interface B {
    fun methodOfB()
}
class FromTwoInterfaces: A, B{
    override fun methodOfA() {
        println("Overridden method of A")
    }

    override fun methodOfB() {
        println("Overridden method of B")
    }
}

fun main() {
    val dog = Dog()
    dog.sound()

    val cat = Cat()
    cat.sound()

    val childInstance = Child()
    childInstance.printMethod()

    val bike = BikeVehicle()
    bike.drive()

    val operation: Operation = Operation.Addition()
    performOperation(operation)

    val fromTwoInterfaces = FromTwoInterfaces()
    fromTwoInterfaces.methodOfB()
}