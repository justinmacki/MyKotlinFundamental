fun collections(){
    //Collections

    //List
    //immutable
    val airlines = listOf("Cebu Pacific", "PAL", "Airasia")
    println(airlines[1]) // Print out the item in array index 1
    println(airlines.get(0)) // Print out the item in array index 0
    println(airlines.isEmpty()) // Check if the list is empty or not
    println(airlines.indexOf("Airasia")) // Check the index number of airline Airasia
    println(airlines.last()) // Get the last element/item in the list
    println(airlines.contains("Cathay Pacific")) // Check if Cathay Pacific is included in the list
    println(airlines.size) // Get the size of the list


    println()

    //mutable
    val terminals = mutableListOf<Int>(1,2,3,4)
    //val terminals: MutableList<Int> = mutableListOf(1,2,3,4)
    println(terminals)
    terminals.add(5) // Add terminal 5 on the list
    println(terminals)
    terminals.remove(2) // Remove Terminal 2 from the list
    println(terminals)
    println(terminals.contains(2)) // To check if Terminal 2 still exists in the list
    println(terminals.isEmpty()) // Check if the list is empty or not
    println(terminals.indexOf(5)) // Check the index number of Terminal
    println(terminals)
    terminals.set(2,6) // This will re-assign the value of index 2 to Terminal 6 (Terminal 4 is replaced)
    println(terminals)
    terminals.add(4) // Add terminal 4 again on the list
    println(terminals.last()) // Get the last element/item in the list
    println(terminals.size) // Get the size of the list
    terminals.sort() // To sort the Terminals in ascending order
    println(terminals)
    terminals.removeFirst() // Removes the first item in the list
    println(terminals)
    terminals.add(0,1) // Insert Terminal 1 on a specific index
    println(terminals)
    println(terminals.drop(3)) // Drop the item from index 0 and before index 3

    //YAGNI Principle - You Aren't Gonna Need It

    //************************************************************************************************************//

    // Set -> it contains unique set of elements

    //immutable
    val usernames: Set<String> = setOf("brandon", "amelia", "charlie")
    println(usernames) // Print the Set
    println(usernames.size) // Get the size of the set.
    println(usernames.contains("brandon")) // Check if username 'brandon' already exists
    println(usernames.isEmpty()) // Check if the set is empty
    println(usernames.first()) // Get the first element in the set
    println(usernames.sorted()) // Print the sorted set in alphabetical order
    println(usernames.last()) // Get the last element in the set

    println()

    //mutables
    val students: MutableSet<String> = mutableSetOf("Brandon", "Amelia", "Charlie")
    println(students)
    students.add("Alex") // Add Alex to the set of students
    println(students)
    students.add("Brandon") // If this is a list, the result would contain duplications.
    println(students)
    students.remove("Amelia") // This will remove Amelia from the set
    println(students)
    println(students.sorted()) // This will return the sorted set of students alphabetically
    println(students.first()) // This will get the first student in the set
    println(students.reversed()) // This will get the reversed set of students
    students.clear()
    println(students) // This will clear the set

    //************************************************************************************************************//

    // Map -> A collection of key-value pairs
    // Student Details: firstName, lastName, yrLevel, section
    // "Brandon", "Diaz", "First, "A"

    //immutable
    val studentDetails: Map<String, String> = mapOf(
        "firstName" to "Brandon",
        "lastName" to "Diaz",
        "yrLevel" to "First",
        "section" to "A"
    )

    println(studentDetails) // This will print the map
    println(studentDetails.keys) // This will get all the existing Keys in the map
    println(studentDetails.values) // This will get all the existing Values in the map
    println(studentDetails.size) // This will return the size of the Map

    println()

    //mutable
    val studentsDetails: MutableMap<String, String> = mutableMapOf(
        "firstName" to "Kathryn",
        "lastName" to "Bernardo",
        "yrLevel" to "Second",
        "section" to "A"
    )

    println(studentsDetails) // To print the mutable map
    studentsDetails.remove("section") // Removes the section key and its value
    println(studentsDetails)
    studentsDetails.put("section", "A") // Adds a section key and a value
    println(studentsDetails)
    studentsDetails.replace("section", "B") // Replaces the section of Kathryn Bernardo
    println(studentsDetails)
    println("${studentsDetails.get("firstName")} ${studentsDetails.get("lastName")} is in section ${studentsDetails.get("section")} and a ${studentsDetails.get("yrLevel")} Year student.") // Gets all the necessary data of Kathryn
    println(studentsDetails.containsKey("remarks")) // This will check if there is an existing remarks key
    println(studentsDetails.containsValue("Kathryn")) // This will check if there is an existing Kathryn value
    studentsDetails.put("remarks", "Passed") // Adds a section key and a value
    println(studentsDetails.size) // This will return the size of the Map
    println(studentsDetails)
    studentsDetails.clear() // This will clear all key-value pairs in the map
    println(studentsDetails)
}