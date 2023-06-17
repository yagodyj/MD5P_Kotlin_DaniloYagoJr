package practiceActivities

fun main(){
    print("Enter weight(kg): ")
    var weight = readln().toDouble()
    print("Enter height(m): ")
    var height = readln().toDouble()
    var bmi = calculateBMI(weight,height)
    println("BMI: ${String.format("%.2f",bmi)}")
}

fun calculateBMI(kg:Double, m:Double):Double{
    var bmi = kg / (m * m)
    return bmi

}