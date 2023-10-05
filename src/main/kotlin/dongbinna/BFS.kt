package dongbinna

import java.util.Deque
import java.util.LinkedList

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
    bfs(graph, 1, visited)
}

fun bfs(graph:MutableList<List<Int>>, start:Int, visited:BooleanArray){
    val queue = LinkedList<Int>()
    queue.add(start)
    visited[start] = true
    while(!queue.isEmpty()){
        val v = queue.pop()
        print("$v ")
        for(i in graph[v]){
            if(!visited[i]){
                queue.add(i)
                visited[i] = true
            }
        }
    }
}