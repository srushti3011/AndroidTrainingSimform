package kotlinexercise

class ControlFlow {
}

fun factorial (num: Int): Int{
    if(num == 1) {
        return 1
    } else {
        return num * factorial(num - 1)
    }
}

fun checkIfPalindrome(str: String): Boolean {
    val length = str.count()
    if(length % 2 == 0) {
        val secondHalfStr = str.substring(length/2, length)
        val secondHalfReversed = secondHalfStr.reversed()
        val firstHalf = str.substring(0, length/2)
        if(secondHalfReversed == firstHalf) {
            return true
        }
    }
    return false
}

fun printFibonacci(numOfTerms: Int) {
    var first = 0
    var second = 1
    print("$first $second ")
    for(i in 1..numOfTerms-2) {
        val res = first + second
        print("$res ")
        first = second
        second = res
    }
    println()
}

fun checkIfPrime(num: Int): Boolean {
    for(div in 2..num-1) {
        if(num % div == 0) {
            return false
        }
    }
    return true
}

fun main() {
//    1
    val tableFor = 2
    for (i in 1..10) {
        println("$tableFor * $i = ${tableFor*i}")
    }

//    2
    println(factorial(3))

//    3
    println(checkIfPalindrome("aabba"))

//    4
    printFibonacci(6)

//    5
    println(checkIfPrime(15))
}