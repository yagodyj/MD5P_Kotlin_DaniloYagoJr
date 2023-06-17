package kotlinbasics

fun main() {
    var number = setOf<Int>(1, 3, 5, 7, 9)

    var ctr = 0
    while (ctr < number.size) {
        println(number.elementAt(ctr))
        ctr++
    }

    println("*************")

    var number2 = mutableSetOf<Int>(1, 3 , 5, 7, 9)
    number2.add(6)
    number2.remove(3)

    var ctr2 = 0
    while(ctr2 < number2.size){
        println(number2.elementAt(ctr2))
        ctr2++
    }
}