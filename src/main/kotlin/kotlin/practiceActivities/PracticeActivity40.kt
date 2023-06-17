package practiceActivities

fun main() {
    print("Enter a word: ")
    var word = readln()
    var newWord = removeDuplicates(word)
    println("Word with duplicates removed: $newWord")
}
fun removeDuplicates(text: String): String {
    var newWord = ""
    var lastLetter = 'n'

    for (letter in text) {
        if (letter != lastLetter) {
            newWord = newWord + letter
            lastLetter = letter
        }
    }
    return newWord
}