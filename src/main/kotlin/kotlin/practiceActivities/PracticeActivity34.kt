package practiceActivities

fun main(){
    var vowel = 0
    var totalVowel = 0
    print("Input a word: ")
    var input = readln()


    val searchA = "a"
    val resultA = input.contains(searchA)
    val searchE = "e"
    val resultE = input.contains(searchE)
    val searchI = "i"
    val resultI = input.contains(searchI)
    val searchO = "o"
    val resultO = input.contains(searchO)
    val searchU = "u"
    val resultU = input.contains(searchU)

    if(resultA){
        vowel = + 1
        totalVowel += vowel
    }
    if(resultE){
        vowel = + 1
        totalVowel += vowel
    }
    if(resultI){
        vowel = + 1
        totalVowel += vowel
    }
    if(resultO){
        vowel = + 1
        totalVowel += vowel
    }
    if(resultU){
        vowel = + 1
        totalVowel += vowel
    }
    println("Total number of vowels is $totalVowel")
}
