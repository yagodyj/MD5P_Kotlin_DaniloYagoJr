package ooppracticeactivities.ooppracticeactivity14

open class Employee {
    var position:String = ""
    var name:String = "default name"
    var age:Int = 0

    constructor(){
        position = "default position"
        name = "default name"
        age = 0
    }
    constructor(position:String, name:String, age:Int){
        this.position = position
        this.name = name
        this.age = age
    }

    open fun displayInfo(){
        println("Employee's position is $position")
    }
}