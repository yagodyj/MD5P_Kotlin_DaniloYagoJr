package ooppracticeactivities.ooppracticeactivity14

class Administrator(private val department:String) :
    Employee(){

    override fun displayInfo() {
        position = "Administrator"
        println("Administrator's name is Maria")
        println("Administrator's age is 32")
    }
    fun department(){
        println("Belongs to $department department")
    }
}