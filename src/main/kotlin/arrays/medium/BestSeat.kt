package arrays.medium

/**
 * You walk into a theatre you're about to see a show in. The usher within the theatre walks you to your row and mentions
 * you're allowed to sit anywhere within the given row. Naturally you'd like to sit in the seat that gives you the most space.
 * You also would prefer this space to be evenly distributed on either side of you (e.g. if there are three empty seats
 * in a row, you would prefer to sit in the middle of those three seats).
 * Given the theatre row represented as an integer array, return the seat index of where you should sit.
 * Ones represent occupied seats and zeroes represent empty seats.
 * You may assume that someone is always sitting in the first and last seat of the row.
 * Whenever there are two equally good seats, you should sit in the seat with the lower index.
 * If there is no seat to sit in, return -1. The given array will always have a length of at least one and contain only ones and zeroes.
 *
 * Sample Input
 * seats = [1, 0, 1, 0, 0, 0, 1]
 *
 * Sample Output
 * 4
 *
 * Hint 1
 * Try thinking about this problem in real life. How would you determine what seat has the most space?
 *
 * Hint 2
 * The best seat will always be within the longest contiguous subarray of all zeros.
 *
 * Hint 3
 * Once you find the longest contiguous subarray of empty seats, how can you choose where to sit within that subarray?
 *
 * Hint 4
 * How can you find the midpoint between two people?
 *
 * Time & Space Complexity óptimo:
 * O(n) time
 * O(1) space
 * donde N es el tamaño del array.
 */

fun bestSeat(seats: List<Int>): Int {

    var bestSeatIndex = -1
    var maxAvailableSeats = 0

    var left = 0

    while (left < seats.size) {

        var right = left + 1
        while (right < seats.size && seats[right] == 0) {
            right += 1
        }

        val availableSpace = right - left - 1
        if (availableSpace > maxAvailableSeats) {
            bestSeatIndex = (left + right) / 2
            maxAvailableSeats = availableSpace
        }
        left = right
    }

    return bestSeatIndex
}