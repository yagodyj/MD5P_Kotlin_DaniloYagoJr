package kotlinoop.kotlinoop3

class Person {
    var name:String
    var age:Int

    constructor(){
        //primary
        name = "default name"
        age = 0
    }

    constructor(name:String, age:Int){
        //secondary
        this.name = name
        this.age = age
    }

    constructor(name:String){
        this.name = name
        this.age = 0
    }

    constructor(age:Int){
        this.name = "John"
        this.age = age
    }
}