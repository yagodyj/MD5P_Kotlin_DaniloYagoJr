package practiceActivities

fun main(){
    var name = "Name"
    var birthYear = 0
    val currentYear = 2023
    var age = 0

    print("Enter your name:")
    name = readln()
    print("Enter your Birth year:")
    birthYear = readln().toInt()

    age = currentYear - birthYear

    println("$name, your age on $currentYear is $age")
}