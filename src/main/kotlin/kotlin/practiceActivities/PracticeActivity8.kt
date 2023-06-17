package practiceActivities

fun main(){
    var grade = 0

    print("Enter your grade: ")
    grade = readln().toInt()

    if (grade < 60){
        println("Your grade is: F")
    }else if(grade <= 69) {
        println("Your grade is: D")
    }else if(grade <= 79){
        println("Your grade is: C")
    }else if(grade <= 89 ){
        println("Your grade is: B")
    }else{
        println("Your grade is: A")
    }
}