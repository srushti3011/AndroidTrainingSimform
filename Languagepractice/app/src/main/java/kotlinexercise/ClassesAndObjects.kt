package kotlinexercise

class ClassesAndObjects {
}

// 1
class Person(val name: String, val age: Int) {
    fun displayGreeting() {
        println("Hello $name")
    }
}

// 2
object Singleton {
    fun singletonMethod() {
        println("This is singleton method")
    }
}

// 3
class Student(val name: String) {
    var city: String = ""

    constructor(name: String, city: String): this(name) {
        this.city = city
    }
}

// 4
data class User(
    val id: Int,
    val name: String
)

// 5
class Car(val brand: String, val speed: Int) {
    companion object {
        var noOfCars = 0

        fun displayNoOfCars() {
            println("No. of cars = ${Car.noOfCars}")
        }
    }
    init {
        Car.noOfCars += 1
    }
}

fun main() {
    val personOne = Person(name = "Joe", age = 30)
    personOne.displayGreeting()

    Singleton.singletonMethod()

    val studentOne = Student(name = "Joe")
    val studentTwo = Student(name = "Harry", city = "Mumbai")

    val userOne = User(id = 1, name = "Lily")
    println(userOne)

    val userTwo = userOne.copy(id = 5)
    println(userTwo)

    val carOne = Car(brand = "XYZ", speed = 100)
    val carTwo = Car(brand = "MNO", speed = 120)
    Car.displayNoOfCars()
}