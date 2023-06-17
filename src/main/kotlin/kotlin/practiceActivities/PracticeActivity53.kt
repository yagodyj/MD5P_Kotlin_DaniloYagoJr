package practiceActivities

fun main(){
    print("Enter length: ")
    var num1 = readln().toDouble()
    print("Enter width: ")
    var num2 = readln().toDouble()

    var lambdaPeri = { length:Double, width:Double -> 2*(length+width) }
    var lambdaArea = { length:Double, width:Double -> length * width}

    println("The perimeter is ${lambdaPeri(num1,num2)}")
    println("The area is ${lambdaArea(num1,num2)}")
}