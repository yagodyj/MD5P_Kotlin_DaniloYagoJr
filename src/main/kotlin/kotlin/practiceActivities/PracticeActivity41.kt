package practiceActivities

fun main(){
    print("Enter a string: ")
    var word = readln()
    var newWord = replaceSpaces(word)
    println("String with spaces replaced: $newWord")
}

fun replaceSpaces(text:String):String{
    var newText = text.replace(" ","_")
    return newText
}