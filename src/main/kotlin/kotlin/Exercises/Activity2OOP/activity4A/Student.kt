package Exercises.Activity2OOP.activity4A

class Student {
    var firstName: String
    var lastName: String
    var nickName: String
    var id: Int
    var yearEnrolled: Int


    constructor() {
        firstName = "Natalie"
        lastName = "Aaron"
        nickName = "Talie"
        id = 2022001
        yearEnrolled = 2022
    }

    constructor(firstName: String, lastName: String) {
        this.firstName = firstName
        this.lastName = lastName
        this.nickName = "Seb"
        this.id = 2022002
        this.yearEnrolled = 2022
    }

    constructor(firstName: String, lastName: String, nickName: String) {
        this.firstName = firstName
        this.lastName = lastName
        this.nickName = nickName
        this.id = 2022003
        this.yearEnrolled = 2022
    }

    constructor(firstName: String, lastName: String, nickName: String, id: Int) {
        this.firstName = firstName
        this.lastName = lastName
        this.nickName = nickName
        this.id = id
        this.yearEnrolled = 2023
    }

    constructor(firstName: String, lastName: String, nickName: String, id: Int, yearEnrolled: Int) {
        this.firstName = firstName
        this.lastName = lastName
        this.nickName = nickName
        this.id = id
        this.yearEnrolled = yearEnrolled
    }

    constructor(id: Int) {
        this.firstName = "Elijah"
        this.lastName = "Caleb"
        this.nickName = "Eli"
        this.id = id
        this.yearEnrolled = 2023
    }
}

    //    fun searchStudentWildSearch(search:String){
//        var search:String
//        var output = arrayListOf<String>()
//
//    }

