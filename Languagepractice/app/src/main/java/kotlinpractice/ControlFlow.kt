package kotlinpractice

class ControlFlow {
}

fun main() {
    val age = 25
    var allowedToDrive: Boolean = if (age > 18) {
        true
    } else {
        false
    }
    println(allowedToDrive)

    var drivingAllowedString: String = if(age > 18) "Yes, allowed to drive" else "No, not allowed to drive"
    print(drivingAllowedString)

    val dayToday = "Tuesday"

    when (dayToday) {
        "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> println("Go to work")
        "Saturday", "Sunday" -> println("Do your own work")
        else -> println("No case matches")
    }
    val numToBeChecked = 5
    when {
        numToBeChecked > 5 -> print("Greater than 5")
        numToBeChecked < 5 -> println("Less than 5")
        else -> println("Equal to 5")
    }

    val arr = arrayOf(1,10,100,1000)
    for (num in arr) {
        print("$num ")
    }
    for (index in arr.indices) {
        println("$index = ${arr[index]}")
    }
    for ((index, value) in arr.withIndex()) {
        println("Index = $index Value = $value")
    }

    var threshold = 5
    while(threshold > 0) {
        println("Not critical")
        threshold--
    }

    var datafound = -1
    do {
        print("Found data")
    } while (datafound > 0)

    loop@ for (i in 1..5) {
        for (j in 1..5) {
            if (i == 2 && j ==2) {
//            break@loop
                break
            }
            println("$i $j")
        }
    }

    loop@ for (i in 1..2) {
        for (j in 1..5) {
            if (i == 2 && j ==2) {
//            continue@loop
                continue
            }
            println("$i $j")
        }
    }

    arrayOf(1,3,5,7,9).forEach lit@ {
        if(it > 5) return@lit
        print(it)
    }
    println()

    val t = arrayOf(5,"hello",0.4f)
    val m = t
    t[0] = 10
    t.forEach { println(it) }
    m.forEach { println(it) }
}