package kotlinpractice

class NullSafety {
}
class StudentNullSafety(val name: String, var address: Address?)

class Address(val city: String, var country: String)
fun main() {
    var numOne: Int? = 5
    if(numOne != null) {
        println(numOne)
    } else {
        print("Value is null")
    }

    var name: String? = null
    print(name?.length)
    name = "Hello"
    print(name?.length)

    val address = Address(city = "Ahmedabad", country = "India")
    val student = StudentNullSafety(name = "Mally", address = null)
    println(student.address?.country?.length)

    val str: String? = null
    print(str?.length ?: "can't access")
    println(str!!)

    val value = "this is string" as? String
    println(value)

    val listContatiningNull = listOf(1,2,null,3,4)
    println(listContatiningNull)

    val filteredList = listContatiningNull.filterNotNull()
    println(filteredList)
}