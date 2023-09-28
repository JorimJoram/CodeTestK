package baekjoon

fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    var pList = readLine().split(" ").map { it.toInt() }
    pList = pList.sorted()

    var reduceSum = 0
    var result = 0

    for(p in pList){
        reduceSum += p
        result += reduceSum
    }

    println(result)
}