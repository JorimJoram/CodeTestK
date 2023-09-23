package PracticalModernJavaToKotlin

class VehicleImpl:Vehicle, Ben() {
    override val SPEED_LIMIT: Int = 200

    override fun getSpeedLimit(): Int {
        return SPEED_LIMIT
    }

    override fun makeBen(){
        println("Ben")
        super.makeBen()
    }
}

fun main(){
    val vehicleImpl = VehicleImpl()
    vehicleImpl.makeBen()
    print(vehicleImpl.getSpeedLimit())
}