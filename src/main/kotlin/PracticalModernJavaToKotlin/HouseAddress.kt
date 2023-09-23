package PracticalModernJavaToKotlin

interface HouseAddress {
    fun getPostCode():String
    fun getAddress():String
    fun getDetailAddress():String
    fun getCountryCode():String {
        println("Test")
        return "test"
    }

}