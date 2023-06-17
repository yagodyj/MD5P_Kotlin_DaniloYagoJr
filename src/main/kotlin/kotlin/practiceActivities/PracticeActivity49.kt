package practiceActivities

fun main(){
    print("Enter length: ")
    var num1 = readln().toDouble()
    print("Enter width: ")
    var num2 = readln().toDouble()


    println("The perimeter is ${num1 perimeter num2}")

    println("The area is ${num1 area num2}")
}

infix fun Double.perimeter (number1:Double):Double{
    var peri = 2*(number1 + this)
    return peri
}
infix fun Double.area (number1:Double):Double{
    var area = number1 * this
    return area
}