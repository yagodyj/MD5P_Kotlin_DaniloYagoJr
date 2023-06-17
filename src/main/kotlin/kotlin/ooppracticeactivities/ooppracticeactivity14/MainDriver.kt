package ooppracticeactivities.ooppracticeactivity14

fun main(){
    println("---------------------------------------------------------")
    var employee1 = Employee()
    employee1.position = "Teacher"
    employee1.displayInfo()

    var myTeacher = Teacher("Programming")
    myTeacher.name = "Juan"
    myTeacher.age = 35
    myTeacher.displayInfo()
    myTeacher.subject()
    println("---------------------------------------------------------")

    println("---------------------------------------------------------")
    var employee2 = Employee("","",0)
    employee2.displayInfo()

    var myAdmin = Administrator("Information Technology")
    myAdmin.displayInfo()
    myAdmin.department()
}