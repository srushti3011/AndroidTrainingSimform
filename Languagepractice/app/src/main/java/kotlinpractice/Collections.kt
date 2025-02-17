package kotlinpractice

class Collections {
}
fun main() {
    val setOne = mutableSetOf(5, 10)
    setOne.add(20)
    for (element in setOne) println(element)

    val setTwo = setOf("string 1", 2)
    for (element in setTwo) println(element)

    val setThree: Set<Any> = setOf("hello", 5)

    val mapOne = mapOf(2 to "two", 1 to "one")
    for (element in mapOne) {
        println(element.key)
        println(element.value)
    }

    val mapTwo = mutableMapOf<Number, String>().apply { this[1] = "one"; this[2] = "two"}
    for (element in mapTwo) println(element.key)

    val mapThree = buildMap {
        put(1, "Student1")
        put(2, "Student2")
    }
    println(mapThree)

    val tempMap = emptyMap<String, Int>()
    println(tempMap)

    val listOne = mutableListOf(1, 2, 3, 20, 50)
    val listTwo = mutableListOf(80, 90)

    val copyList = listTwo.toMutableList()
    copyList.add(30)
    println(listTwo)

    var varListOne = mutableListOf(1,5,10)
    var varListTwo = mutableListOf(2,20,40)
    println(varListTwo)
    varListTwo = varListOne
    println(varListTwo)
    varListTwo[2] = 100
    println(varListOne)

    val listThree = mutableListOf(10, 20, 30, 40)
    println(listThree.map { it -> it * it })

    val iteratorOne = listThree.iterator()

    while(iteratorOne.hasNext()) {
        println(iteratorOne.next())
    }

    val iteratorTwo = listThree.listIterator()
    iteratorTwo.next()
    iteratorTwo.set(200)
    println(listThree)
    iteratorTwo.add(1000)
    println(listThree)

    for (num in 1..<5) print(num)
    for (num in 1..5) print(num)
    for (num in 1..5 step 2) println(num)
    for (num in 5 downTo 0 step  3) println(num)
    val rangeOne = 1..10 // type is IntRange
    val charRange = 'a'..'c' // type is charRange
    val floatRange = 1.0..2.0

    val sequenceOne = sequenceOf(5,10,15,20,30)
    val result = sequenceOne.map { it -> it * it }.filter { it -> it % 2 == 0 }.take(2)
    for (num in result) println(num)

    println(listOne)

    print(listOne.map { it -> it+it })
    print(listOne.mapIndexed{ index, value -> index*value })

    val keys = listOf(1,2,3)
    val values = listOf("Mally", "Sally", "Joe", "Harry")
    print(keys.zip(values))

    val pairsList = listOf("mango" to "yellow", "apple" to "red")
    println(pairsList.unzip())

    val fruits = listOf("Apple", "Mango")
    val fruitLength = fruits.associateWith{ it.length }
    println(fruits.associateWith{ it.length })
    println(fruits.associateBy { it.first().uppercase() })

    val bigList = listOf(listOf(5,6), listOf(10,11), setOf(19,11), listOf("hello"))
    println(bigList.flatten())

    val numbers = listOf(10,20,30,44,45,55,65,80)
    println(numbers.filter { it % 10 == 0 })
    println(numbers.filterIndexed { index, value -> value<30 && index>=2 })

    val students = listOf("Mally, Sally", "Joe")
    val (selected, rest) = students.partition { it.length % 2 == 0 }
    println(selected)
    println(rest)
    println(students.all { it.endsWith('y') || it.endsWith('e') })
    println(students.any { it.endsWith('a') })

    val studentsMarks = mapOf(1 to 50, 2 to 30)
    println(studentsMarks.map { it.key + 1 to it.value })

    val listOfSeasons = mutableListOf("Summer", "Winter", "Monsoon")
    println(listOfSeasons)
    listOfSeasons+="Spring"
    println(listOfSeasons)
    listOfSeasons-="Monsoon"
    println(listOfSeasons)

    val countries = listOf("India", "China", "Canada")
    println(countries.groupBy { it.get(0) })

    val indianStates = listOf("Gujarat", "Madhya Pradesh", "Rajasthan", "Maharashtra", "Kerala", "Tamil Nadu")
    println(indianStates.slice(1..4))
    println(indianStates.takeLast(3))
    println(indianStates.dropLast(4))
    println(indianStates.dropLastWhile { it.length % 2 == 0 })
    println(indianStates.dropWhile { it.length >= 7 })

    val nums = listOf(1,2,3,4,5,6,7,8)
    val windowdResult = nums.windowed(8)
    println(windowdResult)

    val exampleMap = buildMap {
        put(1, 50)
        put(2, 45)
        put(3, 55)
    }

    println(exampleMap[1])

    println(countries.first { it.startsWith('C') })
    println(countries.first())
    println(countries.last { it.endsWith('a') })
    println(countries.last())
    println(countries.random())

    println(countries.contains("canada"))
    println(countries.contains("Canada"))
    println(countries.containsAll(listOf("Canada", "China")))
    println(countries.shuffled())

    val evenNos = listOf(2,4,6,8,10,12)
    println(evenNos.average())
    println(evenNos.sum())
    println(countries.count())
    println(evenNos.max())
    println(evenNos.reduce { acc, curr -> acc + curr })
    println(evenNos.fold(1) { acc, curr -> acc * curr })

    val listOfDuplicates = mutableListOf(1,1,3,5,7,8,9,10)
    listOfDuplicates.remove(1)
    println(listOfDuplicates)
    listOfDuplicates.removeAll(listOf(1,3))
    println(listOfDuplicates)
    listOfDuplicates.retainAll(listOf(8,9,10))
    println(listOfDuplicates)

    val oddNumbers = mutableListOf(1,3,5,7,9)
    println(oddNumbers.get(0))
    println(oddNumbers.getOrNull(5))
    println(oddNumbers.getOrElse(12, {it}))
    println(oddNumbers.indexOfFirst { it % 2 == 0 })
    oddNumbers.fill(3)
    println(oddNumbers)

    val setNew = setOf(4,5,10,12)
    println(setNew union setOf(5,6))
    println(setNew intersect setOf(5,7,8))
    println(setNew subtract setOf(5,7,9))
    println(setNew - setOf(5))
    println(setNew + setOf(80,90))

    val mapNew = mutableMapOf("Delhi" to "India", "Toronto" to "Canada", "Chicago" to "USA")
    println(mapNew.get("New York"))
    println(mapNew["New York"])
    println(mapNew)
    mapNew.remove("Delhi")
    println(mapNew)
    mapNew.put("Ahmedabad", "India")
    println(mapNew)
    mapNew.keys.remove("Toronto")
    println(mapNew)
    mapNew["Coimbatore"] = "India"
    println(mapNew)
    mapNew.values.remove("India")
    println(mapNew)

    val pairOne = Pair(1, "Hello")
    println(pairOne.first)
    println(pairOne.second)
    val oneToTen = List<Int>(10) {it -> it + 1}
    println(oneToTen)

    val list = listOf(1,10,15,20)
    println(list.subList(2,3))
    println(list.slice(2 until 3))
}

