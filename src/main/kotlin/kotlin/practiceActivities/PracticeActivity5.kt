package practiceActivities

fun main(){
    var studentsName = "Name of Students"
    var numberOfUnits:Float = 0.0F
    val pricePerUnit:Float = 741.0F
    var tuitionFee:Float = 0.0F
    var cashPayment:Float = 0.0F
    var install2:Float = 0.0F
    var install3:Float = 0.0F

    print("Enter Students Name: ")
    studentsName = readln()
    print("Enter total number of units: ")
    numberOfUnits = readln().toFloat()

    tuitionFee = numberOfUnits * pricePerUnit
    cashPayment = tuitionFee * 0.9F
    install2 = tuitionFee * 1.05F
    install3 = tuitionFee * 1.1F

    println("$studentsName, the following payment mode is available for you:")
    println("Computed tuition fee: Php$tuitionFee")
    println("Payment mode:")
    println("Cash payment: ${String.format("%.2f",cashPayment)}")
    println("2-Installment: ${String.format("%.2f",install2)}")
    println("3-Installment: ${String.format("%.2f",install3)}")
}