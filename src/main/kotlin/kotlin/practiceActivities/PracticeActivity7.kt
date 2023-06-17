package practiceActivities

fun main(){
    var num = 0

    print("Enter a number: ")
    num = readln().toInt()

    if (num %2 == 0){
        println("The number is Even")
    }else{
        println("The number is Odd")
    }
}