package kotlinbasics

fun main(){
    var beatles = listOf<String>("Paul", "John", "Ringo", "George")
    println("list size is ${beatles.size}")

    var ctr = 0
    while (ctr < beatles.size){
        println(beatles[ctr])
        ctr++
    }
    println("******************")

    var rivermaya = mutableListOf<String>("Bamboo", "Rico", "Perf", "Juan")
    rivermaya.removeAt(0)
    rivermaya.remove("Rico")
    rivermaya.add("John")
    rivermaya.add(2, "Peter")
    var ctr2: Int = 0
    while(ctr2 < rivermaya.size) {
        println(rivermaya[ctr2])
        ctr2++
    }
}