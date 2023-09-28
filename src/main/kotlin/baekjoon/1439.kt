package baekjoon

fun main() = with(System.`in`.bufferedReader()){
    val s = readLine()
    var oneChange = 0
    var zeroChange = 0
    var prevLetter = ' '

    for((idx, letter) in s.withIndex()){
        if(idx > 0){
            prevLetter = s[idx-1]
        }else if(idx == 0){
            when(letter){
                '1' -> oneChange++
                '0' -> zeroChange++
            }
        }
        if(prevLetter == '0' && letter == '1'){
            oneChange ++
        }else if(prevLetter == '1' && letter == '0'){
            zeroChange ++
        }
    }
    when{
        zeroChange > oneChange -> println(oneChange)
        zeroChange < oneChange -> println(zeroChange)
        else -> println(oneChange)
    }
}