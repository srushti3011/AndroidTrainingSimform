package kotlinpractice

class BackingFields {
}
class StudentClass (val name: String){
    private var _age: Int = 0
    private var marks = 0
        get() {
            return field
        }
        set(value) {
            field = value
        }

    constructor(name: String, age: Int, marks: Int): this(name = name) {
        this._age = age
        this.marks = marks
    }

    val age: Int
        get() {
            return _age
        }
}
fun main() {
    val studentOne = StudentClass(name = "Joe", age = 30, marks = 50)
    println(studentOne.age)
}
