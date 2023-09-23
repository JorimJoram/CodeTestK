package PracticalModernJavaToKotlin

interface CompanyEncryption {
    fun encrypt(byte: Byte): Byte
    fun decrypt(byte: Byte): Byte
    fun isEncoded(byte: Byte): Boolean
}