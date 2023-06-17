package practiceActivities

fun main(){
    var numberOfData = 0.0

        print("Enter the number of data: ")
        numberOfData = readln().toDouble()
        println("The average is ${String.format("%.2f", (calculateAverage(numberOfData)))}")
}
fun calculateAverage(numberOfData: Double, vararg inputs: Int):Double{
    var total = 0.0
    var numbers = 0
    for (num in 1..numberOfData.toInt()){
        print("Enter number $num: ")
        numbers = readln().toInt()
        total += numbers
    }
    return total/ numberOfData
    return total
}

