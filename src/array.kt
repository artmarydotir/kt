fun main() {
//    create array
    val interestingThings = arrayOf("Kotlin", "Programming")


    val numbers = listOf("Kotlin", "Programming", 1, 5)
    println(numbers.size)
    println(numbers[0])
    println(numbers.get(1))

//    itrate - basic for loop
    for (interesting in numbers) {
        println(interesting)
    }

}