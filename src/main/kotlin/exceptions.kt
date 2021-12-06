import java.lang.NumberFormatException
import java.util.*
import kotlin.collections.ArrayList

fun main(){
//    try {
//        val message = "2"
//        message.toInt()
//
//    }catch(e: NumberFormatException){
//        //e.printStackTrace() //or
//        println(e.localizedMessage)
//    }finally {
//        println("with errors")
//    }

//    val message = "Welcome to Kotlin Tutorials"
//    if(message.length > 10){
//        throw IllegalArgumentException("String is invalid")
//    }
//    var input = arrayOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15)
//     if(input == null || input.size < 1){
//         println(Array<Int>(0){0})
//     }else{
//         var output = arrayOf<Int>(0,0)
//         for(i in input){
//             if(i<=0){
//                 output[1] += i
//             }else{
//                 output[0] += 1
//             }
//         }
//         println(Arrays.toString(output))
//     }

 //   print(input.map {it * -1})

//    var year = 2020
//
//    // checking leap year condition
//    val isleap = if (year % 4 == 0){
//        if (year % 100 == 0) {
//            // Century Year must be divisible by 400 for Leap year
//            year % 400 == 0
//        } else true
//    } else false;
//
//    println("$year is ${if (isleap) "Leap Year" else "Not a Leap Year"} ")

    var time = 3
    print(Math.floor(time.toDouble()/2).toInt())
}

