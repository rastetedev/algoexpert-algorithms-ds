package arrays.easy

import org.junit.jupiter.api.Test

internal class TwoNumberSumTest {

    @Test
    fun twoNumberSumTestCaseFirst() {
        val output = twoNumberSumFirstSol(listOf(3, 5, -4, 8, 11, 1, -1, 6), 10)
        assert(output.size == 2)
        assert(output.contains(11))
        assert(output.contains(-1))
    }

    @Test
    fun twoNumberSumTestCaseSecond() {
        val output = twoNumberSumSecondSol(listOf(4, 6), 10)
        assert(output.size == 2)
        assert(output.contains(4))
        assert(output.contains(6))
    }

    @Test
    fun twoNumberSumTestCaseThird() {
        val output = twoNumberSumThirdSol(listOf(4, 6, 1), 5)
        assert(output.size == 2)
        assert(output.contains(4))
        assert(output.contains(1))
    }

    @Test
    fun twoNumberSumTestCaseFourth() {
        val output = twoNumberSumFirstSol(listOf(4, 6, 1, -3), 3)
        assert(output.size == 2)
        assert(output.contains(6))
        assert(output.contains(-3))
    }

    @Test
    fun twoNumberSumTestCaseFifth() {
        val output = twoNumberSumSecondSol(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9), 17)
        assert(output.size == 2)
        assert(output.contains(8))
        assert(output.contains(9))
    }

    @Test
    fun twoNumberSumTestCaseSixth() {
        val output = twoNumberSumThirdSol(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 15), 18)
        assert(output.size == 2)
        assert(output.contains(3))
        assert(output.contains(15))
    }
}