package practiceActivities

fun main(){
    print("Enter a Text: ")
    var text = readln()
    var reversedText = reversed(text)
    println(reversedText)
}

fun reversed(text:String):String{
    var reverse = text.reversed()
    return reverse
}