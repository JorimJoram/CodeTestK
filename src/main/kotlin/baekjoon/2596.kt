package baekjoon

import java.lang.StringBuilder
import kotlin.system.exitProcess

fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    val sentence = readLine()
    val charMap = mapOf(
        "000000" to 'A',
        "001111" to 'B',
        "010011" to 'C',
        "011100" to 'D',
        "100110" to 'E',
        "101001" to 'G',
        "111010" to 'H'
    )
    val result = mutableListOf<String>()

    for(chunk in sentence.chunked(6)){
        val code = testCode(charMap, chunk)
        if(code == null){
            val chunkIndex = sentence.indexOf(chunk) / 6 + 1
            println(chunkIndex)
            exitProcess(0)
        }else{
            result.add(code.toString())
        }
    }

    println(result.joinToString(""))
}

fun testCode(codeMap: Map<String, Char>, chunk:String): Char? {
    if(codeMap.containsKey(chunk)) return codeMap[chunk]

    for(idx in chunk.indices){
        val tmpCode = StringBuilder(chunk)
        tmpCode[idx] = if(tmpCode[idx] == '0') '1' else '0'
        val modifiedChunk = tmpCode.toString()
        if(codeMap.containsKey(modifiedChunk)) return codeMap[modifiedChunk]
    }

    return null
}

