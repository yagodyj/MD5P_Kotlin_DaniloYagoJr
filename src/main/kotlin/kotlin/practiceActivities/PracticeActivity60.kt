package practiceActivities

fun main() {
    var setOfNumbers = mutableListOf<Int>()
    print("Enter number of Inputs: ")
    var inputs = readln().toInt()
    for (ctr in 1..inputs) {
        print("Enter a number: ")
        setOfNumbers.add(readln().toInt())
    }
    setOfNumbers.toString()
    print("Number: $setOfNumbers")
    processHigherOrder  { "Number: $setOfNumbers" }
}

fun processHigherOrder(processFunction: (Int) -> String){
    println(processFunction)
}


