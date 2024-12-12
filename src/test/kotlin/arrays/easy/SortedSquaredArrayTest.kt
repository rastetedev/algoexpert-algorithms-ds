package arrays.easy

import org.junit.jupiter.api.Test

internal class SortedSquaredArrayTest {

    @Test
    fun sortedSquaredArrayTestCaseFirst() {
        val input = listOf(1, 2, 3, 5, 6, 8, 9)
        val expected = listOf(1, 4, 9, 25, 36, 64, 81)
        val output = sortedSquaredArrayFirstSol(input)
        assert(expected == output)
    }

    @Test
    fun sortedSquaredArrayTestCaseSecond() {
        val input = listOf(1)
        val expected = listOf(1)
        val output = sortedSquaredArraySecondSol(input)
        assert(expected == output)
    }

    @Test
    fun sortedSquaredArrayTestCaseThird() {
        val input = listOf(-5, -4, -3, -2, -1)
        val expected = listOf(1, 4, 9, 16, 25)
        val output = sortedSquaredArrayFirstSol(input)
        assert(expected == output)
    }

    @Test
    fun sortedSquaredArrayTestCaseFourth() {
        val input = listOf(-10, -5, 0, 5, 10)
        val expected = listOf(0, 25, 25, 100, 100)
        val output = sortedSquaredArraySecondSol(input)
        assert(expected == output)
    }

    @Test
    fun sortedSquaredArrayTestCaseFifth() {
        val input = listOf(-2, -1)
        val expected = listOf(1, 4)
        val output = sortedSquaredArrayFirstSol(input)
        assert(expected == output)
    }

    @Test
    fun sortedSquaredArrayTestCaseSixth() {
        val input = listOf(0, 0, 0, 0, 0, 0)
        val expected = listOf(0, 0, 0, 0, 0, 0)
        val output = sortedSquaredArraySecondSol(input)
        assert(expected == output)
    }
}