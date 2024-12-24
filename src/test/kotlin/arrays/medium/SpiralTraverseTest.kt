package arrays.medium

import org.junit.jupiter.api.Test

internal class SpiralTraverseTest {

    @Test
    fun spiralTraverseTestCaseFirst() {
        val matrix = listOf(
            listOf(1, 2, 3, 4),
            listOf(12, 13, 14, 5),
            listOf(11, 16, 15, 6),
            listOf(10, 9, 8, 7)
        )
        val expected = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16)
        val output = spiralTraverseFirstSol(matrix)
        assert(output == expected)
    }

    @Test
    fun spiralTraverseTestCaseSecond() {
        val matrix = listOf(
            listOf(1, 2, 3, 4),
            listOf(10, 11, 12, 5),
            listOf(9, 8, 7, 6)
        )
        val expected = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)
        val output = spiralTraverseSecondSol(matrix)
        assert(output == expected)
    }

    @Test
    fun spiralTraverseTestCaseThird() {
        val matrix = listOf(
            listOf(1, 2, 3),
            listOf(12, 13, 4),
            listOf(11, 14, 5),
            listOf(10, 15, 6),
            listOf(9, 8, 7)
        )
        val expected = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)
        val output = spiralTraverseFirstSol(matrix)
        assert(output == expected)
    }

    @Test
    fun spiralTraverseTestCaseFourth() {
        val matrix = listOf(
            listOf(1),
            listOf(3),
            listOf(2),
            listOf(5),
            listOf(4),
            listOf(7),
            listOf(6),

            )
        val expected = listOf(1, 3, 2, 5, 4, 7, 6)
        val output = spiralTraverseSecondSol(matrix)
        assert(output == expected)
    }

    @Test
    fun spiralTraverseTestCaseFifth() {
        val matrix = listOf(
            listOf(1, 3, 2, 5, 4, 7, 6)
        )
        val expected = listOf(1, 3, 2, 5, 4, 7, 6)
        val output = spiralTraverseFirstSol(matrix)
        assert(output == expected)
    }

    @Test
    fun spiralTraverseTestCaseSixth() {
        val matrix = listOf(
            listOf(1, 11),
            listOf(2, 12),
            listOf(3, 13),
            listOf(4, 14),
            listOf(5, 15),
            listOf(6, 16),
            listOf(7, 17),
            listOf(8, 18),
            listOf(9, 19),
            listOf(10, 20)
        )
        val expected = listOf(1, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 10, 9, 8, 7, 6, 5, 4, 3, 2)
        val output = spiralTraverseSecondSol(matrix)
        assert(output == expected)
    }
}