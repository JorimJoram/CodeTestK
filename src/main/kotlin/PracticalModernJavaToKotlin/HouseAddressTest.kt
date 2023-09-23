package PracticalModernJavaToKotlin

class HouseAddressTest: HouseAddress {
    override fun getPostCode(): String {
        return "tt"
    }

    override fun getAddress(): String {
        return "not"
    }

    override fun getDetailAddress(): String {
        return "test"
    }

    override fun getCountryCode(): String {
        return super.getCountryCode()
    }
}

fun main(){
    val house = HouseAddressTest()
    house.getCountryCode()
}