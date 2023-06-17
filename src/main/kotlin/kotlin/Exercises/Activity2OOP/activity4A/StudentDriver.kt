package Exercises.Activity2OOP.activity4A

fun main(){
    print("Search here: ")
    var searchHere = readln()

    var studentI = Student()
    studentI.firstName = "Richard"
    studentI.lastName = "Pemberton"
    studentI.nickName = "Ric"
    studentI.id = 2022001
    studentI.yearEnrolled = 2022
    println(studentI.firstName)
    println(studentI.lastName)
    println(studentI.nickName)
    println(studentI.id)
    println(studentI.yearEnrolled)

    var studentII = Student("Sebastian","Lars")
    println(studentII.firstName)
    println(studentII.lastName)
    println(studentII.nickName)
    println(studentII.id)
    println(studentII.yearEnrolled)

    var studentIII = Student("Jeffrey","Thompson","Jeff")
    println(studentIII.firstName)
    println(studentIII.lastName)
    println(studentIII.nickName)
    println(studentIII.id)
    println(studentIII.yearEnrolled)

    var studentIV = Student("Liv","Tyler","Liv",2023001)
    println(studentIV.firstName)
    println(studentIV.lastName)
    println(studentIV.nickName)
    println(studentIV.id)
    println(studentIV.yearEnrolled)

    var studentV = Student("Corliss","Williamson","Cor",2023002,2023)
    println(studentV.firstName)
    println(studentV.lastName)
    println(studentV.nickName)
    println(studentV.id)
    println(studentV.yearEnrolled)

    var studentVI = Student(2023003)
    println(studentVI.firstName)
    println(studentVI.lastName)
    println(studentVI.nickName)
    println(studentVI.id)
    println(studentVI.yearEnrolled)
}