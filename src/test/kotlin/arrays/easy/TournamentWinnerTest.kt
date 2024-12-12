package arrays.easy

import org.junit.jupiter.api.Test

internal class TournamentWinnerTest {

    @Test
    fun tournamentWinnerTestCaseFirst() {
        val matches = listOf(
            listOf("HTML", "C#"),
            listOf("C#", "Python"),
            listOf("Python", "HTML")
        )
        val results = listOf(0, 0, 1)
        val expected = "Python"
        val output = tournamentWinner(matches, results)
        assert(expected == output)
    }

    @Test
    fun tournamentWinnerTestCaseSecond() {
        val matches = listOf(
            listOf("HTML", "Java"),
            listOf("Java", "Python"),
            listOf("Python", "HTML"),
            listOf("C#", "Python"),
            listOf("Java", "C#"),
            listOf("C#", "HTML")
        )
        val results = listOf(0, 1, 1, 1, 0, 1)
        val expected = "C#"
        val output = tournamentWinner(matches, results)
        assert(expected == output)
    }

    @Test
    fun tournamentWinnerTestCaseThird() {
        val matches = listOf(
            listOf("Bulls", "Eagles")
        )
        val results = listOf(1)
        val expected = "Bulls"
        val output = tournamentWinner(matches, results)
        assert(expected == output)
    }

    @Test
    fun tournamentWinnerTestCaseFourth() {
        val matches = listOf(
            listOf("Bulls", "Eagles"),
            listOf("Bulls", "Bears"),
            listOf("Bears", "Eagles")
        )
        val results = listOf(0, 0, 0)
        val expected = "Eagles"
        val output = tournamentWinner(matches, results)
        assert(expected == output)
    }

    @Test
    fun tournamentWinnerTestCaseFifth() {
        val matches = listOf(
            listOf("A", "B")
        )
        val results = listOf(0)
        val expected = "B"
        val output = tournamentWinner(matches, results)
        assert(expected == output)
    }

    @Test
    fun tournamentWinnerTestCaseSixth() {
        val matches = listOf(
            listOf("HTML", "Java"),
            listOf("Java", "Python"),
            listOf("Python", "HTML"),
            listOf("C#", "Python"),
            listOf("Java", "C#"),
            listOf("C#", "HTML"),
            listOf("SQL", "C#"),
            listOf("HTML", "SQL"),
            listOf("SQL", "Python"),
            listOf("SQL", "Java")
        )
        val results = listOf(0, 0, 0, 0, 0, 0, 1, 0, 1, 1)
        val expected = "SQL"
        val output = tournamentWinner(matches, results)
        assert(expected == output)
    }
}