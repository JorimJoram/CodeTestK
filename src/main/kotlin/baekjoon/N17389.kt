package baekjoon

fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    val answerList = readLine()

    var totalScore = 0
    var bonus = 0

    for(i in answerList.indices){
        when{
            answerList[i] == 'O' -> {
                totalScore += (i + 1)
                totalScore += bonus
                bonus+=1
            }
            else -> {
                bonus = 0
            }
        }
    }

    println(totalScore)
}