import kotlin.math.floor

class Day6 {

    fun solveA(inputMap: String): Int {
        val starMap = createMap(parseInput(inputMap))
        val root = Planet("COM", 0)
        return calculateOrbitsRecursive(root, starMap)
    }

    fun solveB(inputMap: String): Int {
        val starMap = createMap(parseInput(inputMap))
        val listOne = findAllParents("YOU", starMap)
        val listTwo = findAllParents("SAN", starMap)
        val commonParent = listOne.intersect(listTwo).firstOrNull()
        if (commonParent != null) {
            return listOne.indexOf(commonParent) + listTwo.indexOf(commonParent)
        }
        return 0
    }

    fun parseInput(inputMap: String): List<Pair<String, String>> {
        return inputMap.split('\n')
            .map { Pair(it.substringBefore(')'), it.substringAfter(')')) }
    }

    private fun createMap(input: List<Pair<String, String>>): Map<String, String> {
        return input.associateBy({ it.second }, { it.first })
            .toMap()
    }

    private fun calculateOrbitsRecursive(root: Planet, starMap: Map<String, String>): Int {
        val children = starMap.filterValues { it == root.name }
        return if (children.isEmpty()) {
            root.orbit
        } else {
            children.map { calculateOrbitsRecursive(Planet(it.key, root.orbit + 1), starMap) }
                .sum()
                .plus(root.orbit)
        }
    }

    private fun findAllParents(person: String, starMap: Map<String, String>): MutableList<String> {
        val parents = mutableListOf<String>()
        var searchedValue = person
        do {
            val parent = starMap[searchedValue] ?: break
            parents.add(parent)
            searchedValue = parent
        } while (true)
        return parents
    }

    data class Planet(val name: String, val orbit: Int)
}