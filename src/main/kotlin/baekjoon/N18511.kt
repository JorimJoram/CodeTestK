package baekjoon

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

private var num: IntArray? = null
private var N = 0
private var K = 0
private var ans = 0

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine(), " ")
    N = st.nextToken().toInt()
    K = st.nextToken().toInt()
    val st2 = StringTokenizer(br.readLine(), " ")
    num = IntArray(K)
    for (i in 0 until K) {
        num!![i] = st2.nextToken().toInt()
    }
    num!!.sort()
    dfs(0)
    println(ans)
}

private fun dfs(now: Int) {
    if (now > N) return

    if (ans < now) ans = now

    for (i in K - 1 downTo 0) {
        dfs(now * 10 + num!![i])
    }
}