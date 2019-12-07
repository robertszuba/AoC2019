import junitparams.JUnitParamsRunner
import junitparams.Parameters
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import java.lang.StringBuilder

@RunWith(JUnitParamsRunner::class)
class Day5Test {

    private val puzzleSolver = Day5()

    fun getInputCommands(): Array<Array<Int>> {
        return arrayOf(
            arrayOf(1, 1, 0, 0, 0), arrayOf(101, 1, 1, 0, 0), arrayOf(1101, 1, 1, 1, 0), arrayOf(10101, 1, 1, 0, 1),
            arrayOf(2, 2, 0, 0, 0), arrayOf(102, 2, 1, 0, 0), arrayOf(1002, 2, 0, 1, 0), arrayOf(11002, 2, 0, 1, 1),
            arrayOf(3, 3, 0, 0, 0), arrayOf(103, 3, 1, 0, 0), arrayOf(1103, 3, 1, 1, 0), arrayOf(10103, 3, 1, 0, 1),
            arrayOf(4, 4, 0, 0, 0), arrayOf(104, 4, 1, 0, 0), arrayOf(1004, 4, 0, 1, 0), arrayOf(11004, 4, 0, 1, 1),
            arrayOf(99, 99, 0, 0, 0)
        )
    }

    @Test
    @Parameters(method = "getInputCommands")
    fun testGetOpcode(input: Int, outputCommand: Int, firstParamMode: Int, secondParamMode: Int, thirdParamMode: Int) {
        assertThat(puzzleSolver.getOpcode(input)).isEqualTo(outputCommand)
    }

    @Test
    @Parameters(method = "getInputCommands")
    fun testGetFirstParamMode(input: Int, outputCommand: Int, firstParamMode: Int, secondParamMode: Int, thirdParamMode: Int) {
        assertThat(puzzleSolver.getFirstParamMode(input)).isEqualTo(firstParamMode)
    }

    @Test
    @Parameters(method = "getInputCommands")
    fun testGetSecondParamMode(input: Int, outputCommand: Int, firstParamMode: Int, secondParamMode: Int, thirdParamMode: Int) {
        assertThat(puzzleSolver.getSecondParamMode(input)).isEqualTo(secondParamMode)
    }

    @Test
    @Parameters(method = "getInputCommands")
    fun testGetThirdParamMode(input: Int, outputCommand: Int, firstParamMode: Int, secondParamMode: Int, thirdParamMode: Int) {
        assertThat(puzzleSolver.getThirdParamMode(input)).isEqualTo(thirdParamMode)
    }

    // PUZZLE 1

    @Test
    fun testSolve1a() {
        val input = intArrayOf(1, 0, 0, 0, 99)
        val expectedOutput = intArrayOf(2, 0, 0, 0, 99)

        assertThat(puzzleSolver.runProgram(input, 1, StringBuilder())).containsExactly(*expectedOutput)
    }

    @Test
    fun testSolve2a() {
        val input = intArrayOf(2, 3, 0, 3, 99)
        val expectedOutput = intArrayOf(2, 3, 0, 6, 99)

        assertThat(puzzleSolver.runProgram(input, 1, StringBuilder())).containsExactly(*expectedOutput)
    }

    @Test
    fun testSolve3a() {
        val input = intArrayOf(2, 4, 4, 5, 99, 0)
        val expectedOutput = intArrayOf(2, 4, 4, 5, 99, 9801)

        assertThat(puzzleSolver.runProgram(input, 1, StringBuilder())).containsExactly(*expectedOutput)
    }

    @Test
    fun testSolve4a() {
        val input = intArrayOf(1, 1, 1, 4, 99, 5, 6, 0, 99)
        val expectedOutput = intArrayOf(30, 1, 1, 4, 2, 5, 6, 0, 99)

        assertThat(puzzleSolver.runProgram(input, 1, StringBuilder())).containsExactly(*expectedOutput)
    }

    @Test
    fun testSolve5a() {
        val input = intArrayOf(1002, 4, 3, 4, 33)
        val expectedOutput = intArrayOf(1002, 4, 3, 4, 99)

        assertThat(puzzleSolver.runProgram(input, 1, StringBuilder())).containsExactly(*expectedOutput)
    }

    @Test
    fun testSolve6a() {
        val input = intArrayOf(1101, 100, -1, 4, 0)
        val expectedOutput = intArrayOf(1101, 100, -1, 4, 99)

        assertThat(puzzleSolver.runProgram(input, 1, StringBuilder())).containsExactly(*expectedOutput)
    }

    // PUZZLE B

    @Test
    fun testSolve1b() {
        val input = intArrayOf(3, 9, 8, 9, 10, 9, 4, 9, 99, -1, 8)
        val expectedOutput = intArrayOf(3, 9, 8, 9, 10, 9, 4, 9, 99, 0, 8)
        val sb = StringBuilder()
        assertThat(puzzleSolver.runProgram(input, 1, sb)).containsExactly(*expectedOutput)
        assertThat(sb.toString()).isEqualTo("0")
    }

