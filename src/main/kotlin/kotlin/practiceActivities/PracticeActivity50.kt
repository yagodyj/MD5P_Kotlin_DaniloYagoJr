package practiceActivities

fun main(){
    print("Enter weight(kg): ")
    var weight = readln().toDouble()
    print("Enter height(m): ")
    var height = readln().toDouble()
    var bmi = {weight:Double,height:Double -> weight / (height*height)}
    println("BMI: ${String.format("%.2f",bmi(weight,height))}")
}
