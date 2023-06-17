package practiceActivities

fun main(){
    var input = 0.0
    try{
        print("Enter a decimal number: ")
        input = readln().toDouble()
        println(String.format("%.0f",input))
    }catch (e:Exception){
        println("Error: Invalid input. Please enter a valid decimal number")
    }
}