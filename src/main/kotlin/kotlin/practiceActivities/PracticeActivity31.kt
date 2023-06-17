package practiceActivities

fun main(){
    var setA = mutableSetOf<Int>()
    println("***SET A***")
    print("Enter number 1: ")
    setA.add(readln().toInt())
    print("Enter number 2: ")
    setA.add(readln().toInt())
    print("Enter number 4: ")
    setA.add(readln().toInt())
    print("Enter number 4: ")
    setA.add(readln().toInt())
    print("Enter number 5: ")
    setA.add(readln().toInt())

    var setB = mutableSetOf<Int>()
    println("***SET B***")
    print("Enter number 1: ")
    setB.add(readln().toInt())
    print("Enter number 2: ")
    setB.add(readln().toInt())
    print("Enter number 3: ")
    setB.add(readln().toInt())
    print("Enter number 4: ")
    setB.add(readln().toInt())
    print("Enter number 5: ")
    setB.add(readln().toInt())

    var intersectSet = setA.intersect(setB)
    println("Intersection of the sets $intersectSet")
}