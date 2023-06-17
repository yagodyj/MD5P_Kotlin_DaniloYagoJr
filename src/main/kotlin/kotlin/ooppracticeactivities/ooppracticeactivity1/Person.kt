package ooppracticeactivities.ooppracticeactivity1

class Person {
    var name:String
    var age:Int
    var email:String

    init {
        name = "Juan Dela Cruz"
        age = 69
        email = "juan.delacruz@gmail.com"
    }

    fun printDetails(){
        println("Name: $name")
        println("Age: $age")
        println("Email: $email")
    }
}