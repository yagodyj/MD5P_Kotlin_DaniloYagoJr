package kotlinoop.kotlinoop1

class Person1B(name:String, age:Int){
    var name: String
    var age: Int

    //init block, initialization
    init{
        this.name = name
        this.age = age
    }

    fun walk(){
        println("A person walks")
    }

    fun eat(){
        println("A person eats")
    }

    fun sayHello(){
        println("$name says hello!")
    }
}
fun main(){
    //instantiation - creating objects from a class
    val pedroObject = Person1B("Ringo", 21)
    println(pedroObject.name)
    println(pedroObject.age)
    pedroObject.sayHello()
}