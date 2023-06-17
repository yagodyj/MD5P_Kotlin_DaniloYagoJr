package practiceActivities

fun main(){
    print("Enter a number (1-10): ")
    var number:Int = readln().toInt()

    var ctr1 = 0
    while(ctr1 < 10){
        println("$number * ${ctr1+1} = ${(ctr1+1) * number}")
        ctr1++
    }
}