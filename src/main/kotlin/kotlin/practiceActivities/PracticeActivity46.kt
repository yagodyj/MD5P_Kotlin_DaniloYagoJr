package practiceActivities

fun main(){
    print("Enter number 1: ")
    var number1 = readln().toDouble()
    print("Enter number 2: ")
    var number2 = readln().toDouble()
    print("Enter number 3: ")
    var number3 = readln().toDouble()
    print("Enter number 4: ")
    var number4 = readln().toDouble()
    print("Enter number 5: ")
    var number5 = readln().toDouble()

    var average = computeAverage(number1,number2,number3,number4,number5)
    println("Average: ${String.format("%.1f",average)}")
}

fun computeAverage(num1:Double,num2:Double,num3:Double,num4:Double,num5:Double):Double{
    var ave = (num1 + num2 + num3 + num4 + num5) / 5
    return ave
}