package baekjoon

import java.util.*

// X가 이겼는지 확인
fun checkX(map: Array<CharArray>): Boolean {
    for (i in 0 until 3) {
        // 가로 체크
        if (map[i][0] == 'X' && map[i][0] == map[i][1] && map[i][1] == map[i][2]) return true

        // 세로 체크
        if (map[0][i] == 'X' && map[0][i] == map[1][i] && map[1][i] == map[2][i]) return true
    }
    // 대각 체크
    if (map[0][0] == 'X' && map[0][0] == map[1][1] && map[1][1] == map[2][2]) return true

    if (map[0][2] == 'X' && map[0][2] == map[1][1] && map[1][1] == map[2][0]) return true

    return false
}

// O가 이겼는지 확인
fun checkO(map: Array<CharArray>): Boolean {
    for (i in 0 until 3) {
        if (map[i][0] == 'O' && map[i][0] == map[i][1] && map[i][1] == map[i][2]) return true

        if (map[0][i] == 'O' && map[0][i] == map[1][i] && map[1][i] == map[2][i]) return true
    }
    if (map[0][0] == 'O' && map[0][0] == map[1][1] && map[1][1] == map[2][2]) return true

    if (map[0][2] == 'O' && map[0][2] == map[1][1] && map[1][1] == map[2][0]) return true

    return false
}

fun main(){
    val scanner = Scanner(System.`in`)
    while (true) {
        val input = scanner.next()
        if (input == "end") break

        val map = Array(3) { CharArray(3) }
        var x = 0
        var o = 0
        for (i in 0..<9) {
            // 3x3 2차원 배열로 만들기
            map[i / 3][i % 3] = input[i]
            if (input[i] == 'X') x++
            else if (input[i] == 'O') o++
        }
        val isX = checkX(map)
        val isO = checkO(map)

        if (isX && !isO && x == o + 1) println("valid") // X가 이긴 경우
        else if (!isX && isO && x == o) println("valid") // O가 이긴 경우
        else if (!isX && !isO && x == 5 && o == 4) println("valid") // 가득 찬 경우
        else println("invalid") // 위 경우에 다 포함 안될때
    }
}
