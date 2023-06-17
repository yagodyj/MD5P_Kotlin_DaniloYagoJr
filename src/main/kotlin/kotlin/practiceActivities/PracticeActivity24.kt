package practiceActivities

fun main(){
    var total1 = 0
    var total2 = 0
    var counter2 = 0
    var counter3 = 0

    println("Number\tSquare\tCube")
    for(counter in 1..10){
        if(counter%2 == 1 ){
            continue
        }
        counter2 = counter*counter
        counter3 = counter*counter*counter
        println("  $counter\t\t$counter2\t\t$counter3")
        total1 += counter2
        total2 += counter3

    }
    println("Total\t$total1\t\t$total2")
}