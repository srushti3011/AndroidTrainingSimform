package kotlinexercise

import kotlin.properties.Delegates

class Delegation {
}

class Business(val name: String, val expenses: Int, val collection: Int) {
//    1
    var headquarters: String by Delegates.observable("India") {
            property, oldValue, newValue -> println("headquarter is changed")
    }

//    3
    val profit: Int by lazy {
        println("Profit property was lazy")
        collection - expenses
    }

//    4
    var numberOfEmployees: Int by Delegates.vetoable(50) {
        property, oldValue, newValue ->  newValue > 20
    }

    fun viewCompanyInfo() {
        println("Name: ${this.name} Expenses: ${this.expenses} Collection: ${this.collection} Profit: ${this.profit} Headquarters: ${this.headquarters} No. of Employees: ${this.numberOfEmployees}")
    }
}

// 2
interface Teachable {
    fun teach()
}
open class Teacher: Teachable {
    open override fun teach() {
        println("The teacher is teaching")
    }
}
class EnglishTeacher: Teacher() {
    override fun teach() {
        println("English Teacher Teaching")
    }
}
class Principal(var teacher: Teachable): Teachable by teacher {
    fun delegateWork() {
        println("Delegating work to Teacher")
        teach()
    }
}

fun main() {
    val clothingBrand = Business(name = "XYZ", expenses = 107, collection = 200)
    println(clothingBrand.profit)
    clothingBrand.viewCompanyInfo()
    clothingBrand.headquarters = "USA"
    clothingBrand.numberOfEmployees = 15
    clothingBrand.viewCompanyInfo()

    val englishTeacher = EnglishTeacher()
    val principalOne = Principal(englishTeacher)
    principalOne.delegateWork()
}