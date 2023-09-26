package baekjoon

fun main() = with(System.`in`.bufferedReader()){
    var line: String
    while (true){
        line = readLine()
        if(line == "end"){
            break
        }

        if(isBingo(line) == "O"){
            if(isFull(line)){
                println("invalid")
            }else{
                println("valid")
            }
        }else if (isBingo(line) == "X"){
            if(isCount(line)){
                println("valid")
            }else{
                println("invalid")
            }
        }else{
            if(isFull(line)){
                println("valid")
            }else{
                println("invalid")
            }
        }
    }
}

private fun isFull(line: String): Boolean{
    val xCnt = line.count(){it=='X'}
    val oCnt = line.count(){it=='O'}
    return (xCnt + oCnt == 9) && (xCnt > oCnt)
}
private fun isCount(line:String): Boolean{
    val xCnt = line.count(){it=='X'}
    val oCnt = line.count(){it=='O'}

    return (xCnt == oCnt) || (xCnt - oCnt == 1)
}
private fun isBingo(line: String): String{
    val isSameCnt = line.count(){it=='X'} == line.count(){it=='O'}
    val tocMap = line.chunked(3)
    var result:String = isVertical(tocMap, isSameCnt)
    result = isHorizon(tocMap, isSameCnt)
    result = isCross(tocMap, isSameCnt)
    return result
}

private fun isCross(tocMap: List<String>, isSame:Boolean): String{
    var result:String = ""
    when{
        ((tocMap[0][0] == 'X' && tocMap[1][1] == 'X' && tocMap[2][2] == 'X') || (tocMap[1][1] == 'X' && tocMap[0][2] == 'X' && tocMap[2][0] == 'X')) -> result = "X"
        ((tocMap[0][0] == 'O' && tocMap[1][1] == 'O' && tocMap[2][2] == 'O') || (tocMap[1][1] == 'X' && tocMap[0][2] == 'O' && tocMap[2][0] == 'O')) && isSame -> result = "O"
    }
    return result
}
private fun isVertical(tocMap:List<String>, isSame: Boolean): String{
    var result = ""
    for(i in 0 .. 2){
        when{
            (tocMap[0][i] == 'X' && tocMap[1][i] == 'X' && tocMap[2][i] == 'X') -> result = "X"
            ((tocMap[0][i] == 'O' && tocMap[1][i] == 'O' && tocMap[2][i] == 'O')) && isSame -> result = "O"

        }
    }
    return result
}
private fun isHorizon(tocMap:List<String>, isSame: Boolean): String{
    var result = ""
    for(i in 0 .. 2){
        when{
            (tocMap[i][0] == 'X' && tocMap[i][1] == 'X' && tocMap[i][2] == 'X') -> result = "X"
            ((tocMap[i][0] == 'O' && tocMap[i][1] == 'O' && tocMap[i][2] == 'O')) && isSame -> result = "O"
        }
    }
    return result
}