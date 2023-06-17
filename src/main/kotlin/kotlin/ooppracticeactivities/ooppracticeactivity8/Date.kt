package ooppracticeactivities.ooppracticeactivity8

class Date {
    var day:Int
    var month:String
    var year:Int

    constructor(){
        day = 0
        month = "default"
        year = 0
    }
    constructor(day:Int,month:String,year:Int){
        this.day = day
        this.month = month
        this.year = year
    }
}