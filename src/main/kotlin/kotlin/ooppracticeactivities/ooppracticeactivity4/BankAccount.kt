package ooppracticeactivities.ooppracticeactivity4

class BankAccount(var accountNumber:Int) {
    var balance:Int = 0

    fun deposit(amount:Int){
        balance += amount
        println("You have successfully added Php$amount to $accountNumber")
        println("Your account balance is $balance\n")
    }
   fun withdraw(amount:Int){
       balance -= amount
       println("You have successfully withdrawn Php$amount from $accountNumber")
       println("Your account balance is $balance")
   }
}