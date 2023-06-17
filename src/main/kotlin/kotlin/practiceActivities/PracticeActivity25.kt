package practiceActivities

fun main(){
    var inputBase = 0
    print("Enter the base size: ")
    inputBase = readln().toInt()

    repeat(inputBase+1){
        print(" ".repeat(inputBase - it))
        println("$".repeat(it))
    }
}