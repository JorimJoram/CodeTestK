package baekjoon

fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    val weightList = mutableListOf<Int>()
    var maxWeight = 0
    for(i in 1 .. n){
        weightList.add(readLine().toInt())
    }

    weightList.sortDescending()

    for((idx, weight) in weightList.withIndex()){
        val result = weight * (idx+1)
        if(maxWeight < result)
            maxWeight = result
    }

    println(maxWeight)
}