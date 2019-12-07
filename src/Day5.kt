
private const val OPCODE_ADD = 1
private const val OPCODE_MULTIPLY = 2
private const val OPCODE_SAVE = 3
private const val OPCODE_LOAD = 4
private const val OPCODE_JUMP_IF_TRUE = 5
private const val OPCODE_JUMP_IF_FALSE = 6
private const val OPCODE_LESS_THAN = 7
private const val OPCODE_EQUALS = 8
private const val OPCODE_END = 99

private const val IMMEDIATE_MODE = 1
private const val POSITION_MODE = 0

class Day5 {

    fun solveA(program: IntArray, outPut: StringBuilder): String {
        val newInput = program.clone()
        runProgram(newInput, 1, outPut)
        return outPut.toString()
    }

    fun solveB(program: IntArray, outPut: StringBuilder): String {
        val newInput = program.clone()
        runProgram(newInput, 5, outPut)
        return outPut.toString()
    }

    fun runProgram(program: IntArray, input: Int, outPut: StringBuilder) : IntArray {
        var index = 0
        do {
            val opCode = getOpcode(program[index])
            val firstParamMode = getFirstParamMode(program[index])
            val secondParamMode = getSecondParamMode(program[index])
            when(opCode) {
                OPCODE_ADD -> {
                    val firstParam = loadValue(program, index + 1, firstParamMode)
                    val secondParam = loadValue(program, index + 2, secondParamMode)
                    program[program[index+3]] = firstParam + secondParam
                    index += 4
                }
                OPCODE_MULTIPLY -> {
                    val firstParam = loadValue(program, index + 1, firstParamMode)
                    val secondParam = loadValue(program, index + 2, secondParamMode)
                    program[program[index+3]] = firstParam * secondParam
                    index += 4
                }
                OPCODE_SAVE -> {
                    program[program[index+1]] = input
                    index += 2
                }
                OPCODE_LOAD -> {
                    val diagnosticCode = loadValue(program, index + 1, firstParamMode)
                    outPut.append(diagnosticCode)
                    index += 2
                }
                OPCODE_JUMP_IF_TRUE -> {
                    val firstParam = loadValue(program, index + 1, firstParamMode)
                    if (firstParam != 0) {
                        val secondParam = loadValue(program, index + 2, secondParamMode)
                        index = secondParam
                    } else {
                        index += 3
                    }
                }
                OPCODE_JUMP_IF_FALSE -> {
                    val firstParam = loadValue(program, index + 1, firstParamMode)
                    if (firstParam == 0) {
                        val secondParam = loadValue(program, index + 2, secondParamMode)
                        index = secondParam
                    } else {
                        index += 3
                    }
                }
                OPCODE_LESS_THAN -> {
                    val firstParam = loadValue(program, index + 1, firstParamMode)
                    val secondParam = loadValue(program, index + 2, secondParamMode)
                    program[program[index+3]] = if (firstParam < secondParam) 1 else 0
                    index += 4
                }
                OPCODE_EQUALS -> {
                    val firstParam = loadValue(program, index + 1, firstParamMode)
                    val secondParam = loadValue(program, index + 2, secondParamMode)
                    program[program[index+3]] = if (firstParam == secondParam) 1 else 0
                    index += 4
                }
                OPCODE_END -> index = program.size
            }
        } while (index < program.size)
        return program
    }

    fun getOpcode(input: Int) = input % 100

    fun getFirstParamMode(input: Int) = getCharacterAtPosition(input, 2)

    fun getSecondParamMode(input: Int) = getCharacterAtPosition(input, 3)

    fun getThirdParamMode(input: Int) = getCharacterAtPosition(input, 4)

    private fun loadValue(input: IntArray, param: Int, paramMode: Int): Int {
        return if (paramMode == POSITION_MODE) {
            input[input[param]]
        } else {
            input[param]
        }
    }

    private fun getCharacterAtPosition(input: Int, positionFromRight: Int) = input.toString().reversed().getOrElse(positionFromRight) { '0' }.minus('0')
}