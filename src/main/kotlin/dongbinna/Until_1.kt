package dongbinna

class Until_1 {
}

fun main() = with(System.`in`.bufferedReader()){
    var cnt = 0
    var (n, k) = readLine().split(" ").map { it.toInt() }

    while(n > 1){
        when{
            n % k == 0 -> n /= k
            else -> n -= 1
        }
        cnt ++
    }
    println(cnt)
}