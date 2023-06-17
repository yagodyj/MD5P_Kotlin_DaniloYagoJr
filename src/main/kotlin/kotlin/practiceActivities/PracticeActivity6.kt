package practiceActivities

fun main(){
    var num = 0

    print("Enter a number: ")
    num = readln().toInt()

    if(num == 0){
        println("The number is Zero")
    }else if(num < 0){
        println("The number is Negative")
    }else{
        println("The number is Positive")
    }
}