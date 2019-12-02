import kotlin.math.floor

class Day1 {

    fun solveA(input: Array<Int>) : Int {
        return input.map { calculateRequiredFuel(it) }.sum()
    }

    fun solveB(input: Array<Int>) : Int {
        return input.map { calculateRequiredFuelAccurate(it) }.sum()
    }

    fun calculateRequiredFuel(mass: Int) : Int {
        return floor(mass.div(3.0)).toInt().minus(2)
    }

    fun calculateRequiredFuelAccurate(mass: Int) : Int {
        val totalFuel = calculateRequiredFuel(mass)
        if (totalFuel > 0) {
            return totalFuel.plus(calculateRequiredFuelAccurate(totalFuel))
        }
        return 0
    }
}