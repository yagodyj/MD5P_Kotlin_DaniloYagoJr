package kotlinbasics

fun main(){
    for(counter in 1..7){
        if(counter == 4){
            continue
        }
        println(counter)
    }
    println("Hello World!")
}