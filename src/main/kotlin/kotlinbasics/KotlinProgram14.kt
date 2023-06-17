package kotlinbasics

fun main(){
    var selection = 0
    println("Please enter selection")
    println("[1] Register Student")
    println("[2] Compute Grade")
    selection = readln().toInt()

    when(selection){
        1-> {
            println("STUDENT REGISTRATION!!")
            print("Enter name: ")
            var name:String = readln()
            print("Enter course: ")
            var course:String = readln()

            println("Do you want to register $name with course $course?")
            var response:String = readln()

            if(response == "yes"){
                print("Registered successfully!")
            }else{
                print("Registration Failed!")
            }
        }
        2 -> {
            println("STUDENT GRADE COMPUTATION!")
            print("Enter grade 1: ")
            var grade1:Int = readln().toInt()
            print("Enter grade 2: ")
            var grade2:Int = readln().toInt()
            print("Enter grade 3: ")
            var grade3:Int = readln().toInt()

            var gradeAverage = (grade1+grade2+grade3)/3

            println("Average is $gradeAverage")
            if(gradeAverage > 74){
                print("passed!")
            }else{
                print("Failed!")
            }
        }
    }
}