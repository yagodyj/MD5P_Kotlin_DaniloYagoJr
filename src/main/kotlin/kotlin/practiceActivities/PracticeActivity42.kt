package practiceActivities

fun main(){
    print("Enter a string: ")
    var word = readln()
    print("Enter a character: ")
    var letter = readln().first()
    var countedLetters = countOccurence(word,letter)
    println(countedLetters)
}

fun countOccurence(string:String, letter: Char): Int {
    var appearance = 0
    for(character in string){
        when (character){
            letter -> {
                appearance++
            }
        }
    }
    return appearance
}