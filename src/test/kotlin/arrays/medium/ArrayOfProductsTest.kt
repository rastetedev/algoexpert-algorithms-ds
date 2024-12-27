package arrays.medium

import org.junit.jupiter.api.Test

internal class ArrayOfProductsTest {

    @Test
    fun arrayOfProductsTestCaseFirst() {
        val numbers = listOf(5, 1, 4, 2)
        val expected = listOf(8, 40, 10, 20)
        val output = arrayOfProductsFirstSol(numbers)
        assert(output == expected)
    }

    @Test
    fun arrayOfProductsTestCaseSecond() {
        val numbers = listOf(1, 8, 6, 2, 4)
        val expected = listOf(384, 48, 64, 192, 96)
        val output = arrayOfProductsSecondSol(numbers)
        assert(output == expected)
    }

    @Test
    fun arrayOfProductsTestCaseThird() {
        val numbers = listOf(-5, 2, -4, 14, -6)
        val expected = listOf(672, -1680, 840, -240, 560)
        val output = arrayOfProductsThirdSol(numbers)
        assert(output == expected)
    }

    @Test
    fun arrayOfProductsTestCaseFourth() {
        val numbers = listOf(9, 3, 2, 1, 9, 5, 3, 2)
        val expected = listOf(1620, 4860, 7290, 14580, 1620, 2916, 4860, 7290)
        val output = arrayOfProductsFirstSol(numbers)
        assert(output == expected)
    }

    @Test
    fun arrayOfProductsTestCaseFifth() {
        val numbers = listOf(4, 4)
        val expected = listOf(4, 4)
        val output = arrayOfProductsSecondSol(numbers)
        assert(output == expected)
    }

    @Test
    fun arrayOfProductsTestCaseSixth() {
        val numbers = listOf(0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
        val expected = listOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
        val output = arrayOfProductsThirdSol(numbers)
        assert(output == expected)
    }
}