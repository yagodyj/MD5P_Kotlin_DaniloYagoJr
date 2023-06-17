package practiceActivities

fun main(){
    print("Enter a string: ")
    var text = readln()

    var whiteSpace = countWords(text)
    println("Number of Words: $whiteSpace")
}

fun countWords(words: String): Int {

    var counter = 1
    for (character in words) {
        when (character) {
            ' ' -> {
                counter++
            }
        }
    }
    return  counter
}