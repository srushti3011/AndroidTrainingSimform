package kotlinpractice

class ThisExpression {
}

fun main() {
    fun display() {
        println("Global display")
    }

    class ExampleClassForThisExpression {
        private fun display() {
            println("Class display")
        }
        fun callDisplay() {
            this.display()
            display()
        }
    }
    val exampleInstanceOne = ExampleClassForThisExpression()
    exampleInstanceOne.callDisplay()
}