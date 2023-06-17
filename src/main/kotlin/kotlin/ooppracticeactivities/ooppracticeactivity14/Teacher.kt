package ooppracticeactivities.ooppracticeactivity14

class Teacher(private val subject:String) :
    Employee() {
    override fun displayInfo() {
        position = "Teacher"
        println("Teacher's name is $name")
        println("Teacher's age is $age")
    }
    fun subject(){
        println("The teacher teaches $subject")
    }

}