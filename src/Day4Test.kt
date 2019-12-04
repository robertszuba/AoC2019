import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class Day4Test {

    private val puzzleSolver = Day4()

    @Test
    fun testGenerateCodes1() {
        val codesInRange = puzzleSolver.generateCodesInRange(0, 5)
        assertThat(codesInRange).containsExactly(0, 1, 2, 3, 4, 5)
    }

    @Test
    fun testGenerateCodes2() {
        val codesInRange = puzzleSolver.generateCodesInRange(10, 20)
        assertThat(codesInRange).containsExactly(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
    }

    @Test
    fun testValidateDigits1() {
        assertThat(puzzleSolver.validateDigits(123456)).isFalse()
    }

    @Test
    fun testValidateDigits2() {
        assertThat(puzzleSolver.validateDigits(123123)).isFalse()
    }

    @Test
    fun testValidateDigits3() {
        assertThat(puzzleSolver.validateDigits(111123)).isTrue()
    }

    @Test
    fun testValidateDigits4() {
        assertThat(puzzleSolver.validateDigits(111111)).isTrue()
    }

    @Test
    fun testValidateDigits5() {
        assertThat(puzzleSolver.validateDigits(223450)).isFalse()
    }

    @Test
    fun testValidateDigits6() {
        assertThat(puzzleSolver.validateDigits(123789)).isFalse()
    }

    // advanced validation

    @Test
    fun testValidateDigitsAdvanced1() {
        assertThat(puzzleSolver.validateDigitsAdvanced(123789)).isFalse()
    }

    @Test
    fun testValidateDigitsAdvanced2() {
        assertThat(puzzleSolver.validateDigitsAdvanced(112233)).isTrue()
    }

    @Test
    fun testValidateDigitsAdvanced3() {
        assertThat(puzzleSolver.validateDigitsAdvanced(123444)).isFalse()
    }

    @Test
    fun testValidateDigitsAdvanced4() {
        assertThat(puzzleSolver.validateDigitsAdvanced(111122)).isTrue()
    }
}