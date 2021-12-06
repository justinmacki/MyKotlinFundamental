fun main(){
    var lowerFlag = false
    var upperFlag = false
    var digitFlag = false
    var charFlag = false
    print("Enter a password: ")
    var userInput = readLine()!!
    val lower = listOf<Char>('A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z')
    val upper = listOf<Char>('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z')
    val digit = listOf<Char>('0', '1', '2', '3', '4', '5', '6', '7', '8', '9')
    val chars = listOf<Char>('#', '$', '@')

    if(userInput.length >= 6 && userInput.length < 17){
        for (item in userInput){
            if (lower.contains(item)) lowerFlag = true
            if (upper.contains(item)) upperFlag = true
            if (digit.contains(item)) digitFlag = true
            if (chars.contains(item)) charFlag = true
        }
        if (charFlag && digitFlag && upperFlag && lowerFlag){ println("Very good password!")} else{ println("Not good!") }
    }
}