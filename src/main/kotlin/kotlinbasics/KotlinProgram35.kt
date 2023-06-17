package kotlinbasics

fun main(){
    var num1 = 0
    var num2 = 0

    println("******************************")
    println("\tSimple Calculator")
    println("******************************")
    try{
        print("Enter number 1: ")
        num1 = readln().toInt()
        print("Enter number 2: ")
        num2 = readln().toInt()
        println("The quotient is ${num1/num2}")
        }catch(exception:Exception){ println("Wrong Input!! Input Integers only")
        }
    println("This is a test")
}