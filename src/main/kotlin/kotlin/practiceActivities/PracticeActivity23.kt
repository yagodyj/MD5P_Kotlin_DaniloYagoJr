package practiceActivities

fun main(){
    var number = ArrayList<Int>()
    print("Enter number 1: ")
    number.add(readln().toInt())
    print("Enter number 2: ")
    number.add(readln().toInt())
    print("Enter number 3: ")
    number.add(readln().toInt())
    print("Enter number 4: ")
    number.add(readln().toInt())
    print("Enter number 5: ")
    number.add(readln().toInt())

    var ctr:Int = 0
    var count = 0
    var count2 = 0
    while(ctr < number.size) {
        if(number[ctr]%2 == 0) {
            count++
        }else{
            count2++
        }
        ctr++
    }
    println("There are $count even and $count2 odd numbers")
}