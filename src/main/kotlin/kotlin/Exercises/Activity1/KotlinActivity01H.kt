package Exercises.Activity1

fun main(){
    var num1 = 0
    var num2 = 0
    var lowerNumber = 0
    var higherNumber = 0
    print("Enter first number: ")
    num1 = readln().toInt()
    print("Enter second number: ")
    num2 = readln().toInt()
    if (num1<num2){
        lowerNumber = num1
        higherNumber = num2
    }else{
        lowerNumber = num2
        higherNumber = num1
    }
    print("$lowerNumber,$higherNumber -> ")
    for(ctr in lowerNumber..higherNumber){
        print(ctr)
    }

}