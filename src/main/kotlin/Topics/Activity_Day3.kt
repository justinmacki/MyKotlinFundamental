package Topics

fun Activity_Day3(){
    //1
    print("Enter First Number: ")
    var n1 = readLine()!!.toInt()
    print("Enter First Number: ")
    var n2 = readLine()!!.toInt()
    print("Enter First Number: ")
    var n3 = readLine()!!.toInt()

    if (n1 >= n2 && n1 >= n3) println("Largest Number: $n1")

    if (n2 >= n1 && n2 >= n3) println("Largest Number: $n2")

    if (n3 >= n1 && n3 >= n2) println("Largest Number: $n3")

    //2
    val vowels = listOf<String>("a", "e", "i", "o", "u")
    val consonants = listOf<String>("b", "c", "d", "f", "g", "h", "j","k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z")


    print("Enter a letter: ")
    var userInput = readLine()!!

    if(userInput.length > 1){
        println("Please input a character only!")
    }else{
        if (vowels.contains(userInput.lowercase())){
            println("Your letter is a vowel")
        }else if(consonants.contains(userInput.lowercase())){
            println("Your letter is a consonant")
        }else{
            println("Your input is not in the alphabet")
        }
    }

    // 3
    print("Enter a password: ")
    var userInputs = readLine()!!

    val regex = """^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[${'$'}#@]).{6,16}${'$'}""".toRegex()

    if(regex.matches(userInputs)){
        println("Very good password!")
    }else{
        println("Try more combinations!")
    }
}