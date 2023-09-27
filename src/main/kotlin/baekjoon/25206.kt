package baekjoon

fun main() = with(System.`in`.bufferedReader()){
    var totalScore = 0.0
    var totalSubject = 0.0

    for(i in 0 until 20){
        val inputLine = readLine().split(" ")
        if(inputLine[2] == "P") continue
        totalScore += inputLine[1].toDouble() * gradeMap[inputLine[2]]!!
        totalSubject += inputLine[1].toDouble()
    }
    println(totalScore/totalSubject)
}

val gradeMap = mapOf(
    "A+" to 4.5,
    "A0" to 4.0,
    "B+" to 3.5,
    "B0" to 3.0,
    "C+" to 2.5,
    "C0" to 2.0,
    "D+" to 1.5,
    "D0" to 1.0,
    "F" to 0.0
 )