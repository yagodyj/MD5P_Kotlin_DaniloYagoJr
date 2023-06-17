package practiceActivities

fun main(){
    var num1 = 0
    var num2 = 0
    var num3 = 0
    var phytagorean = true

    print("Enter first number: ")
    num1 = readln().toInt()
    print("Enter second number: ")
    num2 = readln().toInt()
    print("Enter third number: ")
    num3 = readln().toInt()

    phytagorean = num3*num3 == num1*num1+num2*num2

    if(phytagorean == true){
        println("These numbers form a Phythagorean triple")
    }else{
        println("These numbers do not form a Phythagorean triple")
    }
}