package ooppracticeactivities.ooppracticeactivity5

class Student {
    var name:String
    var age: Int
    var grade: Int

    init {
        name = "Juan Dela Cruz"
        age = 15
        grade = 9
    }

    fun promote(){
        println("Student's name: $name")
        println("Student's age: $age")
        println("Student's grade: $grade")
    }
    fun promoted(){
        grade += 1
        println("\n$name have been promoted to grade $grade")
    }
}