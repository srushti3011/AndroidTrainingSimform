package kotlinpractice

class NestedAndInnerClass {
}

class Outer(val propertyOne: String) {
    class Inner() {
        fun display() {
//            println("Displaying... $propertyOne") // gives error "unresolved reference"
        }
    }
}

class StudentInner(private val name: String) {
    inner class Address(val city: String) {
        fun display() {
            println("$name, $city")
        }
    }
}

class Country(val name: String) {
    inner class City(val name: String, val stateBelongingTo: String) {
        fun getDetails() {
            println("Country: ${this@Country.name}\nCity Name: ${this.name}\nState: ${this.stateBelongingTo}")
        }
    }
}

fun main() {
    val outerOne = Outer(propertyOne = "Hello")
    val innerOne = Outer.Inner()

    val studentOne = StudentInner(name = "Joe").Address(city = "Chicago")
    studentOne.display()

    val countryOne = Country(name = "India").City(name = "Jaipur", stateBelongingTo = "Rajasthan")
    countryOne.getDetails()
}