import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class Day6Test {

    private val puzzleSolver = Day6()

    private val testInput = """
        K)L
        COM)Z
        Z)C
        C)D
        D)E
        E)F
        Z)G
        G)H
        D)I
        E)J
        J)K
    """.trimIndent()

    private val testInput2 = """
        COM)B
        B)C
        C)D
        D)E
        E)F
        B)G
        G)H
        D)I
        E)J
        J)K
        K)L
        K)YOU
        I)SAN
    """.trimIndent()

    @Test
    fun testParseInput() {
        val list = puzzleSolver.parseInput(testInput)
        val expectedList = listOf(
            Pair("K", "L"),
            Pair("COM", "Z"),
            Pair("Z", "C"),
            Pair("C", "D"),
            Pair("D", "E"),
            Pair("E", "F"),
            Pair("Z", "G"),
            Pair("G", "H"),
            Pair("D", "I"),
            Pair("E", "J"),
            Pair("J", "K")
        )
        assertThat(list).isEqualTo(expectedList)
    }

    @Test
    fun testSolveA() {
        //Puzzle 6a 453028
        assertThat(puzzleSolver.solveA(testInput)).isEqualTo(42)
    }

    @Test
    fun testSolveB() {
        assertThat(puzzleSolver.solveB(testInput2)).isEqualTo(4)
    }
}