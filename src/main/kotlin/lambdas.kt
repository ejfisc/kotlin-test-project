data class Student(val name: String, var age: Int)

fun getStudents(): List<Student> {
    return listOf(
        Student("Ginger", 19),
        Student("Michael", 23),
        Student("Maria", 20),
        Student("Joe", 39),
        Student("Bob", 16)
    )
}

fun main() {
    val students = getStudents()
    val combos = students.map{a -> a.name + " : " + a.age}
    println("Combos: $combos")
    println("The oldest student: ${students.maxByOrNull{it.age}}")

    val studentsWithLongNames = students.filter{it.name.length > 5}
    println("Long names: $studentsWithLongNames")

    val shortName = students.minByOrNull{it.name.length}
    if(shortName != null) {
        val shortestNameLength = shortName.name.length
        val studentsWithShortestNames = students.filter{it.name.length == shortestNameLength}
        println("Short names: $studentsWithShortestNames")
    }

}