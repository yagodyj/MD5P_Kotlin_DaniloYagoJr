package practiceActivities

fun main() {
    var factorial = 1
    var number = 0
    var ctr = 1

    try {
        print("Enter a positive integer: ")
        number = readln().toInt()
        if (number < 0){
            throw Exception()
        }else{
            do {
                factorial *= ctr
                ctr++
            } while (ctr <= number)
            print("The factorial of $number is $factorial")
        }
    }catch (e:Exception){
        println("Error: Invalid input. Please enter a positive integer")
    }

}