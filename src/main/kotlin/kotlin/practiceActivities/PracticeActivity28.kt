package practiceActivities
    fun optionFunc(){
    var option: String = " "

    println("\nMain Menu")
    println(" a. Celsius to Fahrenheit")
    println(" b. Fahrenheit to Celsius")
    println(" c. Exit")
    print("Choose option [a, b, or, c]: ")
    option = readln()

    when (option) {
        "a" -> {
            print("Enter temp in Celsius: ")
            var toFahrenheit = readln().toDouble()
            var celsius = 9.0 / 5.0 * toFahrenheit + 32.0
            println("$toFahrenheit degrees is $celsius degrees in Fahrenheit")
            optionFunc()
        }
        "b" -> {
            print("Enter temp in Fahrenheit: ")
            var toCelsius = readln().toDouble()
            var fahrenheit = (toCelsius - 32.0) * 5.0 / 9.0
            println("$toCelsius degrees is $fahrenheit degrees in Celsius")
            optionFunc()
        }
        "c" -> {
            println("End of Program. Good Bye!")
        }
    }
    }
fun main(){
    optionFunc()
}


