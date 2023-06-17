package kotlinbasics

fun main(){
    val name:String? = "John"
    val newName = name!!

    //println(newName)

    //elvis
    val name2:String? = null
    val elvisOperatorResult = name2?: "No null value please"
    println(elvisOperatorResult)

    val greeting: String? = "Peter"
    val result = greeting?.let{10+10}
    println(result)

}
