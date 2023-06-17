package practiceActivities

fun main(){
    print("Enter the number of eggs: ")
    var num1 = readln().toInt()

    var dozen = determineDozen(num1)
    println("Number of dozen: $dozen")

    var remainder = showLessDozen(num1)
    println("Eggs less than a dozen: $remainder")
}

fun determineDozen(number1:Int):Int{
    var dozen = number1 / 12
    return dozen
}

fun showLessDozen(number1:Int):Int{
    var lessDozen = number1%12
    return lessDozen
}