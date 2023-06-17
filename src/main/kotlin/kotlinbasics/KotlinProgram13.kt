package kotlinbasics

fun main(){
    var num = 0

    print("Enter a number: ")
    num = readln().toInt()

    when(num){
        1->{
            println("One")
        }
        2->{
            println("Two")
        }
        3->{
            println("Three")
        }
        else->{
            println("Invalid Number")
        }
    }
}