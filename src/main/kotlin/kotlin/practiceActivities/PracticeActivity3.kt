package practiceActivities

fun main(){
    var item = "Item name"
    var price1:Float = 0.0F
    var price2:Float = 0.0F
    var price3:Float = 0.0F
    var averagePrice:Float = 0.0F

    print("Enter Item Name: ")
    item = readln()
    print("Enter 1st price: ")
    price1 = readln().toFloat()
    print("Enter 2nd price: ")
    price2 = readln().toFloat()
    print("Enter 3rd price: ")
    price3 = readln().toFloat()

    averagePrice = (price1 + price2 + price3) / 3

    println("\n******$item******")
    println("Price in day 1: $price1")
    println("Price in day 2: $price2")
    println("Price in day 3: $price3")
    println("Average Price is: ${String.format("%.2f",averagePrice)}")

}