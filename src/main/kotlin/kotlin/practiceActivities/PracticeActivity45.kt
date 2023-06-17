package practiceActivities

fun main(){
    print("Enter a positive integer: ")
    var number = readln().toInt()
    var factorial = findFactorial(number)
    print("The factorial of $number is $factorial")
}

fun findFactorial(integer: Int): Int {

    var factorial = 1
    var ctr = 1
    if (integer < 0) {
        println("POSITIVE INTEGER ONLY!!")
    } else {
        do {
            factorial *= ctr
            ctr++
        } while (ctr <= integer)
    }
    return  factorial
}
