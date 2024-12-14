package arrays.medium

import org.junit.jupiter.api.Test

internal class SmallestDifferenceTest {

    @Test
    fun smallestDifferenceTestCaseFirst() {
        val firstList = mutableListOf(-1, 5, 10, 20, 28, 3)
        val secondList = mutableListOf(26, 134, 135, 15, 17)
        val output = smallestDifference(firstList, secondList)
        val expected = listOf(28, 26)
        assert(output == expected)
    }

    @Test
    fun smallestDifferenceTestCaseSecond() {
        val firstList = mutableListOf(10, 0, 20, 25, 2000)
        val secondList = mutableListOf(1005, 1006, 1014, 1032, 1031)
        val output = smallestDifference(firstList, secondList)
        val expected = listOf(2000, 1032)
        assert(output == expected)
    }

    @Test
    fun smallestDifferenceTestCaseThird() {
        val firstList = mutableListOf(0, 20)
        val secondList = mutableListOf(21, -2)
        val output = smallestDifference(firstList, secondList)
        val expected = listOf(20, 21)
        assert(output == expected)
    }

    @Test
    fun smallestDifferenceTestCaseFourth(){
        val firstList = mutableListOf(240, 124, 86, 111, 2, 84, 954, 27, 89)
        val secondList = mutableListOf(1, 3, 954, 19, 8)
        val output = smallestDifference(firstList, secondList)
        val expected = listOf(954, 954)
        assert(output == expected)
    }
}