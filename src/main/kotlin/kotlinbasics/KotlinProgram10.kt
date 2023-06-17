package kotlinbasics

fun main(){
    var age = 0

    print("Please Enter your age: ")
    age = readln().toInt()

    if(age >= 18){
        println("Your age is $age")
        println("You are qualified to vote!")

    }
    else{
        println("Your age is $age")
        println("You are not qualified to vote!")
    }
    println("This will always display")
}