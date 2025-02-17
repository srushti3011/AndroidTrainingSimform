package kotlinpractice

class Interfaces {
}

interface WriteAble {
    fun pickupPen(penName: String)
    fun startWriting()
    fun closeAndPutPen()
}

class Writer(var name: String, var numOfBooksPublished: Int): WriteAble {
    override fun pickupPen(penName: String) {
        println("${this.name} has pickedup $penName pen")
    }
    override fun startWriting() {
        println("${this.name} has started writing")
    }
    override fun closeAndPutPen() {
        println("${this.name} completed")
    }
}

interface Walkable {
    fun walk()
}

interface Runnable {
    fun walk()
    fun run()
}

class Person(): Walkable, Runnable {
    override fun walk() {
        println("Start walking")
    }
    override fun run() {
        println("Start running")
    }
}

interface A {
    fun display() {
        println("A")
    }
}

interface B {
    fun display() {
        println("B")
    }
}

class C : A, B {
    override fun display() {
        println("Custom display of C")
        super<A>.display()
    }
}

fun interface Calculateable {
    fun add(num1: Int, num2: Int) : Int
}

class Nums: Calculateable {
    override fun add(num1: Int, num2: Int): Int {
        return num1 + num2
    }
}

fun interface Displayable {
    fun printFruit(name: String) {
        println("Name is $name")
    }
    fun printColor(color: String) {
        println("Color is $color")
    }
    fun printCountryOfOrigin(country: String)
}

fun main() {
    val writierOne = Writer(name = "Mally", numOfBooksPublished = 5)
    writierOne.pickupPen(penName = "Parker")
    writierOne.startWriting()
    writierOne.closeAndPutPen()

    var speed = 1
    val personOne = Person()
    println(personOne.hashCode())
    for (num in 1..5) {
        if (speed < 5) {
            personOne.walk()
        } else {
            personOne.run()
        }
        if (num == 3) {
            speed = 10
        }
    }

    val instanceOfC = C()
    instanceOfC.display()

    val numsOne = Nums()
    println(numsOne.add(num1 = 10, num2 = 15))

    val addThem: Calculateable = Calculateable { num1, num2 -> num1 + num2 }
    print(addThem.add(num1 = 5, num2 = 10))

    val fruit: Displayable = Displayable { country -> println("$country") }
    fruit.printFruit(name = "Apple")
    fruit.printColor(color = "Red")
    fruit.printCountryOfOrigin(country = "J&K, India")
}