package Exercises.Activity1

fun main(){
    var completeName:String = "Complete Name"
    var address:String = "Address"
    var contactNumber:Int = 123456
    var emailAd:String = "Email Address"

    var passAct1A:String = "Did the student pass Activity 01-A? Y/N: "
    var passAct1B:String = "Did the student pass Activity 01-B? Y/N: "
    var passAct1C:String = "Did the student pass Activity 01-C? Y/N: "
        print("Enter Student number (KG-XXXXXXXX-XXX): ")
        var studentNumber = readln()

    when(studentNumber){
        "KG-02232023-068" -> {
            completeName = "Bernardo Pracillo Padilla"
            address = "sample address"
            contactNumber = 111111
            emailAd = "sample@email.com"
        }"KG-02252023-032"->{
            completeName = "Rodney Llubit Estacion"
            address = "sample address"
            contactNumber = 222222
            emailAd = "sample@email.com"
        }"KG-02262023-033"->{
            completeName = "Danilo Manalang Yago"
            address = "Lipa City, Batangas"
            contactNumber = 555583443
            emailAd = "dyj.yago2000@gmail.com"
        }"KG-02262023-037"->{
        completeName = "Ryan Amantillo Caseres"
        address = "sample address"
        contactNumber = 333333
        emailAd = "sample@email.com"
        }"KG-02282023-053"->{
        completeName = "Clifford Luces Trinidad"
        address = "sample address"
        contactNumber = 444444
        emailAd = "sample@email.com"
        }"KG-03022023-069"->{
        completeName = "Mary Claire Osongco Capili"
        address = "sample address"
        contactNumber = 555555
        emailAd = "sample@email.com"
        }"KG-03032023-028"->{
        completeName = "Rirrucham Casanova Kashyap"
        address = "sample address"
        contactNumber = 666666
        emailAd = "sample@email.com"
        }"KG-03072023-067"->{
        completeName = "Riecho Hernandez Pinanonang"
        address = "sample address"
        contactNumber = 777777
        emailAd = "sample@email.com"
        }"KG-03102023-065"->{
        completeName = "Joseph Christopher Samonte Gonzales"
        address = "sample address"
        contactNumber = 888888
        emailAd = "sample@email.com"
        }"KG-03152023-060"->{
        completeName = "Vincent Revilla Yaiso"
        address = "sample address"
        contactNumber = 999999
        emailAd = "sample@email.com"
        }"KG-03222023-061"->{
        completeName = "Bernadette Perez De Jesus"
        address = "sample address"
        contactNumber = 101010
        emailAd = "sample@email.com"
        }else->{
            println("Invalid Student Number")
        }
    }

    var ctr = 0
    println(completeName)
    println(address)
    println(contactNumber)
    println(emailAd)
    print(passAct1A)
    var act1AAns = readln()
    if(act1AAns == "Y"){
        ctr++
    }
    print(passAct1B)
    var act1BAns = readln()
    if(act1BAns == "Y"){
        ctr++
    }
    print(passAct1C)
    var act1CAns = readln()
    if(act1CAns == "Y"){
        ctr++
    }

    println("$completeName has submitted $ctr/3 activities")
}