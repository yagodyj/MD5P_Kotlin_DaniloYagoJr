package Exercises.Activity1

fun main() {
    var newWord = false
    var input = ""
    print("Enter a text: ")
    input = readln()

    var postInput1 = input
    var lastLetter = input.lastIndex
    var pal = ""
    for (char in 0..lastLetter) {
        pal = pal + input[lastLetter - char]
    }
    if (postInput1 == pal) {
        newWord = true
    }
    if (newWord) {
        println("$input - Palindrome")
    } else {
        println("$input - Not Palindrome")
    }
}