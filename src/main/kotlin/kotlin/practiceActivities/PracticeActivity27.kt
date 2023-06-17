package practiceActivities

fun main(){
    var inputNumber = 0
    var size = 0
    print("Enter matrix to generate (n by n): ")
    inputNumber = readln().toInt()
    size = inputNumber * inputNumber
    var number = inputNumber

    while (size > 0) {
        var counter = 0
        var output:String = ""
        while (counter < inputNumber) {
            if(number%2 == 0) {
                if(output !== "")
                    output += "\t"
                    output += size
            }else{
                if(output !== "")
                    output = "\t" + output
                    output = size.toString() + output
            }
            counter++
            size--
        }
        number--
        println(output)
    }
}