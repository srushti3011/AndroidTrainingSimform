package kotlinpractice

class OOP {
}
// OOP

class DemoClass(
    val examplePropertyOne: String,
    val examplePropertyTwo: Int = 2
) {
    var examplePropertyThree: Int = 0
    constructor(examplePropertyThree: Int, examplePropertyOne: String, examplePropertyTwo: Int): this(examplePropertyOne, examplePropertyTwo) {
        println(this.examplePropertyOne)
        println("Initializing now")
        this.examplePropertyThree = examplePropertyThree
    }
    init {
        println("First init")
    }
    init {
        println("Second init")
    }
}

class Student(var name: String, var age: Int, var address: String) {
    companion object {
        var studentCount: Int = 0

        fun displayCount() {
            println("The total students registered are ${Student.studentCount}")
        }
    }
    init {
        println("Init called")
        Student.studentCount += 1
    }
    fun displayStudent() {
        println("Name: ${this.name} Age: ${this.age} Address: ${this.address}")
    }
}

open class Parent() {
    init {
        println("Parent Init")
    }
    open fun exampleMethod() {
        println("Example method of Parent")
    }
    fun cantOverrideMethod() {
        println("Can't be overridden")
    }
}

class Child() : Parent() {
    init {
        println("Child init")
    }
    override fun exampleMethod() {
        super.exampleMethod()
        println("Example method of Child Class")
    }
}
open class ParentOne() {
    open fun display() {
        println("Display of parent one")
    }
}

open class ParentTwo() {
    open fun display() {
        println("Display of parent two")
    }
}

class Properties {
    val name: String
        get() = this.toString()
    val width: Double = 1.2
    val length: Double = 2.4
    var area : Double = 0.0
        get() = this.width * this.length
        set(value) {
            field = value
        }
}

class OrderOfExecution(val name: String) {
    var age: Int? = null
    constructor(age: Int, name: String): this(name) {
        println("Secondary constructor called")
        this.age = age
    }
    init {
        println("Value of age is ${this.age}")
    }
}

fun main() {
    var demoOne = DemoClass(10, "Demo", 5)

    val studentOne = Student(name = "Mally", age = 25, address = "Ahmedabad")
    studentOne.displayStudent()

    val studentTwo = Student("Sally", 30, "Surat")
    studentTwo.displayStudent()

    Student.displayCount()

    val childOne = Child()
    childOne.exampleMethod()

    val one =  OrderOfExecution(5, "Mally")
}