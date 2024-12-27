package arrays.medium

import org.junit.jupiter.api.Test

internal class MergeOverlappingIntervalsTest {

    @Test
    fun mergeOverlappingIntervalsTestCaseFirst() {
        val intervals = listOf(listOf(1, 2), listOf(3, 5), listOf(4, 7), listOf(6, 8), listOf(9, 10))
        val expected = listOf(listOf(1, 2), listOf(3, 8), listOf(9, 10))
        val output = mergeOverlappingIntervals(intervals)
        assert(expected == output)
    }

    @Test
    fun mergeOverlappingIntervalsTestCaseSecond() {
        val intervals = listOf(listOf(1, 3), listOf(2, 8), listOf(9, 10))
        val expected = listOf(listOf(1, 8), listOf(9, 10))
        val output = mergeOverlappingIntervals(intervals)
        assert(expected == output)
    }

    @Test
    fun mergeOverlappingIntervalsTestCaseThird() {
        val intervals = listOf(
            listOf(1, 10), listOf(10, 20), listOf(20, 30), listOf(30, 40), listOf(40, 50),
            listOf(50, 60), listOf(60, 70), listOf(70, 80)
        )
        val expected = listOf(listOf(1, 80))
        val output = mergeOverlappingIntervals(intervals)
        assert(expected == output)
    }

    @Test
    fun mergeOverlappingIntervalsTestCaseFourth() {
        val intervals = listOf(listOf(1, 10), listOf(11, 20), listOf(21, 30), listOf(31, 40))
        val expected = listOf(listOf(1, 10), listOf(11, 20), listOf(21, 30), listOf(31, 40))
        val output = mergeOverlappingIntervals(intervals)
        assert(expected == output)
    }

    @Test
    fun mergeOverlappingIntervalsTestCaseFifth() {
        val intervals =
            listOf(listOf(89, 90), listOf(-10, 20), listOf(-50, 0), listOf(70, 90), listOf(90, 91), listOf(90, 95))
        val expected = listOf(listOf(-50, 20), listOf(70, 95))
        val output = mergeOverlappingIntervals(intervals)
        assert(expected == output)
    }

    @Test
    fun mergeOverlappingIntervalsTestCaseSixth() {
        val intervals = listOf(listOf(0, 0), listOf(0, 0), listOf(0, 0), listOf(0, 0), listOf(0, 0))
        val expected = listOf(listOf(0, 0))
        val output = mergeOverlappingIntervals(intervals)
        assert(expected == output)
    }
}