package ooppracticeactivities.ooppracticeactivity2

class Rectangle(var width:Double, var height:Double) {
    var area:Double
    init {
        area = 0.0
    }

    fun calculateArea():Double {
        area = width * height
        println("The area of the rectangle is $area")
        return area
    }
}