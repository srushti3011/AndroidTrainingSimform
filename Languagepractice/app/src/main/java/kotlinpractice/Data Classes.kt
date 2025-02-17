package kotlinpractice

class DataClasses {
}

data class StudentData(
    var name: String,
    var age: Int,
    var subjectsEnrolled: MutableList<String>
) {
    fun display() {
        println("Display of StudentData called")
    }
}

fun main() {
    val studentOne = StudentData(
        name = "Joe",
        age = 20,
        subjectsEnrolled = mutableListOf("English", "Math", "Social Studies")
    )

    val studentTwo = StudentData(
        name = "Joe",
        age = 20,
        subjectsEnrolled = mutableListOf("English", "Math", "Social Studies")
    )

    println(studentOne)
    studentOne.display()
    println(studentOne == studentTwo)
    val studentThree = studentOne.copy(age = 5)
    println(studentThree)
    println(studentOne.hashCode())
    println(studentThree.hashCode())
    println(studentOne.equals(studentThree))
    println(studentOne == studentThree)
    println(studentOne === studentThree)
    println(studentOne == studentTwo)
    studentOne.age = 21
    println(studentOne)

    val (name, age, subjectsEnrolled) = studentOne
    println("Destructured values\n$name, $age, $subjectsEnrolled")
}