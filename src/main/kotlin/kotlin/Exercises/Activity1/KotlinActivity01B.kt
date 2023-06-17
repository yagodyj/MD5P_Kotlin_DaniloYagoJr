package Exercises.Activity1

fun main (){
    var itemType = "What kind of item to be borrowed?"
    var borrowerName = "Name of the student"
    var dateBorrowed = "Date Borrowed:"
    var dateReturned = "Date Returned:"
    var librarianProcessed = "Librarian Processed:"
    print("Name of the student: ")
    borrowerName = readln()
    println("[Book, Magazine, Journal, School Equipment, Internet Access]")
    print("Item/s to avail:")
    itemType = readln()
    print("Enter the date today: ")
    dateBorrowed = readln()

    println("**************************************************************")
    print("Processed by: ")
    librarianProcessed = readln()
    print("Returning date: ")
    dateReturned = readln()
    println("**************************************************************")
    println("$borrowerName, you borrowed $itemType on $dateBorrowed")
    println("$itemType borrowed must be returned in $dateReturned")
    println("Processed by: $librarianProcessed")
    println("**************************************************************")

}