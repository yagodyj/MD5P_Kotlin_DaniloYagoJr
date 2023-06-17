package practiceActivities

fun main(){
    var ctr1 = 0
    while(ctr1 < 5){
        var ctr2 = ctr1
        while (ctr2 < 5){
            print("*")
            ctr2++
        }
        println()
        ctr1++
    }
}