package kotlinexercise

class SealedClass {
}

// 1
sealed class Result {
    data class Success (
        var data: String
    ): Result()
    data class Error (
        var errorMessage: String
    ): Result()
    data class Loading(
        var loadingMessage: String
    ): Result()
}
// 3
sealed class NetworkError: Result() {
    data class NetworkProblem (
        var networkErrorMessage: String
    ): NetworkError()
}

fun printMessage(state: Result) {
    when(state) {
        is Result.Error -> println("Error")
        is Result.Success -> println("Success")
        is Result.Loading -> println("Loading")
        is NetworkError.NetworkProblem -> println("Network Error")
    }
}

// 2
sealed class AreaCalculator {
    data class Circle(
        val radius: Int
    ): AreaCalculator()

    data class Rectangle (
        val length: Int,
        val width: Int
    ): AreaCalculator()

    data class Triangle (
        val base: Int,
        val height: Int
    ): AreaCalculator()
}

fun calculateArea(shape: AreaCalculator) {
    when(shape) {
        is AreaCalculator.Circle -> {
            println("${3.14 * shape.radius * shape.radius}")
        }
        is AreaCalculator.Triangle -> {
            println("${0.5 * shape.base * shape.height}")
        }
        is AreaCalculator.Rectangle -> {
            println("${shape.width * shape.length}")
        }
    }
}

// 4
sealed class UserAction {
    data class Click (
        val click: String = "Clicking"
    ): UserAction()

    data class Swipe (
        val swipe: String = "Swiping"
    ): UserAction()

    data class Drag (
        val drag: String = "Dragging"
    ): UserAction()
}

fun monitorAction(actionPerformed: UserAction) {
    when(actionPerformed) {
        is UserAction.Click -> {
            println(actionPerformed.click)
        }
        is UserAction.Drag -> {
            println(actionPerformed.drag)
        }
        is UserAction.Swipe -> {
            println(actionPerformed.swipe)
        }
    }
}

fun main() {
    val loadingJustNow: Result = Result.Loading(loadingMessage = "Loading...")
    printMessage(loadingJustNow)

    val circle: AreaCalculator = AreaCalculator.Circle(radius = 7)
    calculateArea(circle)

    val userAction: UserAction = UserAction.Click()
    monitorAction(userAction)
}