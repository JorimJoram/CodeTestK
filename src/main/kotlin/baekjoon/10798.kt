package baekjoon

fun main() = with(System.`in`.bufferedReader()){
    val senList = mutableListOf<String>()
    var maxLen = 0
    for(i in 0 until  5) {
        val sen = readLine()
        if (sen.length > maxLen) maxLen = sen.length
        senList.add(sen)
    }

    for(j in 0 until  maxLen){
        for(i in 0 until 5){
            if(senList[i].lastIndex < j) continue
            else print(senList[i][j])
        }
    }
}
//백준에서 ..< 연산은 안된다고 함 (1.8 JVM써서 그렇다고 함)