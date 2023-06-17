package practiceActivities

fun main(){
    var answer = ""
    var name = mapOf("Alice" to "555-1234", "Bob" to "555-5678", "Charlie" to "555-9101")
    println(name)
    print("What is the name?: ")
    answer = readln()
    print("$answer's phone number is ${name[answer]}.")
}

