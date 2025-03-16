package arrays.medium

import org.junit.jupiter.api.Test

internal class ZeroSumSubarrayTest {

    @Test
    fun zeroSumSubarrayTestCaseFirst() {
        val numbers = listOf(0)
        val expected = true
        val output = zeroSumSubarray(numbers)
        assert(output == expected)
    }

    @Test
    fun zeroSumSubarrayTestCaseSecond() {
        val numbers = emptyList<Int>()
        val expected = false
        val output = zeroSumSubarray(numbers)
        assert(output == expected)
    }

    @Test
    fun zeroSumSubarrayTestCaseThird() {
        val numbers = listOf(1)
        val expected = false
        val output = zeroSumSubarray(numbers)
        assert(output == expected)
    }

    @Test
    fun zeroSumSubarrayTestCaseFourth() {
        val numbers = listOf(1, 2, 3)
        val expected = false
        val output = zeroSumSubarray(numbers)
        assert(output == expected)
    }

    @Test
    fun zeroSumSubarrayTestCaseFifth() {
        val numbers = listOf(-2, -3, -1, 2, 3, 4, -5, -3, 1, 2)
        val expected = true
        val output = zeroSumSubarray(numbers)
        assert(output == expected)
    }

    @Test
    fun zeroSumSubarrayTestCaseSixth() {
        val numbers = listOf(2, 3, 4, -5, -3, 4, 5)
        val expected = true
        val output = zeroSumSubarray(numbers)
        assert(output == expected)
    }
}