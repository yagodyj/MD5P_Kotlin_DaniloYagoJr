package kotlinbasics

fun main(){
    println(total(2,5,10))
}
fun total(vararg numbers:Int):Int{
    var total = 0
    for (num in numbers){
        total += num
    }
    return total
}