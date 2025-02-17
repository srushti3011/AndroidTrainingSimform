package kotlinpractice

class AbstractClasses {
}

abstract class Countries(
    val countryName: String
) {
    abstract fun display()
    open fun className() {
        println("This is Countries class")
    }
}

class City(countryName: String, val cityName: String): Countries(countryName = countryName) {
    override fun display() {
        println("city is ${this.cityName} located in country ${this.countryName}")
    }
}

fun main() {
    val cityOne = City(countryName = "India", cityName = "Surat")
    cityOne.display()
    cityOne.className()

}