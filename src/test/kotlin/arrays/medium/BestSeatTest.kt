package arrays.medium

import org.junit.jupiter.api.Test


internal class BestSeatTest {

    @Test
    fun bestSeatTestCaseFirst() {
        val seats = listOf(1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 0, 0, 1)
        val expected = 5
        val output = bestSeat(seats)
        assert(output == expected)
    }

    @Test
    fun bestSeatTestCaseSecond() {
        val seats = listOf(1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1)
        val expected = 3
        val output = bestSeat(seats)
        assert(output == expected)
    }

    @Test
    fun bestSeatTestCaseThird() {
        val seats = listOf(1, 0, 0, 0, 1, 0, 0, 0, 0, 1)
        val expected = 6
        val output = bestSeat(seats)
        assert(output == expected)
    }

    @Test
    fun bestSeatTestCaseFourth() {
        val seats = listOf(1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1)
        val expected = 13
        val output = bestSeat(seats)
        assert(output == expected)
    }

    @Test
    fun bestSeatTestCaseFifth() {
        val seats = listOf(1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1)
        val expected = 13
        val output = bestSeat(seats)
        assert(output == expected)
    }

    @Test
    fun bestSeatTestCaseSixth() {
        val seats = listOf(1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1)
        val expected = 4
        val output = bestSeat(seats)
        assert(output == expected)
    }
}