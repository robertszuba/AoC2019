
private const val ZERO_ASCII = '0'.toInt()

class Day4() {

    fun solveA(rangeStart: Int, rangeEnd: Int): Int {
        return generateCodesInRange(rangeStart, rangeEnd)
            .filter { validateDigits(it) }
            .count()
    }

    fun solveB(rangeStart: Int, rangeEnd: Int): Int {
        return generateCodesInRange(rangeStart, rangeEnd)
            .filter { validateDigitsAdvanced(it) }
            .count()
    }

    fun generateCodesInRange(rangeStart: Int, rangeEnd: Int): IntArray {
        return IntArray(rangeEnd-rangeStart+1) { it.plus(rangeStart) }
    }

    fun validateDigits(number: Int): Boolean {
        val charArray = number.toString().toCharArray()
        var adjacentDigitsFound = false
        for (i in 0 until (charArray.size-1)) {
            val firstDigit = charDigitToInt(charArray[i])
            val secondDigit = charDigitToInt(charArray[i+1])
            if (firstDigit > secondDigit) {
                return false
            }
            if (firstDigit == secondDigit) {
                adjacentDigitsFound = true
            }
        }
        return adjacentDigitsFound
    }

    fun validateDigitsAdvanced(number: Int): Boolean {
        val charArray = number.toString().toCharArray()
        val digitsCounts = IntArray(10)
        for (i in 0 until (charArray.size-1)) {
            val firstDigit = charDigitToInt(charArray[i])
            val secondDigit = charDigitToInt(charArray[i+1])
            if (firstDigit > secondDigit) {
                return false
            }
            if (i==0) {
                digitsCounts[firstDigit]++
            }
            digitsCounts[secondDigit]++
        }
        return digitsCounts.any { it == 2 }
    }

    private fun charDigitToInt(char: Char) = char.toInt() - ZERO_ASCII
}