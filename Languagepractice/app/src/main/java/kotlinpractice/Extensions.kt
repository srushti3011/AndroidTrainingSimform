package kotlinpractice

class Extensions {
}

fun String.append(toAppend: String): String {
    return this+toAppend
}

fun Int.add(num: Int): Int {
    return this + num
}

fun List<Int>.firstEvenNo(): Int? {
    return this.asSequence().filter { it % 2 == 0 }.take(1).elementAtOrNull(0)
}

class Colors(val name: String, val message: String) {
    init {
        println("Color init")
    }
}

fun Colors.displayColor(): Unit {
    println("${this.name}")
}

class HasCompanion() {
    companion object {
        fun display() {
            println("Companion's display")
        }
    }
}

fun HasCompanion.Companion.newMethod() {
    println("Extension method for Companion")
}

class ExtensionInClass {
    fun String.displayIt() {
        println("Display it inside ExtensionInClass class $this")
    }
    fun display() {
        "234".displayIt()
    }
}

fun Any.printVal() {
    println("$this")
}

fun main() {
    var str = "Hello"
    var str1 = "World"
    print(str1.append(str))
    println(2.add(6))
    println(listOf(5,15,20).firstEvenNo())

    val colorOne = Colors(name = "Red", message = "Danger")
    colorOne.displayColor()
    HasCompanion.newMethod()

    val instanceTwo = ExtensionInClass()
    instanceTwo.display()
}

