package Exercises.Activity1

fun main(){
    var groceryItems = "List of items in the Grocery:"
    var remainingItems = 0
    var quantity = 0
    var soldItems = 0

    do{
        print("Enter a product: ")
        groceryItems = readln()
        print("Enter the quantity of the product: ")
        quantity = readln().toInt()
        print("Enter the sold amount of this item: ")
        soldItems = readln().toInt()
        remainingItems = quantity - soldItems
        println("There are $remainingItems remaining $groceryItems")
        print("Do you want to enter another product?[y/n]: ")
        var response = readln()
    }while (response == "y")
    println("Thanks for using the app!")
}