package kotlinbasics

fun main(){
    myHigherOrderFunction(sayHello2)
}

fun myHigherOrderFunction(myFunction: () -> Unit){
    myFunction()
}

fun total(number1:Int, number2:Int):Int{
    return number1+number2
}
var sayHello2 = { println("Hello World!!") }