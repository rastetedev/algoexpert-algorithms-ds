package arrays.medium

import org.junit.jupiter.api.Test

internal class SweatAndSavoryTest {

    @Test
    fun sweatAndSavoryTestCaseFirst() {
        val dishes = listOf<Int>()
        val expected = listOf(0,0)
        val output = sweetAndSavory(dishes, 10)
        assert(output == expected)
    }

    @Test
    fun sweatAndSavoryTestCaseSecond() {
        val dishes = listOf(4)
        val expected = listOf(0,0)
        val output = sweetAndSavory(dishes, 10)
        assert(output == expected)
    }

    @Test
    fun sweatAndSavoryTestCaseThird() {
        val dishes = listOf(-5, 10)
        val expected = listOf(0, 0)
        val output = sweetAndSavory(dishes, 0)
        assert(output == expected)
    }

    @Test
    fun sweatAndSavoryTestCaseFourth() {
        val dishes = listOf(-3, -5, 1, 7)
        val expected = listOf(-3, 1)
        val output = sweetAndSavory(dishes, 0)
        assert(output == expected)
    }

    @Test
    fun sweatAndSavoryTestCaseFifth() {
        val dishes = listOf(2, 5, -4, -7, 12, 100, -25)
        val expected = listOf(-25, 5)
        val output = sweetAndSavory(dishes, -20)
        assert(output == expected)
    }

    @Test
    fun sweatAndSavoryTestCaseSixth() {
        val dishes = listOf(2, 5, -4, -7, 12, 100, -25)
        val expected = listOf(-7, 12)
        val output = sweetAndSavory(dishes, 7)
        assert(output == expected)
    }
}