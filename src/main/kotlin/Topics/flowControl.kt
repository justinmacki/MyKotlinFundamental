package Topics

fun flowControl(){
//        if(userAge >= 0){
//            if(userAge < 18){
//                println("You are not allowed to use our service")
//            }else{
//                println("You can use our service")
//            }
//        }else{
//
//        }
    //    print("Enter your name: ")
//    var userName = readLine()!!
//    print("Enter your birthyear: ")
//    var userYear = readLine()!!.toInt()
//    println("Hello, $userName! Your age this year is: ${2021-userYear}")
//    println()
    try{
        print("Enter your age: ")
        var userAge = readLine()!!.toInt()

        //if-block
        if(userAge<=0){
            println("Please input a valid age")
        }else if(userAge == 17){
            println("You need a guardian")
        }else if(userAge < 18){
            println("You are not allowed to use our service")
        }else{
            println("You can use our service")
        }
    }catch (e: Exception){
        println("That is an invalid input")
    }

    println("What is the day today?")
    var dayOfWeek = readLine()!!.lowercase()

    when(dayOfWeek){
        "monday" -> println("Hey it's Monday! Let's be productive.")
        "tuesday" -> println("Hey it's Tuesday! Choose to be happy.")
        "wednesday" -> println("Hey it's Wednesday my dudes!")
        "thursday" -> println("Hey it's Thursday! You're almost there!")
        "friday" -> println("Thank God it's Friday!")
        "saturday" -> println("Happy Weekends! Get some life!")
        "sunday" -> println("Happy Weekends! Get some life!")
        else -> println("Not a valid day!")
    }

    // Calculator
    print("Enter your first value: ")
    var a = readLine()!!.toDouble()
    print("Enter your second value: ")
    var b = readLine()!!.toDouble()
    print("Enter operator to be used (+, -, *, /, %): ")
    var oper = readLine()!!

    when(oper){
        "+" -> println(a+b)
        "-" -> println(a-b)
        "*" -> println(a*b)
        "/" -> println(a/b)
        "%" -> println(a%b)
        else -> println("Please use a valid operator.")
    }

    // WHILE LOOP
    var exitCode = -1

    print("People Entered: ")
    var userInput = readLine()!!.toInt()
    var counter = 0

    while(userInput != exitCode){
        counter += userInput
        println("Total: $counter")
        print("People Entered: ")
        userInput = readLine()!!.toInt()
    }

    println("Limit reached!")
}