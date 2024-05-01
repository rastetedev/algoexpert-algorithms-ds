package arrays.easy

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse

internal class ValidateSubsequenceTest {

    @Test
    fun validateSubsequenceTestCaseFirst() {
        val array = listOf(5, 1, 22, 25, 6, -1, 8, 10)
        val sequence = listOf(1, 6, -1, 10)
        assert(validateSubsequenceFirstSol(array, sequence))
    }

    @Test
    fun validateSubsequenceTestCaseSecond() {
        val array = listOf(5, 1, 22, 25, 6, -1, 8, 10)
        val sequence = listOf(26)
        assertFalse(validateSubsequenceSecondSol(array, sequence))
    }

    @Test
    fun validateSubsequenceTestCaseThird() {
        val array = listOf(5, 1, 22, 25, 6, -1, 8, 10)
        val sequence = listOf(5, 1, 22, 25, 6, -1, 8, 10)
        assert(validateSubsequenceFirstSol(array, sequence))
    }

    @Test
    fun validateSubsequenceTestCaseFourth() {
        val array = listOf(1, 1, 6, 1)
        val sequence = listOf(1, 1, 1, 6)
        assertFalse(validateSubsequenceSecondSol(array, sequence))
    }

    @Test
    fun validateSubsequenceTestCaseFifth() {
        val array = listOf(5, 1, 22, 25, 6, -1, 8, 10)
        val sequence = listOf(22)
        assert(validateSubsequenceFirstSol(array, sequence))
    }

    @Test
    fun validateSubsequenceTestCaseSixth() {
        val array = listOf(26)
        val sequence = listOf(26)
        assert(validateSubsequenceSecondSol(array, sequence))
    }
}