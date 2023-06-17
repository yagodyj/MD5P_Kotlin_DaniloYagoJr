package kotlinoop.kotlinoop7

class Outer {
    //nested class
    //In a nested class, the inner class cannot
    //access the properties and behaviours of the
    //Outer class
    val outerClassName = "Outer name"

    class Inner{

        fun callOuter(){
            println("Not possible")
        }
    }
}