package arrays.easy

import org.junit.jupiter.api.Test

internal class TransposeMatrixTest {

    @Test
    fun transposeMatrixTestCaseFirst() {
        val matrix = mutableListOf(mutableListOf(1))
        val expected = mutableListOf(mutableListOf(1))
        val output = transposeMatrix(matrix)
        assert(expected == output)
    }

    @Test
    fun transposeMatrixTestCaseSecond() {
        val matrix = mutableListOf(mutableListOf(1), mutableListOf(-1))
        val expected = mutableListOf(mutableListOf(1, -1))
        val output = transposeMatrix(matrix)
        assert(expected == output)
    }

    @Test
    fun transposeMatrixTestCaseThird() {
        val matrix = mutableListOf(mutableListOf(1, 2, 3))
        val expected = mutableListOf(mutableListOf(1), mutableListOf(2), mutableListOf(3))
        val output = transposeMatrix(matrix)
        assert(expected == output)
    }

    @Test
    fun transposeMatrixTestCaseFourth() {
        val matrix = mutableListOf(mutableListOf(1), mutableListOf(2), mutableListOf(3))
        val expected = mutableListOf(mutableListOf(1, 2, 3))
        val output = transposeMatrix(matrix)
        assert(expected == output)
    }

    @Test
    fun transposeMatrixTestCaseFifth() {
        val matrix = mutableListOf(mutableListOf(1, 2, 3), mutableListOf(4, 5, 6))
        val expected = mutableListOf(mutableListOf(1, 4), mutableListOf(2, 5), mutableListOf(3, 6))
        val output = transposeMatrix(matrix)
        assert(expected == output)
    }

    @Test
    fun transposeMatrixTestCaseSixth() {
        val matrix = mutableListOf(mutableListOf(0, 1), mutableListOf(0, 1), mutableListOf(0, 1))
        val expected = mutableListOf(mutableListOf(0, 0, 0), mutableListOf(1, 1, 1))
        val output = transposeMatrix(matrix)
        assert(expected == output)
    }
}