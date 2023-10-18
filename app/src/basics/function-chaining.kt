package functional

fun main(args: Array<String>) {

    val data = mapOf(
        "users1.csv" to listOf(32, 45, 17, -1, 34),
        "users2.csv" to listOf(19, -1, 67, 22),
        "users3.csv" to listOf(),
        "users4.csv" to listOf(56, 32, 18, 44)
    )

    val averageAge = data.flatMap { it.value }
        .filter { it >= 0 }
        .average()

    val faultyFiles = data.filter { it.value.any { it < 0 } }
        .map { it.key }

    val numberOfFaults = data.flatMap { it.value }
        .filter { it < 0 }
        .count()

    println("Users average %.2f years of age.".format(averageAge))
    println("Files with faulty data: $faultyFiles")
    println("There were $numberOfFaults errors in the data.")
}