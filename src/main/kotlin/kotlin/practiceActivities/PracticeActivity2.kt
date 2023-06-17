package practiceActivities

fun main(){
    var width:Double = 0.0
    var length:Double = 0.0
    var perimeter:Double = 0.0
    var area:Double = 0.0


    print("Enter length: ")
    length = readln().toDouble()
    print("Enter width: ")
    width = readln().toDouble()
    perimeter = 2 * (length + width)
    area = width * length

    println("Perimeter is: $perimeter")
    println("Area is: ${String.format("%.2f",area)}")

}