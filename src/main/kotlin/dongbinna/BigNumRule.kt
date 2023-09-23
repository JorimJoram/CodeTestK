package dongbinna

class BigNumRule {

}

fun main() = with(System.`in`.bufferedReader()){
    val line1 = readLine().split(" ")
    val N = line1[0].toInt()
    val M = line1[1].toInt()
    val K = line1[2].toInt()

    var numList = readLine().split(" ").map { it.toInt() }
    numList = numList.sorted().reversed()

    var cnt = 1
    var idx = 0
    var result = 0

    while (cnt < M){
        idx = 0
        for(i:Int in 1 .. K){
            result += numList[idx]
            cnt += 1
        }
        idx += 1
        result += numList[idx]
        cnt += 1
    }

    println(result)
}