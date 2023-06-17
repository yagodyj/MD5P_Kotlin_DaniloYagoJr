package Exercises

fun main(){
    val applyingPosition:String = "Financial Analyst"
    val availabilityForWork:String = "A.S.A.P."
    val desiredSalary:Double = 25000.0
    var lastName:String = "Dela Cruz"
    var firstName:String = "Juan"
    var middleName:String = "Santos"
    var address:String = "Tondo"
    var city:String = "Metro Manila"
    var state:String = "Philippines"
    var zipCode:Int = 1234
    var homePhone:Int = 81234567
    var cellPhone:Int = 927123456
    var emailAd:String = "juandelacruz@gmail.com"
    val ssNumber:Int = 88885964
    var citizenUS:Boolean = false
    var convicted:Boolean = false
    var drugScreeningTest:Boolean = true
    var schoolName:String = "U.P."
    var schoolLocation:String = "Diliman"
    var yearsAttended:String = "2018-2022"
    var degreeReceived:String = "B.S. Business Ad"
    var major:String = "Financial Management"
    var licensesHeld:String = "CFA"
    var employer:String = "BSP"
    var datesEmployed:String = "2022-2023"
    var workPhone:Int = 8265489
    var payRate:Double = 15000.0
    var toPayRate:Double = 25000.0
    var position:String = "Finance Associate"
    var dutiesPerformed:String = "preparation of financial reports"
    var svNameTitle:String = "Maria Makiling - Senior Accountant"
    var reasonForLeaving:String = "Career advancement"
    val contactThem:Boolean = true
    var refName:String = "Pedro Penduko"
    var refTitle:String = "VP for Finance"
    var refCompany:String = "ABC Company"
    var refPhone:String = "88525584"

    println("Position You Are Applying For: $applyingPosition")
    println("Date Available for Work: $availabilityForWork")
    println("Desired Salary: $desiredSalary")
    println("")
    println("PERSONAL INFORMATION")
    println("Last Name: $lastName")
    println("First Name: $firstName")
    println("Middle Name: $middleName")
    println("Address: $address")
    println("City: $city")
    println("State: $state")
    println("Zip: $zipCode")
    println("Home Phone: $homePhone")
    println("Cell Phone: $cellPhone")
    println("Email Address: $emailAd")
    println("Social Security Number: $ssNumber")
    println("Are you a U.S. Citizen? $citizenUS")
    println("Have you ever convicted? $convicted")
    println("If selected for employment are you willing to submit to a pre-employment drug screening test? $drugScreeningTest")
    println("")

    println("EDUCATION")
    println("School Name: $schoolName")
    println("School Location: $schoolLocation")
    println("Years Attended: $yearsAttended")
    println("Degree Received: $degreeReceived")
    println("Major: $major")
    println("")

    schoolName = "Tondo Highschool"
    schoolLocation = "Tondo, Manila"
    yearsAttended = "2014-2018"
    degreeReceived = "N/A"
    major = "N/A"

    println("School Name: $schoolName")
    println("School Location: $schoolLocation")
    println("Years Attended: $yearsAttended")
    println("Degree Received: $degreeReceived")
    println("Major: $major")
    println("")

    println("Other training, certifications or licenses held: $licensesHeld")
    println("")
    println("EMPLOYMENT")
    println("Employer: $employer")
    println("Dates Employed: $datesEmployed")
    println("Work Phone: $workPhone")

    address = "Manila"
    println("Address: $address")
    println("City: $city")
    println("State: $state")
    println("Zip: $zipCode")
    println("Position: $position")
    println("Duties Performed: $dutiesPerformed")
    println("Supervisors Name and Title: $svNameTitle")
    println("Reason for Leaving: $reasonForLeaving")
    println("May we contact them? $contactThem")
    println("")
    println("REFERENCES")

    println("Name: $refName")
    println("Title: $refTitle")
    println("Company: $refCompany")
    println("Phone: $refPhone")
    println("")

    refName = "Jose Rizal"
    refTitle = "National Hero"
    refCompany = "Katipunan"
    refPhone = "12345678"

    println("Name: $refName")
    println("Title: $refTitle")
    println("Company: $refCompany")
    println("Phone: $refPhone")

}