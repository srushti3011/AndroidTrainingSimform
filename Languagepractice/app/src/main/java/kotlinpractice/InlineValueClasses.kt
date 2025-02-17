package kotlinpractice

class InlineValueClasses {
}

class FName(val name: String)
class LName(val name: String)
class PersonName(
    val firstN: FName,
    val lName: LName
) {
    fun displayFullName() {
        println("${this.firstN.name} ${this.lName.name}")
    }
}

@JvmInline
value class FirstName(val name: String)

@JvmInline
value class LastName(val name: String)

class PersonUsingInline(val firstName: FirstName, val lastName: LastName) {
    fun personName() {
        println("${this.firstName.name} ${this.lastName.name}")
    }
}

fun main() {
    val fName = FName(name = "Joe")
    val lName = LName(name = "Peter")
    val personJoe = PersonName(firstN = fName, lName = lName)
    personJoe.displayFullName()
    val first = FirstName(name = "Joe")
    val last = LastName(name = "Peter")
    val personOne = PersonUsingInline(firstName = first, lastName = last)
    personOne.personName()
}