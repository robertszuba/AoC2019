import org.junit.Assert.assertEquals
import org.junit.Test

class Day1Test {

    private val puzzleSolver = Day1()

    // PUZZLE 1

    @Test
    fun test1a() {
        assertEquals(2, puzzleSolver.calculateRequiredFuel(12))
    }

    @Test
    fun test2a() {
        assertEquals(2, puzzleSolver.calculateRequiredFuel(14))
    }

    @Test
    fun test3a() {
        assertEquals(654, puzzleSolver.calculateRequiredFuel(1969))
    }

    @Test
    fun test4a() {
        assertEquals(33583, puzzleSolver.calculateRequiredFuel(100756))
    }

    @Test
    fun testSolvePuzzleA() {
        val input = arrayOf(12 , 14, 1969, 100756)
        val expectedOutput = 2 + 2 + 654 + 33583
        assertEquals(expectedOutput, puzzleSolver.solveA(input))
    }

    // PUZZLE 2

    @Test
    fun test1b() {
        assertEquals(2, puzzleSolver.calculateRequiredFuelAccurate(12))
    }

    @Test
    fun test2b() {
        assertEquals(966, puzzleSolver.calculateRequiredFuelAccurate(1969))
    }

    @Test
    fun test4b() {
        assertEquals(50346, puzzleSolver.calculateRequiredFuelAccurate(100756))
    }

    @Test
    fun testSolvePuzzleB() {
        val input = arrayOf(12 , 1969, 100756)
        val expectedOutput = 2 + 966 + 50346
        assertEquals(expectedOutput, puzzleSolver.solveB(input))
    }
}