package practiceActivities

fun main(){
    val brands = arrayOf("HP", "ACER", "LENOVO", "TOSHIBA","DELL")
    var ctr:Int = 0
    while(ctr < brands.size){
        print("${brands[ctr]}\t")
        ctr++
    }
    try{
        print("\nEnter an index [0-4]: ")
        var index = readln().toInt()
        println(brands[index])
    }catch (e:Exception){
        println("Error: Index out of bounds. Please enter an index between 0 and 4.")
    }
}