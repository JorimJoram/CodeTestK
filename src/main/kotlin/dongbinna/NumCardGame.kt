package dongbinna

class NumCardGame {
}

fun main() = with(System.`in`.bufferedReader()){
    /*
    val (n, m) = readLine().split(" ").map { it -> it.toInt() }
    val mapList: MutableList<List<Int>> = mutableListOf()
    var max = 0

    for(i:Int in 1 .. n){
        mapList.add(readLine().split(" ").map { it -> it.toInt() })
    }

    for(item in mapList){
        val tmp = findMin(item)
        if(max < tmp){
            max = tmp
        }
    }

    println(max)
    */

    val(n, m) = readLine()!!.split(" ").map { it.toInt() }
    val mapList = List(n){
        readLine()!!.split(" ").map { it.toInt() }
    }

    val max = mapList.maxOfOrNull { it.minOrNull() ?: 0 } ?: 0
    //minOrNull -> 최소값을 찾음
    //maxOfOrNull -> 최대값을 찾음
    println(max)

}

//private fun findMin(item: List<Int>): Int{
//    val resultItem = item.sorted()
//    return resultItem[0]
//}