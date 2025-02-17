package kotlinpractice

class ScopeFunctions {
}

class PersonScopeFunctions(
    var name: String = "",
    var age: Int = 0
)

fun main() {
    val personOne = PersonScopeFunctions().apply {
        name = "MallY"
        age = 20
    }
    personOne.also {
        println(it.name)
        println(it.age)
    }
    with(personOne) {
        name = "Sally"
        age = 21
    }

    val personTwo: PersonScopeFunctions? = null
    personTwo?.let {
        println(it.name)
    }
    personTwo?.run {
        println(name)
    }
    run {
        println("hello")
        "hello"
    }

    PersonScopeFunctions().apply {
        name = "Joe"
        age = 30
    }.also {
        println(it.name)
        println(it.age)
    }
}