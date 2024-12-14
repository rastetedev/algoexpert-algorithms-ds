package arrays.medium

import org.junit.jupiter.api.Test

internal class MoveElementToEndTest {

    @Test
    fun moveElementsToEndTestCaseFirst() {
        val numbers = mutableListOf(2, 1, 2, 2, 2, 3, 4, 2)
        val toNumber = 2
        val output = moveElementsToEnd(numbers, toNumber)
        numbers.forEachIndexed { index, number ->
            assert(output[index] == number)
        }
    }

    @Test
    fun moveElementsToEndTestCaseSecond() {
        val numbers = mutableListOf<Int>()
        val toNumber = 3
        val output = moveElementsToEnd(numbers, toNumber)
        numbers.forEachIndexed { index, number ->
            assert(output[index] == number)
        }
    }

    @Test
    fun moveElementsToEndTestCaseThird() {
        val numbers = mutableListOf(1, 2, 4, 5, 6)
        val toNumber = 3
        val output = moveElementsToEnd(numbers, toNumber)
        numbers.forEachIndexed { index, number ->
            assert(output[index] == number)
        }
    }

    @Test
    fun moveElementsToEndTestCaseFourth() {
        val numbers = mutableListOf(3, 3, 3, 3, 3, 3)
        val toNumber = 3
        val output = moveElementsToEnd(numbers, toNumber)
        numbers.forEachIndexed { index, number ->
            assert(output[index] == number)
        }
    }

    @Test
    fun moveElementsToEndTestCaseFifth() {
        val numbers = mutableListOf(3, 1, 2, 4, 5)
        val toNumber = 3
        val output = moveElementsToEnd(numbers, toNumber)
        numbers.forEachIndexed { index, number ->
            assert(output[index] == number)
        }
    }

    @Test
    fun moveElementsToEndTestCaseSixth() {
        val numbers = mutableListOf(1, 2, 4, 5, 3)
        val toNumber = 3
        val output = moveElementsToEnd(numbers, toNumber)
        numbers.forEachIndexed { index, number ->
            assert(output[index] == number)
        }
    }
}