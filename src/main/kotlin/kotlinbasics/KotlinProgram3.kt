package kotlinbasics

fun main(){
    print("Enter Your Name: ")
    var name :String = readln()
    println("Hello $name")

    print("Enter a number: ")
    var number :Int = readln().toInt()
    println("You entered number $number")

}