package arrays.easy

import org.junit.jupiter.api.Test

internal class NonConstructibleChangeTest {

    @Test
    fun nonConstructibleChangeTestCaseFirst() {
        val coins = mutableListOf(5, 7, 1, 1, 2, 3, 22)
        val expected = 20
        val output = nonConstructibleChange(coins)
        assert(expected == output)
    }

    @Test
    fun nonConstructibleChangeTestCaseSecond() {
        val coins = mutableListOf(1, 1, 1, 1, 1)
        val expected = 6
        val output = nonConstructibleChange(coins)
        assert(expected == output)
    }

    @Test
    fun nonConstructibleChangeTestCaseThird() {
        val coins = mutableListOf(1, 5, 1, 1, 1, 10, 15, 20, 100)
        val expected = 55
        val output = nonConstructibleChange(coins)
        assert(expected == output)
    }

    @Test
    fun nonConstructibleChangeTestCaseFourth() {
        val coins = mutableListOf(1, 1)
        val expected = 3
        val output = nonConstructibleChange(coins)
        assert(expected == output)
    }

    @Test
    fun nonConstructibleChangeTestCaseFifth() {
        val coins = mutableListOf(2)
        val expected = 1
        val output = nonConstructibleChange(coins)
        assert(expected == output)
    }

    @Test
    fun nonConstructibleChangeTestCaseSixth() {
        val coins = mutableListOf(1, 2, 3, 4, 5, 6, 7)
        val expected = 29
        val output = nonConstructibleChange(coins)
        assert(expected == output)
    }
}