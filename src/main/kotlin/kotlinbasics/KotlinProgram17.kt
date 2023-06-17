package kotlinbasics

fun main(){
    var counter = 0
    while(counter < 5){
        println("Dyj")
        if(counter ==  3){
            break
        }
        counter++
    }
    print("Hello world!")
}