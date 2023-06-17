package ooppracticeactivities.ooppracticeactivity10

class BankAccount {
    var accountNumber:Int
    var initialBalance:Int

    constructor(accountNumber:Int){
        this.accountNumber = accountNumber
        this.initialBalance = 0
    }
    constructor(accountNumber: Int, initialBalance:Int){
        this.accountNumber = accountNumber
        this.initialBalance = initialBalance
    }
}