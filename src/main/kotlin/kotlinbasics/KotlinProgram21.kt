package kotlinbasics

fun main(){
    var names = arrayOf("paul", "john", "ringo", "george")
    //only strings
    //var names = arrayOf<string>("paul", "john", "ringo", "george")

    println("array size is ${names.size}")

    var ctr:Int = 0
    while(ctr < names.size){
        println(names[ctr])
        ctr++
    }
}