package arrays.hard

import org.junit.jupiter.api.Test

internal class FourNumberSumTest {

    @Test
    fun fourNumberSumTestCaseFirst() {
        val numbers = listOf(7, 6, 4, -1, 1, 2)
        val output = fourNumberSum(numbers, targetSum = 16)
        assert(
            output == listOf(
                listOf(7, 6, 4, -1),
                listOf(7, 6, 1, 2)
            )
        )
    }

    @Test
    fun fourNumberSumTestCaseSecond() {
        val numbers = listOf(1, 2, 3, 4, 5, 6, 7)
        val output = fourNumberSum(numbers, targetSum = 10)
        assert(
            output == listOf(
                listOf(1, 2, 3, 4)
            )
        )
    }

    @Test
    fun fourNumberSumTestCaseThird() {
        val numbers = listOf(5, -5, -2, 2, 3, -3)
        val output = fourNumberSum(numbers, targetSum = 0)
        assert(
            output == listOf(
                listOf(5, -5, -2, 2),
                listOf(5, -5, 3, -3),
                listOf(-2, 2, 3, -3)
            )
        )
    }

    @Test
    fun fourNumberSumTestCaseFourth() {
        val numbers = listOf(-2, -1, 1, 2, 3, 4, 5, 6, 7, 8, 9)
        val output = fourNumberSum(numbers, targetSum = 4)
        assert(
            output == listOf(
                listOf(-2, -1, 1, 6),
                listOf(-2, 1, 2, 3),
                listOf(-2, -1, 2, 5),
                listOf(-2, -1, 3, 4),
            )
        )
    }

    @Test
    fun fourNumberSumTestCaseFifth() {
        val numbers = listOf(-1, 22, 18, 4, 7, 11, 2, -5, -3)
        val output = fourNumberSum(numbers, targetSum = 30)
        assert(
            output == listOf(
                listOf(-1, 22, 7, 2),
                listOf(22, 4, 7, -3),
                listOf(-1, 18, 11, 2),
                listOf(18, 4, 11, -3),
                listOf(22, 11, 2, -5),
            )
        )
    }

    @Test
    fun fourNumberSumTestCaseSixth() {
        val numbers = listOf(-10, -3, -5, 2, 15, -7, 28, -6, 12, 8, 11, 5)
        val output = fourNumberSum(numbers, targetSum = 20)
        assert(
            output == listOf(
                listOf(-5, 2, 15, 8),
                listOf(-3, 2, -7, 28),
                listOf(-10, -3, 28, 5),
                listOf(-10, 28, -6, 8),
                listOf(-7, 28, -6, 5),
                listOf(-5, 2, 12, 11),
                listOf(-5, 12, 8, 5),
            )
        )
    }
}