package practiceActivities

fun main(){
    var fare = 0.0
    var passType = "Passenger Type"
    var isBusinessClass = "Travelling in Business Class"
    var newFare = 0.0
    var discount = 0.0
    var discountTotal = 0.0
    var businessCharge = 0.0

    print("Enter fare: ")
    fare = readln().toDouble()
    print("Passenger Type [O, S, C]: ")
    passType = readln()
    print("Travelling in business class? [Y/N]: ")
    isBusinessClass = readln()

    when (passType){
        "O" -> {
            discount = 0.0
            businessCharge = 1000.0
        }
        "S" -> {
            discount = 0.05
            businessCharge = 700.0
        }
        "C" -> {
            discount = 0.10
            businessCharge = 500.0
        }
        else ->{
            discount = 0.0
            businessCharge = 0.0
            fare = 0.0
        }
    }

    discountTotal = fare * discount

    when(isBusinessClass){
        "Y" -> {
            newFare = fare - discountTotal + businessCharge
        }
        "N" ->{newFare = fare - discountTotal
            businessCharge = 0.0
        }
        else-> {
            discountTotal = 0.0
            businessCharge = 0.0
            newFare = 0.0

        }
    }
    println("\nDiscount is : $discountTotal")
    println("Business class charge is $businessCharge")
    println("New fare is $newFare")

}