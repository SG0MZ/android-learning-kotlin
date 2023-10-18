package basics

fun main(args: Array<String>) {

    val veryLongList = (1..999999L).toList()

    var sum = 0L
    var lazySum = 0L

    val msNonLazy = measureTimeMillis {
        sum = veryLongList
            .filter { it > 50 }
            .map { it * 2 }
            .map { it / 3 }
            .map { it + 17 }
            .take(1000)
            .sum()
    }

    val msLazy = measureTimeMillis {
        lazySum = veryLongList
            .asSequence()
            .filter { it > 50 }
            .map { it * 2 }
            .map { it / 3 }
            .map { it + 17 }
            .take(1000)
            .sum()
    }

    println("Non-lazy: $msNonLazy ms, Result: $sum")
    println("Lazy: $msLazy ms, Result: $lazySum")
}