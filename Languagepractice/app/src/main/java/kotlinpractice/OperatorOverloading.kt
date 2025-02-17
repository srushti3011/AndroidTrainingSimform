package kotlinpractice

class OperatorOverloading {
}

class Point(var x: Int, var y: Int) {
    fun display() {
        println("x = $x, y = $y")
    }

    operator fun unaryMinus(): Point {
        return Point(-x, -y)
    }

    operator fun plus(other: Point): Point {
        return Point(x = this.x + other.x, y = this.y + other.y )
    }

    operator fun minus(other: Point): Point {
        return Point(x = this.x - other.x, y = this.y - other.y)
    }

    operator fun compareTo(other: Point): Int {
        val comparingX = this.x - other.x
        val compareY = this.y - other.y
        if(comparingX > 0 && compareY > 0) {return 1}
        else if(comparingX < 0 && compareY < 0) {return -1}
        return 0
    }

    operator fun timesAssign(other: Point): Unit {
        this.x *= other.x
        this.y *= other.y
    }
}

fun main() {
    val pointOne = Point(x = 5,y = 6)
    println((-pointOne).display())

    val pointTwo = Point(x = 5,y = 7)
    println(pointOne > pointTwo)

    println((pointOne+(-pointTwo)).display())
    pointOne *= pointTwo

    println(pointOne.display())
}