package practiceActivities

fun main(){
    var product = "Product Name"
    var price = 0.0
    var netPrice = 0.0
    var discount = 0.0

    print("Enter Product name: ")
    product = readln()
    print("Enter product price: ")
    price = readln().toDouble()

    if (price > 100000){
        netPrice = price * 0.8
        discount = price * 0.2
    }else if(price > 50000) {
        netPrice = price * 0.85
        discount = price * 0.15
    }else if(price > 20000){
        netPrice = price * 0.9
        discount = price * 0.1
    }else if(price > 10000 ){
        netPrice = price * 0.95
        discount = price * 0.05
    }else{
        netPrice = price * 1
        discount = 0.0
    }

    println("\nPrice of $product is Php${String.format("%.2f",price)}")
    println("Discount is Php${String.format("%.2f",discount)}")
    println("Net price is Php${String.format("%.2f",netPrice)}")
}