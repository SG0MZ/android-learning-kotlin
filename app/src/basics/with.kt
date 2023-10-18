package basics

fun main(args: Array<String>) {
    val props = java.lang.System.getProperties()

    with(props) {
        list(System.out)
        println(propertyNames().toList())
        println(getProperty("user.home"))
    }
}