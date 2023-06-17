package ooppracticeactivities.ooppracticeactivity9

fun main(){
    var car1 = Car("Toyota","Vios")
    println(car1.make)
    println(car1.model)
    car1.year = 2017
    println(car1.year)

    var car2 = Car("Mitsubishi","Xpander",2023)
    println(car2.make)
    println(car2.model)
    println(car2.year)
}