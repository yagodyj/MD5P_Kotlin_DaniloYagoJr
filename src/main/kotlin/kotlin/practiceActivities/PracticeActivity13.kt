package practiceActivities

fun main(){
    var weight = 0.0
    var height = 0.0
    var bmi = 0.0
    var bodyMassIndex = "BMI"

    print("Enter your weight(Kg): ")
    weight = readln().toDouble()
    print("Enter your height(m): ")
    height = readln().toDouble()

    bmi = weight / (height * height)

    if (bmi >= 30 ){
        bodyMassIndex = "Obese"
    }else if (bmi >= 25){
        bodyMassIndex = "Overweight"
    }else if (bmi >= 18.5){
        bodyMassIndex = "Normal weight"
    }else{
        bodyMassIndex = "Underweight"
    }

    println("Your BMI is ${String.format("%.2f",bmi)}, which is in the $bodyMassIndex range")
}