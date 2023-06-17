package practiceActivities

fun main(){
    var num1 = 0
    var num2 = 0
    var num3 = 0
    var smallest = 0

    print("Enter first number: ")
    num1 = readln().toInt()
    print("Enter second number: ")
    num2 = readln().toInt()
    print("Enter third number: ")
    num3 = readln().toInt()

    if (num1<num2 && num1<num3){
        smallest = num1
    }else if(num2<num1 && num2<num3){
        smallest = num2
    }else{
        smallest = num3
    }

    println("The smallest number is $smallest")
}