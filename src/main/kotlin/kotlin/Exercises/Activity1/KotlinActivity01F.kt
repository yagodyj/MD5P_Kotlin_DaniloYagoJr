package Exercises.Activity1

fun main(){
    print("Enter string 1: ")
    var string1 = readln()
    print("Enter string 2: ")
    var string2 = readln()
    var word = string1+string2
    var newWord = ""
    val set = mutableSetOf<Char>()
    for(char in word) {
        set.add(char)
    }
    println(set.joinToString(""))
}