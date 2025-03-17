package arrays.medium

import org.junit.jupiter.api.Test

internal class MajorityElementTest {

    @Test
    fun majorityElementTestCaseFirst() {
        val elements = listOf(2)
        val expected = 2
        val output =  majorityElement(elements)
        assert(expected == output)
    }

    @Test
    fun majorityElementTestCaseSecond() {
        val elements = listOf(1, 2, 1)
        val expected = 1
        val output =  majorityElement(elements)
        assert(expected == output)
    }

    @Test
    fun majorityElementTestCaseThird() {
        val elements = listOf(1, 2, 3, 2, 2, 1, 2)
        val expected = 2
        val output =  majorityElement(elements)
        assert(expected == output)
    }

    @Test
    fun majorityElementTestCaseFourth() {
        val elements = listOf(1, 2, 3, 2, 3, 2, 2, 4, 2)
        val expected = 2
        val output =  majorityElement(elements)
        assert(expected == output)
    }

    @Test
    fun majorityElementTestCaseFifth() {
        val elements = listOf(1, 1, 1, 1, 1, 1, 1)
        val expected = 1
        val output =  majorityElement(elements)
        assert(expected == output)
    }

    @Test
    fun majorityElementTestCaseSixth() {
        val elements = listOf(1, 2, 3, 2, 2, 4, 2, 2, 5, 2, 1)
        val expected = 2
        val output =  majorityElement(elements)
        assert(expected == output)
    }
}