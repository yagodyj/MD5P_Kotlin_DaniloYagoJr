package kotlinoop.kotlinoop10

fun main(){
    val myCar = Car("Toyota","Corolla",2001)

    myCar.accelerate()
    myCar.accelerate(20.0)
    myCar.refuel()
    myCar.brake()
    myCar.displayInfo()

    val car2 = Vehicle("Mitsubishi","Xpander",2023)
    car2.displayInfo()
}