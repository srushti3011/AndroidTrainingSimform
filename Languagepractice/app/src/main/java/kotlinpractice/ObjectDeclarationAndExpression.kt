package kotlinpractice

class ObjectDeclarationAndExpression {
}

object PersonObjectDeclaration {
    init {
        println("Object Declaration Person initialized")
    }
    val name: String = "Joe Peter"
    fun startWork() {
        println("${this.name} is starting the work")
    }
    fun workDone() {
        println("${this.name} has completed the work")
    }
}

fun interface Calculatable {
    fun add(num1: Int, num2: Int)
}

open class Information {
    fun exampleMethod() {
        print("Example method")
    }
}

object InfoChild: Information() {
    fun infoChildMethod() {
        super.exampleMethod()
    }
}

fun main() {
    println("Person yet not accessed")
    PersonObjectDeclaration.startWork()
    PersonObjectDeclaration.workDone()

    val flower = object {
        init {
            println("Object Expression flower initialized")
        }
        val name = "sunflower"
        val color = "yellow"

        fun displayFlower() {
            println("This flower is ${this.name} $this")
        }
    }
    println("Flower initializing")
    flower.displayFlower()

    val addThem = object : Calculatable {
        override fun add(num1: Int, num2: Int) {
            println(num1+num2)
        }
    }
    addThem.add(num1 = 5, num2 = 10)
    InfoChild.infoChildMethod()
}
