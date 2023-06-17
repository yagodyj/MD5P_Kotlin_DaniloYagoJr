package practiceActivities

fun main(){
    print("Enter a string: ")
    var word = readln()
    print("Enter a character: ")
    var letter = readln().first()
    println((word)countOccurence(letter))
}

infix fun String.countOccurence(letter: Char): Int {
    var appearance = 0
    for(character in this){
        when (character){
            letter -> {
                appearance++
            }
        }
    }
    return appearance
}