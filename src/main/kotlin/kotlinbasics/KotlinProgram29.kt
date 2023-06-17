package kotlinbasics

fun main(){
    val matrix = listOf(
        listOf('a','b','c'),
        listOf('d','e','f'),
        listOf('g','h','i'),
        listOf('j','k','l')
    )
    println(matrix.size)

    var row = 0
    while (row < matrix.size){
        var column = 0
        while (column < matrix[row].size) {
            print("${matrix[row][column]} \t")
            column++
        }
        row++
        println()
    }
}