package ooppracticeactivities.ooppracticeactivity7

fun main(){
    var personI = Person("John")
    println(personI.name)
    personI.age = 21
    println(personI.age)

    var personII = Person("Peter", 22)
    println(personII.name)
    println(personII.age)
}