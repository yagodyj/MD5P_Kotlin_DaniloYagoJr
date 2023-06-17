package kotlinbasics

fun main(){
    val firstName = "Juan"
    val middleName = "D."
    val lastName = "Dela Cruz"
    var fullName = firstName + " " + middleName + " " + lastName
    fullName = firstName.plus(" ").plus(middleName).plus(" ").plus(lastName)
    println(fullName)

    fullName = "$firstName $middleName $lastName"
    println(fullName)

    var myText = "Hello World!"
    var subText = myText.substring(6,12)
    println(subText)

    var text = "peter,paul,mary"
    var splitText = text.split(",")
    println(splitText)

    var textToTrim = "\n  Hello World!    "
    var trimmedText = textToTrim.trim()
    println(trimmedText)
}