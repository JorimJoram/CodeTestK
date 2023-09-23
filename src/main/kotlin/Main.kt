class Test{
    companion object {
        var t = 1234
        fun tester(): Int {
            return t + 30;
        }
    }
}

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    var a = 10
    println("Test: ${addTo10(a)}")
    println("testClass : ${Test.tester()}")
    println("Tester : ${Test.t}")
}

fun addTo10(num: Int) : Int{
    return num + 10;
}