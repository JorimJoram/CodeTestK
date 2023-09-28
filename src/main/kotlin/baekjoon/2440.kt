package baekjoon

fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    for(i in (n) downTo 0){
        for(j in 1 .. i){
            print("*")
        }
        println()
    }
}