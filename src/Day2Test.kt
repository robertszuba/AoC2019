import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class Day2Test {

    private val puzzleSolver = Day2()

    // PUZZLE 1

    @Test
    fun testSolve1a() {
        val input = intArrayOf(1, 0, 0, 0, 99)
        val expectedOutput = intArrayOf(2, 0, 0, 0, 99)

        assertThat(puzzleSolver.runProgram(input)).containsExactly(*expectedOutput)
    }

    @Test
    fun testSolve2a() {
        val input = intArrayOf(2, 3, 0, 3, 99)
        val expectedOutput = intArrayOf(2, 3, 0, 6, 99)

        assertThat(puzzleSolver.runProgram(input)).containsExactly(*expectedOutput)
    }

    @Test
    fun testSolve3a() {
        val input = intArrayOf(2, 4, 4, 5, 99, 0)
        val expectedOutput = intArrayOf(2, 4, 4, 5, 99, 9801)

        assertThat(puzzleSolver.runProgram(input)).containsExactly(*expectedOutput)
    }

    @Test
    fun testSolve4a() {
        val input = intArrayOf(1, 1, 1, 4, 99, 5, 6, 0, 99)
        val expectedOutput = intArrayOf(30, 1, 1, 4, 2, 5, 6, 0, 99)

        assertThat(puzzleSolver.runProgram(input)).containsExactly(*expectedOutput)
    }
}