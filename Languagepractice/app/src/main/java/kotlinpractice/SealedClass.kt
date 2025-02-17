package kotlinpractice

class SealedClass {
}

sealed class Cities(val name: String, val country: String) {
    init {
        println("Sealed class init")
    }
    fun displayCity() {
        println("Name ${this.name} is situated in ${this.country}")
    }
}

class IndiaCities(name: String, country: String): Cities(name = name, country = country) {
    init {
        println("IndiaCities init")
    }
}

sealed interface Travelable {
    fun travelByCar()
    fun travelByBus()
    fun travelByTrain()
    fun travelByAir()
    fun travelByWaterways()
}

class People: Travelable {
    override fun travelByCar() {
        println("travel by car")
    }

    override fun travelByBus() {
        println("travel by bus")
    }

    override fun travelByTrain() {
        println("travel by train")
    }

    override fun travelByAir() {
        println("travel by air")
    }

    override fun travelByWaterways() {
        println("travel by waterways")
    }
}

sealed class APIStates {
    data class Error(val errorMessage: String): APIStates()
    data class Success(val response: String): APIStates()
}

fun main() {
    val ahm = IndiaCities(name = "Ahmedabad", country = "India")
    ahm.displayCity()

    val groupOfPeopleOne = People()
    groupOfPeopleOne.travelByTrain()

    val gotResponse: APIStates = APIStates.Success(response = "Response available")

    fun handleAPI(state: APIStates) {
        when(state) {
            is APIStates.Error -> println(state.errorMessage)
            is APIStates.Success -> println(state.response)
        }
    }
    handleAPI(gotResponse)
}
