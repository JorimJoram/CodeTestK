package baekjoon

fun main() = with(System.`in`.bufferedReader()){
    val (w,h,n,m) = readLine().split(" ").map { it.toInt() }
    var cnt = 1
    var start_w = 0
    var start_h = 0

    while(true){
        while(true){
            start_h += (m+1)
            if(start_h >= h) break
            cnt ++
        }
        start_w += (n+1)
        if(start_w >= w) break
        cnt ++
        start_h = 0
    }

    println(cnt)

}