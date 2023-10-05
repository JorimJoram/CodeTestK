package dongbinna

fun main() = with(System.`in`.bufferedReader()){
    val graph = mutableListOf<List<Int>>(
        listOf(),
        listOf(2,3,8),
        listOf(1,7),
        listOf(1,4,5),
        listOf(3,5),
        listOf(3,4),
        listOf(7),
        listOf(2,6,8),
        listOf(1,7)
    )
    val visited = BooleanArray(9){false}
    dfs(graph, 1, visited)
}

fun dfs(graph:MutableList<List<Int>>, v:Int, visited: BooleanArray){
    visited[v] = true
    print("$v ")
    for(i in graph[v]){
        if(!visited[i])
            dfs(graph, i, visited)
    }
}