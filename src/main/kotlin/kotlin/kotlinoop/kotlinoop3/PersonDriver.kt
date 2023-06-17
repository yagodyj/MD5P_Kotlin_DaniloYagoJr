package kotlinoop.kotlinoop3

fun main(){
    //1st constructor
    println("First Constructor")
    val person1 = Person()
    println(person1.name)
    println(person1.age)

    //2nd constructor
    println("Second Constructor")
    val person2 = Person("Peter", 21)
    println(person2.name)
    println(person2.age)

    //3rd constructor
    println("Third Constructor")
    val person3 = Person("Bernadette")
    println(person3.name)
    person3.age = 24
    println(person3.age)

    //4th constructor
    println("Fourth Constructor")
    val person4 = Person(10)
    println(person4.name)
    println(person4.age)
}