package kotlinpractice

class CompileTimeConstants {
}

object Rectangle {
    const val sides: Int = 4
    fun printSides() {
        println("No. of sides in rectangle are ${this.sides}")
    }
}

class Shape {
    lateinit var name: String
    fun displayName() {
        println("${this.name} is the shape")
//        println(rectangle::name.isInitialized)
    }
}

fun main() {
    Rectangle.printSides()
    var rectangle = Shape()
    rectangle.name = "Rectangle"
    println(rectangle.name)
}

