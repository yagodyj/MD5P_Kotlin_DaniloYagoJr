package kotlinoop.kotlinoop2

fun main(){
    var myPhone = MobilePhone(10)
    myPhone.checkBalance()
    myPhone.load(30)
    myPhone.checkBalance()
    myPhone.sendTextMessage("Wer n U?")
    myPhone.sendTextMessage("D2 n me")
    myPhone.checkBalance()
    myPhone.displayLogs()
}