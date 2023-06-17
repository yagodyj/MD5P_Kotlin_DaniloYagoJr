package kotlinbasics

fun main(){
    val myText = "Hello World!"
    val stringLength = myText.length
    println(stringLength)

    val upperCase = myText.uppercase()
    val lowerCase = myText.lowercase()
    println(upperCase)
    println(lowerCase)

    val searchText = "hello"
    val result = myText.uppercase().contains(searchText.uppercase())
    println(result)

    val replacedText = myText.replace("World", "Kotlin")
    println(replacedText)

    println("${myText[0]} ${myText[11]}")
}