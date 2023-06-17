fun main(){
    var num1 = 0
    var num2 = 0

    println("**********************************")
    println("   \tSimple Calculator")
    println("**********************************")
    do {
        try {
            print("Enter number 1: ")
            num1 = readln().toInt()
            print("Enter number 2: ")
            num2 = readln().toInt()
            println("The quotient is ${num1 / num2}")
            break
        } catch (exception: NumberFormatException) {
            println("NumberFormatException")
            println("Wrong input!! Input integers only")
        } catch (exception: ArithmeticException) {
            println("ArithmeticException")
            println("Cannot divide by zero")
        }finally {
            println("**********************************")
        }
    }while (true)
}