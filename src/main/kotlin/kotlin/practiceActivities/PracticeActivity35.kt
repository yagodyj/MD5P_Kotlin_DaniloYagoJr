package practiceActivities

fun main() {
    val number = mutableListOf<Int>()
    var ctr = 0
    while (ctr < 9) {
        print("Enter Number ${ctr + 1}: ")
        number.add(readln().toInt())
        ctr++
    }
    val numbers = arrayOf(
        arrayOf(number[0], number[1], number[2]),
        arrayOf(number[3], number[4], number[5]),
        arrayOf(number[6], number[7], number[8])
    )
    for (row in 0..2) {
        for (column in 0..2) {
            print("${numbers[row][column]}\t")
        }
        println()
    }
}