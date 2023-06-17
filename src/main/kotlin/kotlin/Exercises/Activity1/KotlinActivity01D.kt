package Exercises.Activity1

fun main(){
    var total = 0.0
    var answer = 0.0
    for (ctr in 1..5){
        print("Enter an amount: ")
        var amount = readln().toDouble()
        total += amount
    }
    print("Divide the value by how many?: ")
    var divide = readln().toDouble()

    answer = total / divide

    println("The answer is $answer")
}