package practiceActivities

fun main(){
    print("Enter length: ")
    var num1 = readln().toDouble()
    print("Enter width: ")
    var num2 = readln().toDouble()

    var peri = perimeter(num1,num2)
    println("Perimeter is $peri meters")

    var area = area(num1,num2)
    println("Area is $area meters")
}

fun perimeter (number1:Double, number2:Double):Double{
    var peri = 2*(number1 + number2)
    return peri
}
fun area (number1:Double, number2:Double):Double{
    var area = number1 * number2
    return area
}