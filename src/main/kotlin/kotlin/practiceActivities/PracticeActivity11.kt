package practiceActivities

fun main(){
    var name = ""
    var subject1 = 0.0
    var subject2 = 0.0
    var subject3 = 0.0
    var averageGrade = 0.0

    print("Enter Students name: ")
    name = readln()
    print("Enter grade in Physics: ")
    subject1 = readln().toDouble()
    print("Enter grade in Algebra: ")
    subject2 = readln().toDouble()
    print("Enter grade in Programming: ")
    subject3 = readln().toDouble()
    println("")
    averageGrade = (subject1 + subject2 + subject3) / 3

    if(averageGrade < 78){
        println("$name average grade is ${String.format("%.2f",averageGrade)}\nFailure")
    }else if(averageGrade < 83){
        println("$name average grade is ${String.format("%.2f",averageGrade)}\nFair")
    }else if(averageGrade < 89) {
        println("$name average grade is ${String.format("%.2f",averageGrade)}\nAverage Student")
    }else if(averageGrade < 95) {
        println("$name average grade is ${String.format("%.2f",averageGrade)}\nDean Lister")
    }else if(averageGrade <= 100) {
        println("$name average grade is ${String.format("%.2f",averageGrade)}\nPresident Lister")
    }else{
        println("Invalid Grade!!")
    }
}