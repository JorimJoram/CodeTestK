package baekjoon

import java.math.BigInteger

fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    val cardMap = hashMapOf<BigInteger, Int>()

    for(i in 0 until n){
        val num = readLine().toBigInteger()
        cardMap[num] = (cardMap[num] ?: 0) + 1
    }

    var cardList = cardMap.toList()
    cardList = cardList.sortedByDescending { it.second }
    val maxSecond = cardList[0].second
    var maxPairList = cardList.takeWhile { it.second == maxSecond }
    maxPairList = maxPairList.sortedBy { it.first }
    println(maxPairList[0].first)

}

/*
5
1987654321
1987654321
1111111111
1111111111
4
* */