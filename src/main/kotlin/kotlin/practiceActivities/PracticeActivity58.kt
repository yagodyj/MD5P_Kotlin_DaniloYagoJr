package practiceActivities

fun main(){
    var num1 = 0
    var num2= 0
    try {
        print("Enter the first number: ")
        num1 = readln().toInt()
        print("Enter the second number: ")
        num2 = readln().toInt()

        var sum = num1 + num2
        var difference = num1 - num2
        var product = num1 * num2
        var quotient = num1 / num2
        println("$sum, $difference, $product, $quotient")
    }catch (e:Exception){
        println("Error: Arithmetic overflow. The result of the operation exceeds the maximum value of an integer.")
    }
}