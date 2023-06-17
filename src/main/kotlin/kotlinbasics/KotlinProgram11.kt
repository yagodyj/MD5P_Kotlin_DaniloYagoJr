package kotlinbasics

fun main(){
    var age = 0

    print("Enter your age: ")
    age = readln().toInt()

    if (age >= 60){
        println("Senior Citizen")
    }else if(age >= 19) {
        println("Adult")
    }else if(age >= 13){
        println("Teenager")
    }else if(age >= 0 ){
        println("Kid")
    }else{
        println("Invalid age!")
    }

}