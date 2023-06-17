package practiceActivities

fun main(){

    print("Enter a positive integer: ")
    var number:Int = readln().toInt()
    if(number < 0){
        println("POSITIVE INTEGER ONLY!!")
        }else{
            repeat(number){
            if (it%2 == 0) {
                println(it+1)
                }
            }
        }
//    var number:Int = 0
//
//    print("Enter a positive integer: ")
//    number = readln().toInt()
//       for(counter in 1..number){
//           if(counter%2 == 0 ){
//               continue
//           }
//           println(counter)
//           }
}