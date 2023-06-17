package practiceActivities

fun main(){
    var total = 0.0
    var athlete = mutableListOf<String>()
    var sales = mutableListOf<Double>()
    print("Enter athlete 1: ")
    athlete.add(readln())
    print("Enter sales: ")
    sales.add(readln().toDouble())
    print("Enter athlete 2: ")
    athlete.add(readln())
    print("Enter sales: ")
    sales.add(readln().toDouble())
    print("Enter athlete 3: ")
    athlete.add(readln())
    print("Enter sales: ")
    sales.add(readln().toDouble())
    print("Enter athlete 4: ")
    athlete.add(readln())
    print("Enter sales: ")
    sales.add(readln().toDouble())
    print("Enter athlete 5: ")
    athlete.add(readln())
    print("Enter sales: ")
    sales.add(readln().toDouble())


    println("Top Sports Man")
    println("Name      Sales")
    println("=======================")

    var ctr2: Int = 0
    while(ctr2 < athlete.size) {
        println("${athlete[ctr2]}    $${sales[ctr2]}")
        ctr2++
        total += sales[ctr2-1]
    }
    println("=======================")
    println("Total: $${String.format("%.2f",total)}")

}