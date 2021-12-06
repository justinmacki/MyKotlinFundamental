fun main(){
    var myName: String? = null
    println(myName)

    var input: String? = null
    println(input?: "default")

    var input1: String? = "null"
    println(input1?.length)
}