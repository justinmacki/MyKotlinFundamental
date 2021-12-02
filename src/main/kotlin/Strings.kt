fun main() {

    var firstName = "Macki"
    var middleName = "Baldon"
    var surName = "Julhusin"
    val myMessage = "Happy Birthday! Justin!"
    val myMessage2 = "Happy Birthday! Justin!"
    val myMessage3 = "Happy Birthday! Justin $firstName ${middleName.first()}. $surName!"
    println(myMessage)
    println(myMessage.get(0))
    println(myMessage.substring(16,22))
    println(myMessage.compareTo(myMessage2))
    println(myMessage.plus(" " + myMessage2))
    println(myMessage.drop(1))
    println(myMessage.dropLast(2))
    if(myMessage.contains("Justin", ignoreCase = true)){
        println(myMessage.uppercase())
    }else{
        println(myMessage.lowercase())
    }
    println(myMessage3.drop(1).dropLast(1))


    val nickName = "macki"
    val product = 100
    val quantity = 10

    println("Hello ${nickName.replaceFirstChar {nickName.first().uppercase()}}, Your total cost is: " +
            "\$${product*quantity}. Thank you for shopping with us!")
}