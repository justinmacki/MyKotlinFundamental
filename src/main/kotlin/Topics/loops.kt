package Topics

fun loops(){
    //    val rows = 5
//    for (i in 1..rows) {
//        for (j in 1..i) {
//            print("$j ")
//        }
//        println()
//    }
    val fruits: MutableMap<Int, String> = mutableMapOf(
        1 to "Banana",
        2 to "Apple",
        3 to "Orange",
        4 to "Guava"
    )

    for(item in fruits){
        println(item.value)
    }

    val airlines = listOf("Cebu Pacific", "PAL", "Airasia")

    for(item in airlines){
        println(item)
    }

    val users = arrayListOf<String>("Ferdie","Lisa")
    val age = arrayListOf<Int>(45,13)

    println()

    for(count in 0..users.lastIndex){
        println("${users[count]} is ${age[count]} years old.")
    }

}