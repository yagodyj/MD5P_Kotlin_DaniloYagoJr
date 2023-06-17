package ooppracticeactivities.ooppracticeactivity8

fun main(){
    var date1 = Date()
    date1.day = 12
    date1.month = "May"
    date1.year = 2023
    println(date1.day)
    println(date1.month)
    println(date1.year)

    var date2 = Date(14,"July",1995)
    println(date2.day)
    println(date2.month)
    println(date2.year)
}