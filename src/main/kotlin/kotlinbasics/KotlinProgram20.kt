package kotlinbasics

fun main(){
    var ctr1 = 0
    while(ctr1 < 4){
        var ctr2 = 0
        while (ctr2 < 8){
            print(ctr2+1)
            ctr2++
        }
        println()
        ctr1++
    }
}