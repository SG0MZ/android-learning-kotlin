package oo

open class Being
open class Person: Being()
class Student: Person()

fun main(args: Array<String>) {
    val people: MutableList<Person> = mutableListOf(Person(),Person())
    people.add(Student())

    val p: Person = Student()

    val students: List<Person> = listOf<Student>()

    val events: TimeSeries<Person> = timeSeriesOf()
    val students3: List<Student> = listOf(Student(),Student())
    events.addAll(students3)

    val chartData: JavaTimeSeries<Person> = JavaTimeSeries()
    chartData.add(Student())
    chartData.addAll(students3)
}