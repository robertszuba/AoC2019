import Day3.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class Day3Test {

    private val puzzleSolver = Day3()

    @Test
    fun testPoint1() {
        assertThat(Point(0, 0).distancePromCenter()).isEqualTo(0)
    }

    @Test
    fun testPoint2() {
        assertThat(Point(3, 3).distancePromCenter()).isEqualTo(6)
    }

    @Test
    fun testPoint3() {
        assertThat(Point(-5, -5).distancePromCenter()).isEqualTo(10)
    }

    @Test
    fun testCommandParser1() {
        val nullablePair = puzzleSolver.splitDirectionCommand("R8")
        assertThat(nullablePair).isNotNull()
        assertThat(nullablePair?.first).isEqualTo('R')
        assertThat(nullablePair?.second).isEqualTo(8)
    }

    @Test
    fun testCommandParser2() {
        val nullablePair = puzzleSolver.splitDirectionCommand("U5")
        assertThat(nullablePair).isNotNull()
        assertThat(nullablePair?.first).isEqualTo('U')
        assertThat(nullablePair?.second).isEqualTo(5)
    }

    @Test
    fun testCommandParser3() {
        val nullablePair = puzzleSolver.splitDirectionCommand("L5")
        assertThat(nullablePair).isNotNull()
        assertThat(nullablePair?.first).isEqualTo('L')
        assertThat(nullablePair?.second).isEqualTo(5)
    }

    @Test
    fun testCommandParser4() {
        val nullablePair = puzzleSolver.splitDirectionCommand("D3")
        assertThat(nullablePair).isNotNull()
        assertThat(nullablePair?.first).isEqualTo('D')
        assertThat(nullablePair?.second).isEqualTo(3)
    }

    @Test
    fun testCommandParser5() {
        assertThat(puzzleSolver.splitDirectionCommand("Z8")).isNull()
        assertThat(puzzleSolver.splitDirectionCommand("")).isNull()
    }

    @Test
    fun testAddPointsRight1() {
        val points = puzzleSolver.addPointsRight(Point(0, 0), 3)
        assertThat(points).containsExactly(Point(1, 0), Point(2, 0), Point(3, 0))
    }

    @Test
    fun testAddPointsRight2() {
        val points = puzzleSolver.addPointsRight(Point(10, 55), 5)
        assertThat(points).containsExactly(Point(11, 55), Point(12, 55), Point(13, 55), Point(14, 55), Point(15, 55))
    }

    @Test
    fun testAddPointsLeft1() {
        val points = puzzleSolver.addPointsLeft(Point(0, 0), 3)
        assertThat(points).containsExactly(Point(-1, 0), Point(-2, 0), Point(-3, 0))
    }

    @Test
    fun testAddPointsLeft2() {
        val points = puzzleSolver.addPointsLeft(Point(10, 55), 5)
        assertThat(points).containsExactly(Point(9, 55), Point(8, 55), Point(7, 55), Point(6, 55), Point(5, 55))
    }

    @Test
    fun testAddPointsUp1() {
        val points = puzzleSolver.addPointsUp(Point(0, 0), 3)
        assertThat(points).containsExactly(Point(0, 1), Point(0, 2), Point(0, 3))
    }

    @Test
    fun testAddPointsUp2() {
        val points = puzzleSolver.addPointsUp(Point(-10, -55), 5)
        assertThat(points).containsExactly(Point(-10, -54), Point(-10, -53), Point(-10, -52), Point(-10, -51), Point(-10, -50))
    }

    @Test
    fun testAddPointsDown1() {
        val points = puzzleSolver.addPointsDown(Point(0, 0), 3)
        assertThat(points).containsExactly(Point(0, -1), Point(0, -2), Point(0, -3))
    }

    @Test
    fun testAddPointsDown2() {
        val points = puzzleSolver.addPointsDown(Point(-10, -55), 5)
        assertThat(points).containsExactly(Point(-10, -56), Point(-10, -57), Point(-10, -58), Point(-10, -59), Point(-10, -60))
    }

    @Test
    fun testSolve1a() {
        val input1 = arrayOf("R8", "U5", "L5", "D3")
        val input2 = arrayOf("U7", "R6", "D4", "L4")
        assertThat(puzzleSolver.solveA(input1, input2)).isEqualTo(6)
    }

    @Test
    fun testSolve2a() {
        val input1 = arrayOf("R75", "D30", "R83", "U83", "L12", "D49", "R71", "U7", "L72")
        val input2 = arrayOf("U62", "R66", "U55", "R34", "D71", "R55", "D58", "R83")
        assertThat(puzzleSolver.solveA(input1, input2)).isEqualTo(159)
    }

    @Test
    fun testSolve3a() {
        val input1 = arrayOf("R98", "U47", "R26", "D63", "R33", "U87", "L62", "D20", "R33", "U53", "R51")
        val input2 = arrayOf("U98", "R91", "D20", "R16", "D67", "R40", "U7", "R15", "U6", "R7")
        assertThat(puzzleSolver.solveA(input1, input2)).isEqualTo(135)
    }

    @Test
    fun testSolve1b() {
        val input1 = arrayOf("R8", "U5", "L5", "D3")
        val input2 = arrayOf("U7", "R6", "D4", "L4")
        assertThat(puzzleSolver.solveB(input1, input2)).isEqualTo(30)
    }

    @Test
    fun testSolve2b() {
        val input1 = arrayOf("R75", "D30", "R83", "U83", "L12", "D49", "R71", "U7", "L72")
        val input2 = arrayOf("U62", "R66", "U55", "R34", "D71", "R55", "D58", "R83")
        assertThat(puzzleSolver.solveB(input1, input2)).isEqualTo(610)
    }

    @Test
    fun testSolve3b() {
        val input1 = arrayOf("R98", "U47", "R26", "D63", "R33", "U87", "L62", "D20", "R33", "U53", "R51")
        val input2 = arrayOf("U98", "R91", "D20", "R16", "D67", "R40", "U7", "R15", "U6", "R7")
        assertThat(puzzleSolver.solveB(input1, input2)).isEqualTo(410)
    }
}