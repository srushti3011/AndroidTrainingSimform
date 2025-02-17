package kotlinpractice

class EnumClasses {
}

enum class Season {
    WINTER,
    SUMMER,
    MONSOON
}

enum class IndianCurrency(var valueOfNote: Int) {
    Ten(valueOfNote = 10),
    Twenty(valueOfNote = 20),
    Fifty(valueOfNote = 50),
    Hundred(valueOfNote = 100),
    FiveHundred(valueOfNote = 500),
    TwoThousand(valueOfNote = 2000)
}

interface Doable {
    fun displayCase()
}

enum class Fruits: Doable {
    Mango,
    Apple;
    override fun displayCase() {
        println("$this")
    }
}

enum class AnimalTypes {
    Domestic {
        override fun currentCase(){
            println("current case is Domestic")
        }
    },
    Wild {
        override fun currentCase(){
            println("current case is Wild")
        }
    };

    abstract fun currentCase()
}

fun main() {
    val winter = Season.WINTER
    println(winter.name)
    println(winter.ordinal)
    val seasons = Season.values()
    val seasonsEntries = Season.entries
    println(seasonsEntries)
    seasons.forEach { println(it) }

    when(winter) {
        Season.WINTER -> println("Winter season")
        Season.SUMMER -> println("Summer season")
        Season.MONSOON -> println("Monsoon season")
    }

    val currencyNoteOne = IndianCurrency.Ten
    println(currencyNoteOne.valueOfNote)

    Fruits.Mango.displayCase()
    Fruits.Apple.displayCase()

    AnimalTypes.Wild.currentCase()
}