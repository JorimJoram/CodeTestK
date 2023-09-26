package baekjoon

fun main() = with(System.`in`.bufferedReader()){
    var (n, k) = readLine().split(" ").map { it.toInt() }
    var totalCoin = 0
    val coinList = mutableListOf<Int>()

    for(i:Int in 1 .. n){
        coinList.add(readLine().toInt())
    }
    coinList.sortDescending()

    for(coin in coinList){
        if(k == 0){
            break
        }
        if(k / coin > 0){
            totalCoin += k/coin
            k %= coin
        }
    }
    println(totalCoin)
}