package practiceActivities

fun main(){
    var counter = 0
    var number = 0.0
    var addNumber = 0.0
    var average = 0.0

    while(counter < 5){
        print("Enter a number :")
        number = readln().toDouble()
        addNumber += number
        counter++
    }
    average = addNumber / 5
    print("The average is: $average")
}