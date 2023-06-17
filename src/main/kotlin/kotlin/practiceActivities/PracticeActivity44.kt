package practiceActivities

fun main(){
    print("Temperature(Celsius): ")
    var celsius = readln().toDouble()

    var fahrenheit = convertTemp(celsius)
    println("Temperature(Fahrenheit): ${String.format("%.1f",fahrenheit)}")

}

fun convertTemp(temp:Double):Double{
    var converted = (temp * 9/5) + 32
    return converted
}