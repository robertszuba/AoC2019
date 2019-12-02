
private const val OPCODE_ADD = 1
private const val OPCODE_MULTIPLY = 2
private const val OPCODE_END = 99

class Day2 {

    fun solveA(input: IntArray): Int {
        val newInput = input.clone()
        newInput[1] = 12
        newInput[2] = 2
        return runProgram(newInput)[0]
    }

    fun solveB(input: IntArray): String {
        for(i in 0 .. 99) {
            for(j in 0 .. 99) {
                val newInput = input.clone()
                newInput[1] = i
                newInput[2] = j
                if (runProgram(newInput)[0] == 19690720) {
                    return "$i $j"
                }
            }
        }
        return "unknown"
    }

    fun runProgram(input: IntArray) : IntArray {
        loop@ for (i in 0 .. input.size step 4) {
            when(input[i]) {
                OPCODE_ADD -> input[input[i+3]] = input[input[i+1]] + input[input[i+2]]
                OPCODE_MULTIPLY -> input[input[i+3]] = input[input[i+1]] * input[input[i+2]]
                OPCODE_END -> break@loop
            }
        }
        return input
    }
}