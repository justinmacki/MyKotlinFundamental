fun main(){
    //Arithmetic
//    val numByte = Byte.MAX_VALUE
//    val numShort = Short.MAX_VALUE
//    val numLong = Long.MAX_VALUE
//    val numFloat = Float.MAX_VALUE
//    val numDouble = Double.MAX_VALUE

//    val numByte = 1
//    val numShort = 2
//    var numLong = 7
//    val numFloat = 1.23F
//    val numDouble = 4
//
//    var result = numShort + numLong
//    println("$numShort + $numLong = $result")
//
//    result = numShort - numLong
//    println("$numShort - $numLong = $result")
//
//    result = numShort * numLong
//    println("$numShort * $numLong = $result")
//
//    result = numShort / numLong
//    println("$numShort / $numLong = $result")
//
//    result = numShort % numLong
//    println("$numShort % $numLong = $result")
//
//    result = numLong % numShort
//    println("$numLong % $numShort = $result")
//
//    numLong++
//    println("Increment of numLong: $numLong")
//
//    numLong--
//    println("Decrement of numLong: $numLong")
//
//    //Augmented
//    var myNum1 = 15
//    var results = 0
//    results += myNum1
//    println(results)
//
//    results -= myNum1
//    println(results)
//
//    myNum1 *= myNum1
//    println(myNum1)
//
//    myNum1 /= myNum1
//    println(myNum1)


    var year: Int = readLine()!!.toInt()
    println(year%100)

    if (year % 100 > 0)
        print(year / 100 + 1)
    else
        print(year / 100)

}