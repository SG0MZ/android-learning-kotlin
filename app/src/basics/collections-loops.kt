package basics

import java.util.*

fun main(args: Array<String>) {

    val randoms: MutableList<Int> = mutableListOf()

    for (i in 1..100) {
        randoms.add(Random().nextInt(100) + 1)
    }

    var i = 0
    while (i < randoms.size && randoms[i] > 10) {
        println(randoms[i])
        i++
    }
}