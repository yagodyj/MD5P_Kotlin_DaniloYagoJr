package practiceActivities

fun main(){
    var num1 = 0
    var num2 = 0
    try{
        print("Enter number 1: ")
        num1 = readln().toInt()
        print("Enter number 2: ")
        num2 = readln().toInt()
        println("The quotient is ${num1/num2}")
    }catch (exception:Exception){
        println("Error: Division by zero")

    }
}