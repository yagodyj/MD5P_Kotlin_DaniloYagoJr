package practiceActivities

fun main(){
    var answer = 1
    var counter = 1
    print("Enter a positive integer: ")
    var number: Int = readln().toInt()
        if(number < 0){
            println("POSITIVE INTEGER ONLY!!")
        }else {
            do {
                answer *= counter
                counter++
            } while (counter <= number)
            print("The factorial of $number is $answer")
    }
}