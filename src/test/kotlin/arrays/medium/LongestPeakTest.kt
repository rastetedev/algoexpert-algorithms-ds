package arrays.medium

import org.junit.jupiter.api.Test

internal class LongestPeakTest {

    @Test
    fun longestPeakTestCaseFirst() {
        val numbers = listOf(1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3)
        val expected = 6
        val output = longestPeakSol(numbers)
        assert(output == expected)
    }

    @Test
    fun longestPeakTestCaseSecond() {
        val numbers = listOf(1, 2, 3, 4, 5, 1)
        val expected = 6
        val output = longestPeakSol(numbers)
        assert(output == expected)
    }

    @Test
    fun longestPeakTestCaseThird() {
        val numbers = listOf(1, 2, 3, 4, 5, 6, 10, 100, 1000)
        val expected = 0
        val output = longestPeakSol(numbers)
        assert(output == expected)
    }

    @Test
    fun longestPeakTestCaseFourth() {
        val numbers = listOf(1, 2, 3, 2, 1, 1)
        val expected = 5
        val output = longestPeakSol(numbers)
        assert(output == expected)
    }

    @Test
    fun longestPeakTestCaseFifth() {
        val numbers = listOf(1, 1, 1, 2, 3, 10, 12, -3, -3, 2, 3, 45, 800, 99, 98, 0, -1, -1, 2, 3, 4, 5, 0, -1, -1)
        val expected = 9
        val output = longestPeakSol(numbers)
        assert(output == expected)
    }

    @Test
    fun longestPeakTestCaseSixth() {
        val numbers = listOf(1, 3, 2)
        val expected = 3
        val output = longestPeakSol(numbers)
        assert(output == expected)
    }

    @Test
    fun longestPeakTestCaseSeventh() {
        val numbers = emptyList<Int>()
        val expected = 0
        val output = longestPeakSol(numbers)
        assert(output == expected)
    }
}