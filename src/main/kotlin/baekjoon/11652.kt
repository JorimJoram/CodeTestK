package baekjoon

import java.math.BigInteger

fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    val cardList = mutableListOf<BigInteger>()
    val cardSet = hashSetOf<BigInteger>()

    for(i in 0 until n){
        val num = readLine().toBigInteger()
        cardList.add(num)
        cardSet.add(num)
    }
    val cardSetList = cardSet.sorted()
    var max = 0
    var resultCard = BigInteger.valueOf(0)
    for(card in cardSetList){
        val cnt = cardList.count{ it == card}
        if(max < cnt){
            max = cnt
            resultCard = card
        }
    }
    println(resultCard)
}