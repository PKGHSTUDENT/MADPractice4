import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class CipherTest {

    @Test
    fun encryptTest() {
        val shiftArray = intArrayOf(1, 2, 20, 21, 5, 22, 23, 24, 8, 9, 10, 11, 32, 16, 17, 18, 19, 9, 30, 31, 12, 13, 14, 25, 26, 6, 7, 27, 28, 23, 4, 15, 33)
        val plaintext = "ПОЛЕ"
        val cipher: Cipher = Cipher()
        val key = Box<String>("")
        val enc = cipher.encrypt(plaintext, shiftArray, key)
        val expected = "ВАКЪ"
//        println("Key: $key")
//        println("Plaintext: $plaintext")
//        println("Ciphertext: $enc")
//        println("Decrypted text: ${cipher.decrypt(enc, shiftArray, key.toString())}")
        assertEquals(expected, cipher.encrypt(plaintext, shiftArray, key))
    }

    @Test
    fun decryptTest() {
        val plaintext = "ВАКЪ"
        val shiftArray = intArrayOf(1, 2, 20, 21, 5, 22, 23, 24, 8, 9, 10, 11, 32, 16, 17, 18, 19, 9, 30, 31, 12, 13, 14, 25, 26, 6, 7, 27, 28, 23, 4, 15, 33)
        val key = "19 18 32 22"
        val expected = "ПОЛЕ"
        val cipher: Cipher = Cipher()
        assertEquals(expected, cipher.decrypt(plaintext, shiftArray, key))

    }
}