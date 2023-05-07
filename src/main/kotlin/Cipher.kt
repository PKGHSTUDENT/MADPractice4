class Cipher {
    var ALPHABET = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ"

    fun encrypt(str: String, shift: IntArray, key: Box<String>): String {

        var result = ""
        for (ch in str) {
            val index = ALPHABET.indexOf(ch.uppercase())
            val shiftedIndex = (index + shift[index]) % ALPHABET.length
3
            result += ALPHABET[shiftedIndex]
            key.value += shift[index].toString() + " "
        }
        key.value.trim()
        return result
    }

    fun decrypt(str: String, shift: IntArray, key: String): String {
        var result = ""
        var shiftKey = key.split(" ")
        var keyIndex = 0;
        for (ch in str) {
            var index = ALPHABET.indexOf(ch.uppercase())
            var shiftedIndex = index - shiftKey[keyIndex].toInt()
            if (shiftedIndex < 0)
                shiftedIndex += ALPHABET.length
            result += ALPHABET[shiftedIndex]
            keyIndex++
        }
        return result
    }
}