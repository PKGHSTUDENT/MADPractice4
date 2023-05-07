fun main() {
    println("@dobrodelete")

    print("Enter number of task: ")
    val input = readln().toInt()

    when (input) {
        1 -> {
            print("Enter the number of rows: ")
            val rows = readln().toInt()

            print("Enter the number of columns: ")
            val columns = readln().toInt()

            val array: Array<IntArray> = Array(rows) { IntArray(columns) }

            println("Enter the numbers:")
            for (i in 0 until rows) {
                for (j in 0 until columns) {
                    array[i][j] = readln().toInt()
                }
            }
            println("The array used ${countDifferentDigits(array, rows, columns)} different digits.");
        }
        2 -> {
            /*val array = arrayOf(
                intArrayOf(5, 9, 6, 7, 2),
                intArrayOf(9, 8, 4, 5, 3),
                intArrayOf(6, 4, 3, 8, 7),
                intArrayOf(7, 5, 8, 4, 8),
                intArrayOf(2, 3, 7, 8, 1)
            )*/

            print("Enter the number of rows & columns: ")
            val rows = readln().toInt()

            val array: Array<IntArray> = Array(rows) {IntArray(rows)}

            println("Enter the numbers:")
            for (i in 0 until rows) {
                println("Enter $i row numbers separated by a spase:")
                val n = readln().split(" ")
                for (j in 0 until rows) {
                    array[i][j] = n[j].toInt()
                }
            }

            val isSymmetrical = isSymmetrical(array)
            if (isSymmetrical) {
                println("The array is symmetrical about the main diagonal.")
            } else {
                println("The array is not symmetrical about the main diagonal.")
            }

        }
        3 -> {
            val alphabet = "АБВГДЕЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ"
            val shiftArray = intArrayOf(1, 2, 20, 21, 5, 22, 23, 24, 8, 9, 10, 11, 32, 16, 17, 18, 19, 9, 30, 31, 12, 13, 14, 25, 26, 6, 7, 27, 28, 23, 4, 15, 33)

            println("Program use RU alphabet. Alphabet: $alphabet")
            print("Program use custom shift array. Shift array: ")
            shiftArray.forEach { print("$it ") }
            print("\nEnter your text: ")

            val plaintext = readln().toString()
            val cipher: Cipher = Cipher()
            val key = Box<String>("")
            val enc = cipher.encrypt(plaintext, shiftArray, key)

            println("Key: $key")
            println("Plaintext: $plaintext")
            println("Ciphertext: $enc")
            println("Decrypted text: ${cipher.decrypt(enc, shiftArray, key.toString())}")
        }
    }
}

fun countDifferentDigits(array: Array<IntArray>, rows: Int, columns: Int): Int {
    if (array.isEmpty() || rows == 0 || columns == 0) return 0

    if (array[0].size != columns) throw IllegalArgumentException("The actual number of columns does not match the number of columns passed")
    if (array.size != rows) throw IllegalArgumentException("The actual number of rows does not match the number of rows passed")

    val digits = HashSet<Int>()
    for (i in 0 until rows) {
        for (j in 0 until columns) {
            var number = array[i][j]
            while (number > 0) {
                digits.add(number % 10)
                number /= 10
            }
        }
    }
    return digits.size;
}

fun isSymmetrical(array: Array<IntArray>): Boolean {
    if (array.isEmpty()) return false
//    if (array.)
    for (i in array.indices) {
        for (j in i + 1 until array[0].size) {
            if (array[i][j] != array[j][i]) {
                return false
            }
        }
    }
    return true
}