    @Test
    fun testSolve2b() {
        val input = intArrayOf(3, 9, 8, 9, 10, 9, 4, 9, 99, -1, 8)
        val expectedOutput = intArrayOf(3, 9, 8, 9, 10, 9, 4, 9, 99, 1, 8)
        val sb = StringBuilder()
        assertThat(puzzleSolver.runProgram(input, 8, sb)).containsExactly(*expectedOutput)
        assertThat(sb.toString()).isEqualTo("1")
    }

    @Test
    fun testSolve3b() {
        val input = intArrayOf(3, 9, 7, 9, 10, 9, 4, 9, 99, -1, 8)
        val expectedOutput = intArrayOf(3, 9, 7, 9, 10, 9, 4, 9, 99, 1, 8)
        val sb = StringBuilder()
        assertThat(puzzleSolver.runProgram(input, 7, sb)).containsExactly(*expectedOutput)
        assertThat(sb.toString()).isEqualTo("1")
    }

    @Test
    fun testSolve4b() {
        val input = intArrayOf(3, 9, 7, 9, 10, 9, 4, 9, 99, -1, 8)
        val expectedOutput = intArrayOf(3, 9, 7, 9, 10, 9, 4, 9, 99, 0, 8)
        val sb = StringBuilder()
        assertThat(puzzleSolver.runProgram(input, 8, sb)).containsExactly(*expectedOutput)
        assertThat(sb.toString()).isEqualTo("0")
    }

    @Test
    fun testSolve5b() {
        val input = intArrayOf(3, 3, 1108, -1, 8, 3, 4, 3, 99)
        val expectedOutput = intArrayOf(3, 3, 1108, 0, 8, 3, 4, 3, 99)
        val sb = StringBuilder()
        assertThat(puzzleSolver.runProgram(input, 7, sb)).containsExactly(*expectedOutput)
        assertThat(sb.toString()).isEqualTo("0")
    }

    @Test
    fun testSolve6b() {
        val input = intArrayOf(3, 3, 1108, -1, 8, 3, 4, 3, 99)
        val expectedOutput = intArrayOf(3, 3, 1108, 1, 8, 3, 4, 3, 99)
        val sb = StringBuilder()
        assertThat(puzzleSolver.runProgram(input, 8, sb)).containsExactly(*expectedOutput)
        assertThat(sb.toString()).isEqualTo("1")
    }

    @Test
    fun testSolve7b() {
        val input = intArrayOf(3, 3, 1107, -1, 8, 3, 4, 3, 99)
        val expectedOutput = intArrayOf(3, 3, 1107, 1, 8, 3, 4, 3, 99)
        val sb = StringBuilder()
        assertThat(puzzleSolver.runProgram(input, 7, sb)).containsExactly(*expectedOutput)
        assertThat(sb.toString()).isEqualTo("1")
    }

    @Test
    fun testSolve8b() {
        val input = intArrayOf(3, 3, 1107, -1, 8, 3, 4, 3, 99)
        val expectedOutput = intArrayOf(3, 3, 1107, 0, 8, 3, 4, 3, 99)
        val sb = StringBuilder()
        assertThat(puzzleSolver.runProgram(input, 8, sb)).containsExactly(*expectedOutput)
        assertThat(sb.toString()).isEqualTo("0")
    }

    @Test
    fun testSolve9b() {
        val input = intArrayOf(3, 12, 6, 12, 15, 1, 13, 14, 13, 4, 13, 99, -1, 0, 1, 9)
        val expectedOutput = intArrayOf(3, 12, 6, 12, 15, 1, 13, 14, 13, 4, 13, 99, 0, 0, 1, 9)
        val sb = StringBuilder()
        assertThat(puzzleSolver.runProgram(input, 0, sb)).containsExactly(*expectedOutput)
        assertThat(sb.toString()).isEqualTo("0")
    }

    @Test
    fun testSolve10b() {
        val input = intArrayOf(3, 12, 6, 12, 15, 1, 13, 14, 13, 4, 13, 99, -1, 0, 1, 9)
        val expectedOutput = intArrayOf(3, 12, 6, 12, 15, 1, 13, 14, 13, 4, 13, 99, 12, 1, 1, 9)
        val sb = StringBuilder()
        assertThat(puzzleSolver.runProgram(input, 12, sb)).containsExactly(*expectedOutput)
        assertThat(sb.toString()).isEqualTo("1")
    }

    @Test
    fun testSolve11b() {
        val input = intArrayOf(3, 3, 1105, -1, 9, 1101, 0, 0, 12, 4, 12, 99, 1)
        val expectedOutput = intArrayOf(3, 3, 1105, 0, 9, 1101, 0, 0, 12, 4, 12, 99, 0)
        val sb = StringBuilder()
        assertThat(puzzleSolver.runProgram(input, 0, sb)).containsExactly(*expectedOutput)
        assertThat(sb.toString()).isEqualTo("0")
    }

    @Test
    fun testSolve12b() {
        val input = intArrayOf(3, 3, 1105, -1, 9, 1101, 0, 0, 12, 4, 12, 99, 1)
        val expectedOutput = intArrayOf(3, 3, 1105, 7, 9, 1101, 0, 0, 12, 4, 12, 99, 1)
        val sb = StringBuilder()
        assertThat(puzzleSolver.runProgram(input, 7, sb)).containsExactly(*expectedOutput)
        assertThat(sb.toString()).isEqualTo("1")
    }
}