package practiceActivities

fun main(){
    var num = 0

    print("Enter a number between 1 and 7: ")
    num = readln().toInt()

    when(num){
        1->{
            println("Monday")
        }
        2->{
            println("Tuesday")
        }
        3->{
            println("Wednesday")
        }
        4->{
            println("Thursday")
        }
        5->{
            println("Friday")
        }
        6->{
            println("Saturday")
        }
        7->{
            println("Sunday")
        }
        else->{
            println("Error")
        }
    }
}