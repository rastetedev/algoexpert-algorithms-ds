package arrays.medium

import org.junit.jupiter.api.Test

internal class MonotonicArrayTest {

    @Test
    fun monotonicArrayTestCaseFirst() {
        val numbers = listOf(-1, -5, -10, -1100, -1100, -1101, -1102, -9001)
        val expected = true
        val actual = monotonicArrayFirstSol(numbers)
        assert(actual == expected)
    }

    @Test
    fun monotonicArrayTestCaseSecond() {
        val numbers = emptyList<Int>()
        val expected = true
        val actual = monotonicArraySecondSol(numbers)
        assert(actual == expected)
    }

    @Test
    fun monotonicArrayTestCaseThird() {
        val numbers = listOf(1)
        val expected = true
        val actual = monotonicArrayFirstSol(numbers)
        assert(actual == expected)
    }

    @Test
    fun monotonicArrayTestCaseFourth() {
        val numbers = listOf(1, 2)
        val expected = true
        val actual = monotonicArraySecondSol(numbers)
        assert(actual == expected)
    }

    @Test
    fun monotonicArrayTestCaseFifth() {
        val numbers = listOf(1, 1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 8, 9, 10, 11)
        val expected = true
        val actual = monotonicArrayFirstSol(numbers)
        assert(actual == expected)
    }

    @Test
    fun monotonicArrayTestCaseSixth() {
        val numbers = listOf(-1, -1, -2, -3, -4, -5, -5, -5, -6, -7, -8, -7, -9, -10, -11)
        val expected = false
        val actual = monotonicArraySecondSol(numbers)
        assert(actual == expected)
    }
}