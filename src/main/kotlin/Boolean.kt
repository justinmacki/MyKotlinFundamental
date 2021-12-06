fun main(){
    val isNotChristmas = false
    val isChristmas = true

    println(!isChristmas && !isChristmas)
    println(isChristmas && isChristmas)
    println(!isChristmas && isChristmas)
    println(isChristmas && !isChristmas)
    println()
    println(!isChristmas || !isChristmas)
    println(isChristmas || isChristmas)
    println(!isChristmas || isChristmas)
    println(isChristmas || !isChristmas)
    println()
    println(isChristmas.and(false))
    println(isChristmas.or(false))
    println(isChristmas.xor(false))
}