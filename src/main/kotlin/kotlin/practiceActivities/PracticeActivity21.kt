package practiceActivities

fun main(){
    var ctr1 = 0
    while(ctr1 < 5){
        var ctr2 = 0
        while (ctr2 < ctr1+1){
            print(ctr2+1)
            ctr2++
        }
        println()
        ctr1++
    }
}