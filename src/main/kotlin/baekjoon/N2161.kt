package baekjoon


fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    val numList = (1..n).toMutableList()
    val resultList = mutableListOf<Int>()
    var removeItem: Int


    for (i in numList.indices){
        resultList.add(numList.removeAt(0))

        if(numList.lastIndex > 0){
            removeItem = numList.removeAt(0)
            numList.add(removeItem)
        }
    }

    resultList.forEach{
        print("$it ")
    }
}