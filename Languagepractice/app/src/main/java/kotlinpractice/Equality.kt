package kotlinpractice

class Equality {
}

class StudentEquality(
    val name: String,
    val marks: Int
)

class Color(
    val name: String
) {
    override fun equals(other: Any?): Boolean {
        if(this === other) return true
        else if (other is Color) {
            return other.name == this.name
        }
        return false
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }
}

fun main() {
    val numOne = 5
    val numTwo = 5
    println(numOne == numTwo)
    println(numOne === numTwo)

    val wordOne = "hello"
    val wordTwo = "hello"
    println(wordOne == wordTwo)
    println(wordOne === wordTwo)

    val num1 = 1000
    val num2 = 1000
    println(num1 === num2)

    val floatOne = 5.6f
    val floatTwo = 5.6f
    println(floatOne == floatTwo)
    println(floatOne === floatTwo)

    val studentOne = StudentEquality(name = "Mally", marks = 25)
    val studentTwo = StudentEquality(name = "Mallu", marks = 25)
    println(studentOne == studentTwo)
    println(studentOne === studentTwo)
    val studentThree = studentTwo
    println(studentTwo == studentThree)
    println(studentTwo === studentThree)

    val colorOne = Color(name = "red")
    val colorTwo = Color(name = "red")
    println(colorOne === colorTwo)
    println(colorOne == colorTwo)

    val listOne = mutableListOf(5,10,15)
    val listTwo = mutableListOf(5,10,15)
    println(listOne === listTwo)
    println(listOne == listTwo)
    val listThree = listTwo
    println(listThree === listTwo)

    val setOne = setOf(1,3,4)
    val setTwo = setOf(1,3,4)
    println(setOne == setTwo)
}