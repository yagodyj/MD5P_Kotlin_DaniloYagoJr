package kotlinbasics

fun main(){
    var num1 = 0
    var num2 = 0
    var sum = 0
    var difference = 0
    var product = 0
    var quotient = 0
    var modulo = 0

    print("Enter your 1st Number: ")
    num1 = readln().toInt()
    print("Enter your 2nd Number: ")
    num2 = readln().toInt()


    sum = num1+num2
    difference = num1 - num2
    product = num1 * num2
    quotient = num1 / num2
    modulo = num1 % num2


    println("The sum is: $sum")
    println("The difference is: $difference")
    println("The product is: $product")
    println("The quotient is: $quotient")
    println("The modulo is: $modulo")
}