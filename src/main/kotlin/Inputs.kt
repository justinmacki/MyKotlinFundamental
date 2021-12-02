import java.util.*

fun main(){
    print("Enter your name: ")
    var userName = readLine().toString()
    print("Enter your birthyear: ")
    var userYear = readLine()!!.toInt()
    println("Hello, $userName! Your age this year is: ${2021-userYear}")
    println()

    val cal = GregorianCalendar()
    val y: Int
    val m: Int
    val d: Int
    var a: Int

    y = cal[Calendar.YEAR]
    m = cal[Calendar.MONTH] + 1
    d = cal[Calendar.DAY_OF_MONTH]

    print("Enter your birthdate (MM-DD-YYYY): ")
    var userBirthDate = readLine().toString()
    var splitted = userBirthDate.split("-")
    a = y - splitted[2].toInt()

    if(splitted[0].toInt() > m){
        a -= 1
    }else if(splitted[0].toInt() == m){
        if(splitted[1].toInt() > d){
            a -= 1
        }
    }
    println("Hello, $userName! Your age this year is: $a")
}