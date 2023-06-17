fun main() {

    val last = 'E'
    var alphabet = 'A'
    for (i in 1..5) {
        for (j in 1..5) {
            print("${alphabet+i+j-2} ")
        }

        println()
    }
}