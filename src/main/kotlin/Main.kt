fun main() {
    countDifferentDigits()
}

fun countDifferentDigits() {
    print("Enter the number of rows: ")
    val rows = readLine()!!.toInt()

    print("Enter the number of columns: ")
    val columns = readLine()!!.toInt()

    val array = Array(rows) { IntArray(columns) }

    println("Enter the numbers:")
    for (i in 0 until rows) {
        for (j in 0 until columns) {
            array[i][j] = readLine()!!.toInt()
        }
    }

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

    println("Two-dimensional array:")
    for (row in array) {
        for (element in row) {
            print("$element ")
        }
        println()
    }

    println("Count different digits: ${digits.size}")
    println("Number of different digits:")
    for (digit in digits) {
        print("$digit ")
    }
}
