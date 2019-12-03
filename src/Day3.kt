import kotlin.math.abs

class Day3 {

    private val properDirections = listOf('R', 'L', 'U', 'D')

    fun solveA(input1: Array<String>, input2: Array<String>): Int {
        return markPoints(input1).intersect(markPoints(input2)).map { it.distancePromCenter() }.min() ?: 0
    }

    fun solveB(input1: Array<String>, input2: Array<String>): Int {
        val points1 = markPoints(input1)
        val points2 = markPoints(input2)
        return points1.intersect(points2)
            .map {
                val distance1 = points1.indexOf(it)
                val distance2 = points2.indexOf(it)
                distance1.plus(distance2).plus(2)
            }.min() ?: 0
    }

    private fun markPoints(input: Array<String>): List<Point> {
        var currentPoint = Point(0, 0)
        val commands = input.mapNotNull { splitDirectionCommand(it) }
        val points = mutableListOf<Point>()
        commands.forEach {
            when (it.first) {
                'R' -> points.addAll(addPointsRight(currentPoint, it.second))
                'L' -> points.addAll(addPointsLeft(currentPoint, it.second))
                'U' -> points.addAll(addPointsUp(currentPoint, it.second))
                else -> points.addAll(addPointsDown(currentPoint, it.second))
            }
            currentPoint = points.last()
        }
        return points.toList()
    }

    fun splitDirectionCommand(command: String): Pair<Char, Int>? {
        if (command.length > 1) {
            val direction = command[0]
            val distance = command.substring(1).toIntOrNull()
            if (properDirections.contains(direction) && distance != null) {
                return Pair(direction, distance)
            }
        }
        return null
    }

    fun addPointsRight(startingPoint: Point, distance: Int): List<Point> {
        val list = mutableListOf<Point>()
        for (step in 1 .. distance) {
            list.add(Point(y = startingPoint.y, x = startingPoint.x + step))
        }
        return list.toList()
    }

    fun addPointsLeft(startingPoint: Point, distance: Int): List<Point> {
        val list = mutableListOf<Point>()
        for (step in 1 .. distance) {
            list.add(Point(y = startingPoint.y, x = startingPoint.x - step))
        }
        return list.toList()
    }

    fun addPointsUp(startingPoint: Point, distance: Int): List<Point> {
        val list = mutableListOf<Point>()
        for (step in 1 .. distance) {
            list.add(Point(y = startingPoint.y + step, x = startingPoint.x))
        }
        return list.toList()
    }

    fun addPointsDown(startingPoint: Point, distance: Int): List<Point> {
        val list = mutableListOf<Point>()
        for (step in 1 .. distance) {
            list.add(Point(y = startingPoint.y - step, x = startingPoint.x))
        }
        return list.toList()
    }

    data class Point(val x: Int, val y: Int) {

        fun distancePromCenter() = abs(x).plus(abs(y))
    }
}