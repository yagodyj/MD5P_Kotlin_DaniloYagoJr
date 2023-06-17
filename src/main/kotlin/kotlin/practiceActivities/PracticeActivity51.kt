package practiceActivities

fun main() {
    print("Enter a positive integer: ")
    var number = readln().toInt()
    var lambdaFactorial = { num: Int ->
        var total = 1
        for (ctr in 1..num)
            total *= ctr
        total
    }
    println("The factorial of $number is ${lambdaFactorial(number)}")
}
