package practiceActivities

fun main(){
    var number = ArrayList<Int>()
    print("Enter number 1: ")
    number.add(readln().toInt())
    print("Enter number 2: ")
    number.add(readln().toInt())
    print("Enter number 3: ")
    number.add(readln().toInt())
    print("Enter number 4: ")
    number.add(readln().toInt())
    print("Enter number 5: ")
    number.add(readln().toInt())
    var numbers = number.toList()


    println("Max value is: ${numbers.max()}")
    println("Min value is: ${numbers.min()}")
}