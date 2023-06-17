package kotlinbasics

fun main(){
    print("Enter a number: ")
    var input = readln().toInt()
    var num = cube(input)
    println("The cube of $input is $num")
}

fun cube(digit:Int):Int{
    var result:Int = digit * digit * digit
    return  result
}
