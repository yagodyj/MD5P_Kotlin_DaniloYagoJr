package kotlinbasics

fun main(){
    //sample database
    var defaultUsername:String = "admin"
    var defaultPassword:String = "1234"

    //login
    print("Enter username: ")
    var username : String = readln()
    print("Enter password: ")
    var password : String = readln()

    //testing of credentials
    if ((username == defaultUsername) && (password == defaultPassword)){
        println("Successfully Logged In!")
    }else{
        println("Invalid username or password")
    }
}