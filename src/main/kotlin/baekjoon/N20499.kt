package baekjoon

fun main() = with(System.`in`.bufferedReader()){
    val (k, d, a) = readLine().split("/").map { it.toInt() }

    if(k+a < d || d == 0) println("hasu") else println("gosu")
}