package baekjoon

fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    var aList = readLine().split(" ").map { it.toInt() }
    var bList = readLine().split(" ").map { it.toInt() }

    aList = aList.sorted()
    bList = bList.sorted().reversed()

    var result = 0

    for(i in 0 until n){
        result += aList[i] * bList[i]
    }

    println(result)
}