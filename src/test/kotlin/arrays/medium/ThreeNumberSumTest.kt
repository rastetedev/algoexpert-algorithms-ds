package arrays.medium

import org.junit.jupiter.api.Test

internal class ThreeNumberSumTest {

    @Test
    fun threeNumberSumTestCaseFirst() {
        val output = threeNumberSum(mutableListOf(12, 3, 1, 2, -6, 5, -8, 6), 0)
        val expected = listOf(
            listOf(-8, 2, 6),
            listOf(-8, 3, 5),
            listOf(-6, 1, 5)
        )
        assert(expected == output)
    }

    @Test
    fun threeNumberSumTestCaseSecond() {
        val output = threeNumberSum(mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 15), 18)
        val expected = listOf(
            listOf(1, 2, 15),
            listOf(1, 8, 9),
            listOf(2, 7, 9),
            listOf(3, 6, 9),
            listOf(3, 7, 8),
            listOf(4, 5, 9),
            listOf(4, 6, 8),
            listOf(5, 6, 7)
        )
        assert(expected == output)
    }

    @Test
    fun threeNumberSumTestCaseThird() {
        val output = threeNumberSum(mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 15), 32)
        val expected = listOf(
            listOf(8, 9, 15)
        )
        assert(expected == output)
    }

    @Test
    fun threeNumberSumTestCaseFourth() {
        val output = threeNumberSum(mutableListOf(8, 10, -2, 49, 14), 57)
        val expected = listOf(
            listOf(-2, 10, 49)
        )
        assert(expected == output)
    }

    @Test
    fun threeNumberSumTestCaseFifth() {
        val output = threeNumberSum(mutableListOf(1, 2, 3), 7)
        val expected = emptyList<Int>()
        assert(expected == output)
    }

    @Test
    fun threeNumberSumTestCaseSixth() {
        val output = threeNumberSum(mutableListOf(1, 2, 3), 6)
        val expected = listOf(
            listOf(1, 2, 3)
        )
        assert(expected == output)
    }
}