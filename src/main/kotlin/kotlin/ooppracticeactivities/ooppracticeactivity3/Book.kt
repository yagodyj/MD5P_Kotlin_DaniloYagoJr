package ooppracticeactivities.ooppracticeactivity3

class Book() {
    var title:String
    var author:String
    var year:Int
    init {
        title = "The Great Gatsby"
        author = "F. Scott Fitzgerald"
        year = 1925
    }

    fun printDetails(){
        println("Title: $title")
        println("Author: $author")
        println("Year: $year")
    }
}