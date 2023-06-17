package ooppracticeactivities.ooppracticeactivity10

fun main(){
    var bankAccount1 = BankAccount(123456)
    println(bankAccount1.accountNumber)
    bankAccount1.initialBalance = 10000
    println(bankAccount1.initialBalance)

    var bankAccount2 = BankAccount(789456,15000)
    println(bankAccount2.accountNumber)
    println(bankAccount2.initialBalance)
}