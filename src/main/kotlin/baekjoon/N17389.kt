package baekjoon

fun main() = with(System.`in`.bufferedReader()){
    val n = readLine()!!.toInt()
    val answerList = readLine()?.take(n) ?: "" //take -> 입력받는 문자열의 길이 제한

    var totalScore = 0
    var bonus = 0

    for((i, answer) in answerList.withIndex()){
        when(answer){
            'O' -> {
                totalScore += (i + 1) + bonus
                bonus++
            }
            else -> { bonus = 0 }
        }
    }

    println(totalScore)
}