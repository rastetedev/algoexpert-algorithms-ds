package arrays.medium

import org.junit.jupiter.api.Test

internal class MissingNumbersTest {

    @Test
    fun missingNumbersTestCaseFirst() {
        val numbers = listOf<Int>()
        val expected = listOf(1, 2)
        val actual = missingNumbersFirstSol(numbers)
        assert(actual == expected)
    }

    @Test
    fun missingNumbersTestCaseSecond() {
        val numbers = listOf(1)
        val expected = listOf(2, 3)
        val actual = missingNumbersSecondSol(numbers)
        assert(actual == expected)
    }

    @Test
    fun missingNumbersTestCaseThird() {
        val numbers = listOf(2)
        val expected = listOf(1, 3)
        val actual = missingNumbersFirstSol(numbers)
        assert(actual == expected)
    }

    @Test
    fun missingNumbersTestCaseFourth() {
        val numbers = listOf(3, 5, 7, 8, 1, 10, 11, 2, 4, 13, 17, 22, 18, 21, 16, 20, 6, 9, 15, 12)
        val expected = listOf(14, 19)
        val actual = missingNumbersSecondSol(numbers)
        assert(actual == expected)
    }

    @Test
    fun missingNumbersTestCaseFifth() {
        val numbers = listOf(1, 2, 3, 4, 5, 6, 7)
        val expected = listOf(8, 9)
        val actual = missingNumbersFirstSol(numbers)
        assert(actual == expected)
    }

    @Test
    fun missingNumbersTestCaseSixth() {
        val numbers = listOf(1, 2, 4, 5, 7)
        val expected = listOf(3, 6)
        val actual = missingNumbersSecondSol(numbers)
        assert(actual == expected)
    }
}