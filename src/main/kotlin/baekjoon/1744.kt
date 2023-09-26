package baekjoon

fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    val negList = mutableListOf<Int>()
    val posList = mutableListOf<Int>()
    val zeroList = mutableListOf<Int>()

    var result = 0
    for(i in 1 .. n){
        val num = readLine().toInt()
        when{
            num < 0 -> negList.add(num)
            num == 0 -> zeroList.add(num)
            else -> posList.add(num)
        }
    }

    posList.sortDescending()
    negList.sort()
    //사람의 머리로는 어떻게 할지 감이 잡힌 상황이라 최대한 구현만 해보셈 그러면 어지간하면 해결되리라 믿음
}