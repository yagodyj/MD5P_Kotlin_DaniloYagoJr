package practiceActivities

fun main(){
    var inputYear = 0

    print("Enter a year: ")
    inputYear = readln().toInt()

    if ((inputYear % 100 == 0) && (inputYear % 400 != 0)) {
        println("$inputYear is not a leap year")
    }else if(inputYear % 4 == 0){
        println("$inputYear is a leap year")
    }else{
        println("$inputYear is not a leap year")
    }
}