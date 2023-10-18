package basics

fun main(args: Array<String>) {

    val anonymous = "Anonymous"

    print("Enter your name: ")
    val input = readLine()

    val name = if (input != null && input.isNotBlank()) {
        input
    } else {
        anonymous
    }

    val message = if (name == anonymous) {
        "Conscious about your privacy, eh?"
    } else {
        "Welcome $name, the CIA has been informed of your name :)"
    }

    println(message)
}