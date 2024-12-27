package arrays.medium

import org.junit.jupiter.api.Test

internal class FirsDuplicateValueTest {

    @Test
    fun firstDuplicateValueTestCaseFirst() {
        val numbers = mutableListOf(2, 1, 5, 2, 3, 3, 4)
        val expected = 2
        val output = firstDuplicateValueFirstSol(numbers)
        assert(output == expected)
    }

    @Test
    fun firstDuplicateValueTestCaseSecond() {
        val numbers = mutableListOf(2, 1, 5, 3, 3, 2, 4)
        val expected = 3
        val output = firstDuplicateValueSecondSol(numbers)
        assert(output == expected)
    }

    @Test
    fun firstDuplicateValueTestCaseThird() {
        val numbers = mutableListOf(1, 1, 2, 3, 3, 2, 2)
        val expected = 1
        val output = firstDuplicateValueThirdSol(numbers)
        assert(output == expected)
    }

    @Test
    fun firstDuplicateValueTestCaseFourth() {
        val numbers = mutableListOf(3, 1, 3, 1, 1, 4, 4)
        val expected = 3
        val output = firstDuplicateValueFirstSol(numbers)
        assert(output == expected)
    }

    @Test
    fun firstDuplicateValueTestCaseFifth() {
        val numbers = emptyList<Int>().toMutableList()
        val expected = -1
        val output = firstDuplicateValueSecondSol(numbers)
        assert(output == expected)
    }

    @Test
    fun firstDuplicateValueTestCaseSixth() {
        val numbers = mutableListOf(1)
        val expected = -1
        val output = firstDuplicateValueThirdSol(numbers)
        assert(output == expected)
    }

}