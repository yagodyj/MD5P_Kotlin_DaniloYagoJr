package sampleOOP

class Student4(val firstName: String, val lastName: String, val nickName: String, val id: Int, val yearEnrolled: Int)

// Define the list of students
val students = arrayListOf(
    Student4("John", "Doe", "JD", 1234, 2021),
    Student4("Jane", "Doe", "Janey", 5678, 2020),
    Student4("Bob", "Smith", "Bobby", 9012, 2022)
)

// Function to search for students with a wild search string
fun searchStudentWildSearch(searchString: String): ArrayList<Student4> {
    val matchingStudents = arrayListOf<Student4>()
    for (student in students) {
        if (student.firstName.contains(searchString, ignoreCase = true) ||
            student.lastName.contains(searchString, ignoreCase = true) ||
            student.nickName.contains(searchString, ignoreCase = true)) {
            matchingStudents.add(student)
        }
    }
    return matchingStudents
}

// Function to search for students with a wild search string in a specific field
fun searchStudentWildSearch(searchString: String, searchField: String): ArrayList<Student4> {
    val matchingStudents = arrayListOf<Student4>()
    for (student in students) {
        when (searchField) {
            "firstName" -> {
                if (student.firstName.contains(searchString, ignoreCase = true)) {
                    matchingStudents.add(student)
                }
            }
            "lastName" -> {
                if (student.lastName.contains(searchString, ignoreCase = true)) {
                    matchingStudents.add(student)
                }
            }
            "nickName" -> {
                if (student.nickName.contains(searchString, ignoreCase = true)) {
                    matchingStudents.add(student)
                }
            }
        }
    }
    return matchingStudents
}